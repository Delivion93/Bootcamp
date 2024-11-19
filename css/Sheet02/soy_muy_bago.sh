#!/bin/bash
for i in {1..10}
do
        folder=$(printf "Ex%02d" $i)
        mkdir "$folder"
        cd "$folder"
        touch index.html
        cd ..
done