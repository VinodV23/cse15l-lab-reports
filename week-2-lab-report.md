# Week 2 Lab Report
## ChatServer
! [image] (Chat1.png)
Above is the code for the assignment <br/>
<br/>
! [image] (Chat2.png)
Above is a screenshot after one addition to the chat log. The handle request method is being called. <br/> \
The relevant argument is the url of the server. Pieces of this url such as the path and
query are used later in the method. Some relevant fields are ```query``` which contains
the query of the url and ```first```, ```second```, and ```log``` which contain empty 
strings that will be updated with parts of the final return value. <br/> \
The ```first``` and ```second``` fields are updated with the section of the query after
```s=``` and ```user=``` respectively. Also, ```log``` is updated with those two updated fields 
and is formatted. <br/>\

