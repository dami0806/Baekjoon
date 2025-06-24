function solution(files) {
    const parse = files.map((file,idx) =>{
    const m = file.match(/^([^\d]+)(\d{1,5})/);
        return {
            origin: file,
            head: m[1].toLowerCase(),
            num: Number(m[2]),
            idx
        }
    });
    
    //정렬
    parse.sort((a,b) => {
        if(a.head !== b.head) return a.head.localeCompare(b.head);
        if(a.num !== b.num) return a.num - b.num;
        return a.idx - b.idx
    });
    
    return parse.map(a=>a.origin);
}