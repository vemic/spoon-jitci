# Spoon JITCI Project

このプロジェクトはSpoon 11.2.1を使用したJavaコード解析のサンプルプロジェクトです。

## 概要

Spoonは、Javaソースコードの静的解析、変換、生成を行うためのライブラリです。このプロジェクトでは、Spoonを使用した基本的なコード解析の例を提供しています。

## 必要条件

- Java 11以上
- Maven 3.6以上

## セットアップ

```bash
# 依存関係をダウンロード
mvn clean compile

# テストを実行
mvn test

# メインクラスを実行
mvn exec:java
```

## プロジェクト構造

```
src/
├── main/
│   ├── java/
│   │   └── com/example/
│   │       └── SpoonExample.java    # メインクラス
│   └── resources/
└── test/
    ├── java/
    │   └── com/example/
    │       └── SpoonExampleTest.java # テストクラス
    └── resources/
```

## 使用している依存関係

- **Spoon Core**: 11.2.1 - Javaコード解析ライブラリ
- **JUnit 5**: 5.10.0 - テストフレームワーク

## 実行例

プロジェクトを実行すると、以下のような出力が表示されます：

```
Spoon Example - Version 11.2.1
サンプルファイルを作成しました: target/sample/HelloWorld.java
クラス名: HelloWorld
  パッケージ: sample
  メソッド: sayHello
    戻り値型: void
    パラメータ数: 0
    ステートメント数: 1
  メソッド: add
    戻り値型: int
    パラメータ数: 2
    ステートメント数: 1

解析が完了しました。
```

## 開発

### ビルド

```bash
mvn clean compile
```

### テスト実行

```bash
mvn test
```

### パッケージ作成

```bash
mvn package
```

### 依存関係確認

```bash
mvn dependency:tree
```

## ライセンス

このプロジェクトはサンプル用途です。