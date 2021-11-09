package algoanddatastructures.LinkedLists


//in a linkedlist there is a concept of head and tail ,which refers to first and
//last nodes respectively

//we also track the size of the list


class LinkedList <T:Any>{

    private var head:Node<T>?=null
    private var tail:Node<T>?=null
    private var size=0

    fun isEmpty():Boolean=size==0

    override fun toString(): String {
        if(isEmpty()){
            return "empty list"
        }else{
            return head.toString()
        }
    }

//    push operation inserts a value to the front of the list. This is also called
//    headfirst insertion
//    we could use fluent interface for the same

    fun push(value:T):LinkedList<T> =apply {
        head=Node(value=value,next = head)
        if(tail==null){
            tail=head
        }
        size++
    }

//    append operation inserts node at the end of the list

    fun append(value:T):LinkedList<T> =apply {
        if(isEmpty()){
            push(value)
            return@apply
        }

        val newNode=Node(value)
        tail!!.next=newNode

        tail=newNode
        size++

    }

//    insert operation requires two steps
//    ->finding a particular node in the list
//    ->inserting the new node after that ode

    fun nodeAt(index:Int):Node<T>?{
        var currentNode=head
        var currentIndex=0

        while (currentNode!=null && currentIndex<index){
            currentNode=currentNode.next
            currentIndex++
        }

        return currentNode
    }

//    here the current node retrieves a node at the specified position
//    so when we insert the new node the node get inserted after this node

//    so to insert a new node we need to provide the value and the node after

    fun insert(value:T,afterNode:Node<T>):Node<T>{
        if(tail==afterNode){
            append(value)
            return tail!!
        }

        val newNode=Node(value=value,next=afterNode.next)
        afterNode.next=newNode
        size++
        return newNode

    }



//    now we are going to see the remove operations on a linkedlist



}