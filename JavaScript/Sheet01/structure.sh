#!/bin/bash
for i in {8..15}
do
        folder=$(printf "Ex%02d" $i)
        mkdir "$folder"
        cd "$folder"
        touch index.html
        cd ..
done