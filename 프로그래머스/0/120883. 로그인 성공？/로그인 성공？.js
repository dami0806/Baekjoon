function solution(id_pw, db) {
    const userMap = new Map(db);
    const [id,pw] = id_pw;
    
    if(!userMap.has(id)) return "fail";
    return userMap.get(id) === pw ? "login":"wrong pw";
}