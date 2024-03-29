# Week 1 Lab Report
## cd No Argument
![Image](SC1.png)
The working directory was ```/home```
<br/>
The output was nothing because using cd changes the directory. If the current directory was ```/lecture1``` for example, this would move it back to ```/home```. <br/>
This output is not an error as nothing should happen if you are in the ```/home``` directory. <br/>

## cd Path to Directory
![Image](SC2.png)
The working directory was ```/home ```<br/>
The output was that the current directory became ```/lecture1``` and the prompt was updated. This was because the argument is what the directory was changed to. <br/>
This output is not an error as the current directory was successfully changed. <br/>

## cd Path to File
![Image](SC10.png)
The working directory was ```/lecture1``` <br/>
The output was that it said not a directory. cd can only be used for directories, not files.<br/>
This output is an error files can not be the argument for cd. <br/>

## ls No Arguments
![Image](SC4.png)
The working directory was ```/home``` <br/>
The output was the ```/lecture1```. This was printed out and in blue because it is a folder. <br/>
This is not an error. <br/>

## ls Path to Directory
![Image](SC5.png)
The working directory was ```/home``` <br/>
The output was the contents of what was in the argument. The argument was ```/lecture1``` so everything inside this folder was printed. <br/>
This is not an error. <br/>

## ls Path to File
![Image](SC6.png)
The working directory was ```/lecture1``` <br/>
The output was the name of the file ```README```. The argument was ```README``` and so the string README was printed. <br/>
This is not an error. <br/>

## cat No Arguments
![Image](SC7.png)
The working directory was ```/lecture1``` <br/>
There was no output. cat prints out the contents of a file/directory but requires an argument for that to occur. When typing into the terminal after ```cat```, the input is reprinted to the terminal. <br/>
This is an error that occurs because there is no file or directory for it to print the contents of. <br/>

## cat Path to Directory
![Image](SC8.png)
The working directory was ```/lecture1``` <br/>
The output was Is a directory. The argument was ```/messages``` and the output stated that the argument was a directory. <br/>
This is an error as cat printed out the fact that ```/messages``` is a directory. <br/>

**cat Path to File**
![Image](SC9.png)
The current directory was ```/lecture1``` <br/>
The output was the contents of ```README```. The argument was ```README``` and so every line in ```README``` was printed out. <br/>
This is not an error as cat printed out the contents of the ```README``` file. <br/>
