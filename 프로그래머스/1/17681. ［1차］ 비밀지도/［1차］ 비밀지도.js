function solution(n, arr1, arr2) {
    return arr1.map((val, i) => {
            const binary = (val|arr2[i]).toString(2).padStart(n,"0")//OR
            return [...binary].map(a => a === "1"? a = "#" : a= " ").join("");
        });
}