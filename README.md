# Java IOs - Practical content template

This repository contains the template to the
[Java IOs](https://github.com/heig-vd-dai-course/heig-vd-dai-course/tree/main/05-java-ios)
practical content.
---
## Observations
### Binary
|       |  1B   | 1KiB  |   1MiB   |   5MiB   |
|:-----:|:-----:|:-----:|:--------:|:--------:|
| Write | 150ms | 151ms |  875ms   | 3'863ms  |
| Read  | 130ms | 150ms | 10'902ms | 54'820ms |
### Buffered Binary
|       |  1B   | 1KiB  |   1MiB   |   5MiB   |
|:-----:|:-----:|:-----:|:--------:|:--------:|
| Write | 130ms | 130ms |  160ms   |  250ms   |
| Read  | 140ms | 156ms | 10'890ms | 55'118ms |
### Text
|       |  1B   | 1KiB  |   1MiB   |   5MiB   |
|:-----:|:-----:|:-----:|:--------:|:--------:|
| Write | 135ms | 181ms |  260ms   |  440ms   |
| Read  | 154ms | 180ms | 21'675ms | 99'860ms |
### Buffered Text
|       |  1B   | 1KiB  |   1MiB   |   5MiB    |
|:-----:|:-----:|:-----:|:--------:|:---------:|
| Write | 134ms | 132ms |  238ms   |   312ms   |
| Read  | 127ms | 160ms | 20'530ms | 100'806ms |
#### Which type of stream is the most efficient for each use case?
Buffered Binary is by far the most efficient. Even though it comes pretty close with its unbuffered version for the reading part, it falls behind quite drastically on the writing part.
#### Why is it more efficient than the other types of streams?
Buffered means less calls are made to the Kernel/OS and then as it's written/read as binary, there's no encoding/decoding to go through.
#### What is the difference between binary data and text data?
The binary stores the data directly as 0s and 1s over Bytes. Whereas text data will need to be encoded over multiple Bytes. See table for ASCII [here](https://github.com/heig-vd-dai-course/heig-vd-dai-course/blob/main/05-java-ios/COURSE_MATERIAL.md#utf-8). 
#### What is a character encoding?
It is what tells the CPU how the characters have been stored and how it needs to interpret them so that it is readable and usable by a human. 
#### Why is this benchmark methodology important?
Because this way we can see for ourselves the importance of correctly choosing how to store our data so that our applications can run as smoothly as possible for the users.
It also allows us to see how important it is to know how the data have been stored to avoid nonsensical text.