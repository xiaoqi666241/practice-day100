# practiceDay100

LeetCode 刷题练习项目（Maven 单模块，Java 17 + JUnit 5）。

## 项目说明

- 单一 Maven 模块，所有题目放在同一个 `src` 下，不按天建独立模块。
- 包名按日期分目录，格式为 `_<yyyyMMdd>day<NNN>`（如 `_20261102day001`，下划线是因为 Java 包名不能以数字开头）。
- 类名格式：`LC + 四位题号 + 英文驼峰`，如 `LC0001_TwoSum`、`LC0003_LongestSubstring`，不统一叫 `Solution`。
- 公共数据结构（链表、二叉树节点）统一放 `com.practice.common`。
- 每天刷完题后更新 [docs/](docs/) 下对应笔记，并在下方进度表登记。

## 环境要求

- JDK 17+
- Maven 3.8+

## 常用命令

```bash
# 运行全部测试
mvn test

# 只跑某一天的测试
mvn test -Dtest="LC0001_TwoSumTest,LC0003_LongestSubstringTest"
```

## 刷题进度表

| 日期 | 题号 | 题目 | 难度 | 状态 | 笔记链接 |
|------|------|------|------|------|----------|
| 2026-11-02 | LC0001 | 两数之和（Two Sum） | 简单 | 已完成 | [docs/20261102day001.md](docs/20261102day001.md) |
| 2026-11-02 | LC0003 | 无重复字符的最长子串（Longest Substring Without Repeating Characters） | 中等 | 已完成 | [docs/20261102day001.md](docs/20261102day001.md) |

<!-- 新题追加到表格末尾即可 -->
