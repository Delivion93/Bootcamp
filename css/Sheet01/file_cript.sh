#!/bin/bash
for i in {8..24}
do
        folder=$(printf "Ex%02d" $i)
        cd "$folder"
	touch index.html
	cd ..
done