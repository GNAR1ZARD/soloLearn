function asyncFunc(work) {
    // create a new promise
    return new Promise(function(resolve, reject) {
      // if work is empty, reject the promise with an error
      if (work === "")
        reject(Error("Nothing"));
      // use setTimeout to simulate async work
      setTimeout(function() {
        // resolve the promise with the work value
        resolve(work);
      }, 1000);
    });
  }
  
  // call asyncFunc with "Work 1", starting the first async task
  asyncFunc("Work 1")
  .then(function(result) {
    // log the result of the first task
    console.log(result);
    // return a new promise from calling asyncFunc with "Work 2"
    return asyncFunc("Work 2"); 
  }, function(error) {
    // log any error from the first task
    console.log(error);
  })
  .then(function(result) {
    // log the result of the second task
    console.log(result);
  }, function(error) {
    // log any error from the second task
    console.log(error);
  });
  // log "End" to show the end of the scripts toplevel execution
  console.log("End");
  