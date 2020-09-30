function howLong(steps, foot, speed) {

    let finalLength = steps * foot;
    let brakes = Math.floor(finalLength / 500);
    let speedForMeters = speed / 3.6;
    let time = finalLength / speedForMeters + brakes * 60;

    let timeInHours = Math.floor(time / 3600);
    let timeInMins = Math.floor(time / 60);
    let timeInSecs = Math.ceil(time % 60);

    //if (timeInHours < 10) {
    //   console.log(`0${timeInHours}:${timeInMins}:${timeInSecs}`);
    //} else {
    //  console.log(`0${timeInHours}:${timeInMins}:${timeInSecs}`);
    //}
    
    console.log(`${timeInHours <10 ? 0: ""}${timeInHours}:${timeInMins <10 ? 0: ""}${timeInMins}:${timeInSecs <10 ? 0: ""}${timeInSecs}`)
}

howLong(4000, 0.60, 5);