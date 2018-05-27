---
layout: page
title: Py Wiki
category: python
tags: [python], [wiki]
---

Python을 활용하면서 자주 썼던 모듈이나 사용법을 위키로 정리해봅니다.

Using Python, I would like to summarize the modules and usages I used frequently with the wiki.

---

## List function

### 리스트 개념
리스트는 데이터 여러 개를 하나로 묶어 저장하는 모음집.

사용법은 대괄호 ([ ]) 안에 데이터 여러 개를 쉼표( , )로 구분하여 나열하면 된다.

리스트 인덱스의 주소는 0부터 시작하며, 위치 번호 -1은 마지막 값을 의미한다.


### 리스트 및 자료 정보 파악
- len(ar) 
  - 인덱스의 개수 즉, 리스트 길이를 구하는 함수.
  - [EX1] 
  - `ar = []`
  - [EX2[] 
  - `len(ar) # 리스트의 내용이 없으므로 0 출력`
  - `len( [1, 2, 3] ) #자료 개수가 세 개의 이므로 3 출력`

### 리스트 형태 변형
- split()
  -  괄호 안의 값을 기준으로 (비어 있을 경우, 공백을 기준으로) 문자열을 나누어준다.
  - [EX1]
  - `input().split() # 1 2 3 4 5 => ['1', '2', '3', '4', '5', '6']`

- sort()
  - 오름차순으로 정렬해주는 함수.
  - [EX1] 
  - `coordinate = [x1, x2, x3, x4] # 만일 값이 [4, 3, 2, 1] 라면,`
  - `coordinate.sort() # x 좌표를 sort. [1, 2, 3, 4]으로 sort.`  
  - * hash 자료형 중 하나인 딕셔너리(dictionary)에는 sorted()가 적용 가능하다.
  - [EX2] 
  - `rule = { 'K':3, 'Q':2, 'J':1, 'A':4 }`
  - `sorted(rule) # ['A', 'J', 'K', 'Q']`

### 자료의 추가 / 수정 /삭제 
- append(x)
  - 자료 x를 리스트의 맨 뒤에 추가해주는 함수.
  - [EX1] 
  - `ar = ['가', '나', '다']`
  - `ar.append('라')`
  - `ar #['가', '나', '다', '라']로 출력`
  - 리스트1에 리스트2를 append 할 수 있다. 
  - [EX2]
  - `lis = []`
  - `li.input().split()`
  - `lis.append(li)`

- pop(i)
  - i번 위치에 있는 인덱스를 리스트에서 pop 시키고(= 빼내기) 그 값을 함수의 결괏값으로 반환.
  - [EX1] 
  - `stack = [2, 1, 7]`
  - `stack.pop(2) # 7 출력, stack = [2, 1]`

- clear()
  - 리스트의 모든 자료를 지웁니다. 
  - [EX1]
  - `ar = [1, 2, 3]`
  - `ar.clear() # ar = [] 로 빈 리스트가 된다. `

