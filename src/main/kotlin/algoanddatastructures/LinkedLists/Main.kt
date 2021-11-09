package algoanddatastructures.LinkedLists

fun main() {
    "creating and linking nodes " example {
        val node1=Node(value=1)
        val node2=Node(value=2)
        val node3=Node(value=3)

        node1.next=node2
        node2.next=node3


        println(node1)
    }

    "push" example {
        val list=LinkedList<Int>()
        list.push(3)
        list.push(4)
        list.push(5)


        println(list)
    }

    "fluent interface push" example {
        val list=LinkedList<Int>()
        list.push(3).push(50)

        println(list)
    }

    "fluent interface append" example {
        val list=LinkedList<Int>()
        list.append(4).append(10).append(100)
        println(list)
    }

    "inserting at a particular index" example {
        val list=LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println(list)

        var middleNode=list.nodeAt(1)!!
        for(i in 1..3){
            list.insert(-1*i,middleNode)
        }

        println(list)
    }


}