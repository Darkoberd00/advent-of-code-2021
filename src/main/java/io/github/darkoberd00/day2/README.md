# Day 2: Dive!
![Türchen_2](https://www.footballr.at/wp-content/uploads/2018/12/christmas-1911637_1920.jpg)

## Introduction
You're minding your own business on a ship at sea when the overboard alarm goes off! You rush to see if you can help. Apparently, one of the Elves tripped and accidentally sent the sleigh keys flying into the ocean!

Before you know it, you're inside a submarine the Elves keep ready for situations like this. It's covered in Christmas lights (because of course it is), and it even has an experimental antenna that should be able to track the keys if you can boost its signal strength high enough; there's a little meter that indicates the antenna's signal strength by displaying 0-50 **stars**.

Your instincts tell you that in order to save Christmas, you'll need to get all **fifty stars** by December 25th.

Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants **one star**. Good luck!

## Task Description:
### PART ONE
Now, you need to figure out how to pilot this thing.

It seems like the submarine can take a series of commands like ```forward 1```, ```down 2```, or ```up 3```:

- ```forward X``` increases the horizontal position by ```X``` units.
- ```down X``` **_increases_** the depth by ```X``` units.
- ```up X``` **_decreases_** the depth by ```X``` units.

Note that since you're on a submarine, ```down``` and ```up``` affect your **_depth_**, and so they have the opposite result of what you might expect.

The submarine seems to already have a planned course (your puzzle input). You should probably figure out where it's going. For example:
```
forward 5
down 5
forward 8
up 3
down 8
forward 2
```
Your horizontal position and depth both start at 0. The steps above would then modify them as follows:

- ```forward 5``` adds ```5``` to your horizontal position, a total of ```5```.
- ```down 5``` adds ```5``` to your depth, resulting in a value of ```5```.
- ```forward 8``` adds ```8``` to your horizontal position, a total of ```13```.
- ```up 3``` decreases your depth by ```3```, resulting in a value of ```2```.
- ```down 8``` adds ```8``` to your depth, resulting in a value of ```10```.
- ```forward 2``` adds ```2``` to your horizontal position, a total of ```15```.

After following these instructions, you would have a horizontal position of ```15``` and a depth of ```10```. (Multiplying these together produces ```150```.)

Calculate the horizontal position and depth you would have after following the planned course. **_What do you get if you multiply your final horizontal position by your final depth?_**

**[Inputs](https://github.com/Darkoberd00/advent-of-code-2021/tree/master/src/main/resources)**

### PART TWO

Based on your calculations, the planned course doesn't seem to make any sense. You find the submarine manual and discover that the process is actually slightly more complicated.

In addition to horizontal position and depth, you'll also need to track a third value, _**aim**_, which also starts at ```0```. The commands also mean something entirely different than you first thought:

- ```down X``` **_increases_** your aim by ```X``` units.
- ```up X``` _**decreases**_ your aim by ```X``` units.
- ```forward X``` does two things:
  - It increases your horizontal position by ```X``` units.
  - It increases your depth by your aim _**multiplied by**_ ```X```.
  
Again note that since you're on a submarine, ```down``` and ```up``` do the opposite of what you might expect: "down" means aiming in the positive direction.

Now, the above example does something different:

- ```forward 5``` adds ```5``` to your horizontal position, a total of ```5```. Because your aim is ```0```, your depth does not change.
- ```down 5``` adds ```5``` to your aim, resulting in a value of ```5```.
- ```forward 8``` adds ```8``` to your horizontal position, a total of ```13```. Because your aim is ```5```, your depth increases by ```8*5=40```.
- ```up 3``` decreases your aim by ```3```, resulting in a value of ```2```.
- ```down 8``` adds ```8``` to your aim, resulting in a value of ```10```.
- ```forward 2``` adds ```2``` to your horizontal position, a total of ```15```. Because your aim is ```10```, your depth increases by ```2*10=20``` to a total of ```60```.

After following these new instructions, you would have a horizontal position of ```15``` and a depth of ```60```. (Multiplying these produces ```900```.)

Using this new interpretation of the commands, calculate the horizontal position and depth you would have after following the planned course. _**What do you get if you multiply your final horizontal position by your final depth?**_

**[Inputs](https://github.com/Darkoberd00/advent-of-code-2021/tree/master/src/main/resources)**
