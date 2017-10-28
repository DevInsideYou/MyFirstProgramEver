def asleep(hour):
  return message(hour, "asleep")

def awake(hour):
  return message(hour, "awake")

def message(hour, state):
  return "It's {} o'clock, so I'm {}".format(hour, state)

isWorkday = True

currentHour = 0 # 12am

while currentHour <= 23:
  if isWorkday:
    if 7 <= currentHour < 23:
      print(awake(currentHour))
    else:
      print(asleep(currentHour))
  else:
    if currentHour < 9:
      print(asleep(currentHour))
    else:
      print(awake(currentHour))

  currentHour = currentHour + 1
