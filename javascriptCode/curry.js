/// Need to fix this

function curry(func, arity = func.length) {
  return (...args) => {
    if (arity <= args.length) {
      return func(...args);
    } else {
      return curry(func.bind(this, ...args), arity - args.length);
    }
  };
}

function add(a, b) {
  return a + b;
}

curriedAdd = curry(add);
console.log(curriedAdd(2, 3, 4, 5, 6));
