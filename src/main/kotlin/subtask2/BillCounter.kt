package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        for (i in bill) {
            if ((bill.sum() - bill[k]) / 2 == b)
                return "Bon Appetit"
        }
            if ((bill.sum() - bill[k]) / 2 != b)
                return (b - ((bill.sum() - bill[k])) / 2).toString()
                return "Bon Appetit"


    }
    }