let arr = [3, 1, 4, 5, 2];
// arr.sort((a, b) => a - b);
// console.log(arr);
// Mob No : 8619447423

function quickSort(list, s, e) {
  if (s < e) {
    let realPos = Partition(list, s, e);
    quickSort(list, s, realPos - 1);
    quickSort(list, realPos + 1, e);
  }
  return list;
}

function Partition(list, s, e) {
  let index = e;
  for (let i = s; i <= e; i++) {
    if (list[index] < list[i]) {
      let temp = list[e];
      list[e] = list[i];
      list[i] = temp;
      index = i;
    }
  }
  let temp = list[index];
  list[index] = list[e];
  list[e] = temp;
  return index;
}

function mergeSort(arr, s, e) {
  if (s < e) {
    const mid = s + Math.floor((e - s) / 2);
    mergeSort(arr, s, mid);
    mergeSort(arr, mid + 1, e);
    merge(arr, s, mid, e);
  } else {
    return;
  }
}

function merge(arr, left, mid, right) {
  let leftArray = [],
    rightArray = [];
  let i = left,
    l_index = 0,
    r_index = 0;

  for (let k = left; k <= mid; k++) {
    leftArray.push(arr[k]);
  }
  for (let k = mid + 1; k <= right; k++) {
    rightArray.push(arr[k]);
  }
  while (rightArray.length > r_index && leftArray.length > l_index) {
    if (rightArray[r_index] > leftArray[l_index]) {
      arr[i] = leftArray[l_index];
      i++;
      l_index++;
    } else {
      arr[i] = rightArray[r_index];
      i++;
      r_index++;
    }
  }

  while (l_index < leftArray.length) {
    arr[i] = leftArray[l_index];
    l_index++;
    i++;
  }
  while (r_index < rightArray.length) {
    arr[i] = rightArray[r_index];
    r_index++;
    i++;
  }
}

console.log(
  "Sorted By Quick Sort",
  quickSort(arr, 0, arr.length - 1, arr.length - 1)
);
mergeSort(arr, 0, arr.length - 1);
console.log("Sorted By Merge Sort", arr);
