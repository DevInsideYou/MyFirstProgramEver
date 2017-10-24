// jshint esversion: 6

function asleep(hour) {
  return message(hour, "asleep");
}

function awake(hour) {
  return message(hour, "awake");
}

function message(hour, state) {
  return `It's ${hour} o'clock, so I'm ${state}`;
}

const isWorkday = true;

let currentHour = 0; // 12am

while(currentHour <= 23) {
  if(isWorkday) {
    if(currentHour < 7)
      console.log(asleep(currentHour));
    else if (currentHour < 23)
      console.log(awake(currentHour));
    else
      console.log(asleep(currentHour));
  }
  else {
    if(currentHour < 9)
      console.log(asleep(currentHour));
    else
      console.log(awake(currentHour));
  }

  currentHour = currentHour + 1;
}
