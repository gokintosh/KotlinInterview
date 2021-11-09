package algoanddatastructures.LinkedLists


//How linked list different from kotlin Array or ArrayList:

//linked list allows constant time insertion and removal from the front of the list
//reliable performance characteristics

//-> linked list is a chain of nodes
//-> two responsibilities are holding a value and reference to a new node. Null
//marks the end of the list

class Node<T :Any>(var value:T,var next:Node<T>?=null){
    override fun toString(): String {
        return if(next!=null){
            "$value -> ${next.toString()}"
        }else{
            "$value"
        }
    }
}