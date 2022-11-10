#!/usr/bin/env bash

#remove previous artifacts
rm js/kotlin*
rm js/Test*

# generate new js artifacts from log module
./gradlew :log:jsBrowserDistribution

# cope js artifacts to js folder
cp log/build/compileSync/main/productionExecutable/kotlin/* js/

# compile type script
cd js
tsc

# run index.js
node index.js