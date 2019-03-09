# NMA communicates with a NodeJS back-end API

#### made by Lukas Bildstein, Martin Bischof, Mirko Nowak

This project is a prototype for using the Volley HTTP - library for testing Web-API Requests. 

## Volley
Source: https://developer.android.com/training/volley

> Volley is an HTTP library that makes networking for Android apps easier and most importantly, faster.

**Advantages** 
* easy to use
* uses separate threads for network communication (if you use the `RequestQueue`)
* `RequestQueue`:
    * existing default implementation: 
        * checks if a request can be answered from the cache
    * You can also create a custom RequestQueue to supply your own behaviour of handling HTTP requests. 
* Offers `JsonObjectRequest`and `JsonArrayRequest` for easy retrieving of JSON results
* Custom Implementations of Requests are madable

**Disadvantages** 
* > Volley is not suitable for large download or streaming operations, since Volley holds all responses in memory during parsing
* external library must be included

## Using Java Streams

Based on the knowledge aquired from previous projects it is also possible to retreive data from a Web API via a Java Stream. 

**Advantages**
* no external library must be included
* plain Java - no learning of new frameworks and APIs / Methods
* well tested
* independent of the used Android SDK and Java version

**Disadvantages**
* setup by the developer - needs a lot of knowledge in Java Streams
    * error handling 
    * syntax checks for Response
    * HTTP headers must be defined
* blocking read (synchronous if no additional threads are used)



