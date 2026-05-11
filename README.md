# TextUtils — Java Text Utility Tool

A simple Java utility tool that provides common text and string operations.  
Developed as part of **SWE 442 — Software Configuration Management**.

---

## Group Members


- Member 1 — [Name]

- Elias Dhafer Alsirhani

- Ziad Ali Al-Shammari
- Member 3 — [Name]

---

## What Does This Tool Do?

TextUtils is a lightweight Java utility that helps process and analyze text strings. It currently supports:

- **Reverse a String** — returns any string in reverse order
- **Count Words** — counts the number of words in a sentence
- **Palindrome Check** — checks if a string reads the same forwards and backwards (case-insensitive)

---

## Project Structure

```
SCM442-JavaTool/
├── Main.java          # Entry point — runs demos of all utility methods
├── TextUtils.java     # Core utility class with all text operations
├── README.md          # Project documentation
└── RELEASE_NOTES.md   # Version changelog
```

---

## How to Compile and Run

Make sure you have **Java (JDK 8 or higher)** installed.

**Compile:**
```bash
javac TextUtils.java Main.java
```

**Run:**
```bash
java Main
```

**Expected Output:**
```
=== TextUtils Java Utility Tool ===

Original:        Hello, World!
Reversed:        !dlroW ,olleH

Sentence:        Software configuration management is important
Word count:      5

"racecar" is palindrome: true
"hello" is palindrome: false
"A man a plan a canal Panama" is palindrome: true
```

---

## Branching Strategy

This project follows a feature branching workflow:

| Branch | Description |
|---|---|
| `main` | Stable, production-ready code |
| `feature/add-reverse-string` | Added reverseString feature |
| `feature/add-word-count` | Added countWords feature |

---

## Releases

| Tag | Description |
|---|---|
| `v1.0` | Initial release with basic project setup |
| `v1.1` | Feature update — added reverseString and countWords |
