# Rorschach
A text-based Rorschach test with randomly generated "inkblots", written in Java

I wrote this at the end of my Computer Science II class in my Senior year of High School. I liked the idea of randomly generating the "inkblots" that would appear and trying to generate a report based on user responses. Massive credit to Tracy Calabresi, my Computer Science teacher, for giving me the freedom to make this nearing the end of the class!

# Intro

Inspired by the psychological test that I learned about in AP Psychology, and the character from Watchmen, Rorschach is a set of Java files that work together to display randomly generated images with prompts for the user to answer what they see in the picture. It is mostly functional, with the end report being unfinished because I ran out of time.

RorschachRunner is your standard "runner" file and it calls all the other functions in the other files.

TestMaker makes the test format and calls the functions in InkblotMaker

InkblotMaker displays a randomly generated series of "X"s and "O"s to simulate a random inkblot in a Rorschach test. They are symetrical, just like in a real test.

I use a list of positive and negative adjectives to scan the results after the test is over.

A text file can be generated at the end but it currently doesn't record anything.

# Instructions for Download and Use:

Step 1: Download all files

Step 2: Run RorschachRunner.java in a Java IDE

Step 3: Have Fun!

