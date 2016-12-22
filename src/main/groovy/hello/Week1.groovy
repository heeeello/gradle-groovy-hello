package hello

/**
 * 方案描述：
 * 要寻找k， 需要寻找A，B数组中相同的数字的个数。
 *  考虑到最后需要变化一个数字，
 *  如果相同的元素总数和数组元素总数相同，就需要-1;
 *  如果相同的元素数比数组总元素数小， 通过变化B中个一个数据可以再增加一个相同的元素，需要+1
 *
 *  这样只需要求出A，B两个数组中相同元素的个数。
 *
 *  看到整数的范围是一定的(1-1000), 可以使用一个Map的键来表示A,B的元素，Map的值为元素出现的个数。
 *  这样相互A_MAP, B_MAP比较每个元素的个数，最小个数就是A，B数组中对应元素相等的个数，
 *  然后累加最小个数即为A,B两个数组中相同元素的总个数
 *
 */
class Week1 {

    static int N_MAX=1000
    static int N_MIN=1

    static def main(def args) {

        Integer number = 0;
        List<Integer> A = []
        List<Integer> B = []
        List<String> lines = System.in.readLines()

        number = Integer.parseInt(lines[0])
//        println number

        lines[1].split("\\s+").each { String s ->
            A.push(Integer.parseInt(s))
        }
        //println A

        lines[2].split("\\s+").each { String s ->
            B.push(Integer.parseInt(s))
        }
        //println B

        ArrayList<Integer> A_counter = new ArrayList<Integer>(Collections.nCopies(N_MAX+N_MIN, 0))
        ArrayList<Integer> B_counter = new ArrayList<Integer>(Collections.nCopies(N_MAX+N_MIN, 0))
        ArrayList<Integer> min_counter = new ArrayList<Integer>(Collections.nCopies(N_MAX+N_MIN, 0))

        A.each {Integer a ->
            A_counter[a] ++
        }
        B.each {Integer b ->
            B_counter[b] ++
        }
        for(int i=0; i<N_MAX+N_MIN; i++){
            if(A_counter[i]>=B_counter[i]){
                min_counter[i]=B_counter[i]
            } else {
                min_counter[i]=A_counter[i]
            }
            // Which one is different
//            if(A_counter[i] !=B_counter[i]){
//                println "diff: $i, ${A_counter[i]}, ${B_counter[i]}"
//            }
        }
//        println A_counter
//        println B_counter
//        println min_counter

        int sum = min_counter.sum()

        if(sum==number){
            sum = sum -1
            println sum
        } else {
            sum = sum+1
            println sum
        }

    }
}

