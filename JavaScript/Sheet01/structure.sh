#!/bin/bash
for i in {1..15}
do
        folder=$(printf "Ex%02d" $i)
        mkdir "$folder"
        cd "$folder"
        touch script.js
        cd ..
done