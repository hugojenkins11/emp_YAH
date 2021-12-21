# emp_YAH -- YAH
### Roster:  Hugo Jenkins + Boary; Ameer Alnasser + TurtleBoi
---
## Tests Performed:

* In order to try to find the total time it would take, we tried multiple tests to build up to our big test. One of them was to find the linearsearch time using the middle element and the other one found it using 100 searches. We knew that the 100 searches would be more precise and ended up using that to find how long it hypothetically would take to search for each element separately. It would be unfair to compare LinSearch with BinSearch if LinSearch was only 100 elements and BinSearch was looking for each element, so we multiplied the time for LinSearch by length/100 in our end results. 
--- 
## Results: 
* After getting our peer modifications as well as testing our original method of attack, we noticed that it took wayyyyy too long to finish the linear search. So, we only ran 100 searches and multiplied by length/100 to approximate what it would be for the entire search. 

* We ran a multitude of tests and averaged the results in an Excel form. We attached our exact results [here:](https://docs.google.com/spreadsheets/d/18D3_c6V9efRh5DDQ9xt77HvQBMzrzqQNvs9rFgd-K3Q/edit?usp=sharing)
* Graphs [here:](https://docs.google.com/document/d/1rysJAFSL-ktMp3A7dJaLCnbclpuhJj8XK6FVaUrmbok/edit?usp=sharing)

* By finding this data, we hoped to find a relationship between how much faster Binary Search becomes 

* We noticed that Linear Search looked like an exponential function while Binary Search looked like a linear function. We initially chalked this up to error, but we found out why, talked about in Conclusion

--- 
## Conclusions: 
* We found a relationship between the linear search times divided by the binary times. As the array size got bigger, it seemed that Binary Search would become faster and faster than Linear Search. The function of Binary Search and Linear Search surprised us. We expected there to be a Linear function as size increased for LinearSearch but there ended up being almost an exponential curve in the end while Binary Search was linear. After deliberations with Ameer's brother, we found out the reason for this relationship. For binary search, we know that it takes log2n+1 tries. so that formula would be n=log2 (n+1). If we multiplied by k on both sides (our array size), the new formula would be y ( or nk)= log 2 (n+1) log2(k). 

---
### Special Thanks
* Four for their insightful comments on our plan
* JWJ for their insightful comments on our plan
* Ameer's brother for their explanation of graph
