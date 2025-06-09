function solution(arr)
{
    return arr.filter((a,idx) => 
                      arr[idx-1] !== arr[idx])

}