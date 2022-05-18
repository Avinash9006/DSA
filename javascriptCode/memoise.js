function memoise(fn) {
  let cache = {};
  return (...args) => {
    let key = args.map((k) => k.toString() + ",").join("");
    if (key in cache) {
      return cache[key];
    } else {
      //   cache[key] = args.reduce((acc, curr) => fn(acc, curr), 0);
      cache[key] = fn(...args);
      return cache[key];
    }
  };
}

function add(a, b, c, d) {
  return a + b - c - d;
}

let memoisedAdd = memoise(add);

console.log(memoisedAdd(4, 5, 2, 3));
console.log(memoisedAdd(4, 5));
console.log(memoisedAdd(4, 5));
console.log(memoisedAdd(4, 5));
