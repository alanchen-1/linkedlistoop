<h1> Update: 7/19/2021 </h1>
The original doubly linked list implementation worked fine but didn't work for the purposes of the mini-exercise. I rewrote the implementation with new inheritance structures.
The new implementation is based on the principle that lists are created through a base `empty` list and a `cons` function. 

The answer to the original question was to mirror the data definition of lists in the functional programming language: they are either a list or empty. In coding in this way, we are mirroring the dynamic dispatch ideas present in OOP rather than abusing functional programming. So, in essence, I was being asked to code in an object-oriented way, just in a functional programming language. 

<h1> 7/16/2021 </h1>
This is a very simple implementation of a doubly linked list in Java.

I did this because during a placement course I took before freshman year, I asked a question about formatting nested if statements in functional programming. 
The professor led me through implementing this so that he could answer my question.

In Racket, here was the original question. I was wondering why we use the latter instead of the former. 
```
(define (is-in? val loa)
  (cond
    [(empty? loa) #false]
    [(equal? val (first loa)) #true]
    [else (is-in? val (rest loa))]))
```
vs. 
```
(define (is-in? val loa)
  (cond
      [(empty? loa) #false]
      [(cons? loa) 
                  (cond 
                  [(equal? val (first loa)) #true]
                  [else (is-in? val (rest loa))])]))
```

