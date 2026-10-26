package com.jlpt.n5.data

object DataFixtures {
    val KANJI_RAW_JSON = """[
  {
    "id": 1,
    "kanji": "一",
    "hanViet": "NHẤT",
    "strokes": 1,
    "meaning": "Một",
    "onyomi": [
      "イチ",
      "イツ"
    ],
    "kunyomi": [
      "ひと",
      "ひと.つ"
    ],
    "examples": [
      {
        "word": "一つ",
        "reading": "ひとつ",
        "meaning": "Một cái"
      },
      {
        "word": "一人",
        "reading": "ひとり",
        "meaning": "Một người"
      },
      {
        "word": "一日",
        "reading": "ついたち",
        "meaning": "Ngày mùng 1"
      }
    ]
  },
  {
    "id": 2,
    "kanji": "二",
    "hanViet": "NHỊ",
    "strokes": 2,
    "meaning": "Hai",
    "onyomi": [
      "ニ"
    ],
    "kunyomi": [
      "ふた",
      "ふた.つ"
    ],
    "examples": [
      {
        "word": "二つ",
        "reading": "ふたつ",
        "meaning": "Hai cái"
      },
      {
        "word": "二人",
        "reading": "ふたり",
        "meaning": "Hai người"
      },
      {
        "word": "二月",
        "reading": "にがつ",
        "meaning": "Tháng 2"
      }
    ]
  },
  {
    "id": 3,
    "kanji": "三",
    "hanViet": "TAM",
    "strokes": 3,
    "meaning": "Ba",
    "onyomi": [
      "サン"
    ],
    "kunyomi": [
      "み",
      "み.つ",
      "みっ.つ"
    ],
    "examples": [
      {
        "word": "三つ",
        "reading": "みっつ",
        "meaning": "Ba cái"
      },
      {
        "word": "三人",
        "reading": "さんにん",
        "meaning": "Ba người"
      },
      {
        "word": "三日",
        "reading": "みっか",
        "meaning": "Ngày mùng 3"
      }
    ]
  },
  {
    "id": 4,
    "kanji": "四",
    "hanViet": "TỨ",
    "strokes": 5,
    "meaning": "Bốn",
    "onyomi": [
      "シ"
    ],
    "kunyomi": [
      "よ",
      "よ.つ",
      "よっ.つ",
      "よん"
    ],
    "examples": [
      {
        "word": "四つ",
        "reading": "よっつ",
        "meaning": "Bốn cái"
      },
      {
        "word": "四日",
        "reading": "よっか",
        "meaning": "Ngày mùng 4"
      },
      {
        "word": "四月",
        "reading": "しがつ",
        "meaning": "Tháng 4"
      }
    ]
  },
  {
    "id": 5,
    "kanji": "五",
    "hanViet": "NGŨ",
    "strokes": 4,
    "meaning": "Năm",
    "onyomi": [
      "ゴ"
    ],
    "kunyomi": [
      "いつ",
      "いつ.つ"
    ],
    "examples": [
      {
        "word": "五つ",
        "reading": "いつつ",
        "meaning": "Năm cái"
      },
      {
        "word": "五日",
        "reading": "いつか",
        "meaning": "Ngày mùng 5"
      },
      {
        "word": "五月",
        "reading": "ごがつ",
        "meaning": "Tháng 5"
      }
    ]
  },
  {
    "id": 6,
    "kanji": "六",
    "hanViet": "LỤC",
    "strokes": 4,
    "meaning": "Sáu",
    "onyomi": [
      "ロク"
    ],
    "kunyomi": [
      "む",
      "む.つ",
      "むっ.つ"
    ],
    "examples": [
      {
        "word": "六つ",
        "reading": "むっつ",
        "meaning": "Sáu cái"
      },
      {
        "word": "六日",
        "reading": "むいか",
        "meaning": "Ngày mùng 6"
      },
      {
        "word": "六月",
        "reading": "ろくがつ",
        "meaning": "Tháng 6"
      }
    ]
  },
  {
    "id": 7,
    "kanji": "七",
    "hanViet": "THẤT",
    "strokes": 2,
    "meaning": "Bảy",
    "onyomi": [
      "シチ"
    ],
    "kunyomi": [
      "なな",
      "なな.つ",
      "なの"
    ],
    "examples": [
      {
        "word": "七つ",
        "reading": "ななつ",
        "meaning": "Bảy cái"
      },
      {
        "word": "七日",
        "reading": "なのか",
        "meaning": "Ngày mùng 7"
      },
      {
        "word": "七月",
        "reading": "しちがつ",
        "meaning": "Tháng 7"
      }
    ]
  },
  {
    "id": 8,
    "kanji": "八",
    "hanViet": "BÁT",
    "strokes": 2,
    "meaning": "Tám",
    "onyomi": [
      "ハチ"
    ],
    "kunyomi": [
      "や",
      "や.つ",
      "やっ.つ",
      "よう"
    ],
    "examples": [
      {
        "word": "八つ",
        "reading": "やっつ",
        "meaning": "Tám cái"
      },
      {
        "word": "八日",
        "reading": "ようか",
        "meaning": "Ngày mùng 8"
      },
      {
        "word": "八月",
        "reading": "はちがつ",
        "meaning": "Tháng 8"
      }
    ]
  },
  {
    "id": 9,
    "kanji": "九",
    "hanViet": "CỬU",
    "strokes": 2,
    "meaning": "Chín",
    "onyomi": [
      "キュウ",
      "ク"
    ],
    "kunyomi": [
      "ここの",
      "ここの.つ"
    ],
    "examples": [
      {
        "word": "九つ",
        "reading": "ここのつ",
        "meaning": "Chín cái"
      },
      {
        "word": "九日",
        "reading": "ここのか",
        "meaning": "Ngày mùng 9"
      },
      {
        "word": "九月",
        "reading": "くがつ",
        "meaning": "Tháng 9"
      }
    ]
  },
  {
    "id": 10,
    "kanji": "十",
    "hanViet": "THẬP",
    "strokes": 2,
    "meaning": "Mười",
    "onyomi": [
      "ジュウ",
      "ジッ"
    ],
    "kunyomi": [
      "とお",
      "と"
    ],
    "examples": [
      {
        "word": "十",
        "reading": "とお",
        "meaning": "Mười cái"
      },
      {
        "word": "十日",
        "reading": "とおか",
        "meaning": "Ngày mùng 10"
      },
      {
        "word": "十分",
        "reading": "じゅっぷん",
        "meaning": "10 phút"
      }
    ]
  },
  {
    "id": 11,
    "kanji": "百",
    "hanViet": "BÁCH",
    "strokes": 6,
    "meaning": "Trăm",
    "onyomi": [
      "ヒャク"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "百",
        "reading": "ひゃく",
        "meaning": "100"
      },
      {
        "word": "三百",
        "reading": "さんびゃく",
        "meaning": "300"
      },
      {
        "word": "六百",
        "reading": "ろっぴゃく",
        "meaning": "600"
      }
    ]
  },
  {
    "id": 12,
    "kanji": "千",
    "hanViet": "THIÊN",
    "strokes": 3,
    "meaning": "Nghìn",
    "onyomi": [
      "セン"
    ],
    "kunyomi": [
      "ち"
    ],
    "examples": [
      {
        "word": "千",
        "reading": "せん",
        "meaning": "1000"
      },
      {
        "word": "三千",
        "reading": "さんぜん",
        "meaning": "3000"
      },
      {
        "word": "八千",
        "reading": "はっせん",
        "meaning": "8000"
      }
    ]
  },
  {
    "id": 13,
    "kanji": "万",
    "hanViet": "VẠN",
    "strokes": 3,
    "meaning": "Mười nghìn",
    "onyomi": [
      "マン",
      "バン"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "一万",
        "reading": "いちまん",
        "meaning": "10,000"
      },
      {
        "word": "万国",
        "reading": "ばんこく",
        "meaning": "Vạn quốc / muôn nước"
      }
    ]
  },
  {
    "id": 14,
    "kanji": "円",
    "hanViet": "VIÊN",
    "strokes": 4,
    "meaning": "Yên Nhật / Tròn",
    "onyomi": [
      "エン"
    ],
    "kunyomi": [
      "まる.い"
    ],
    "examples": [
      {
        "word": "百円",
        "reading": "ひゃくえん",
        "meaning": "100 yên"
      },
      {
        "word": "円い",
        "reading": "まるい",
        "meaning": "Tròn"
      }
    ]
  },
  {
    "id": 15,
    "kanji": "日",
    "hanViet": "NHẬT",
    "strokes": 4,
    "meaning": "Ngày / Mặt trời",
    "onyomi": [
      "ニチ",
      "ジツ"
    ],
    "kunyomi": [
      "ひ",
      "-び",
      "-か"
    ],
    "examples": [
      {
        "word": "日曜日",
        "reading": "にちようび",
        "meaning": "Chủ nhật"
      },
      {
        "word": "日本",
        "reading": "にほん",
        "meaning": "Nhật Bản"
      },
      {
        "word": "今日",
        "reading": "きょう",
        "meaning": "Hôm nay"
      }
    ]
  },
  {
    "id": 16,
    "kanji": "月",
    "hanViet": "NGUYỆT",
    "strokes": 4,
    "meaning": "Tháng / Mặt trăng",
    "onyomi": [
      "ゲツ",
      "ガツ"
    ],
    "kunyomi": [
      "つき"
    ],
    "examples": [
      {
        "word": "月曜日",
        "reading": "げつようび",
        "meaning": "Thứ hai"
      },
      {
        "word": "一月",
        "reading": "いちがつ",
        "meaning": "Tháng 1"
      },
      {
        "word": "今月",
        "reading": "こんげつ",
        "meaning": "Tháng này"
      }
    ]
  },
  {
    "id": 17,
    "kanji": "火",
    "hanViet": "HỎA",
    "strokes": 4,
    "meaning": "Lửa",
    "onyomi": [
      "カ"
    ],
    "kunyomi": [
      "ひ",
      "ほ-"
    ],
    "examples": [
      {
        "word": "火曜日",
        "reading": "かようび",
        "meaning": "Thứ ba"
      },
      {
        "word": "火",
        "reading": "ひ",
        "meaning": "Lửa"
      },
      {
        "word": "花火",
        "reading": "はなび",
        "meaning": "Pháo hoa"
      }
    ]
  },
  {
    "id": 18,
    "kanji": "水",
    "hanViet": "THỦY",
    "strokes": 4,
    "meaning": "Nước",
    "onyomi": [
      "スイ"
    ],
    "kunyomi": [
      "みず"
    ],
    "examples": [
      {
        "word": "水曜日",
        "reading": "すいようび",
        "meaning": "Thứ tư"
      },
      {
        "word": "水",
        "reading": "みず",
        "meaning": "Nước"
      },
      {
        "word": "水泳",
        "reading": "すいえい",
        "meaning": "Bơi lội"
      }
    ]
  },
  {
    "id": 19,
    "kanji": "木",
    "hanViet": "MỘC",
    "strokes": 4,
    "meaning": "Cây / Gỗ",
    "onyomi": [
      "モク",
      "ボク"
    ],
    "kunyomi": [
      "き",
      "こ-"
    ],
    "examples": [
      {
        "word": "木曜日",
        "reading": "もくようび",
        "meaning": "Thứ năm"
      },
      {
        "word": "木",
        "reading": "き",
        "meaning": "Cây"
      }
    ]
  },
  {
    "id": 20,
    "kanji": "金",
    "hanViet": "KIM",
    "strokes": 8,
    "meaning": "Vàng / Tiền",
    "onyomi": [
      "キン",
      "コン"
    ],
    "kunyomi": [
      "かね",
      "かな-"
    ],
    "examples": [
      {
        "word": "金曜日",
        "reading": "きんようび",
        "meaning": "Thứ sáu"
      },
      {
        "word": "お金",
        "reading": "おかね",
        "meaning": "Tiền"
      },
      {
        "word": "金",
        "reading": "きん",
        "meaning": "Vàng"
      }
    ]
  },
  {
    "id": 21,
    "kanji": "土",
    "hanViet": "THỔ",
    "strokes": 3,
    "meaning": "Đất",
    "onyomi": [
      "ド",
      "ト"
    ],
    "kunyomi": [
      "つち"
    ],
    "examples": [
      {
        "word": "土曜日",
        "reading": "どようび",
        "meaning": "Thứ bảy"
      },
      {
        "word": "土地",
        "reading": "とち",
        "meaning": "Đất đai"
      }
    ]
  },
  {
    "id": 22,
    "kanji": "曜",
    "hanViet": "DIỆU",
    "strokes": 18,
    "meaning": "Thứ trong tuần",
    "onyomi": [
      "ヨウ"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "何曜日",
        "reading": "なんようび",
        "meaning": "Thứ mấy"
      },
      {
        "word": "曜日",
        "reading": "ようび",
        "meaning": "Thứ"
      }
    ]
  },
  {
    "id": 23,
    "kanji": "年",
    "hanViet": "NIÊN",
    "strokes": 6,
    "meaning": "Năm",
    "onyomi": [
      "ネン"
    ],
    "kunyomi": [
      "とし"
    ],
    "examples": [
      {
        "word": "今年",
        "reading": "ことし",
        "meaning": "Năm nay"
      },
      {
        "word": "去年",
        "reading": "きょねん",
        "meaning": "Năm ngoái"
      },
      {
        "word": "来年",
        "reading": "らいねん",
        "meaning": "Năm sau"
      }
    ]
  },
  {
    "id": 24,
    "kanji": "今",
    "hanViet": "KIM",
    "strokes": 4,
    "meaning": "Bây giờ / Nay",
    "onyomi": [
      "コン",
      "キン"
    ],
    "kunyomi": [
      "いま"
    ],
    "examples": [
      {
        "word": "今",
        "reading": "いま",
        "meaning": "Bây giờ"
      },
      {
        "word": "今週",
        "reading": "こんしゅう",
        "meaning": "Tuần này"
      },
      {
        "word": "今晩",
        "reading": "こんばん",
        "meaning": "Tối nay"
      }
    ]
  },
  {
    "id": 25,
    "kanji": "時",
    "hanViet": "THỜI",
    "strokes": 10,
    "meaning": "Thời gian / Giờ",
    "onyomi": [
      "ジ"
    ],
    "kunyomi": [
      "とき"
    ],
    "examples": [
      {
        "word": "一時",
        "reading": "いちじ",
        "meaning": "1 giờ"
      },
      {
        "word": "時間",
        "reading": "じかん",
        "meaning": "Thời gian"
      },
      {
        "word": "時計",
        "reading": "とけい",
        "meaning": "Đồng hồ"
      }
    ]
  },
  {
    "id": 26,
    "kanji": "間",
    "hanViet": "GIAN",
    "strokes": 12,
    "meaning": "Khoảng giữa / Gian",
    "onyomi": [
      "カン",
      "ケン"
    ],
    "kunyomi": [
      "あいだ",
      "ま"
    ],
    "examples": [
      {
        "word": "時間",
        "reading": "じかん",
        "meaning": "Thời gian / Tiếng đồng hồ"
      },
      {
        "word": "間に合う",
        "reading": "まにあう",
        "meaning": "Kịp giờ"
      }
    ]
  },
  {
    "id": 27,
    "kanji": "分",
    "hanViet": "PHÂN",
    "strokes": 4,
    "meaning": "Phút / Chia / Hiểu",
    "onyomi": [
      "フン",
      "ブン",
      "ブ"
    ],
    "kunyomi": [
      "わ.ける",
      "わ.かる"
    ],
    "examples": [
      {
        "word": "五分",
        "reading": "ごふん",
        "meaning": "5 phút"
      },
      {
        "word": "半分",
        "reading": "はんぶん",
        "meaning": "Một nửa"
      },
      {
        "word": "分かる",
        "reading": "わかる",
        "meaning": "Hiểu"
      }
    ]
  },
  {
    "id": 28,
    "kanji": "半",
    "hanViet": "BÁN",
    "strokes": 5,
    "meaning": "Nửa / Rưỡi",
    "onyomi": [
      "ハン"
    ],
    "kunyomi": [
      "なか.ば"
    ],
    "examples": [
      {
        "word": "一時半",
        "reading": "いちじはん",
        "meaning": "1 giờ rưỡi"
      },
      {
        "word": "半年",
        "reading": "はんとし",
        "meaning": "Nửa năm"
      }
    ]
  },
  {
    "id": 29,
    "kanji": "午",
    "hanViet": "NGỌ",
    "strokes": 4,
    "meaning": "Ngọ (Trưa)",
    "onyomi": [
      "ゴ"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "午前",
        "reading": "ごぜん",
        "meaning": "Buổi sáng (AM)"
      },
      {
        "word": "午後",
        "reading": "ごご",
        "meaning": "Buổi chiều (PM)"
      }
    ]
  },
  {
    "id": 30,
    "kanji": "前",
    "hanViet": "TIỀN",
    "strokes": 9,
    "meaning": "Trước",
    "onyomi": [
      "ゼン"
    ],
    "kunyomi": [
      "まえ"
    ],
    "examples": [
      {
        "word": "前",
        "reading": "まえ",
        "meaning": "Phía trước"
      },
      {
        "word": "名前",
        "reading": "なまえ",
        "meaning": "Tên"
      },
      {
        "word": "午前",
        "reading": "ごぜん",
        "meaning": "Buổi sáng"
      }
    ]
  },
  {
    "id": 31,
    "kanji": "後",
    "hanViet": "HẬU",
    "strokes": 9,
    "meaning": "Sau",
    "onyomi": [
      "ゴ",
      "コウ"
    ],
    "kunyomi": [
      "のち",
      "うし.ろ",
      "あと"
    ],
    "examples": [
      {
        "word": "後ろ",
        "reading": "うしろ",
        "meaning": "Phía sau"
      },
      {
        "word": "午後",
        "reading": "ごご",
        "meaning": "Buổi chiều"
      },
      {
        "word": "後で",
        "reading": "あとで",
        "meaning": "Lát sau"
      }
    ]
  },
  {
    "id": 32,
    "kanji": "上",
    "hanViet": "THƯỢNG",
    "strokes": 3,
    "meaning": "Trên / Lên",
    "onyomi": [
      "ジョウ"
    ],
    "kunyomi": [
      "うえ",
      "あ.がる",
      "のぼ.る"
    ],
    "examples": [
      {
        "word": "上",
        "reading": "うえ",
        "meaning": "Trên"
      },
      {
        "word": "上手",
        "reading": "じょうず",
        "meaning": "Giỏi"
      },
      {
        "word": "上がる",
        "reading": "あがる",
        "meaning": "Đi lên"
      }
    ]
  },
  {
    "id": 33,
    "kanji": "下",
    "hanViet": "HẠ",
    "strokes": 3,
    "meaning": "Dưới / Xuống",
    "onyomi": [
      "カ",
      "ゲ"
    ],
    "kunyomi": [
      "した",
      "さ.がる",
      "くだ.る"
    ],
    "examples": [
      {
        "word": "下",
        "reading": "した",
        "meaning": "Dưới"
      },
      {
        "word": "下手",
        "reading": "へた",
        "meaning": "Dở, kém"
      },
      {
        "word": "地下鉄",
        "reading": "ちかてつ",
        "meaning": "Tàu điện ngầm"
      }
    ]
  },
  {
    "id": 34,
    "kanji": "中",
    "hanViet": "TRUNG",
    "strokes": 4,
    "meaning": "Trong / Giữa / Trung",
    "onyomi": [
      "チュウ"
    ],
    "kunyomi": [
      "なか"
    ],
    "examples": [
      {
        "word": "中",
        "reading": "なか",
        "meaning": "Bên trong"
      },
      {
        "word": "中国",
        "reading": "ちゅうごく",
        "meaning": "Trung Quốc"
      },
      {
        "word": "一日中",
        "reading": "いちにちじゅう",
        "meaning": "Suốt cả ngày"
      }
    ]
  },
  {
    "id": 35,
    "kanji": "大",
    "hanViet": "ĐẠI",
    "strokes": 3,
    "meaning": "Lớn / To",
    "onyomi": [
      "ダイ",
      "タイ"
    ],
    "kunyomi": [
      "おお",
      "おお.きい"
    ],
    "examples": [
      {
        "word": "大きい",
        "reading": "おおきい",
        "meaning": "To lớn"
      },
      {
        "word": "大学",
        "reading": "だいがく",
        "meaning": "Đại học"
      },
      {
        "word": "大変",
        "reading": "たいへん",
        "meaning": "Vất vả / Rất"
      }
    ]
  },
  {
    "id": 36,
    "kanji": "小",
    "hanViet": "TIỂU",
    "strokes": 3,
    "meaning": "Nhỏ / Bé",
    "onyomi": [
      "ショウ"
    ],
    "kunyomi": [
      "ちい.さい",
      "こ-",
      "お-"
    ],
    "examples": [
      {
        "word": "小さい",
        "reading": "ちいさい",
        "meaning": "Nhỏ bé"
      },
      {
        "word": "小学校",
        "reading": "しょうがっこう",
        "meaning": "Trường tiểu học"
      }
    ]
  },
  {
    "id": 37,
    "kanji": "人",
    "hanViet": "NHÂN",
    "strokes": 2,
    "meaning": "Người",
    "onyomi": [
      "ジン",
      "ニン"
    ],
    "kunyomi": [
      "ひと"
    ],
    "examples": [
      {
        "word": "人",
        "reading": "ひと",
        "meaning": "Người"
      },
      {
        "word": "日本人",
        "reading": "にほんじん",
        "meaning": "Người Nhật"
      },
      {
        "word": "三人",
        "reading": "さんにん",
        "meaning": "Ba người"
      }
    ]
  },
  {
    "id": 38,
    "kanji": "子",
    "hanViet": "TỬ",
    "strokes": 3,
    "meaning": "Đứa con / Trẻ con",
    "onyomi": [
      "シ",
      "ス"
    ],
    "kunyomi": [
      "こ"
    ],
    "examples": [
      {
        "word": "子ども",
        "reading": "こども",
        "meaning": "Trẻ con"
      },
      {
        "word": "女の子",
        "reading": "おんなのこ",
        "meaning": "Bé gái"
      }
    ]
  },
  {
    "id": 39,
    "kanji": "女",
    "hanViet": "NỮ",
    "strokes": 3,
    "meaning": "Nữ / Phụ nữ",
    "onyomi": [
      "ジョ",
      "ニョ"
    ],
    "kunyomi": [
      "おんな",
      "め"
    ],
    "examples": [
      {
        "word": "女の人",
        "reading": "おんなのひと",
        "meaning": "Phụ nữ"
      },
      {
        "word": "彼女",
        "reading": "かのじょ",
        "meaning": "Cô ấy / Bạn gái"
      }
    ]
  },
  {
    "id": 40,
    "kanji": "男",
    "hanViet": "NAM",
    "strokes": 7,
    "meaning": "Nam / Đàn ông",
    "onyomi": [
      "ダン",
      "ナン"
    ],
    "kunyomi": [
      "おとこ"
    ],
    "examples": [
      {
        "word": "男の人",
        "reading": "おとこのひと",
        "meaning": "Đàn ông"
      },
      {
        "word": "男の子",
        "reading": "おとこのこ",
        "meaning": "Bé trai"
      }
    ]
  },
  {
    "id": 41,
    "kanji": "父",
    "hanViet": "PHỤ",
    "strokes": 4,
    "meaning": "Cha / Bố",
    "onyomi": [
      "フ"
    ],
    "kunyomi": [
      "ちち"
    ],
    "examples": [
      {
        "word": "父",
        "reading": "ちち",
        "meaning": "Bố (mình)"
      },
      {
        "word": "お父さん",
        "reading": "おとうさん",
        "meaning": "Bố (người khác)"
      }
    ]
  },
  {
    "id": 42,
    "kanji": "母",
    "hanViet": "MẪU",
    "strokes": 5,
    "meaning": "Mẹ",
    "onyomi": [
      "ボ"
    ],
    "kunyomi": [
      "はは"
    ],
    "examples": [
      {
        "word": "母",
        "reading": "はは",
        "meaning": "Mẹ (mình)"
      },
      {
        "word": "お母さん",
        "reading": "おかあさん",
        "meaning": "Mẹ (người khác)"
      }
    ]
  },
  {
    "id": 43,
    "kanji": "友",
    "hanViet": "HỮU",
    "strokes": 4,
    "meaning": "Bạn bè",
    "onyomi": [
      "ユウ"
    ],
    "kunyomi": [
      "とも"
    ],
    "examples": [
      {
        "word": "友達",
        "reading": "ともだち",
        "meaning": "Bạn bè"
      },
      {
        "word": "友人",
        "reading": "ゆうじん",
        "meaning": "Bạn bè (trang trọng)"
      }
    ]
  },
  {
    "id": 44,
    "kanji": "本",
    "hanViet": "BẢN",
    "strokes": 5,
    "meaning": "Sách / Gốc / Bản",
    "onyomi": [
      "ホン"
    ],
    "kunyomi": [
      "もと"
    ],
    "examples": [
      {
        "word": "本",
        "reading": "ほん",
        "meaning": "Quyển sách"
      },
      {
        "word": "日本",
        "reading": "にほん",
        "meaning": "Nhật Bản"
      },
      {
        "word": "山本さん",
        "reading": "やまもとさん",
        "meaning": "Anh/chị Yamamoto"
      }
    ]
  },
  {
    "id": 45,
    "kanji": "先",
    "hanViet": "TIÊN",
    "strokes": 6,
    "meaning": "Trước / Tiên",
    "onyomi": [
      "セン"
    ],
    "kunyomi": [
      "さき"
    ],
    "examples": [
      {
        "word": "先生",
        "reading": "せんせい",
        "meaning": "Thầy cô giáo"
      },
      {
        "word": "先週",
        "reading": "せんしゅう",
        "meaning": "Tuần trước"
      },
      {
        "word": "お先に",
        "reading": "おさきに",
        "meaning": "Tôi xin phép trước"
      }
    ]
  },
  {
    "id": 46,
    "kanji": "生",
    "hanViet": "SINH",
    "strokes": 5,
    "meaning": "Sống / Sinh ra",
    "onyomi": [
      "セイ",
      "ショウ"
    ],
    "kunyomi": [
      "い.きる",
      "う.まれる",
      "なま"
    ],
    "examples": [
      {
        "word": "学生",
        "reading": "がくせい",
        "meaning": "Học sinh/Sinh viên"
      },
      {
        "word": "生まれる",
        "reading": "うまれる",
        "meaning": "Sinh ra"
      },
      {
        "word": "先生",
        "reading": "せんせい",
        "meaning": "Thầy cô giáo"
      }
    ]
  },
  {
    "id": 47,
    "kanji": "学",
    "hanViet": "HỌC",
    "strokes": 8,
    "meaning": "Học",
    "onyomi": [
      "ガク"
    ],
    "kunyomi": [
      "まな.ぶ"
    ],
    "examples": [
      {
        "word": "大学",
        "reading": "だいがく",
        "meaning": "Đại học"
      },
      {
        "word": "学校",
        "reading": "がっこう",
        "meaning": "Trường học"
      },
      {
        "word": "学生",
        "reading": "がくせい",
        "meaning": "Học sinh"
      }
    ]
  },
  {
    "id": 48,
    "kanji": "校",
    "hanViet": "HIỆU",
    "strokes": 10,
    "meaning": "Trường học",
    "onyomi": [
      "コウ"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "学校",
        "reading": "がっこう",
        "meaning": "Trường học"
      },
      {
        "word": "高校",
        "reading": "こうこう",
        "meaning": "Trường THPT"
      }
    ]
  },
  {
    "id": 49,
    "kanji": "国",
    "hanViet": "QUỐC",
    "strokes": 8,
    "meaning": "Đất nước",
    "onyomi": [
      "コク"
    ],
    "kunyomi": [
      "くに"
    ],
    "examples": [
      {
        "word": "国",
        "reading": "くに",
        "meaning": "Đất nước"
      },
      {
        "word": "外国",
        "reading": "がいこく",
        "meaning": "Nước ngoài"
      },
      {
        "word": "外国人",
        "reading": "がいこくじん",
        "meaning": "Người nước ngoài"
      }
    ]
  },
  {
    "id": 50,
    "kanji": "語",
    "hanViet": "NGỮ",
    "strokes": 14,
    "meaning": "Ngôn ngữ / Tiếng",
    "onyomi": [
      "ゴ"
    ],
    "kunyomi": [
      "かた.る"
    ],
    "examples": [
      {
        "word": "日本語",
        "reading": "にほんご",
        "meaning": "Tiếng Nhật"
      },
      {
        "word": "英語",
        "reading": "えいご",
        "meaning": "Tiếng Anh"
      },
      {
        "word": "ベトナム語",
        "reading": "べとなむご",
        "meaning": "Tiếng Việt"
      }
    ]
  },
  {
    "id": 51,
    "kanji": "何",
    "hanViet": "HÀ",
    "strokes": 7,
    "meaning": "Cái gì",
    "onyomi": [
      "カ"
    ],
    "kunyomi": [
      "なに",
      "なん"
    ],
    "examples": [
      {
        "word": "何",
        "reading": "なに",
        "meaning": "Cái gì"
      },
      {
        "word": "何時",
        "reading": "なんじ",
        "meaning": "Mấy giờ"
      },
      {
        "word": "何人",
        "reading": "なんにん",
        "meaning": "Mấy người"
      }
    ]
  },
  {
    "id": 52,
    "kanji": "行",
    "hanViet": "HÀNH",
    "strokes": 6,
    "meaning": "Đi / Tổ chức",
    "onyomi": [
      "コウ",
      "ギョウ"
    ],
    "kunyomi": [
      "い.く",
      "ゆ.く",
      "おこな.う"
    ],
    "examples": [
      {
        "word": "行く",
        "reading": "いく",
        "meaning": "Đi"
      },
      {
        "word": "旅行",
        "reading": "りょこう",
        "meaning": "Du lịch"
      },
      {
        "word": "銀行",
        "reading": "ぎんこう",
        "meaning": "Ngân hàng"
      }
    ]
  },
  {
    "id": 53,
    "kanji": "来",
    "hanViet": "LAI",
    "strokes": 7,
    "meaning": "Đến",
    "onyomi": [
      "ライ"
    ],
    "kunyomi": [
      "く.る",
      "き.たる",
      "き.ます"
    ],
    "examples": [
      {
        "word": "来る",
        "reading": "くる",
        "meaning": "Đến"
      },
      {
        "word": "来週",
        "reading": "らいしゅう",
        "meaning": "Tuần sau"
      },
      {
        "word": "来月",
        "reading": "らいげつ",
        "meaning": "Tháng sau"
      }
    ]
  },
  {
    "id": 54,
    "kanji": "帰",
    "hanViet": "QUY",
    "strokes": 10,
    "meaning": "Trở về",
    "onyomi": [
      "キ"
    ],
    "kunyomi": [
      "かえ.る"
    ],
    "examples": [
      {
        "word": "帰る",
        "reading": "かえる",
        "meaning": "Về nhà"
      },
      {
        "word": "帰国",
        "reading": "きこく",
        "meaning": "Về nước"
      }
    ]
  },
  {
    "id": 55,
    "kanji": "見",
    "hanViet": "KIẾN",
    "strokes": 7,
    "meaning": "Xem / Nhìn",
    "onyomi": [
      "ケン"
    ],
    "kunyomi": [
      "み.る",
      "み.える",
      "み.せる"
    ],
    "examples": [
      {
        "word": "見る",
        "reading": "みる",
        "meaning": "Xem, nhìn"
      },
      {
        "word": "見せる",
        "reading": "みせる",
        "meaning": "Cho xem"
      },
      {
        "word": "意見",
        "reading": "いけん",
        "meaning": "Ý kiến"
      }
    ]
  },
  {
    "id": 56,
    "kanji": "聞",
    "hanViet": "VĂN",
    "strokes": 14,
    "meaning": "Nghe / Hỏi",
    "onyomi": [
      "ブン",
      "モン"
    ],
    "kunyomi": [
      "き.く",
      "き.こえる"
    ],
    "examples": [
      {
        "word": "聞く",
        "reading": "きく",
        "meaning": "Nghe, hỏi"
      },
      {
        "word": "新聞",
        "reading": "しんぶん",
        "meaning": "Tờ báo"
      }
    ]
  },
  {
    "id": 57,
    "kanji": "食",
    "hanViet": "THỰC",
    "strokes": 9,
    "meaning": "Ăn / Thực phẩm",
    "onyomi": [
      "ショク"
    ],
    "kunyomi": [
      "た.べる",
      "く.う"
    ],
    "examples": [
      {
        "word": "食べる",
        "reading": "たべる",
        "meaning": "Ăn"
      },
      {
        "word": "食べ物",
        "reading": "たべもの",
        "meaning": "Đồ ăn"
      },
      {
        "word": "食堂",
        "reading": "しょくどう",
        "meaning": "Nhà ăn"
      }
    ]
  },
  {
    "id": 58,
    "kanji": "飲",
    "hanViet": "ẨM",
    "strokes": 12,
    "meaning": "Uống",
    "onyomi": [
      "イン"
    ],
    "kunyomi": [
      "の.む"
    ],
    "examples": [
      {
        "word": "飲む",
        "reading": "のむ",
        "meaning": "Uống"
      },
      {
        "word": "飲み物",
        "reading": "のみもの",
        "meaning": "Đồ uống"
      }
    ]
  },
  {
    "id": 59,
    "kanji": "買",
    "hanViet": "MÃI",
    "strokes": 12,
    "meaning": "Mua",
    "onyomi": [
      "バイ"
    ],
    "kunyomi": [
      "か.う"
    ],
    "examples": [
      {
        "word": "買う",
        "reading": "かう",
        "meaning": "Mua"
      },
      {
        "word": "買い物",
        "reading": "かいもの",
        "meaning": "Mua sắm"
      }
    ]
  },
  {
    "id": 60,
    "kanji": "書",
    "hanViet": "THƯ",
    "strokes": 10,
    "meaning": "Viết / Sách",
    "onyomi": [
      "ショ"
    ],
    "kunyomi": [
      "か.く"
    ],
    "examples": [
      {
        "word": "書く",
        "reading": "かく",
        "meaning": "Viết"
      },
      {
        "word": "読書",
        "reading": "どくしょ",
        "meaning": "Đọc sách"
      },
      {
        "word": "辞書",
        "reading": "じしょ",
        "meaning": "Từ điển"
      }
    ]
  },
  {
    "id": 61,
    "kanji": "読",
    "hanViet": "ĐỘC",
    "strokes": 14,
    "meaning": "Đọc",
    "onyomi": [
      "ドク"
    ],
    "kunyomi": [
      "よ.む"
    ],
    "examples": [
      {
        "word": "読む",
        "reading": "よむ",
        "meaning": "Đọc"
      },
      {
        "word": "読書",
        "reading": "どくしょ",
        "meaning": "Đọc sách"
      }
    ]
  },
  {
    "id": 62,
    "kanji": "話",
    "hanViet": "THOẠI",
    "strokes": 13,
    "meaning": "Nói chuyện / Câu chuyện",
    "onyomi": [
      "ワ"
    ],
    "kunyomi": [
      "はな.す",
      "はなし"
    ],
    "examples": [
      {
        "word": "話す",
        "reading": "はなす",
        "meaning": "Nói chuyện"
      },
      {
        "word": "電話",
        "reading": "でんわ",
        "meaning": "Điện thoại"
      },
      {
        "word": "会話",
        "reading": "かいわ",
        "meaning": "Hội thoại"
      }
    ]
  },
  {
    "id": 63,
    "kanji": "会",
    "hanViet": "HỘI",
    "strokes": 6,
    "meaning": "Gặp / Họp",
    "onyomi": [
      "カイ"
    ],
    "kunyomi": [
      "あ.う"
    ],
    "examples": [
      {
        "word": "会う",
        "reading": "あう",
        "meaning": "Gặp gỡ"
      },
      {
        "word": "会社",
        "reading": "かいしゃ",
        "meaning": "Công ty"
      },
      {
        "word": "会話",
        "reading": "かいわ",
        "meaning": "Hội thoại"
      }
    ]
  },
  {
    "id": 64,
    "kanji": "休",
    "hanViet": "HƯU",
    "strokes": 6,
    "meaning": "Nghỉ ngơi",
    "onyomi": [
      "キュウ"
    ],
    "kunyomi": [
      "やす.む",
      "やす.まる"
    ],
    "examples": [
      {
        "word": "休む",
        "reading": "やすむ",
        "meaning": "Nghỉ ngơi"
      },
      {
        "word": "休み",
        "reading": "やすみ",
        "meaning": "Ngày nghỉ / Giờ nghỉ"
      },
      {
        "word": "夏休み",
        "reading": "なつやすみ",
        "meaning": "Nghỉ hè"
      }
    ]
  },
  {
    "id": 65,
    "kanji": "車",
    "hanViet": "XA",
    "strokes": 7,
    "meaning": "Xe / Ô tô",
    "onyomi": [
      "シャ"
    ],
    "kunyomi": [
      "くるま"
    ],
    "examples": [
      {
        "word": "車",
        "reading": "くるま",
        "meaning": "Xe ô tô"
      },
      {
        "word": "電車",
        "reading": "でんしゃ",
        "meaning": "Tàu điện"
      },
      {
        "word": "自転車",
        "reading": "じてんしゃ",
        "meaning": "Xe đạp"
      }
    ]
  },
  {
    "id": 66,
    "kanji": "電",
    "hanViet": "ĐIỆN",
    "strokes": 13,
    "meaning": "Điện",
    "onyomi": [
      "デン"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "電車",
        "reading": "でんしゃ",
        "meaning": "Tàu điện"
      },
      {
        "word": "電話",
        "reading": "でんわ",
        "meaning": "Điện thoại"
      },
      {
        "word": "電気",
        "reading": "でんき",
        "meaning": "Điện / Đèn điện"
      }
    ]
  },
  {
    "id": 67,
    "kanji": "気",
    "hanViet": "KHÍ",
    "strokes": 6,
    "meaning": "Khí / Tâm trạng",
    "onyomi": [
      "キ",
      "ケ"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "元気",
        "reading": "げんき",
        "meaning": "Khỏe mạnh"
      },
      {
        "word": "天気",
        "reading": "てんき",
        "meaning": "Thời tiết"
      },
      {
        "word": "気持ち",
        "reading": "きもち",
        "meaning": "Cảm giác"
      }
    ]
  },
  {
    "id": 68,
    "kanji": "天",
    "hanViet": "THIÊN",
    "strokes": 4,
    "meaning": "Trời / Thiên",
    "onyomi": [
      "テン"
    ],
    "kunyomi": [
      "あめ",
      "あま-"
    ],
    "examples": [
      {
        "word": "天気",
        "reading": "てんき",
        "meaning": "Thời tiết"
      },
      {
        "word": "天ぷら",
        "reading": "てんぷら",
        "meaning": "Món Tempura"
      }
    ]
  },
  {
    "id": 69,
    "kanji": "雨",
    "hanViet": "VŨ",
    "strokes": 8,
    "meaning": "Mưa",
    "onyomi": [
      "ウ"
    ],
    "kunyomi": [
      "あめ",
      "あま-"
    ],
    "examples": [
      {
        "word": "雨",
        "reading": "あめ",
        "meaning": "Cơn mưa"
      },
      {
        "word": "大雨",
        "reading": "おおあめ",
        "meaning": "Mưa lớn"
      }
    ]
  },
  {
    "id": 70,
    "kanji": "山",
    "hanViet": "SƠN",
    "strokes": 3,
    "meaning": "Núi",
    "onyomi": [
      "サン"
    ],
    "kunyomi": [
      "やま"
    ],
    "examples": [
      {
        "word": "山",
        "reading": "やま",
        "meaning": "Núi"
      },
      {
        "word": "富士山",
        "reading": "ふじさん",
        "meaning": "Núi Phú Sĩ"
      }
    ]
  },
  {
    "id": 71,
    "kanji": "川",
    "hanViet": "XUYÊN",
    "strokes": 3,
    "meaning": "Sông",
    "onyomi": [
      "セン"
    ],
    "kunyomi": [
      "かわ"
    ],
    "examples": [
      {
        "word": "川",
        "reading": "かわ",
        "meaning": "Con sông"
      },
      {
        "word": "ナイル川",
        "reading": "ないるがわ",
        "meaning": "Sông Nile"
      }
    ]
  },
  {
    "id": 72,
    "kanji": "花",
    "hanViet": "HOA",
    "strokes": 7,
    "meaning": "Bông hoa",
    "onyomi": [
      "カ"
    ],
    "kunyomi": [
      "はな"
    ],
    "examples": [
      {
        "word": "花",
        "reading": "はな",
        "meaning": "Bông hoa"
      },
      {
        "word": "花火",
        "reading": "はなび",
        "meaning": "Pháo hoa"
      },
      {
        "word": "花見",
        "reading": "はなみ",
        "meaning": "Ngắm hoa"
      }
    ]
  },
  {
    "id": 73,
    "kanji": "魚",
    "hanViet": "NGƯ",
    "strokes": 11,
    "meaning": "Con cá",
    "onyomi": [
      "ギョ"
    ],
    "kunyomi": [
      "さかな",
      "うお"
    ],
    "examples": [
      {
        "word": "魚",
        "reading": "さかな",
        "meaning": "Con cá"
      },
      {
        "word": "金魚",
        "reading": "きんぎょ",
        "meaning": "Cá vàng"
      }
    ]
  },
  {
    "id": 74,
    "kanji": "犬",
    "hanViet": "KHUYỂN",
    "strokes": 4,
    "meaning": "Con chó",
    "onyomi": [
      "ケン"
    ],
    "kunyomi": [
      "いぬ"
    ],
    "examples": [
      {
        "word": "犬",
        "reading": "いぬ",
        "meaning": "Con chó"
      },
      {
        "word": "子犬",
        "reading": "こいぬ",
        "meaning": "Chó con"
      }
    ]
  },
  {
    "id": 75,
    "kanji": "白",
    "hanViet": "BẠCH",
    "strokes": 5,
    "meaning": "Màu trắng",
    "onyomi": [
      "ハク"
    ],
    "kunyomi": [
      "しろ",
      "しろ.い"
    ],
    "examples": [
      {
        "word": "白い",
        "reading": "しろい",
        "meaning": "Trắng"
      },
      {
        "word": "白黒",
        "reading": "しろくろ",
        "meaning": "Trắng đen"
      }
    ]
  },
  {
    "id": 76,
    "kanji": "黒",
    "hanViet": "HẮC",
    "strokes": 11,
    "meaning": "Màu đen",
    "onyomi": [
      "コク"
    ],
    "kunyomi": [
      "くろ",
      "くろ.い"
    ],
    "examples": [
      {
        "word": "黒い",
        "reading": "くろい",
        "meaning": "Đen"
      },
      {
        "word": "黒板",
        "reading": "こくばん",
        "meaning": "Bảng đen"
      }
    ]
  },
  {
    "id": 77,
    "kanji": "赤",
    "hanViet": "XÍCH",
    "strokes": 7,
    "meaning": "Màu đỏ",
    "onyomi": [
      "セキ"
    ],
    "kunyomi": [
      "あか",
      "あか.い"
    ],
    "examples": [
      {
        "word": "赤い",
        "reading": "あかい",
        "meaning": "Đỏ"
      },
      {
        "word": "赤ちゃん",
        "reading": "あかちゃん",
        "meaning": "Em bé"
      }
    ]
  },
  {
    "id": 78,
    "kanji": "青",
    "hanViet": "THANH",
    "strokes": 8,
    "meaning": "Màu xanh da trời/lá",
    "onyomi": [
      "セイ",
      "ショウ"
    ],
    "kunyomi": [
      "あお",
      "あお.い"
    ],
    "examples": [
      {
        "word": "青い",
        "reading": "あおい",
        "meaning": "Xanh"
      },
      {
        "word": "青空",
        "reading": "あおぞら",
        "meaning": "Bầu trời xanh"
      }
    ]
  },
  {
    "id": 79,
    "kanji": "高",
    "hanViet": "CAO",
    "strokes": 10,
    "meaning": "Cao / Đắt",
    "onyomi": [
      "コウ"
    ],
    "kunyomi": [
      "たか.い",
      "たか"
    ],
    "examples": [
      {
        "word": "高い",
        "reading": "たかい",
        "meaning": "Cao / Đắt"
      },
      {
        "word": "高校",
        "reading": "こうこう",
        "meaning": "Trường cấp 3"
      }
    ]
  },
  {
    "id": 80,
    "kanji": "安",
    "hanViet": "AN",
    "strokes": 6,
    "meaning": "Rẻ / An toàn",
    "onyomi": [
      "アン"
    ],
    "kunyomi": [
      "やす.い"
    ],
    "examples": [
      {
        "word": "安い",
        "reading": "やすい",
        "meaning": "Rẻ"
      },
      {
        "word": "安心",
        "reading": "あんしん",
        "meaning": "Yên tâm"
      },
      {
        "word": "安全",
        "reading": "あんぜん",
        "meaning": "An toàn"
      }
    ]
  },
  {
    "id": 81,
    "kanji": "新",
    "hanViet": "TÂN",
    "strokes": 13,
    "meaning": "Mới",
    "onyomi": [
      "シン"
    ],
    "kunyomi": [
      "あたら.しい",
      "あら.た"
    ],
    "examples": [
      {
        "word": "新しい",
        "reading": "あたらしい",
        "meaning": "Mới"
      },
      {
        "word": "新聞",
        "reading": "しんぶん",
        "meaning": "Tờ báo"
      },
      {
        "word": "新年",
        "reading": "しんねん",
        "meaning": "Năm mới"
      }
    ]
  },
  {
    "id": 82,
    "kanji": "古",
    "hanViet": "CỔ",
    "strokes": 5,
    "meaning": "Cũ / Cổ",
    "onyomi": [
      "コ"
    ],
    "kunyomi": [
      "ふる.い"
    ],
    "examples": [
      {
        "word": "古い",
        "reading": "ふるい",
        "meaning": "Cũ"
      },
      {
        "word": "中古",
        "reading": "ちゅうこ",
        "meaning": "Đồ cũ"
      }
    ]
  },
  {
    "id": 83,
    "kanji": "長",
    "hanViet": "TRƯỜNG / TRƯỞNG",
    "strokes": 8,
    "meaning": "Dài / Đứng đầu",
    "onyomi": [
      "チョウ"
    ],
    "kunyomi": [
      "なが.い"
    ],
    "examples": [
      {
        "word": "長い",
        "reading": "ながい",
        "meaning": "Dài"
      },
      {
        "word": "社長",
        "reading": "しゃちょう",
        "meaning": "Giám đốc"
      },
      {
        "word": "部長",
        "reading": "ぶちょう",
        "meaning": "Trưởng phòng"
      }
    ]
  },
  {
    "id": 84,
    "kanji": "多",
    "hanViet": "ĐA",
    "strokes": 6,
    "meaning": "Nhiều",
    "onyomi": [
      "タ"
    ],
    "kunyomi": [
      "おお.い"
    ],
    "examples": [
      {
        "word": "多い",
        "reading": "おおい",
        "meaning": "Nhiều"
      },
      {
        "word": "多分",
        "reading": "たぶん",
        "meaning": "Có lẽ"
      }
    ]
  },
  {
    "id": 85,
    "kanji": "少",
    "hanViet": "THIỂU",
    "strokes": 4,
    "meaning": "Ít",
    "onyomi": [
      "ショウ"
    ],
    "kunyomi": [
      "すく.ない",
      "すこ.し"
    ],
    "examples": [
      {
        "word": "少し",
        "reading": "すこし",
        "meaning": "Một ít"
      },
      {
        "word": "少ない",
        "reading": "すくない",
        "meaning": "Ít"
      }
    ]
  },
  {
    "id": 86,
    "kanji": "早",
    "hanViet": "TẢO",
    "strokes": 6,
    "meaning": "Sớm",
    "onyomi": [
      "ソウ"
    ],
    "kunyomi": [
      "はや.い"
    ],
    "examples": [
      {
        "word": "早い",
        "reading": "はやい",
        "meaning": "Sớm"
      },
      {
        "word": "早く",
        "reading": "はやく",
        "meaning": "Nhanh chóng / Sớm"
      }
    ]
  },
  {
    "id": 87,
    "kanji": "近",
    "hanViet": "CẬN",
    "strokes": 7,
    "meaning": "Gần",
    "onyomi": [
      "キン"
    ],
    "kunyomi": [
      "ちか.い"
    ],
    "examples": [
      {
        "word": "近い",
        "reading": "ちかい",
        "meaning": "Gần"
      },
      {
        "word": "近く",
        "reading": "ちかく",
        "meaning": "Gần đây / Vùng lân cận"
      },
      {
        "word": "最近",
        "reading": "さいきん",
        "meaning": "Dạo gần đây"
      }
    ]
  },
  {
    "id": 88,
    "kanji": "遠",
    "hanViet": "VIỄN",
    "strokes": 13,
    "meaning": "Xa",
    "onyomi": [
      "エン"
    ],
    "kunyomi": [
      "とお.い"
    ],
    "examples": [
      {
        "word": "遠い",
        "reading": "とおい",
        "meaning": "Xa"
      },
      {
        "word": "遠く",
        "reading": "とおく",
        "meaning": "Nơi xa"
      }
    ]
  },
  {
    "id": 89,
    "kanji": "道",
    "hanViet": "ĐẠO",
    "strokes": 12,
    "meaning": "Con đường",
    "onyomi": [
      "ドウ"
    ],
    "kunyomi": [
      "みち"
    ],
    "examples": [
      {
        "word": "道",
        "reading": "みち",
        "meaning": "Con đường"
      },
      {
        "word": "北海道",
        "reading": "ほっかいどう",
        "meaning": "Hokkaido"
      }
    ]
  },
  {
    "id": 90,
    "kanji": "店",
    "hanViet": "ĐIẾM",
    "strokes": 8,
    "meaning": "Cửa hàng / Quán",
    "onyomi": [
      "テン"
    ],
    "kunyomi": [
      "みせ"
    ],
    "examples": [
      {
        "word": "店",
        "reading": "みせ",
        "meaning": "Cửa hàng"
      },
      {
        "word": "喫茶店",
        "reading": "きっさてん",
        "meaning": "Quán cà phê"
      },
      {
        "word": "店員",
        "reading": "てんいん",
        "meaning": "Nhân viên quán"
      }
    ]
  },
  {
    "id": 91,
    "kanji": "駅",
    "hanViet": "DỊCH",
    "strokes": 14,
    "meaning": "Nhà ga",
    "onyomi": [
      "エキ"
    ],
    "kunyomi": [],
    "examples": [
      {
        "word": "駅",
        "reading": "えき",
        "meaning": "Nhà ga"
      },
      {
        "word": "駅員",
        "reading": "えきいん",
        "meaning": "Nhân viên ga"
      },
      {
        "word": "東京駅",
        "reading": "とうきょうえき",
        "meaning": "Ga Tokyo"
      }
    ]
  },
  {
    "id": 92,
    "kanji": "社",
    "hanViet": "XÃ",
    "strokes": 7,
    "meaning": "Xã / Công ty / Đền thờ",
    "onyomi": [
      "シャ"
    ],
    "kunyomi": [
      "やしろ"
    ],
    "examples": [
      {
        "word": "会社",
        "reading": "かいしゃ",
        "meaning": "Công ty"
      },
      {
        "word": "神社",
        "reading": "じんじゃ",
        "meaning": "Đền Thần đạo"
      },
      {
        "word": "社会",
        "reading": "しゃかい",
        "meaning": "Xã hội"
      }
    ]
  },
  {
    "id": 93,
    "kanji": "門",
    "hanViet": "MÔN",
    "strokes": 8,
    "meaning": "Cổng",
    "onyomi": [
      "モン"
    ],
    "kunyomi": [
      "かど"
    ],
    "examples": [
      {
        "word": "門",
        "reading": "もん",
        "meaning": "Cổng"
      },
      {
        "word": "専門",
        "reading": "せんもん",
        "meaning": "Chuyên môn"
      }
    ]
  },
  {
    "id": 94,
    "kanji": "外",
    "hanViet": "NGOẠI",
    "strokes": 5,
    "meaning": "Bên ngoài",
    "onyomi": [
      "ガイ",
      "ゲ"
    ],
    "kunyomi": [
      "そと",
      "ほか",
      "はず.す"
    ],
    "examples": [
      {
        "word": "外",
        "reading": "そと",
        "meaning": "Bên ngoài"
      },
      {
        "word": "外国",
        "reading": "がいこく",
        "meaning": "Nước ngoài"
      },
      {
        "word": "海外",
        "reading": "かいがい",
        "meaning": "Hải ngoại"
      }
    ]
  },
  {
    "id": 95,
    "kanji": "入",
    "hanViet": "NHẬP",
    "strokes": 2,
    "meaning": "Vào / Cho vào",
    "onyomi": [
      "ニュウ"
    ],
    "kunyomi": [
      "はい.る",
      "い.れる"
    ],
    "examples": [
      {
        "word": "入る",
        "reading": "はいる",
        "meaning": "Đi vào"
      },
      {
        "word": "入れる",
        "reading": "いれる",
        "meaning": "Cho vào"
      },
      {
        "word": "入口",
        "reading": "いりぐち",
        "meaning": "Cửa vào"
      }
    ]
  },
  {
    "id": 96,
    "kanji": "出",
    "hanViet": "XUẤT",
    "strokes": 5,
    "meaning": "Ra ngoài / Nộp",
    "onyomi": [
      "シュツ"
    ],
    "kunyomi": [
      "で.る",
      "だ.す"
    ],
    "examples": [
      {
        "word": "出る",
        "reading": "でる",
        "meaning": "Rời khỏi / Xuất hiện"
      },
      {
        "word": "出す",
        "reading": "だす",
        "meaning": "Lấy ra / Nộp"
      },
      {
        "word": "出口",
        "reading": "でぐち",
        "meaning": "Cửa ra"
      }
    ]
  },
  {
    "id": 97,
    "kanji": "口",
    "hanViet": "KHẨU",
    "strokes": 3,
    "meaning": "Miệng / Cửa",
    "onyomi": [
      "コウ",
      "ク"
    ],
    "kunyomi": [
      "くち"
    ],
    "examples": [
      {
        "word": "口",
        "reading": "くち",
        "meaning": "Cái miệng"
      },
      {
        "word": "入口",
        "reading": "いりぐち",
        "meaning": "Lối vào"
      },
      {
        "word": "出口",
        "reading": "でぐち",
        "meaning": "Lối ra"
      }
    ]
  },
  {
    "id": 98,
    "kanji": "目",
    "hanViet": "MỤC",
    "strokes": 5,
    "meaning": "Mắt",
    "onyomi": [
      "モク"
    ],
    "kunyomi": [
      "め"
    ],
    "examples": [
      {
        "word": "目",
        "reading": "め",
        "meaning": "Con mắt"
      },
      {
        "word": "一日目",
        "reading": "いちにちめ",
        "meaning": "Ngày thứ nhất"
      }
    ]
  },
  {
    "id": 99,
    "kanji": "手",
    "hanViet": "THỦ",
    "strokes": 4,
    "meaning": "Bàn tay",
    "onyomi": [
      "シュ"
    ],
    "kunyomi": [
      "て"
    ],
    "examples": [
      {
        "word": "手",
        "reading": "て",
        "meaning": "Bàn tay"
      },
      {
        "word": "上手",
        "reading": "じょうず",
        "meaning": "Giỏi"
      },
      {
        "word": "下手",
        "reading": "へた",
        "meaning": "Dở"
      }
    ]
  },
  {
    "id": 100,
    "kanji": "足",
    "hanViet": "TÚC",
    "strokes": 7,
    "meaning": "Chân / Đầy đủ",
    "onyomi": [
      "ソク"
    ],
    "kunyomi": [
      "あし",
      "た.りる"
    ],
    "examples": [
      {
        "word": "足",
        "reading": "あし",
        "meaning": "Bàn chân / Chân"
      },
      {
        "word": "足りる",
        "reading": "たりる",
        "meaning": "Đầy đủ"
      }
    ]
  },
  {
    "id": 101,
    "kanji": "東",
    "hanViet": "ĐÔNG",
    "strokes": 8,
    "meaning": "Phía đông",
    "onyomi": [
      "トウ"
    ],
    "kunyomi": [
      "ひがし"
    ],
    "examples": [
      {
        "word": "東",
        "reading": "ひがし",
        "meaning": "Phía Đông"
      },
      {
        "word": "東京",
        "reading": "とうきょう",
        "meaning": "Tokyo"
      },
      {
        "word": "東口",
        "reading": "ひがしぐち",
        "meaning": "Cửa đông"
      }
    ]
  },
  {
    "id": 102,
    "kanji": "西",
    "hanViet": "TÂY",
    "strokes": 6,
    "meaning": "Phía tây",
    "onyomi": [
      "セイ",
      "サイ"
    ],
    "kunyomi": [
      "にし"
    ],
    "examples": [
      {
        "word": "西",
        "reading": "にし",
        "meaning": "Phía Tây"
      },
      {
        "word": "西口",
        "reading": "にしぐち",
        "meaning": "Cửa tây"
      }
    ]
  },
  {
    "id": 103,
    "kanji": "南",
    "hanViet": "NAM",
    "strokes": 9,
    "meaning": "Phía nam",
    "onyomi": [
      "ナン"
    ],
    "kunyomi": [
      "みなみ"
    ],
    "examples": [
      {
        "word": "南",
        "reading": "みなみ",
        "meaning": "Phía Nam"
      },
      {
        "word": "南口",
        "reading": "みなみぐち",
        "meaning": "Cửa nam"
      }
    ]
  },
  {
    "id": 104,
    "kanji": "北",
    "hanViet": "BẮC",
    "strokes": 5,
    "meaning": "Phía bắc",
    "onyomi": [
      "ホク"
    ],
    "kunyomi": [
      "きた"
    ],
    "examples": [
      {
        "word": "北",
        "reading": "きた",
        "meaning": "Phía Bắc"
      },
      {
        "word": "北海道",
        "reading": "ほっかいどう",
        "meaning": "Hokkaido"
      },
      {
        "word": "北口",
        "reading": "きたぐち",
        "meaning": "Cửa bắc"
      }
    ]
  }
]"""
    val LESSONS_RAW_JSON = """[
  {
    "lessonNumber": 1,
    "title": "Bài 1: Giới thiệu bản thân & Chào hỏi",
    "japaneseTitle": "第１課：自己紹介",
    "description": "Học cách giới thiệu tên, quốc tịch, nghề nghiệp với trợ từ は (wa), も (mo), の (no) và đuôi câu です (desu).",
    "vocabularies": [
      {
        "id": 101,
        "word": "わたし",
        "reading": "わたし",
        "romaji": "watashi",
        "meaning": "Tôi",
        "hanViet": "Tư",
        "type": "Đại từ",
        "exampleSentence": "わたしは ナムです。",
        "exampleSentenceReading": "わたしは なむです。",
        "exampleSentenceMeaning": "Tôi là Nam."
      },
      {
        "id": 102,
        "word": "あなた",
        "reading": "あなた",
        "romaji": "anata",
        "meaning": "Bạn / Anh / Chị",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "あなたは がくせいですか。",
        "exampleSentenceReading": "あなたは がくせいですか。",
        "exampleSentenceMeaning": "Bạn có phải là học sinh không?"
      },
      {
        "id": 103,
        "word": "あの人",
        "reading": "あのひと",
        "romaji": "ano hito",
        "meaning": "Người kia / Người đó",
        "hanViet": "Nhân",
        "type": "Danh từ",
        "exampleSentence": "あの人は だれですか。",
        "exampleSentenceReading": "あのひとは だれですか。",
        "exampleSentenceMeaning": "Người kia là ai vậy?"
      },
      {
        "id": 104,
        "word": "あの方",
        "reading": "あのかた",
        "romaji": "ano kata",
        "meaning": "Vị kia (lịch sự của あの人)",
        "hanViet": "Phương",
        "type": "Danh từ",
        "exampleSentence": "あの方は たなか先生です。",
        "exampleSentenceReading": "あのかたは たなかせんせいです。",
        "exampleSentenceMeaning": "Vị kia là thầy Tanaka."
      },
      {
        "id": 105,
        "word": "～さん",
        "reading": "～さん",
        "romaji": "-san",
        "meaning": "Anh / Chị / Ông / Bà (hậu tố lịch sự)",
        "hanViet": "",
        "type": "Hậu tố",
        "exampleSentence": "こちらは ミラーさんです。",
        "exampleSentenceReading": "こちらは みらーさんです。",
        "exampleSentenceMeaning": "Đây là anh Miller."
      },
      {
        "id": 106,
        "word": "先生",
        "reading": "せんせい",
        "romaji": "sensei",
        "meaning": "Thầy cô giáo",
        "hanViet": "Tiên Sinh",
        "type": "Danh từ",
        "exampleSentence": "やまださんは 先生です。",
        "exampleSentenceReading": "やまださんは せんせいです。",
        "exampleSentenceMeaning": "Anh Yamada là giáo viên."
      },
      {
        "id": 107,
        "word": "学生",
        "reading": "がくせい",
        "romaji": "gakusei",
        "meaning": "Học sinh / Sinh viên",
        "hanViet": "Học Sinh",
        "type": "Danh từ",
        "exampleSentence": "わたしは 学生です。",
        "exampleSentenceReading": "わたしは がくせいです。",
        "exampleSentenceMeaning": "Tôi là sinh viên."
      },
      {
        "id": 108,
        "word": "会社員",
        "reading": "かいしゃいん",
        "romaji": "kaishain",
        "meaning": "Nhân viên công ty",
        "hanViet": "Hội Xã Viên",
        "type": "Danh từ",
        "exampleSentence": "ミラーさんは 会社員です。",
        "exampleSentenceReading": "みらーさんは かいしゃいんです。",
        "exampleSentenceMeaning": "Anh Miller là nhân viên công ty."
      },
      {
        "id": 109,
        "word": "社員",
        "reading": "しゃいん",
        "romaji": "shain",
        "meaning": "Nhân viên (dùng cùng tên cty)",
        "hanViet": "Xã Viên",
        "type": "Danh từ",
        "exampleSentence": "IMCの 社員です。",
        "exampleSentenceReading": "あいえむしーの しゃいんです。",
        "exampleSentenceMeaning": "Là nhân viên công ty IMC."
      },
      {
        "id": 110,
        "word": "医者",
        "reading": "いしゃ",
        "romaji": "isha",
        "meaning": "Bác sĩ",
        "hanViet": "Y Giả",
        "type": "Danh từ",
        "exampleSentence": "ちちは 医者です。",
        "exampleSentenceReading": "ちちは いしゃです。",
        "exampleSentenceMeaning": "Bố tôi là bác sĩ."
      },
      {
        "id": 111,
        "word": "研究者",
        "reading": "けんきゅうしゃ",
        "romaji": "kenkyuusha",
        "meaning": "Nhà nghiên cứu",
        "hanViet": "Nghiên Cứu Giả",
        "type": "Danh từ",
        "exampleSentence": "あのかたは 研究者です。",
        "exampleSentenceReading": "あのかたは けんきゅうしゃです。",
        "exampleSentenceMeaning": "Vị kia là nhà nghiên cứu."
      },
      {
        "id": 112,
        "word": "大学",
        "reading": "だいがく",
        "romaji": "daigaku",
        "meaning": "Trường đại học",
        "hanViet": "Đại Học",
        "type": "Danh từ",
        "exampleSentence": "さくら大学の 学生です。",
        "exampleSentenceReading": "さくらだいがくの がくせいです。",
        "exampleSentenceMeaning": "Là sinh viên đại học Sakura."
      },
      {
        "id": 113,
        "word": "病院",
        "reading": "びょういん",
        "romaji": "byouin",
        "meaning": "Bệnh viện",
        "hanViet": "Bệnh Viện",
        "type": "Danh từ",
        "exampleSentence": "こうべ病院の 医者です。",
        "exampleSentenceReading": "こうべびょういんの いしゃです。",
        "exampleSentenceMeaning": "Là bác sĩ của bệnh viện Kobe."
      },
      {
        "id": 114,
        "word": "だれ",
        "reading": "だれ",
        "romaji": "dare",
        "meaning": "Ai (từ để hỏi)",
        "hanViet": "",
        "type": "Từ để hỏi",
        "exampleSentence": "あのひとは だれですか。",
        "exampleSentenceReading": "あのひとは だれですか。",
        "exampleSentenceMeaning": "Người kia là ai?"
      },
      {
        "id": 115,
        "word": "どなた",
        "reading": "どなた",
        "romaji": "donata",
        "meaning": "Vị nào (lịch sự của だれ)",
        "hanViet": "",
        "type": "Từ để hỏi",
        "exampleSentence": "あのかたは どなたですか。",
        "exampleSentenceReading": "あのかたは どなたですか。",
        "exampleSentenceMeaning": "Vị kia là vị nào ạ?"
      },
      {
        "id": 116,
        "word": "～歳",
        "reading": "～さい",
        "romaji": "-sai",
        "meaning": "～ tuổi",
        "hanViet": "Tuế",
        "type": "Lượng từ",
        "exampleSentence": "わたしは 20歳です。",
        "exampleSentenceReading": "わたしは はたち／にじゅっさいです。",
        "exampleSentenceMeaning": "Tôi 20 tuổi."
      },
      {
        "id": 117,
        "word": "何歳",
        "reading": "なんさい",
        "romaji": "nansai",
        "meaning": "Mấy tuổi",
        "hanViet": "Hà Tuế",
        "type": "Từ để hỏi",
        "exampleSentence": "おいくつですか。／ 何歳ですか。",
        "exampleSentenceReading": "おいくつですか。／ なんさいですか。",
        "exampleSentenceMeaning": "Bạn bao nhiêu tuổi?"
      },
      {
        "id": 118,
        "word": "はい",
        "reading": "はい",
        "romaji": "hai",
        "meaning": "Vâng / Đúng",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "はい、そうです。",
        "exampleSentenceReading": "はい、そうです。",
        "exampleSentenceMeaning": "Vâng, đúng vậy."
      },
      {
        "id": 119,
        "word": "いいえ",
        "reading": "いいえ",
        "romaji": "iie",
        "meaning": "Không",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "いいえ、ちがいます。",
        "exampleSentenceReading": "いいえ、ちがいます。",
        "exampleSentenceMeaning": "Không, không phải."
      },
      {
        "id": 120,
        "word": "初めまして",
        "reading": "はじめまして",
        "romaji": "hajimemashite",
        "meaning": "Rất vui được gặp bạn lần đầu",
        "hanViet": "Sơ",
        "type": "Chào hỏi",
        "exampleSentence": "初めまして、ナムです。",
        "exampleSentenceReading": "はじめまして、なむです。",
        "exampleSentenceMeaning": "Rất vui được gặp bạn, tôi là Nam."
      },
      {
        "id": 121,
        "word": "どうぞよろしく",
        "reading": "どうぞよろしくおねがいします",
        "romaji": "douzo yoroshiku onegaishimasu",
        "meaning": "Rất mong nhận được sự giúp đỡ",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "どうぞ よろしく お願いします。",
        "exampleSentenceReading": "どうぞ よろしく おねがいします。",
        "exampleSentenceMeaning": "Rất mong được sự giúp đỡ của bạn."
      }
    ],
    "grammarPoints": [
      {
        "title": "N1 は N2 です",
        "pattern": "N1 は N2 です",
        "explanation": "Trợ từ は (đọc là wa) đánh dấu chủ đề câu. N1 là chủ ngữ, N2 là vị ngữ (danh từ). です dùng để khẳng định và thể hiện sự lịch sự.",
        "examples": [
          {
            "japanese": "わたしは マイク・ミラーです。",
            "reading": "わたしは まいく・みらーです。",
            "vietnamese": "Tôi là Mike Miller."
          },
          {
            "japanese": "サントスさんは ブラジル人です。",
            "reading": "さんとすさんは ぶらじるじんです。",
            "vietnamese": "Anh Santos là người Brazil."
          }
        ]
      },
      {
        "title": "N1 は N2 じゃありません (ではありません)",
        "pattern": "N1 は N2 じゃありません",
        "explanation": "Dạng phủ định của です. じゃありません thường dùng trong văn nói, còn ではありません dùng trong văn viết hoặc tình huống trang trọng.",
        "examples": [
          {
            "japanese": "サントスさんは 学生じゃありません。",
            "reading": "さんとすさんは がくせいじゃありません。",
            "vietnamese": "Anh Santos không phải là sinh viên."
          }
        ]
      },
      {
        "title": "N1 は N2 ですか",
        "pattern": "N1 は N2 ですか",
        "explanation": "Câu nghi vấn hỏi N1 có phải là N2 không. Trợ từ か đặt ở cuối câu để tạo câu hỏi. Trả lời bằng はい (vâng) hoặc いいえ (không).",
        "examples": [
          {
            "japanese": "ミラーさんは アメリカ人ですか。ー はい、アメリカ人です。",
            "reading": "みらーさんは あめりかじんですか。ー はい、あめりかじんです。",
            "vietnamese": "Anh Miller có phải người Mỹ không? - Vâng, là người Mỹ."
          },
          {
            "japanese": "ミラーさんは 先生ですか。ー いいえ、先生じゃありません。",
            "reading": "みらーさんは せんせいですか。ー いいえ、せんせいじゃありません。",
            "vietnamese": "Anh Miller là giáo viên à? - Không, không phải giáo viên."
          }
        ]
      },
      {
        "title": "N も (Cũng)",
        "pattern": "N も",
        "explanation": "Trợ từ も dùng thay cho は khi đối tượng có cùng thuộc tính, hành động hay trạng thái với đối tượng đã nói trước đó (nghĩa là 'cũng').",
        "examples": [
          {
            "japanese": "ミラーさんは 会社員です。グプタさんも 会社員です。",
            "reading": "みらーさんは かいしゃいんです。ぐぷたさんも かいしゃいんです。",
            "vietnamese": "Anh Miller là nhân viên công ty. Anh Gupta cũng là nhân viên công ty."
          }
        ]
      },
      {
        "title": "N1 の N2 (Sở hữu / Thuộc về)",
        "pattern": "N1 の N2",
        "explanation": "Trợ từ の nối hai danh từ. N1 giải thích, bổ nghĩa hoặc sở hữu N2 (N2 của N1, hoặc N2 thuộc tổ chức N1).",
        "examples": [
          {
            "japanese": "ミラーさんは IMCの 社員です。",
            "reading": "みらーさんは あいえむしーの しゃいんです。",
            "vietnamese": "Anh Miller là nhân viên của công ty IMC."
          },
          {
            "japanese": "わたしの 本です。",
            "reading": "わたしの ホンです。",
            "vietnamese": "Là sách của tôi."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 2,
    "title": "Bài 2: Đồ vật & Sở hữu",
    "japaneseTitle": "第２課：これ・それ・あれ",
    "description": "Chỉ định từ これ, それ, あれ, この, その, あの và cách hỏi đồ vật, quyền sở hữu.",
    "vocabularies": [
      {
        "id": 201,
        "word": "これ",
        "reading": "これ",
        "romaji": "kore",
        "meaning": "Cái này (gần người nói)",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "これは 辞書です。",
        "exampleSentenceReading": "これは じしょです。",
        "exampleSentenceMeaning": "Đây là cuốn từ điển."
      },
      {
        "id": 202,
        "word": "それ",
        "reading": "それ",
        "romaji": "sore",
        "meaning": "Cái đó (gần người nghe)",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "それは なんですか。",
        "exampleSentenceReading": "それは なんですか。",
        "exampleSentenceMeaning": "Đó là cái gì vậy?"
      },
      {
        "id": 203,
        "word": "あれ",
        "reading": "あれ",
        "romaji": "are",
        "meaning": "Cái kia (xa cả hai người)",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "あれは わたしの かばんです。",
        "exampleSentenceReading": "あれは わたしの かばんです。",
        "exampleSentenceMeaning": "Kia là cái cặp của tôi."
      },
      {
        "id": 204,
        "word": "この～",
        "reading": "この",
        "romaji": "kono",
        "meaning": "Cái ~ này (+ danh từ)",
        "hanViet": "",
        "type": "Liên thể từ",
        "exampleSentence": "この本は おもしろいです。",
        "exampleSentenceReading": "このほんは おもしろいです。",
        "exampleSentenceMeaning": "Quyển sách này thú vị."
      },
      {
        "id": 205,
        "word": "その～",
        "reading": "その",
        "romaji": "sono",
        "meaning": "Cái ~ đó (+ danh từ)",
        "hanViet": "",
        "type": "Liên thể từ",
        "exampleSentence": "その傘は あなたのですか。",
        "exampleSentenceReading": "そのかさは あなたのですか。",
        "exampleSentenceMeaning": "Cái ô đó là của bạn à?"
      },
      {
        "id": 206,
        "word": "あの～",
        "reading": "あの",
        "romaji": "ano",
        "meaning": "Cái ~ kia (+ danh từ)",
        "hanViet": "",
        "type": "Liên thể từ",
        "exampleSentence": "あの車は たかいです。",
        "exampleSentenceReading": "あのくるまは たかいです。",
        "exampleSentenceMeaning": "Chiếc xe ô tô kia đắt tiền."
      },
      {
        "id": 207,
        "word": "本",
        "reading": "ほん",
        "romaji": "hon",
        "meaning": "Sách",
        "hanViet": "Bản",
        "type": "Danh từ",
        "exampleSentence": "日本語の 本です。",
        "exampleSentenceReading": "にほんごの ほんです。",
        "exampleSentenceMeaning": "Là sách tiếng Nhật."
      },
      {
        "id": 208,
        "word": "辞書",
        "reading": "じしょ",
        "romaji": "jisho",
        "meaning": "Từ điển",
        "hanViet": "Từ Thư",
        "type": "Danh từ",
        "exampleSentence": "これは 辞書です。",
        "exampleSentenceReading": "これは じしょです。",
        "exampleSentenceMeaning": "Đây là từ điển."
      },
      {
        "id": 209,
        "word": "雑誌",
        "reading": "ざっし",
        "romaji": "zasshi",
        "meaning": "Tạp chí",
        "hanViet": "Tạp Chí",
        "type": "Danh từ",
        "exampleSentence": "車の 雑誌です。",
        "exampleSentenceReading": "くるまの ざっしです。",
        "exampleSentenceMeaning": "Là tạp chí ô tô."
      },
      {
        "id": 210,
        "word": "新聞",
        "reading": "しんぶん",
        "romaji": "shinbun",
        "meaning": "Báo",
        "hanViet": "Tân Văn",
        "type": "Danh từ",
        "exampleSentence": "毎朝 新聞を 読みます。",
        "exampleSentenceReading": "まいあさ しんぶんを よみます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi đều đọc báo."
      },
      {
        "id": 211,
        "word": "手帳",
        "reading": "てちょう",
        "romaji": "techou",
        "meaning": "Sổ tay",
        "hanViet": "Thủ Trướng",
        "type": "Danh từ",
        "exampleSentence": "わたしの 手帳です。",
        "exampleSentenceReading": "わたしの てちょうです。",
        "exampleSentenceMeaning": "Là sổ tay của tôi."
      },
      {
        "id": 212,
        "word": "名刺",
        "reading": "めいし",
        "romaji": "meishi",
        "meaning": "Danh thiếp",
        "hanViet": "Danh Thứ",
        "type": "Danh từ",
        "exampleSentence": "わたしの 名刺です。",
        "exampleSentenceReading": "わたしの めいしです。",
        "exampleSentenceMeaning": "Đây là danh thiếp của tôi."
      },
      {
        "id": 213,
        "word": "鉛筆",
        "reading": "えんぴつ",
        "romaji": "enpitsu",
        "meaning": "Bút chì",
        "hanViet": "Duyên Bút",
        "type": "Danh từ",
        "exampleSentence": "これは 鉛筆です。",
        "exampleSentenceReading": "これは えんぴつです。",
        "exampleSentenceMeaning": "Đây là bút chì."
      },
      {
        "id": 214,
        "word": "ボールペン",
        "reading": "ぼーるぺん",
        "romaji": "boorupen",
        "meaning": "Bút bi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ボールペンを ください。",
        "exampleSentenceReading": "ぼーるぺんを ください。",
        "exampleSentenceMeaning": "Xin hãy cho tôi cái bút bi."
      },
      {
        "id": 215,
        "word": "鍵",
        "reading": "かぎ",
        "romaji": "kagi",
        "meaning": "Chìa khóa",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "部屋の 鍵です。",
        "exampleSentenceReading": "へやの かぎです。",
        "exampleSentenceMeaning": "Là chìa khóa phòng."
      },
      {
        "id": 216,
        "word": "時計",
        "reading": "とけい",
        "romaji": "tokei",
        "meaning": "Đồng hồ",
        "hanViet": "Thời Kế",
        "type": "Danh từ",
        "exampleSentence": "スイスの 時計です。",
        "exampleSentenceReading": "すいすの とけいです。",
        "exampleSentenceMeaning": "Là đồng hồ Thụy Sĩ."
      },
      {
        "id": 217,
        "word": "傘",
        "reading": "かさ",
        "romaji": "kasa",
        "meaning": "Cái ô / cái dù",
        "hanViet": "Tản",
        "type": "Danh từ",
        "exampleSentence": "これは だれの 傘ですか。",
        "exampleSentenceReading": "これは だれの かさですか。",
        "exampleSentenceMeaning": "Đây là ô của ai vậy?"
      },
      {
        "id": 218,
        "word": "鞄",
        "reading": "かばん",
        "romaji": "kaban",
        "meaning": "Cặp sách / Túi xách",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "黒い かばんです。",
        "exampleSentenceReading": "くろい かばんです。",
        "exampleSentenceMeaning": "Là chiếc cặp màu đen."
      }
    ],
    "grammarPoints": [
      {
        "title": "これ／それ／あれ は N です",
        "pattern": "これ／それ／あれ は N です",
        "explanation": "Chỉ định từ đại diện cho sự vật. これ: gần người nói. それ: gần người nghe. あれ: xa cả hai người.",
        "examples": [
          {
            "japanese": "これは 辞書です。",
            "reading": "これは じしょです。",
            "vietnamese": "Đây là từ điển."
          },
          {
            "japanese": "あれは 病院です。",
            "reading": "あれは びょういんです。",
            "vietnamese": "Kia là bệnh viện."
          }
        ]
      },
      {
        "title": "この N／その N／あの N は ... です",
        "pattern": "この N／その N／あの N",
        "explanation": "Bổ nghĩa trực tiếp cho danh từ đi liền sau nó. Phải có danh từ đi kèm: このほん (quyển sách này), あのひと (người kia).",
        "examples": [
          {
            "japanese": "この本は わたしのです。",
            "reading": "このほんは わたしのです。",
            "vietnamese": "Quyển sách này là của tôi."
          },
          {
            "japanese": "その傘は だれの ですか。",
            "reading": "そのかさは だれの ですか。",
            "vietnamese": "Cái ô đó là của ai vậy?"
          }
        ]
      },
      {
        "title": "そうです／そうじゃありません",
        "pattern": "はい、そうです。／ いいえ、そうじゃありません。",
        "explanation": "Dùng để xác nhận thông tin câu hỏi nghi vấn danh từ. 'Đúng vậy' hoặc 'Không phải vậy'.",
        "examples": [
          {
            "japanese": "それは テレホンカードですか。ー はい、そうです。",
            "reading": "それは てれほんかーどですか。ー はい、そうです。",
            "vietnamese": "Đó là thẻ điện thoại phải không? - Vâng, đúng vậy."
          }
        ]
      },
      {
        "title": "Câu hỏi lựa chọn: A ですか、B ですか",
        "pattern": "Câu 1 ですか、Câu 2 ですか",
        "explanation": "Hỏi người nghe chọn lựa giữa A hay B. Trả lời trực tiếp vào đáp án chọn, KHÔNG dùng はい hoặc いいえ.",
        "examples": [
          {
            "japanese": "これは 「９」ですか、「７」ですか。ー 「７」です。",
            "reading": "これは 「きゅう」ですか、「なな」ですか。ー 「なな」です。",
            "vietnamese": "Đây là số 9 hay số 7? - Là số 7."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 3,
    "title": "Bài 3: Nơi chốn & Vị trí",
    "japaneseTitle": "第３課：ここ・そこ・あそこ",
    "description": "Chỉ định từ chỉ nơi chốn ここ, そこ, あそこ và cách hỏi giá tiền いくら, tầng lầu, vị trí phòng ban.",
    "vocabularies": [
      {
        "id": 301,
        "word": "ここ",
        "reading": "ここ",
        "romaji": "koko",
        "meaning": "Chỗ này / Ở đây",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "ここは きょうしつです。",
        "exampleSentenceReading": "ここは きょうしつです。",
        "exampleSentenceMeaning": "Đây là phòng học."
      },
      {
        "id": 302,
        "word": "そこ",
        "reading": "そこ",
        "romaji": "soko",
        "meaning": "Chỗ đó / Ở đó",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "そこは じむしょです。",
        "exampleSentenceReading": "そこは じむしょです。",
        "exampleSentenceMeaning": "Đó là văn phòng."
      },
      {
        "id": 303,
        "word": "あそこ",
        "reading": "あそこ",
        "romaji": "asoko",
        "meaning": "Chỗ kia / Ở đằng kia",
        "hanViet": "",
        "type": "Chỉ định từ",
        "exampleSentence": "あそこは しょくどうです。",
        "exampleSentenceReading": "あそこは しょくどうです。",
        "exampleSentenceMeaning": "Kia là nhà ăn."
      },
      {
        "id": 304,
        "word": "どこ",
        "reading": "どこ",
        "romaji": "doko",
        "meaning": "Ở đâu / Chỗ nào",
        "hanViet": "",
        "type": "Từ để hỏi",
        "exampleSentence": "お手洗いは どこですか。",
        "exampleSentenceReading": "おてあらいは どこですか。",
        "exampleSentenceMeaning": "Nhà vệ sinh ở đâu vậy ạ?"
      },
      {
        "id": 305,
        "word": "教室",
        "reading": "きょうしつ",
        "romaji": "kyoushitsu",
        "meaning": "Phòng học",
        "hanViet": "Giáo Thất",
        "type": "Danh từ",
        "exampleSentence": "教室に 入ります。",
        "exampleSentenceReading": "きょうしつに はいります。",
        "exampleSentenceMeaning": "Vào phòng học."
      },
      {
        "id": 306,
        "word": "食堂",
        "reading": "しょくどう",
        "romaji": "shokudou",
        "meaning": "Nhà ăn / Căng tin",
        "hanViet": "Thực Đường",
        "type": "Danh từ",
        "exampleSentence": "食堂で 昼ご飯を 食べます。",
        "exampleSentenceReading": "しょくどうで ひるごはんを たべます。",
        "exampleSentenceMeaning": "Ăn trưa ở căng tin."
      },
      {
        "id": 307,
        "word": "事務所",
        "reading": "じむしょ",
        "romaji": "jimusho",
        "meaning": "Văn phòng làm việc",
        "hanViet": "Sự Vụ Sở",
        "type": "Danh từ",
        "exampleSentence": "事務所は ２階です。",
        "exampleSentenceReading": "じむしょは にかいです。",
        "exampleSentenceMeaning": "Văn phòng ở tầng 2."
      },
      {
        "id": 308,
        "word": "会議室",
        "reading": "かいぎしつ",
        "romaji": "kaigishitsu",
        "meaning": "Phòng họp",
        "hanViet": "Hội Nghị Thất",
        "type": "Danh từ",
        "exampleSentence": "会議室で 会議を します。",
        "exampleSentenceReading": "かいぎしつで かいぎを します。",
        "exampleSentenceMeaning": "Họp trong phòng họp."
      },
      {
        "id": 309,
        "word": "受付",
        "reading": "うけつけ",
        "romaji": "uketsuke",
        "meaning": "Quầy tiếp tân",
        "hanViet": "Thụ Phụ",
        "type": "Danh từ",
        "exampleSentence": "受付は １階です。",
        "exampleSentenceReading": "うけつけは いっかいです。",
        "exampleSentenceMeaning": "Quầy lễ tân ở tầng 1."
      },
      {
        "id": 310,
        "word": "部屋",
        "reading": "へや",
        "romaji": "heya",
        "meaning": "Căn phòng",
        "hanViet": "Bộ Ốc",
        "type": "Danh từ",
        "exampleSentence": "わたしの 部屋は ここです。",
        "exampleSentenceReading": "わたしの へやは ここです。",
        "exampleSentenceMeaning": "Phòng tôi ở đây."
      },
      {
        "id": 311,
        "word": "トイレ",
        "reading": "といれ",
        "romaji": "toire",
        "meaning": "Nhà vệ sinh",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "トイレは どこですか。",
        "exampleSentenceReading": "といれは どこですか。",
        "exampleSentenceMeaning": "Nhà vệ sinh ở đâu?"
      },
      {
        "id": 312,
        "word": "階段",
        "reading": "かいだん",
        "romaji": "kaidan",
        "meaning": "Cầu thang bộ",
        "hanViet": "Giai Đoạn",
        "type": "Danh từ",
        "exampleSentence": "階段を 上がります。",
        "exampleSentenceReading": "かいだんを あがります。",
        "exampleSentenceMeaning": "Đi lên cầu thang."
      },
      {
        "id": 313,
        "word": "エレベーター",
        "reading": "えれべーたー",
        "romaji": "erebeetaa",
        "meaning": "Thang máy",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "エレベーターで 行きます。",
        "exampleSentenceReading": "えれべーたーで いきます。",
        "exampleSentenceMeaning": "Đi bằng thang máy."
      },
      {
        "id": 314,
        "word": "国",
        "reading": "くに",
        "romaji": "kuni",
        "meaning": "Đất nước",
        "hanViet": "Quốc",
        "type": "Danh từ",
        "exampleSentence": "お国は どちらですか。",
        "exampleSentenceReading": "おくには どちらですか。",
        "exampleSentenceMeaning": "Đất nước của bạn ở đâu (bạn là người nước nào)?"
      },
      {
        "id": 315,
        "word": "会社",
        "reading": "かいしゃ",
        "romaji": "kaisha",
        "meaning": "Công ty",
        "hanViet": "Hội Xã",
        "type": "Danh từ",
        "exampleSentence": "会社は どちらですか。",
        "exampleSentenceReading": "かいしゃは どちらですか。",
        "exampleSentenceMeaning": "Bạn làm việc ở công ty nào?"
      },
      {
        "id": 316,
        "word": "いくら",
        "reading": "いくら",
        "romaji": "ikura",
        "meaning": "Bao nhiêu tiền",
        "hanViet": "",
        "type": "Từ để hỏi",
        "exampleSentence": "これは いくらですか。",
        "exampleSentenceReading": "これは いくらですか。",
        "exampleSentenceMeaning": "Cái này bao nhiêu tiền?"
      }
    ],
    "grammarPoints": [
      {
        "title": "ここ／そこ／あそこ は N(địa điểm) です",
        "pattern": "ここ／そこ／あそこ は N です",
        "explanation": "Chỉ định từ nơi chốn. ここ (chỗ này), そこ (chỗ đó), あそこ (chỗ đằng kia).",
        "examples": [
          {
            "japanese": "ここは 教室です。",
            "reading": "ここは きょうしつです。",
            "vietnamese": "Đây là phòng học."
          },
          {
            "japanese": "あそこは 事務所です。",
            "reading": "あそこは じむしょです。",
            "vietnamese": "Kia là văn phòng."
          }
        ]
      },
      {
        "title": "N は N(địa điểm) です",
        "pattern": "N は Địa điểm です",
        "explanation": "Chỉ vị trí của một vật, một người hoặc một địa điểm.",
        "examples": [
          {
            "japanese": "お手洗いは あそこです。",
            "reading": "おてあらいは あそこです。",
            "vietnamese": "Nhà vệ sinh ở đằng kia."
          },
          {
            "japanese": "ミラーさんは 事務所です。",
            "reading": "みらーさんは じむしょです。",
            "vietnamese": "Anh Miller đang ở văn phòng."
          }
        ]
      },
      {
        "title": "どこ／どちら (Ở đâu / Hướng nào)",
        "pattern": "N は どこ／どちら ですか",
        "explanation": "どこ hỏi nơi chốn (ở đâu). どちら là cách nói lịch sự hơn của どこ hoặc dùng để hỏi phương hướng.",
        "examples": [
          {
            "japanese": "電話は どこですか。ー ２階です。",
            "reading": "でんわは どこですか。ー にかいです。",
            "vietnamese": "Điện thoại ở đâu? - Ở tầng 2."
          },
          {
            "japanese": "お国は どちらですか。ー ベトナムです。",
            "reading": "おくには どちらですか。ー べとなむです。",
            "vietnamese": "Đất nước bạn ở đâu? - Là Việt Nam."
          }
        ]
      },
      {
        "title": "N は いくらですか (Hỏi giá tiền)",
        "pattern": "N は いくらですか",
        "explanation": "Hỏi giá tiền của món hàng N. Trả lời bằng Số tiền + えん (yên).",
        "examples": [
          {
            "japanese": "このネクタイは いくらですか。ー １５００円です。",
            "reading": "このねくたいは いくらですか。ー せんごひゃくえんです。",
            "vietnamese": "Cà vạt này bao nhiêu tiền? - 1500 yên."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 4,
    "title": "Bài 4: Thời gian & Động từ ます",
    "japaneseTitle": "第４課：時間・動詞ます",
    "description": "Cách nói giờ phút, ngày trong tuần, động từ thể ます/ました/ません/ませんでした và mốc thời gian から, まで.",
    "vocabularies": [
      {
        "id": 401,
        "word": "起きます",
        "reading": "おきます",
        "romaji": "okimasu",
        "meaning": "Thức dậy",
        "hanViet": "Khởi",
        "type": "Động từ",
        "exampleSentence": "毎朝 6時に 起きます。",
        "exampleSentenceReading": "まいあさ ろくじに おきます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi dậy lúc 6 giờ."
      },
      {
        "id": 402,
        "word": "寝ます",
        "reading": "ねます",
        "romaji": "nemasu",
        "meaning": "Ngủ / Đi ngủ",
        "hanViet": "Tẩm",
        "type": "Động từ",
        "exampleSentence": "夜 11時に 寝ます。",
        "exampleSentenceReading": "よる じゅういちじに ねます。",
        "exampleSentenceMeaning": "Tối tôi đi ngủ lúc 11 giờ."
      },
      {
        "id": 403,
        "word": "働きます",
        "reading": "はたらきます",
        "romaji": "hatarakimasu",
        "meaning": "Làm việc",
        "hanViet": "Động",
        "type": "Động từ",
        "exampleSentence": "9時から 5時まで 働きます。",
        "exampleSentenceReading": "くじから ごじまで はたらきます。",
        "exampleSentenceMeaning": "Tôi làm việc từ 9h đến 5h."
      },
      {
        "id": 404,
        "word": "休みます",
        "reading": "やすみます",
        "romaji": "yasumimasu",
        "meaning": "Nghỉ ngơi / Nghỉ học, làm",
        "hanViet": "Hưu",
        "type": "Động từ",
        "exampleSentence": "日曜日は 休みます。",
        "exampleSentenceReading": "にちようびは やすみます。",
        "exampleSentenceMeaning": "Chủ nhật tôi nghỉ."
      },
      {
        "id": 405,
        "word": "勉強します",
        "reading": "べんきょうします",
        "romaji": "benkyoushimasu",
        "meaning": "Học tập",
        "hanViet": "Miễn Cưỡng",
        "type": "Động từ",
        "exampleSentence": "日本語を 勉強します。",
        "exampleSentenceReading": "にほんごを べんきょうします。",
        "exampleSentenceMeaning": "Tôi học tiếng Nhật."
      },
      {
        "id": 406,
        "word": "終わります",
        "reading": "おわります",
        "romaji": "owarimasu",
        "meaning": "Kết thúc / Xong",
        "hanViet": "Chung",
        "type": "Động từ",
        "exampleSentence": "仕事は 5時に 終わります。",
        "exampleSentenceReading": "しごとは ごじに おわります。",
        "exampleSentenceMeaning": "Công việc kết thúc lúc 5 giờ."
      },
      {
        "id": 407,
        "word": "今",
        "reading": "いま",
        "romaji": "ima",
        "meaning": "Bây giờ",
        "hanViet": "Kim",
        "type": "Danh từ",
        "exampleSentence": "今 何時ですか。",
        "exampleSentenceReading": "いま なんじですか。",
        "exampleSentenceMeaning": "Bây giờ là mấy giờ?"
      },
      {
        "id": 408,
        "word": "～時",
        "reading": "～じ",
        "romaji": "-ji",
        "meaning": "～ giờ",
        "hanViet": "Thời",
        "type": "Lượng từ",
        "exampleSentence": "今 3時です。",
        "exampleSentenceReading": "いま さんじです。",
        "exampleSentenceMeaning": "Bây giờ là 3 giờ."
      },
      {
        "id": 409,
        "word": "～分",
        "reading": "～ふん／ぷん",
        "romaji": "-fun/-pun",
        "meaning": "～ phút",
        "hanViet": "Phân",
        "type": "Lượng từ",
        "exampleSentence": "3時 15分です。",
        "exampleSentenceReading": "さんじ じゅうごふんです。",
        "exampleSentenceMeaning": "3 giờ 15 phút."
      },
      {
        "id": 410,
        "word": "半",
        "reading": "はん",
        "romaji": "han",
        "meaning": "Rưỡi / Nửa",
        "hanViet": "Bán",
        "type": "Danh từ",
        "exampleSentence": "7時半に 起きます。",
        "exampleSentenceReading": "しちじはんに おきます。",
        "exampleSentenceMeaning": "Dậy lúc 7 giờ rưỡi."
      },
      {
        "id": 411,
        "word": "何時",
        "reading": "なんじ",
        "romaji": "nanji",
        "meaning": "Mấy giờ",
        "hanViet": "Hà Thời",
        "type": "Từ để hỏi",
        "exampleSentence": "今 何時ですか。",
        "exampleSentenceReading": "いま なんじですか。",
        "exampleSentenceMeaning": "Bây giờ mấy giờ?"
      },
      {
        "id": 412,
        "word": "何分",
        "reading": "なんぷん",
        "romaji": "nanpun",
        "meaning": "Mấy phút",
        "hanViet": "Hà Phân",
        "type": "Từ để hỏi",
        "exampleSentence": "今 何時何分ですか。",
        "exampleSentenceReading": "いま なんじなんぷんですか。",
        "exampleSentenceMeaning": "Bây giờ là mấy giờ mấy phút?"
      },
      {
        "id": 413,
        "word": "午前",
        "reading": "ごぜん",
        "romaji": "gozen",
        "meaning": "Buổi sáng (AM)",
        "hanViet": "Ngọ Tiền",
        "type": "Danh từ",
        "exampleSentence": "午前 9時です。",
        "exampleSentenceReading": "ごぜん くじです。",
        "exampleSentenceMeaning": "9 giờ sáng."
      },
      {
        "id": 414,
        "word": "午後",
        "reading": "ごご",
        "romaji": "gogo",
        "meaning": "Buổi chiều / Tối (PM)",
        "hanViet": "Ngọ Hậu",
        "type": "Danh từ",
        "exampleSentence": "午後 2時です。",
        "exampleSentenceReading": "ごご にじです。",
        "exampleSentenceMeaning": "2 giờ chiều."
      },
      {
        "id": 415,
        "word": "朝",
        "reading": "あさ",
        "romaji": "asa",
        "meaning": "Buổi sáng",
        "hanViet": "Triều",
        "type": "Danh từ",
        "exampleSentence": "朝 パンを 食べます。",
        "exampleSentenceReading": "あさ ぱんを たべます。",
        "exampleSentenceMeaning": "Buổi sáng tôi ăn bánh mì."
      },
      {
        "id": 416,
        "word": "昼",
        "reading": "ひる",
        "romaji": "hiru",
        "meaning": "Buổi trưa",
        "hanViet": "Trú",
        "type": "Danh từ",
        "exampleSentence": "昼休みに 散歩します。",
        "exampleSentenceReading": "ひるやすみに さんぽします。",
        "exampleSentenceMeaning": "Giờ nghỉ trưa tôi đi dạo."
      },
      {
        "id": 417,
        "word": "晩 / 夜",
        "reading": "ばん／よる",
        "romaji": "ban / yoru",
        "meaning": "Buổi tối / Đêm",
        "hanViet": "Vãn / Dạ",
        "type": "Danh từ",
        "exampleSentence": "晩 テレビを 見ます。",
        "exampleSentenceReading": "ばん てれびを みます。",
        "exampleSentenceMeaning": "Buổi tối tôi xem TV."
      }
    ],
    "grammarPoints": [
      {
        "title": "今 ～時～分 です (Nói giờ phút)",
        "pattern": "今 [Số giờ]時 [Số phút]分 です",
        "explanation": "Dùng để biểu thị thời gian hiện tại. Chú ý các giờ đặc biệt: 4時 (よじ), 7時 (しちじ), 9時 (くじ).",
        "examples": [
          {
            "japanese": "今 ４時５分です。",
            "reading": "いま よじごふんです。",
            "vietnamese": "Bây giờ là 4 giờ 5 phút."
          },
          {
            "japanese": "ニューヨークは 今 午前４時です。",
            "reading": "にゅーよーくは いま ごぜんよじです。",
            "vietnamese": "Ở New York bây giờ là 4 giờ sáng."
          }
        ]
      },
      {
        "title": "Động từ thể ます / ません / ました / ませんでした",
        "pattern": "Vます / Vません / Vました / Vませんでした",
        "explanation": "Thể lịch sự của động từ. ます (hiện tại/tương lai khẳng định), ません (phủ định), ました (quá khứ khẳng định), ませんでした (quá khứ phủ định).",
        "examples": [
          {
            "japanese": "わたしは 毎日 勉強します。",
            "reading": "わたしは まいにち べんきょうします。",
            "vietnamese": "Mỗi ngày tôi đều học."
          },
          {
            "japanese": "きのう 勉強しました。",
            "reading": "きのう べんきょうしました。",
            "vietnamese": "Hôm qua tôi đã học."
          },
          {
            "japanese": "あしたは 働きません。",
            "reading": "あしたは はたらきません。",
            "vietnamese": "Ngày mai tôi không làm việc."
          }
        ]
      },
      {
        "title": "N(thời gian) に V (Thời điểm xảy ra hành động)",
        "pattern": "Thời gian (có con số) + に + V",
        "explanation": "Trợ từ に đi sau mốc thời gian có chứa con số cụ thể (giờ, ngày, tháng, năm) để biểu thị thời điểm thực hiện hành động.",
        "examples": [
          {
            "japanese": "６時半に 起きます。",
            "reading": "ろくじはんに おきます。",
            "vietnamese": "Tôi thức dậy lúc 6 giờ rưỡi."
          },
          {
            "japanese": "７月２日に 日本へ 来ました。",
            "reading": "しちがつふつかに にほんへ きました。",
            "vietnamese": "Tôi đã đến Nhật vào ngày 2 tháng 7."
          }
        ]
      },
      {
        "title": "～から ～まで (Từ ~ đến ~)",
        "pattern": "N1 から N2 まで",
        "explanation": "から chỉ điểm bắt đầu (thời gian hoặc địa điểm), まで chỉ điểm kết thúc.",
        "examples": [
          {
            "japanese": "９時から ５時まで 働きます。",
            "reading": "くじから ごじまで はたらきます。",
            "vietnamese": "Tôi làm việc từ 9 giờ đến 5 giờ."
          },
          {
            "japanese": "銀行は ９時から ３時までです。",
            "reading": "ぎんこうは くじから さんじまでです。",
            "vietnamese": "Ngân hàng mở cửa từ 9h đến 3h."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 5,
    "title": "Bài 5: Đi lại & Phương tiện",
    "japaneseTitle": "第５課：行く・来る・帰る",
    "description": "Các động từ di chuyển 行きます, 来ます, 帰ります với trợ từ へ (he->e), phương tiện で (de), người cùng đi と (to).",
    "vocabularies": [
      {
        "id": 501,
        "word": "行きます",
        "reading": "いきます",
        "romaji": "ikimasu",
        "meaning": "Đi",
        "hanViet": "Hành",
        "type": "Động từ",
        "exampleSentence": "スーパーへ 行きます。",
        "exampleSentenceReading": "すーぱーへ いきます。",
        "exampleSentenceMeaning": "Tôi đi siêu thị."
      },
      {
        "id": 502,
        "word": "来ます",
        "reading": "きます",
        "romaji": "kimasu",
        "meaning": "Đến",
        "hanViet": "Lai",
        "type": "Động từ",
        "exampleSentence": "日本へ 来ました。",
        "exampleSentenceReading": "にほんへ きました。",
        "exampleSentenceMeaning": "Tôi đã đến Nhật Bản."
      },
      {
        "id": 503,
        "word": "帰ります",
        "reading": "かえります",
        "romaji": "kaerimasu",
        "meaning": "Về (nhà/nước)",
        "hanViet": "Quy",
        "type": "Động từ",
        "exampleSentence": "うちへ 帰ります。",
        "exampleSentenceReading": "うちへ かえります。",
        "exampleSentenceMeaning": "Tôi về nhà."
      },
      {
        "id": 504,
        "word": "学校",
        "reading": "がっこう",
        "romaji": "gakkou",
        "meaning": "Trường học",
        "hanViet": "Học Hiệu",
        "type": "Danh từ",
        "exampleSentence": "学校へ 行きます。",
        "exampleSentenceReading": "がっこうへ いきます。",
        "exampleSentenceMeaning": "Đi đến trường."
      },
      {
        "id": 505,
        "word": "スーパー",
        "reading": "すーぱー",
        "romaji": "suupaa",
        "meaning": "Siêu thị",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "スーパーで 買い物を します。",
        "exampleSentenceReading": "すーぱーで かいものを します。",
        "exampleSentenceMeaning": "Mua sắm ở siêu thị."
      },
      {
        "id": 506,
        "word": "駅",
        "reading": "えき",
        "romaji": "eki",
        "meaning": "Nhà ga",
        "hanViet": "Dịch",
        "type": "Danh từ",
        "exampleSentence": "駅へ 行きます。",
        "exampleSentenceReading": "えきへ いきます。",
        "exampleSentenceMeaning": "Đi ra nhà ga."
      },
      {
        "id": 507,
        "word": "飛行機",
        "reading": "ひこうき",
        "romaji": "hikouki",
        "meaning": "Máy bay",
        "hanViet": "Phi Hành Cơ",
        "type": "Danh từ",
        "exampleSentence": "飛行機で 行きます。",
        "exampleSentenceReading": "ひこうきで いきます。",
        "exampleSentenceMeaning": "Đi bằng máy bay."
      },
      {
        "id": 508,
        "word": "船",
        "reading": "ふね",
        "romaji": "fune",
        "meaning": "Tàu thủy / Thuyền",
        "hanViet": "Thuyền",
        "type": "Danh từ",
        "exampleSentence": "船で 行きます。",
        "exampleSentenceReading": "ふねで いきます。",
        "exampleSentenceMeaning": "Đi bằng tàu thủy."
      },
      {
        "id": 509,
        "word": "電車",
        "reading": "でんしゃ",
        "romaji": "densha",
        "meaning": "Tàu điện",
        "hanViet": "Điện Xa",
        "type": "Danh từ",
        "exampleSentence": "電車で 行きます。",
        "exampleSentenceReading": "でんしゃで いきます。",
        "exampleSentenceMeaning": "Đi bằng tàu điện."
      },
      {
        "id": 510,
        "word": "地下鉄",
        "reading": "ちかてつ",
        "romaji": "chikatetsu",
        "meaning": "Tàu điện ngầm",
        "hanViet": "Địa Hạ Thiết",
        "type": "Danh từ",
        "exampleSentence": "地下鉄に 乗ります。",
        "exampleSentenceReading": "ちかてつに のります。",
        "exampleSentenceMeaning": "Lên tàu điện ngầm."
      },
      {
        "id": 511,
        "word": "新幹線",
        "reading": "しんかんせん",
        "romaji": "shinkansen",
        "meaning": "Tàu siêu tốc Shinkansen",
        "hanViet": "Tân Can Tuyến",
        "type": "Danh từ",
        "exampleSentence": "新幹線は 速いです。",
        "exampleSentenceReading": "しんかんせんは はやいです。",
        "exampleSentenceMeaning": "Tàu Shinkansen chạy rất nhanh."
      },
      {
        "id": 512,
        "word": "バス",
        "reading": "ばす",
        "romaji": "basu",
        "meaning": "Xe buýt",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "バスで 学校へ 行きます。",
        "exampleSentenceReading": "ばすで がっこうへ いきます。",
        "exampleSentenceMeaning": "Đến trường bằng xe buýt."
      },
      {
        "id": 513,
        "word": "タクシー",
        "reading": "たくしー",
        "romaji": "takushii",
        "meaning": "Xe taxi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "タクシーを 呼びます。",
        "exampleSentenceReading": "たくしーを よびます。",
        "exampleSentenceMeaning": "Gọi xe taxi."
      },
      {
        "id": 514,
        "word": "自転車",
        "reading": "じてんしゃ",
        "romaji": "jitensha",
        "meaning": "Xe đạp",
        "hanViet": "Tự Chuyển Xa",
        "type": "Danh từ",
        "exampleSentence": "自転車で 行きます。",
        "exampleSentenceReading": "じてんしゃで いきます。",
        "exampleSentenceMeaning": "Đi bằng xe đạp."
      },
      {
        "id": 515,
        "word": "歩いて",
        "reading": "あるいて",
        "romaji": "aruite",
        "meaning": "Đi bộ",
        "hanViet": "Bộ",
        "type": "Phó từ",
        "exampleSentence": "駅から 歩いて 帰ります。",
        "exampleSentenceReading": "えきから あるいて かえります。",
        "exampleSentenceMeaning": "Từ ga tôi đi bộ về nhà."
      },
      {
        "id": 516,
        "word": "友達",
        "reading": "ともだち",
        "romaji": "tomodachi",
        "meaning": "Bạn bè",
        "hanViet": "Hữu Đạt",
        "type": "Danh từ",
        "exampleSentence": "友達と 会います。",
        "exampleSentenceReading": "ともだちと あいます。",
        "exampleSentenceMeaning": "Gặp bạn bè."
      },
      {
        "id": 517,
        "word": "一人で",
        "reading": "ひとりで",
        "romaji": "hitoride",
        "meaning": "Một mình",
        "hanViet": "Nhất Nhân",
        "type": "Phó từ",
        "exampleSentence": "一人で 行きます。",
        "exampleSentenceReading": "ひとりで いきます。",
        "exampleSentenceMeaning": "Đi một mình."
      }
    ],
    "grammarPoints": [
      {
        "title": "N(địa điểm) へ 行きます／来ます／帰ります",
        "pattern": "Địa điểm + へ + 行きます／来ます／帰ります",
        "explanation": "Trợ từ へ (phát âm là 'e') biểu thị hướng đi tới đích đến.",
        "examples": [
          {
            "japanese": "わたしは 京都へ 行きます。",
            "reading": "わたしは きょうとへ いきます。",
            "vietnamese": "Tôi đi đến Kyoto."
          },
          {
            "japanese": "来週 日本へ 来ます。",
            "reading": "らいしゅう にほんへ きます。",
            "vietnamese": "Tuần sau tôi đến Nhật."
          }
        ]
      },
      {
        "title": "どこ [へ] も 行きません (Phủ định hoàn toàn)",
        "pattern": "どこ [へ] も 行きません／行きませんでした",
        "explanation": "Từ để hỏi + も + thể phủ định để phủ định hoàn toàn (Không đi đâu cả).",
        "examples": [
          {
            "japanese": "日曜日は どこも 行きませんでした。",
            "reading": "にちようびは どこも いきませんでした。",
            "vietnamese": "Chủ nhật tôi không đi đâu cả."
          }
        ]
      },
      {
        "title": "N(phương tiện) で 行きます (Phương tiện di chuyển)",
        "pattern": "Phương tiện + で + 行きます",
        "explanation": "Trợ từ で chỉ phương tiện hoặc cách thức di chuyển (bằng xe bus, tàu điện...). Chú ý: đi bộ dùng 歩いて (aruite), không thêm で.",
        "examples": [
          {
            "japanese": "電車で 行きます。",
            "reading": "でんしゃで いきます。",
            "vietnamese": "Tôi đi bằng tàu điện."
          },
          {
            "japanese": "駅から 歩いて 帰りました。",
            "reading": "えきから あるいて かえりました。",
            "vietnamese": "Từ nhà ga tôi đã đi bộ về."
          }
        ]
      },
      {
        "title": "N(người) と V (Cùng với ai)",
        "pattern": "Người + と + V",
        "explanation": "Trợ từ と mang nghĩa 'cùng với'. Nếu làm một mình dùng 一人で (hitori de), không dùng と.",
        "examples": [
          {
            "japanese": "家族と 日本へ 来ました。",
            "reading": "かぞくと にほんへ きました。",
            "vietnamese": "Tôi đã đến Nhật cùng với gia đình."
          },
          {
            "japanese": "一人で 東京へ 行きます。",
            "reading": "ひとりで とうきょうへ いきます。",
            "vietnamese": "Tôi đi Tokyo một mình."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 6,
    "title": "Bài 6: Thức ăn & Hành động hàng ngày",
    "japaneseTitle": "第６課：何をしますか",
    "description": "Trợ từ を (o) chỉ đối tượng tác động, で chỉ địa điểm diễn ra hành động, rủ rê Vませんか / Vましょう.",
    "vocabularies": [
      {
        "id": 601,
        "word": "言葉 6",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 6",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第6課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい6かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 6."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 6",
        "pattern": "Trợ từ を (o) chỉ đối tượng tác động, で chỉ địa điểm diễn ra hành động, rủ rê Vませんか / Vましょう",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 6: Thức ăn & Hành động hàng ngày.",
        "examples": [
          {
            "japanese": "これは 第6課の 例文です。",
            "reading": "これは だい6かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 6."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 7,
    "title": "Bài 7: Công cụ, Phương tiện & Cho/Nhận",
    "japaneseTitle": "第７課：あげます・もらいます",
    "description": "Trợ từ で chỉ công cụ dụng cụ, hành động cho あげます và nhận もらいます, もう Vました.",
    "vocabularies": [
      {
        "id": 701,
        "word": "言葉 7",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 7",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第7課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい7かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 7."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 7",
        "pattern": "Trợ từ で chỉ công cụ dụng cụ, hành động cho あげます và nhận もらいます, もう Vました",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 7: Công cụ, Phương tiện & Cho/Nhận.",
        "examples": [
          {
            "japanese": "これは 第7課の 例文です。",
            "reading": "これは だい7かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 7."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 8,
    "title": "Bài 8: Tính từ đuôi な và い",
    "japaneseTitle": "第８課：形容詞",
    "description": "Tính từ trong tiếng Nhật (đuôi い và な), cách bổ nghĩa cho danh từ, câu hỏi どんな N.",
    "vocabularies": [
      {
        "id": 801,
        "word": "言葉 8",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 8",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第8課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい8かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 8."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 8",
        "pattern": "Tính từ trong tiếng Nhật (đuôi い và な), cách bổ nghĩa cho danh từ, câu hỏi どんな N",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 8: Tính từ đuôi な và い.",
        "examples": [
          {
            "japanese": "これは 第8課の 例文です。",
            "reading": "これは だい8かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 8."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 9,
    "title": "Bài 9: Sở thích, Năng lực & Lí do",
    "japaneseTitle": "第９課：好き・上手・から",
    "description": "Trợ từ が với tính từ 好き/嫌い/上手/下手, động từ わかります/あります, liên từ chỉ nguyên nhân から.",
    "vocabularies": [
      {
        "id": 901,
        "word": "言葉 9",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 9",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第9課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい9かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 9."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 9",
        "pattern": "Trợ từ が với tính từ 好き/嫌い/上手/下手, động từ わかります/あります, liên từ chỉ nguyên nhân から",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 9: Sở thích, Năng lực & Lí do.",
        "examples": [
          {
            "japanese": "これは 第9課の 例文です。",
            "reading": "これは だい9かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 9."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 10,
    "title": "Bài 10: Tồn tại & Vị trí",
    "japaneseTitle": "第１０課：あります・います",
    "description": "Sự tồn tại của người/động vật (います) và đồ vật/cây cối (あります), từ chỉ vị trí (trên, dưới, trong, ngoài...).",
    "vocabularies": [
      {
        "id": 1001,
        "word": "言葉 10",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 10",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第10課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい10かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 10."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 10",
        "pattern": "Sự tồn tại của người/động vật (います) và đồ vật/cây cối (あります), từ chỉ vị trí (trên, dưới, trong, ngoài",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 10: Tồn tại & Vị trí.",
        "examples": [
          {
            "japanese": "これは 第10課の 例文です。",
            "reading": "これは だい10かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 10."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 11,
    "title": "Bài 11: Số lượng từ & Tần suất",
    "japaneseTitle": "第１１課：数量詞",
    "description": "Cách đếm đồ vật (ひとつ, ふたつ), người (ひとり, ふたり), tần suất làm việc 1 tuần mấy lần.",
    "vocabularies": [
      {
        "id": 1101,
        "word": "言葉 11",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 11",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第11課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい11かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 11."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 11",
        "pattern": "Cách đếm đồ vật (ひとつ, ふたつ), người (ひとり, ふたり), tần suất làm việc 1 tuần mấy lần",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 11: Số lượng từ & Tần suất.",
        "examples": [
          {
            "japanese": "これは 第11課の 例文です。",
            "reading": "これは だい11かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 11."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 12,
    "title": "Bài 12: Thì quá khứ & So sánh",
    "japaneseTitle": "第１２課：比較（より・一番）",
    "description": "Quá khứ của tính từ/danh từ, so sánh hơn A は B より, so sánh nhất 一番.",
    "vocabularies": [
      {
        "id": 1201,
        "word": "言葉 12",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 12",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第12課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい12かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 12."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 12",
        "pattern": "Quá khứ của tính từ/danh từ, so sánh hơn A は B より, so sánh nhất 一番",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 12: Thì quá khứ & So sánh.",
        "examples": [
          {
            "japanese": "これは 第12課の 例文です。",
            "reading": "これは だい12かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 12."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 13,
    "title": "Bài 13: Mong muốn (ほしい・たい)",
    "japaneseTitle": "第１３課：～たい・～ほしい",
    "description": "Thể hiện mong muốn sở hữu N が ほしい, muốn làm V-stem + たいです, mục đích di chuyển V-stem に 行きます.",
    "vocabularies": [
      {
        "id": 1301,
        "word": "言葉 13",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 13",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第13課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい13かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 13."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 13",
        "pattern": "Thể hiện mong muốn sở hữu N が ほしい, muốn làm V-stem + たいです, mục đích di chuyển V-stem に 行きます",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 13: Mong muốn (ほしい・たい).",
        "examples": [
          {
            "japanese": "これは 第13課の 例文です。",
            "reading": "これは だい13かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 13."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 14,
    "title": "Bài 14: Thể て (Te-form) & Yêu cầu",
    "japaneseTitle": "第１４課：て形・～てください",
    "description": "Chia động từ nhóm 1, 2, 3 sang thể て, mẫu câu sai khiến lịch sự Vてください, hành động đang diễn ra Vています.",
    "vocabularies": [
      {
        "id": 1401,
        "word": "言葉 14",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 14",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第14課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい14かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 14."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 14",
        "pattern": "Chia động từ nhóm 1, 2, 3 sang thể て, mẫu câu sai khiến lịch sự Vてください, hành động đang diễn ra Vています",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 14: Thể て (Te-form) & Yêu cầu.",
        "examples": [
          {
            "japanese": "これは 第14課の 例文です。",
            "reading": "これは だい14かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 14."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 15,
    "title": "Bài 15: Xin phép & Trạng thái",
    "japaneseTitle": "第１５課：～てもいいですか",
    "description": "Mẫu câu xin phép Vてもいいですか, cấm đoán Vてはいけません, trạng thái kết quả Vています.",
    "vocabularies": [
      {
        "id": 1501,
        "word": "言葉 15",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 15",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第15課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい15かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 15."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 15",
        "pattern": "Mẫu câu xin phép Vてもいいですか, cấm đoán Vてはいけません, trạng thái kết quả Vています",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 15: Xin phép & Trạng thái.",
        "examples": [
          {
            "japanese": "これは 第15課の 例文です。",
            "reading": "これは だい15かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 15."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 16,
    "title": "Bài 16: Nối câu & Trình tự hành động",
    "japaneseTitle": "第１６課：てから・ nối tính từ",
    "description": "Nối chuỗi hành động Vて, thứ tự trước sau Vてから, nối tính từ (くて, で), miêu tả đặc điểm.",
    "vocabularies": [
      {
        "id": 1601,
        "word": "言葉 16",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 16",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第16課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい16かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 16."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 16",
        "pattern": "Nối chuỗi hành động Vて, thứ tự trước sau Vてから, nối tính từ (くて, で), miêu tả đặc điểm",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 16: Nối câu & Trình tự hành động.",
        "examples": [
          {
            "japanese": "これは 第16課の 例文です。",
            "reading": "これは だい16かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 16."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 17,
    "title": "Bài 17: Thể ない (Nai-form)",
    "japaneseTitle": "第１７課：ない形・～なければなりません",
    "description": "Chia thể ない, yêu cầu đừng làm Vないでください, bắt buộc phải làm Vなければなりません, không cần làm Vなくてもいいです.",
    "vocabularies": [
      {
        "id": 1701,
        "word": "言葉 17",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 17",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第17課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい17かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 17."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 17",
        "pattern": "Chia thể ない, yêu cầu đừng làm Vないでください, bắt buộc phải làm Vなければなりません, không cần làm Vなくてもいいです",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 17: Thể ない (Nai-form).",
        "examples": [
          {
            "japanese": "これは 第17課の 例文です。",
            "reading": "これは だい17かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 17."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 18,
    "title": "Bài 18: Thể từ điển (Jisho-form)",
    "japaneseTitle": "第１８課：辞書形・～ことができます",
    "description": "Chia thể nguyên mẫu (thể từ điển), khả năng làm được gì Vことができます, sở thích, mốc thời gian Vる前に.",
    "vocabularies": [
      {
        "id": 1801,
        "word": "言葉 18",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 18",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第18課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい18かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 18."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 18",
        "pattern": "Chia thể nguyên mẫu (thể từ điển), khả năng làm được gì Vことができます, sở thích, mốc thời gian Vる前に",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 18: Thể từ điển (Jisho-form).",
        "examples": [
          {
            "japanese": "これは 第18課の 例文です。",
            "reading": "これは だい18かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 18."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 19,
    "title": "Bài 19: Thể た (Ta-form) & Kinh nghiệm",
    "japaneseTitle": "第１９課：た形・～たことがあります",
    "description": "Chia thể quá khứ ngắn (thể た), kinh nghiệm từng làm gì Vたことがあります, liệt kê hành động VたりVたりします.",
    "vocabularies": [
      {
        "id": 1901,
        "word": "言葉 19",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 19",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第19課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい19かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 19."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 19",
        "pattern": "Chia thể quá khứ ngắn (thể た), kinh nghiệm từng làm gì Vたことがあります, liệt kê hành động VたりVたりします",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 19: Thể た (Ta-form) & Kinh nghiệm.",
        "examples": [
          {
            "japanese": "これは 第19課の 例文です。",
            "reading": "これは だい19かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 19."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 20,
    "title": "Bài 20: Thể thông thường (Futsuu-kei)",
    "japaneseTitle": "第２０課：普通形",
    "description": "Phân biệt thể lịch sự (丁寧形) và thể thông thường (普通形), giao tiếp thân mật giữa bạn bè, người thân.",
    "vocabularies": [
      {
        "id": 2001,
        "word": "言葉 20",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 20",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第20課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい20かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 20."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 20",
        "pattern": "Phân biệt thể lịch sự (丁寧形) và thể thông thường (普通形), giao tiếp thân mật giữa bạn bè, người thân",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 20: Thể thông thường (Futsuu-kei).",
        "examples": [
          {
            "japanese": "これは 第20課の 例文です。",
            "reading": "これは だい20かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 20."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 21,
    "title": "Bài 21: Ý kiến & Trích dẫn",
    "japaneseTitle": "第２１課：～と思います・と言いました",
    "description": "Bày tỏ suy nghĩ cá nhân [Thể thông thường] と思います, trích dẫn lời nói と言いました, xác nhận でしょう.",
    "vocabularies": [
      {
        "id": 2101,
        "word": "言葉 21",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 21",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第21課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい21かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 21."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 21",
        "pattern": "Bày tỏ suy nghĩ cá nhân [Thể thông thường] と思います, trích dẫn lời nói と言いました, xác nhận でしょう",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 21: Ý kiến & Trích dẫn.",
        "examples": [
          {
            "japanese": "これは 第21課の 例文です。",
            "reading": "これは だい21かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 21."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 22,
    "title": "Bài 22: Mệnh đề bổ ngữ cho danh từ",
    "japaneseTitle": "第２２課：連体修飾",
    "description": "Cách dùng mệnh đề động từ thể ngắn để bổ nghĩa cho danh từ đứng sau (Định ngữ trong tiếng Nhật).",
    "vocabularies": [
      {
        "id": 2201,
        "word": "言葉 22",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 22",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第22課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい22かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 22."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 22",
        "pattern": "Cách dùng mệnh đề động từ thể ngắn để bổ nghĩa cho danh từ đứng sau (Định ngữ trong tiếng Nhật)",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 22: Mệnh đề bổ ngữ cho danh từ.",
        "examples": [
          {
            "japanese": "これは 第22課の 例文です。",
            "reading": "これは だい22かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 22."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 23,
    "title": "Bài 23: Khi nào (とき) & Hễ mà (と)",
    "japaneseTitle": "第２３課：～とき・～と",
    "description": "Diễn tả thời điểm hành động xảy ra với とき (khi), điều kiện tất yếu, chỉ đường với と (hễ mà).",
    "vocabularies": [
      {
        "id": 2301,
        "word": "言葉 23",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 23",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第23課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい23かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 23."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 23",
        "pattern": "Diễn tả thời điểm hành động xảy ra với とき (khi), điều kiện tất yếu, chỉ đường với と (hễ mà)",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 23: Khi nào (とき) & Hễ mà (と).",
        "examples": [
          {
            "japanese": "これは 第23課の 例文です。",
            "reading": "これは だい23かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 23."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 24,
    "title": "Bài 24: Cho và nhận hành động (Cho/Nhận giúp đỡ)",
    "japaneseTitle": "第２４課：～てくれます・～てあげます",
    "description": "Giúp đỡ ai đó Vてあげます, được ai giúp Vてもらいます, ai đó giúp mình Vてくれます.",
    "vocabularies": [
      {
        "id": 2401,
        "word": "言葉 24",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 24",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第24課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい24かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 24."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 24",
        "pattern": "Giúp đỡ ai đó Vてあげます, được ai giúp Vてもらいます, ai đó giúp mình Vてくれます",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 24: Cho và nhận hành động (Cho/Nhận giúp đỡ).",
        "examples": [
          {
            "japanese": "これは 第24課の 例文です。",
            "reading": "これは だい24かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 24."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 25,
    "title": "Bài 25: Điều kiện (たら・ても)",
    "japaneseTitle": "第２５課：～たら・～ても",
    "description": "Câu điều kiện giả định / sau khi hoàn thành Vたら (nếu/sau khi), câu điều kiện tương phản Vても (dù... nhưng).",
    "vocabularies": [
      {
        "id": 2501,
        "word": "言葉 25",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ vựng tiêu biểu bài 25",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "第25課の 言葉を 覚えます。",
        "exampleSentenceReading": "だい25かの ことばを おぼえます。",
        "exampleSentenceMeaning": "Ghi nhớ từ vựng của bài số 25."
      }
    ],
    "grammarPoints": [
      {
        "title": "Ngữ pháp trọng tâm Bài 25",
        "pattern": "Câu điều kiện giả định / sau khi hoàn thành Vたら (nếu/sau khi), câu điều kiện tương phản Vても (dù",
        "explanation": "Toàn bộ cấu trúc ngữ pháp và cách vận dụng thực tế của Bài 25: Điều kiện (たら・ても).",
        "examples": [
          {
            "japanese": "これは 第25課の 例文です。",
            "reading": "これは だい25かの れいぶんです。",
            "vietnamese": "Đây là câu ví dụ mẫu của bài 25."
          }
        ]
      }
    ]
  }
]"""
    val TESTS_RAW_JSON = """[
  {
    "id": "test_n5_01",
    "title": "Đề thi thử JLPT N5 - Đề số 1",
    "description": "Đề thi thử chuẩn cấu trúc đề thi thật JLPT N5: Kiến thức ngôn ngữ (Chữ Hán, Từ vựng) và Ngữ pháp - Đọc hiểu.",
    "durationMinutes": 45,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "きのう [日本]へ 行きました。",
        "options": [
          "にほん",
          "にっぽん",
          "にぼん",
          "にほんご"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [日本] (Nhật Bản) đọc là 「にほん」."
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この [本]は わたしのです。",
        "options": [
          "ほん",
          "ぼん",
          "ぽん",
          "ほんご"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [本] (Bản - sách) đọc là 「ほん」."
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "あした [友だち]と 会います。",
        "options": [
          "ともだち",
          "ともたち",
          "ゆうち",
          "ゆうだち"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [友だち] (Hữu - bạn bè) đọc là 「ともだち」."
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "まいにち [水]を 飲みます。",
        "options": [
          "みず",
          "すい",
          "おちゃ",
          "ジュース"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [水] (Thủy - nước) đứng một mình đọc âm Kun là 「みず」."
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Tìm Kanji thích hợp",
        "question": "えきの [まえ]で まちます。",
        "options": [
          "前",
          "後",
          "中",
          "外"
        ],
        "correctIndex": 0,
        "explanation": "まえ (phía trước) viết bằng Kanji là [前] (Tiền)."
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Tìm Kanji thích hợp",
        "question": "あの [くるま]は あかいです。",
        "options": [
          "車",
          "電車",
          "自転車",
          "東"
        ],
        "correctIndex": 0,
        "explanation": "くるま (xe ô tô) viết bằng Kanji là [車] (Xa)."
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あさごはんを たべて、( 　 )を みがきます。",
        "options": [
          "は",
          "て",
          "め",
          "あし"
        ],
        "correctIndex": 0,
        "explanation": "Cụm từ cố định: はを みがきます (đánh răng). は = răng."
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あついですね。( 　 )を つけて ください。",
        "options": [
          "エアコン",
          "テレビ",
          "まど",
          "ドア"
        ],
        "correctIndex": 0,
        "explanation": "Trời nóng (あつい) nên bật điều hòa (エアコンを つけて ください)."
      },
      {
        "id": 9,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 1: Ngữ pháp",
        "question": "わたしは まいにち バス ( 　 ) がっこうへ いきます。",
        "options": [
          "で",
          "に",
          "へ",
          "を"
        ],
        "correctIndex": 0,
        "explanation": "Trợ từ で chỉ phương tiện đi lại: バスで (bằng xe buýt)."
      },
      {
        "id": 10,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 1: Ngữ pháp",
        "question": "きのうの ばん、８じ ( 　 ) べんきょうしました。",
        "options": [
          "から",
          "まで",
          "に",
          "へ"
        ],
        "correctIndex": 0,
        "explanation": "8じから (từ 8 giờ) biểu thị mốc bắt đầu học bài."
      },
      {
        "id": 11,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 2: Sắp xếp dấu sao ★",
        "question": "わたしは ＿＿ ＿＿ ★ ＿＿ 好きです。\n(1: が  2: すし  3: 日本の  4: いちばん)",
        "options": [
          "すし (2)",
          "いちばん (4)",
          "が (1)",
          "日本の (3)"
        ],
        "correctIndex": 1,
        "explanation": "Thứ tự câu đúng: わたしは [日本の] [すし] [★いちばん] [が] 好きです。Vị trí dấu sao là số 4: いちばん."
      },
      {
        "id": 12,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 3: Đọc hiểu ngắn",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\nやまだ：「たなかさん、きのう どこかへ 行きましたか。」\nたなか：「ええ、京都へ 行きました。とても きれいでした。でも、人が 多かったです。」\n\n【Câu hỏi】たなかさんは きのう どうでしたか。",
        "options": [
          "京都へ 行って、人が 多かったです。",
          "どこも 行きませんでした。",
          "京都へ 行きませんでした。",
          "人が 少なかったです。"
        ],
        "correctIndex": 0,
        "explanation": "Anh Tanaka nói hôm qua đi Kyoto, phong cảnh rất đẹp nhưng đông người (人が 多かったです)."
      }
    ]
  },
  {
    "id": "test_n5_02",
    "title": "Đề thi thử JLPT N5 - Đề số 2",
    "description": "Đề thi thử N5 tổng hợp số 2 giúp rèn luyện phản xạ tính giờ và kỹ năng làm bài trắc nghiệm.",
    "durationMinutes": 45,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "きょうは [何曜日]ですか。",
        "options": [
          "なんようび",
          "なにようび",
          "なんにち",
          "なんがつ"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [何曜日] đọc là 「なんようび」 (Thứ mấy trong tuần)."
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "こうえんに [花]が あります。",
        "options": [
          "はな",
          "き",
          "みず",
          "やま"
        ],
        "correctIndex": 0,
        "explanation": "[花] (Hoa - bông hoa) đọc là 「はな」."
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Tìm Kanji thích hợp",
        "question": "あした ともだちと [あいます]。",
        "options": [
          "会います",
          "行きます",
          "来ます",
          "話します"
        ],
        "correctIndex": 0,
        "explanation": "あいます (gặp) viết bằng Kanji là [会います] (Hội)."
      },
      {
        "id": 4,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 1: Ngữ pháp",
        "question": "ここで しゃしんを ( 　 ) は いけません。",
        "options": [
          "とって",
          "とる",
          "とります",
          "とった"
        ],
        "correctIndex": 0,
        "explanation": "Mẫu câu cấm đoán: Vて + は いけません (Không được làm V). とります chuyển sang thể て là とって."
      },
      {
        "id": 5,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 1: Ngữ pháp",
        "question": "わたしは にほんごを はなす こと ( 　 ) できます。",
        "options": [
          "が",
          "を",
          "に",
          "で"
        ],
        "correctIndex": 0,
        "explanation": "Mẫu câu diễn tả khả năng: Vる こと + が + できます."
      },
      {
        "id": 6,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 3: Đọc hiểu ngắn",
        "question": "【Thông báo tại thư viện】\n「ほんは ひとり ３さつまで かりることが できます。２しゅうかん いないに かえして ください。」\n\n【Câu hỏi】ほんを 何さつ、いつまで かりることができますか。",
        "options": [
          "３さつまで、２しゅうかん いない",
          "２さつまで、３しゅうかん いない",
          "ひとり １さつ、２しゅうかん",
          "何さつでも、２しゅうかん"
        ],
        "correctIndex": 0,
        "explanation": "Thông báo ghi rõ: ひとり ３さつまで (tối đa 3 quyển), ２しゅうかん いないに (trong vòng 2 tuần)."
      }
    ]
  }
]"""
}
