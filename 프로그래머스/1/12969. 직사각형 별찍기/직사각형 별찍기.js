process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const [a,b]= data.split(" ");
    const row = "*".repeat(a);
    for(let i = 0 ; i <b; i ++){
        console.log(row);
    }
});