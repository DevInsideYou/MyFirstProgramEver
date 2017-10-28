#!/usr/bin/env stack
-- stack --install-ghc runghc

-- Use https://repl.it/languages/haskell to play with the code

asleep :: Int -> String
asleep hour = message hour "asleep"

awake :: Int -> String
awake hour = message hour "awake"

message :: Int -> String -> String
message hour state = "It's " ++ show hour ++ " o'clock, so I'm " ++ state

while :: Bool -> Int -> Int -> [String]
while isWorkday currentHour limit
  | (currentHour == limit) = []

while isWorkday currentHour limit =
  (
    if isWorkday then
        if currentHour < 7
          then asleep currentHour
        else if currentHour < 23
          then awake currentHour
        else
          asleep currentHour
    else
      if currentHour < 9
        then asleep currentHour
      else
        awake currentHour
  ) : (while isWorkday (currentHour + 1) limit)

main :: IO ()
main =
  mapM_ putStrLn (while True 0 {- 12am -} 24)
