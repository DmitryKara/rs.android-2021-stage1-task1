package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        return sadArray.returnToHappy()
    }
    }
    private fun IntArray.returnToHappy(): IntArray{
        var mySadArray = this
        var myHappyArray = arrayListOf<Int>()
        val mBoolean = true
        while (mBoolean){
            for (i in mySadArray.indices) {
                if (i == 0 || i == mySadArray.lastIndex) {
                    myHappyArray.add(mySadArray[i])
                    } else {
                        val number = mySadArray[i]
                        val lastNumber = mySadArray[i - 1]
                        val nextNumber = mySadArray[i + 1]
                        if (number <= (lastNumber + nextNumber)){
                            myHappyArray.add(mySadArray[i])
                        }
                    }
                }
                if (mySadArray.size == myHappyArray.size) {
                    return myHappyArray.toIntArray()
                }
                mySadArray = myHappyArray.toIntArray()
                myHappyArray = arrayListOf()
            }

        return mySadArray
    }



