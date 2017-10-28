def asleep(hour)
  return message(hour, "asleep")
end

def awake(hour)
  return message(hour, "awake")
end

def message(hour, state)
  return "It's #{hour} o'clock, so I'm #{state}"
end

isWorkday = true

currentHour = 0 # 12am

while currentHour <= 23
  if isWorkday
    if currentHour < 7
      puts asleep currentHour
    elsif currentHour < 23
      puts awake currentHour
    else
      puts asleep currentHour
    end
  else
    if currentHour < 9
      puts asleep currentHour
    else
      puts awake currentHour
    end
  end

  currentHour = currentHour + 1
end
