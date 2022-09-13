## Building Apps
Once you've created your project, first compile your Scala code to JavaScript by running
```
$ sbt clean fastOptJS
```
IMP: this might refresh new react components but will not refresh new code written inside functions 
behind existing react components. Use the yarn commands below to stop and redeploy to ios/android 

## Stopping and running
`yarn stop`

`yarn ios`

`yarn android`

## Cleaning
`yarn clean`

## Production Bundles
To create a minified app, first build an optimized Scala.js bundle
```
$ sbt fullOptJS
```

Then, go to `App.js` and uncomment `app = require("./target/scala-2.13/app-opt.js").app;` in order to enable the production bundle.
