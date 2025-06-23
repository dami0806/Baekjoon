function solution(fees, records) {
    let records_table = [];
    let car = [];
    let car_time =[];
    let result = [];
    
    // 차량마다 시간 순으로 IN OUT 배열갖기
    for(let i = 0 ; i < records.length; i++) {
        records_table.push(records[i].split(" "));
        let time = records_table[i][0].split(":");
        records_table[i][0] = Number(time[0])*60 +Number(time[1]);
        car.push(records_table[i][1])
    }
    
   
    car =[...new Set(car)].sort((a,b) => a-b);
     car_time = Array.from({length:car.length},() => []);
    records_table.sort((a,b) => a[1] === b[1] ? (a[0]-b[0]): a[1]-b[1]);

    
    car.forEach((a,idx) => {
       let filterCar = records_table.filter(v => v[1] == a);
        
        if(filterCar.length %2 ==1) {
            filterCar.push([ 23*60 + 59, a , 'OUT' ]);
        }
       let t = 0;
        
        for(let i = 0 ; i <filterCar.length-1; i+=2) {
            t += (Number(filterCar[i+1][0]) - Number(filterCar[i][0]));
        }
        
        car_time[idx].push(t);
    });
    
    car_time.forEach(a=> {
        result.push(fees[1] + Math.ceil(Math.max(a[0] - fees[0],0)/fees[2]) *fees[3]);    
    });
    
    
    return result;
}