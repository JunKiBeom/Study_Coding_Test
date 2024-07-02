# [level 1] A+B - 6295 

[문제 링크](https://softeer.ai/practice/6295) 

### 성능 요약

메모리: 15.23 MB, 시간: 165 ms

### 구분

HOME > Challenge > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 06월 29일 01:34:48

### 문제 설명

<p>두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>


<div class="ide-example__input"><div class="ide-prompt__title"><strong>제약조건</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>두 정수 A와 B는 1이상 9이하의 정수이다.</span></p></p></div></div>

<hr>

<div class="ide-example__input"><div class="ide-prompt__title"><strong>입력형식</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>첫째 줄에 테스트 케이스의 개수 T가 주어진다.</span><br><span>  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.</span><br></p></p></div></div>

<hr>

<div class="ide-example__input"><div class="ide-prompt__title"><strong>출력형식</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>각 테스트 케이스마다 "Case #(테스트 케이스 번호): "를 출력한 다음, A+B를 출력한다.</span><br><span>  테스트 케이스 번호는 1부터 시작한다.</span><br></p></p></div></div>

<hr>

<div class="ide-question__example"><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>입력 예시 1</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">5<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
1<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>1<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
2<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>3<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
3<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>4<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
9<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>8<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
5<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>2</p></div></div><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>출력 예시 1</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">Case<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>#1:<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>2<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
Case<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>#2:<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>5<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
Case<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>#3:<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>7<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
Case<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>#4:<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>17<span class="test-case-format-entity" style="font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">↵</span>
Case<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>#5:<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>7</p></div></div></div>


> 출처: Softeer 코딩 테스트 연습, https://softeer.ai/practice/6295