let arr = ['a', 'b', 'c'];

function permutation(arr, str = "") {
  if (arr.length == 0) {
    console.log(str);
    return;
  }
  for (var j = 0; j < arr.length; j++) {
    const unparsedArray = arr.filter((item,index) => index != j);
    permutation(unparsedArray, str + arr[j]);
  }
}

permutation(arr);
