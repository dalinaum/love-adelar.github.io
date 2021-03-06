---
layout: post
title: Py Module & Operations wiki
category: python
tags: [python], wiki
---

Python3 을 활용하면서 자주 썼던 모듈과 연산을 위키로 정리해봅니다.

Using Python3, I would like to summarize the modules and operations I used frequently with the wiki.

---
# Sequence type
* 문자열 (str), 유니코드 (unicode), 리스트 (list), 튜플 (tuple), 버퍼(buffer), xrange가 python의 자료형.
* 시퀀스 자료형에 포함된 각 객체는 index로 참조시킬 수 있다.
* 각 객체는 순서를 가진다.
* Python의 Sequence type에 관한 자료 : https://docs.python.org/2.4/lib/typesseq.html .

## List function

### 리스트 개념
리스트는 데이터 여러 개를 하나로 묶어 저장하는 모음집.

* 사용법: 대괄호 ([ ]) 안에 데이터 여러 개를 쉼표( , )로 구분하여 나열한다.
* 리스트 인덱스의 주소는 0부터 시작하며, 위치 번호 -1은 마지막 값을 의미한다.
* 리스트 [:]는 전체 리스트를 출력 받을 수 있게 한다.

### 리스트 및 자료 정보 파악
- len(ar)
  - 인덱스의 개수 즉, 리스트 길이를 구하는 함수.
  - [EX1]
  - `>>> ar = []`
  - [EX2[]
  - `>>> len(ar) # 리스트의 내용이 없으므로 0 출력`
  - `>>> len( [1, 2, 3] ) #자료 개수가 세 개의 이므로 3 출력`

- count(x)
  - 리스트에서 x 값이 나오는 횟수를 알려주는 함수.
  - [EX1]
  - `>>> ar = [66.25, 333, 333, 1, 1234.5]`
  - `>>> print(ar.count(333) # 2`

### 리스트 인덱스 형태 변형
- split()
  -  괄호 안의 값을 기준으로 (비어 있을 경우, 공백을 기준으로) 문자열을 나누어준다.
  - [EX1]
  - `>>> input().split() # 1 2 3 4 5 => ['1', '2', '3', '4', '5', '6']`

- sort()
  - 오름차순으로 정렬해주는 함수.
  - [EX1]
  - `>>> coordinate = [x1, x2, x3, x4] # 만일 값이 [4, 3, 2, 1] 라면,`
  - `>>> coordinate.sort() # x 좌표를 sort. [1, 2, 3, 4]으로 sort.`  
  - * 참고 : hash 자료형 중 하나인 딕셔너리(dictionary)에는 sorted()가 적용 가능하다.
  - [EX2]
  - `>>> rule = { 'K':3, 'Q':2, 'J':1, 'A':4 }`
  - `>>> sorted(rule) # ['A', 'J', 'K', 'Q']`

- reverse()
  - 리스트 값을 반대로 정렬하는 함수
  - [EX1]
  - `>>> a = [66.25, -1, 333, 1, 1234.5, 333]`
  - `>>> a.reverse() # [333, 1234.5, 1, 333, -1, 66.25]`

### 리스트 인덱스의 추가 / 수정 /삭제
- append(x)
  - 자료 x (object)를 리스트의 맨 뒤에 추가해주는 함수.
  - [EX1]
  - `>>> ar = ['가', '나', '다']`
  - `>>> ar.append('라')`
  - `>>> ar #['가', '나', '다', '라']로 출력`
  - 리스트1에 리스트2를 append 할 수 있다.
  - [EX2]
  - `>>> lis = [1, 2, 3]`
  - `>>> li = [4, 5]`
  - `>>> lis.append(li) #[1, 2, 3, [4, 5]]`

- extend()
  - iterable 객체(리스트, 튜플, 딕셔너리)의 요소를 list에 추가해주는 함수.
  - [EX1]
  - `>>> lis = [1, 2, 3]`
  - `>>> li = [4, 5]`
  - `>>> lis.append(li) # [1. 2. 3. 4, 5]`

- insert(i, x)
    - 리스트의 주어진 자리에 아이템을 삽입시켜주는 함수.
    - i 는 리스트의 위치

- pop(i)
  - i번 위치에 있는 인덱스를 리스트에서 pop 시키고(= 빼내기) 그 값을 함수의 결괏값으로 반환.
  - [EX1]
  - `>>> stack = [2, 1, 7]`
  - `>>> stack.pop(2) # 7 출력, stack = [2, 1]`
  - * 참고 : pop() function vs del statement
  - * pop(i)는 i 값을 출력한 후 나머지 리스트 값들을 출력하는 함수이다.
  - [EX2]
  - `a = [1, 2, 3, 4, 5]`
  - `del a[0] # [2, 3, 4, 5]`
  - * del 문은 출력 없이 인덱스 값을 삭제한다.
  - [EX3]
  - `a.pop(1) # 1출력, a = [2, 3, 4, 5]`

- remove(x)
  - 리스트에서 자료 값 x를 삭제하는 함수.
  - [EX1]
  - `>>> ar = [16.3, 754, 642.1]`
  - `>>> ar.remove(754) # [16.3, 642.1]`

- clear()
  - 리스트의 모든 자료를 지워주는 함수.
  - [EX1]
  - `>>> ar = [1, 2, 3]`
  - `>>> ar.clear() # ar = [] 로 빈 리스트가 된다.`

  ## Tuples and Sequences
