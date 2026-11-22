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
        "exampleSentenceMeaning": "Tôi là Nam.",
        "dictionaryForm": ""
      },
      {
        "id": 102,
        "word": "わたしたち",
        "reading": "わたしたち",
        "romaji": "watashitachi",
        "meaning": "Chúng tôi / Chúng ta",
        "hanViet": "Tư",
        "type": "Đại từ",
        "exampleSentence": "わたしたちは がくせいです。",
        "exampleSentenceReading": "わたしたちは がくせいです。",
        "exampleSentenceMeaning": "Chúng tôi là học sinh.",
        "dictionaryForm": ""
      },
      {
        "id": 103,
        "word": "あなた",
        "reading": "あなた",
        "romaji": "anata",
        "meaning": "Bạn / Anh / Chị",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "あなたは がくせいですか。",
        "exampleSentenceReading": "あなたは がくせいですか。",
        "exampleSentenceMeaning": "Bạn có phải là học sinh không?",
        "dictionaryForm": ""
      },
      {
        "id": 104,
        "word": "あの人",
        "reading": "あのひと",
        "romaji": "ano hito",
        "meaning": "Người kia / Người đó",
        "hanViet": "Nhân",
        "type": "Danh từ",
        "exampleSentence": "あの人は だれですか。",
        "exampleSentenceReading": "あのひとは だれですか。",
        "exampleSentenceMeaning": "Người kia là ai vậy?",
        "dictionaryForm": ""
      },
      {
        "id": 105,
        "word": "あの方",
        "reading": "あのかた",
        "romaji": "ano kata",
        "meaning": "Vị kia (lịch sự của あの人)",
        "hanViet": "Phương",
        "type": "Danh từ",
        "exampleSentence": "あの方は たなか先生です。",
        "exampleSentenceReading": "あのかたは たなかせんせいです。",
        "exampleSentenceMeaning": "Vị kia là thầy Tanaka.",
        "dictionaryForm": ""
      },
      {
        "id": 106,
        "word": "皆さん",
        "reading": "みなさん",
        "romaji": "minasan",
        "meaning": "Mọi người / Các bạn",
        "hanViet": "Giai",
        "type": "Danh từ",
        "exampleSentence": "皆さん、おはようございます。",
        "exampleSentenceReading": "みなさん、おはようございます。",
        "exampleSentenceMeaning": "Chào buổi sáng mọi người.",
        "dictionaryForm": ""
      },
      {
        "id": 107,
        "word": "～さん",
        "reading": "～さん",
        "romaji": "-san",
        "meaning": "Anh / Chị / Ông / Bà (hậu tố lịch sự)",
        "hanViet": "",
        "type": "Hậu tố",
        "exampleSentence": "こちらは ミラーさんです。",
        "exampleSentenceReading": "こちらは みらーさんです。",
        "exampleSentenceMeaning": "Đây là anh Miller.",
        "dictionaryForm": ""
      },
      {
        "id": 108,
        "word": "～ちゃん",
        "reading": "～ちゃん",
        "romaji": "-chan",
        "meaning": "Bé / Em (gọi thân mật cho trẻ em/con gái)",
        "hanViet": "",
        "type": "Hậu tố",
        "exampleSentence": "さくらちゃんは かわいいです。",
        "exampleSentenceReading": "さくらちゃんは かわいいです。",
        "exampleSentenceMeaning": "Bé Sakura rất đáng yêu.",
        "dictionaryForm": ""
      },
      {
        "id": 109,
        "word": "～君",
        "reading": "～くん",
        "romaji": "-kun",
        "meaning": "Cậu / Bạn (dùng cho nam giới nhỏ/bằng tuổi)",
        "hanViet": "Quân",
        "type": "Hậu tố",
        "exampleSentence": "やまだ君は どこですか。",
        "exampleSentenceReading": "やまだくんは どこですか。",
        "exampleSentenceMeaning": "Cậu Yamada ở đâu rồi?",
        "dictionaryForm": ""
      },
      {
        "id": 110,
        "word": "～人",
        "reading": "～じん",
        "romaji": "-jin",
        "meaning": "Người nước... (hậu tố quốc tịch)",
        "hanViet": "Nhân",
        "type": "Hậu tố",
        "exampleSentence": "わたしは ベトナム人です。",
        "exampleSentenceReading": "わたしは べとなむじんです。",
        "exampleSentenceMeaning": "Tôi là người Việt Nam.",
        "dictionaryForm": ""
      },
      {
        "id": 111,
        "word": "先生",
        "reading": "せんせい",
        "romaji": "sensei",
        "meaning": "Thầy cô giáo / Bác sĩ (khi xưng hô)",
        "hanViet": "Tiên Sinh",
        "type": "Danh từ",
        "exampleSentence": "やまださんは 先生です。",
        "exampleSentenceReading": "やまださんは せんせいです。",
        "exampleSentenceMeaning": "Anh Yamada là giáo viên.",
        "dictionaryForm": ""
      },
      {
        "id": 112,
        "word": "教師",
        "reading": "きょうし",
        "romaji": "kyoushi",
        "meaning": "Giáo viên / Nghề dạy học (nói về nghề nghiệp mình)",
        "hanViet": "Giáo Sư",
        "type": "Danh từ",
        "exampleSentence": "わたしは にほんごの きょうしです。",
        "exampleSentenceReading": "わたしは にほんごの きょうしです。",
        "exampleSentenceMeaning": "Tôi là giáo viên tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 113,
        "word": "学生",
        "reading": "がくせい",
        "romaji": "gakusei",
        "meaning": "Học sinh / Sinh viên",
        "hanViet": "Học Sinh",
        "type": "Danh từ",
        "exampleSentence": "わたしは 学生です。",
        "exampleSentenceReading": "わたしは がくせいです。",
        "exampleSentenceMeaning": "Tôi là sinh viên.",
        "dictionaryForm": ""
      },
      {
        "id": 114,
        "word": "会社員",
        "reading": "かいしゃいん",
        "romaji": "kaishain",
        "meaning": "Nhân viên công ty",
        "hanViet": "Hội Xã Viên",
        "type": "Danh từ",
        "exampleSentence": "たなかさんは 会社員です。",
        "exampleSentenceReading": "たなかさんは かいしゃいんです。",
        "exampleSentenceMeaning": "Anh Tanaka là nhân viên công ty.",
        "dictionaryForm": ""
      },
      {
        "id": 115,
        "word": "社員",
        "reading": "しゃいん",
        "romaji": "shain",
        "meaning": "Nhân viên (dùng kèm tên công ty)",
        "hanViet": "Xã Viên",
        "type": "Danh từ",
        "exampleSentence": "IMCの 社員です。",
        "exampleSentenceReading": "IMCの しゃいんです。",
        "exampleSentenceMeaning": "Là nhân viên công ty IMC.",
        "dictionaryForm": ""
      },
      {
        "id": 116,
        "word": "銀行員",
        "reading": "ぎんこういん",
        "romaji": "ginkouin",
        "meaning": "Nhân viên ngân hàng",
        "hanViet": "Ngân Hàng Viên",
        "type": "Danh từ",
        "exampleSentence": "あねは 銀行員です。",
        "exampleSentenceReading": "あねは ぎんこういんです。",
        "exampleSentenceMeaning": "Chị gái tôi là nhân viên ngân hàng.",
        "dictionaryForm": ""
      },
      {
        "id": 117,
        "word": "医者",
        "reading": "いしゃ",
        "romaji": "isha",
        "meaning": "Bác sĩ",
        "hanViet": "Y Giả",
        "type": "Danh từ",
        "exampleSentence": "ちちは 医者です。",
        "exampleSentenceReading": "ちちは いしゃです。",
        "exampleSentenceMeaning": "Bố tôi là bác sĩ.",
        "dictionaryForm": ""
      },
      {
        "id": 118,
        "word": "研究者",
        "reading": "けんきゅうしゃ",
        "romaji": "kenkyuusha",
        "meaning": "Nhà nghiên cứu",
        "hanViet": "Nghiên Cứu Giả",
        "type": "Danh từ",
        "exampleSentence": "シュミットさんは 研究者です。",
        "exampleSentenceReading": "しゅみっとさんは けんきゅうしゃです。",
        "exampleSentenceMeaning": "Anh Schmidt là nhà nghiên cứu.",
        "dictionaryForm": ""
      },
      {
        "id": 119,
        "word": "エンジニア",
        "reading": "エンジニア",
        "romaji": "enjinia",
        "meaning": "Kỹ sư",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "かれは ITの エンジニアです。",
        "exampleSentenceReading": "かれは ITの えんじにあです。",
        "exampleSentenceMeaning": "Anh ấy là kỹ sư CNTT.",
        "dictionaryForm": ""
      },
      {
        "id": 120,
        "word": "大学",
        "reading": "だいがく",
        "romaji": "daigaku",
        "meaning": "Trường đại học",
        "hanViet": "Đại Học",
        "type": "Danh từ",
        "exampleSentence": "ハノイ大学の 学生です。",
        "exampleSentenceReading": "ハノイだいがくの がくせいです。",
        "exampleSentenceMeaning": "Tôi là sinh viên Đại học Hà Nội.",
        "dictionaryForm": ""
      },
      {
        "id": 121,
        "word": "病院",
        "reading": "びょういん",
        "romaji": "byouin",
        "meaning": "Bệnh viện",
        "hanViet": "Bệnh Viện",
        "type": "Danh từ",
        "exampleSentence": "あの建物は 病院です。",
        "exampleSentenceReading": "あのたてものは びょういんです。",
        "exampleSentenceMeaning": "Tòa nhà kia là bệnh viện.",
        "dictionaryForm": ""
      },
      {
        "id": 122,
        "word": "電気",
        "reading": "でんき",
        "romaji": "denki",
        "meaning": "Điện / Đèn điện",
        "hanViet": "Điện Khí",
        "type": "Danh từ",
        "exampleSentence": "電気を つけてください。",
        "exampleSentenceReading": "でんきを つけてください。",
        "exampleSentenceMeaning": "Xin hãy bật đèn lên.",
        "dictionaryForm": ""
      },
      {
        "id": 123,
        "word": "だれ",
        "reading": "だれ",
        "romaji": "dare",
        "meaning": "Ai (từ để hỏi)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "あの人は だれですか。",
        "exampleSentenceReading": "あのひとは だれですか。",
        "exampleSentenceMeaning": "Người kia là ai vậy?",
        "dictionaryForm": ""
      },
      {
        "id": 124,
        "word": "どなた",
        "reading": "どなた",
        "romaji": "donata",
        "meaning": "Vị nào (lịch sự của だれ)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "あの方は どなたですか。",
        "exampleSentenceReading": "あのかたは どなたですか。",
        "exampleSentenceMeaning": "Vị kia là ai ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 125,
        "word": "～歳",
        "reading": "～さい",
        "romaji": "-sai",
        "meaning": "～ tuổi",
        "hanViet": "Tuế",
        "type": "Hậu tố",
        "exampleSentence": "わたしは 20歳です。",
        "exampleSentenceReading": "わたしは はたち／にじゅっさいです。",
        "exampleSentenceMeaning": "Tôi 20 tuổi.",
        "dictionaryForm": ""
      },
      {
        "id": 126,
        "word": "何歳",
        "reading": "なんさい",
        "romaji": "nansai",
        "meaning": "Mấy tuổi / Bao nhiêu tuổi",
        "hanViet": "Hà Tuế",
        "type": "Nghi vấn từ",
        "exampleSentence": "あなたは 何歳ですか。",
        "exampleSentenceReading": "あなたは なんさいですか。",
        "exampleSentenceMeaning": "Bạn bao nhiêu tuổi?",
        "dictionaryForm": ""
      },
      {
        "id": 127,
        "word": "おいくつ",
        "reading": "おいくつ",
        "romaji": "oikutsu",
        "meaning": "Bao nhiêu tuổi (lịch sự của 何歳)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "おいくつですか。",
        "exampleSentenceReading": "おいくつですか。",
        "exampleSentenceMeaning": "Bác bao nhiêu tuổi rồi ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 128,
        "word": "はい",
        "reading": "はい",
        "romaji": "hai",
        "meaning": "Vâng / Dạ / Đúng vậy",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "はい、そうです。",
        "exampleSentenceReading": "はい、そうです。",
        "exampleSentenceMeaning": "Vâng, đúng vậy.",
        "dictionaryForm": ""
      },
      {
        "id": 129,
        "word": "いいえ",
        "reading": "いいえ",
        "romaji": "iie",
        "meaning": "Không / Không phải",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "いいえ、ちがいます。",
        "exampleSentenceReading": "いいえ、ちがいます。",
        "exampleSentenceMeaning": "Không, không phải đâu.",
        "dictionaryForm": ""
      },
      {
        "id": 130,
        "word": "初めまして",
        "reading": "はじめまして",
        "romaji": "hajimemashite",
        "meaning": "Rất vui được gặp bạn lần đầu",
        "hanViet": "Sơ",
        "type": "Chào hỏi",
        "exampleSentence": "初めまして、ナムです。",
        "exampleSentenceReading": "はじめまして、なむです。",
        "exampleSentenceMeaning": "Chào bạn, tôi là Nam.",
        "dictionaryForm": ""
      },
      {
        "id": 131,
        "word": "どうぞよろしく",
        "reading": "どうぞよろしく",
        "romaji": "douzo yoroshiku",
        "meaning": "Rất mong được giúp đỡ",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "どうぞよろしくお願いします。",
        "exampleSentenceReading": "どうぞよろしくおねがいします。",
        "exampleSentenceMeaning": "Rất mong được bạn giúp đỡ.",
        "dictionaryForm": ""
      },
      {
        "id": 132,
        "word": "失礼ですが",
        "reading": "しつれいですが",
        "romaji": "shitsurei desu ga",
        "meaning": "Xin lỗi thất lễ nhưng cho tôi hỏi...",
        "hanViet": "Thất Lễ",
        "type": "Chào hỏi",
        "exampleSentence": "失礼ですが、お名前は？",
        "exampleSentenceReading": "しつれいですが、おなまえは？",
        "exampleSentenceMeaning": "Xin lỗi, anh/chị tên là gì ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 133,
        "word": "お名前は？",
        "reading": "おなまえは？",
        "romaji": "onamae wa?",
        "meaning": "Tên bạn là gì ạ?",
        "hanViet": "Danh Tiền",
        "type": "Chào hỏi",
        "exampleSentence": "お名前は 何ですか。",
        "exampleSentenceReading": "おなまえは なんですか。",
        "exampleSentenceMeaning": "Tên của bạn là gì?",
        "dictionaryForm": ""
      },
      {
        "id": 134,
        "word": "こちらは～さんです",
        "reading": "こちらは～さんです",
        "romaji": "kochira wa -san desu",
        "meaning": "Đây là anh/chị ~",
        "hanViet": "",
        "type": "Giao tiếp",
        "exampleSentence": "こちらは たなかさんです。",
        "exampleSentenceReading": "こちらは たなかさんです。",
        "exampleSentenceMeaning": "Đây là anh Tanaka.",
        "dictionaryForm": ""
      },
      {
        "id": 135,
        "word": "～から来ました",
        "reading": "～からきました",
        "romaji": "-kara kimashita",
        "meaning": "Tôi đến từ ~",
        "hanViet": "Lai",
        "type": "Giao tiếp",
        "exampleSentence": "ベトナムから 来ました。",
        "exampleSentenceReading": "べとなむから きました。",
        "exampleSentenceMeaning": "Tôi đến từ Việt Nam.",
        "dictionaryForm": ""
      },
      {
        "id": 136,
        "word": "どうぞよろしくお願いします",
        "reading": "どうぞよろしくおねがいします",
        "romaji": "douzo yoroshiku onegaishimasu",
        "meaning": "Rất mong nhận được sự giúp đỡ",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "どうぞ よろしく お願いします。",
        "exampleSentenceReading": "どうぞ よろしく おねがいします。",
        "exampleSentenceMeaning": "Rất mong được sự giúp đỡ của bạn.",
        "dictionaryForm": ""
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
        "type": "Đại từ chỉ thị",
        "exampleSentence": "これは ほんです。",
        "exampleSentenceReading": "これは ほんです。",
        "exampleSentenceMeaning": "Đây là quyển sách.",
        "dictionaryForm": ""
      },
      {
        "id": 202,
        "word": "それ",
        "reading": "それ",
        "romaji": "sore",
        "meaning": "Cái đó (gần người nghe)",
        "hanViet": "",
        "type": "Đại từ chỉ thị",
        "exampleSentence": "それは なんですか。",
        "exampleSentenceReading": "それは なんですか。",
        "exampleSentenceMeaning": "Đó là cái gì vậy?",
        "dictionaryForm": ""
      },
      {
        "id": 203,
        "word": "あれ",
        "reading": "あれ",
        "romaji": "are",
        "meaning": "Cái kia (xa cả hai người)",
        "hanViet": "",
        "type": "Đại từ chỉ thị",
        "exampleSentence": "あれは くるまです。",
        "exampleSentenceReading": "あれは くるまです。",
        "exampleSentenceMeaning": "Kia là chiếc xe ô tô.",
        "dictionaryForm": ""
      },
      {
        "id": 204,
        "word": "この～",
        "reading": "この～",
        "romaji": "kono-",
        "meaning": "Cái ~ này (+ danh từ)",
        "hanViet": "",
        "type": "Đại từ chỉ thị",
        "exampleSentence": "この本は おもしろいです。",
        "exampleSentenceReading": "このほんは おもしろいです。",
        "exampleSentenceMeaning": "Quyển sách này thú vị lắm.",
        "dictionaryForm": ""
      },
      {
        "id": 205,
        "word": "その～",
        "reading": "その～",
        "romaji": "sono-",
        "meaning": "Cái ~ đó (+ danh từ)",
        "hanViet": "",
        "type": "Đại từ chỉ thị",
        "exampleSentence": "その傘は だれのですか。",
        "exampleSentenceReading": "そのかさは だれのですか。",
        "exampleSentenceMeaning": "Cái ô đó của ai thế?",
        "dictionaryForm": ""
      },
      {
        "id": 206,
        "word": "あの～",
        "reading": "あの～",
        "romaji": "ano-",
        "meaning": "Cái ~ kia (+ danh từ)",
        "hanViet": "",
        "type": "Đại từ chỉ thị",
        "exampleSentence": "あの人は 先生です。",
        "exampleSentenceReading": "あのひとは せんせいです。",
        "exampleSentenceMeaning": "Người kia là giáo viên.",
        "dictionaryForm": ""
      },
      {
        "id": 207,
        "word": "本",
        "reading": "ほん",
        "romaji": "hon",
        "meaning": "Sách / Quyển sách",
        "hanViet": "Bổn",
        "type": "Danh từ",
        "exampleSentence": "にほんごの 本を よみます。",
        "exampleSentenceReading": "にほんごの ほんを よみます。",
        "exampleSentenceMeaning": "Tôi đọc sách tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 208,
        "word": "辞書",
        "reading": "じしょ",
        "romaji": "jisho",
        "meaning": "Từ điển",
        "hanViet": "Từ Thư",
        "type": "Danh từ",
        "exampleSentence": "電子辞書を 買いました。",
        "exampleSentenceReading": "でんしじしょを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua một chiếc từ điển điện tử.",
        "dictionaryForm": ""
      },
      {
        "id": 209,
        "word": "雑誌",
        "reading": "ざっし",
        "romaji": "zasshi",
        "meaning": "Tạp chí",
        "hanViet": "Tạp Chí",
        "type": "Danh từ",
        "exampleSentence": "これは 車の 雑誌です。",
        "exampleSentenceReading": "これは くるまの ざっしです。",
        "exampleSentenceMeaning": "Đây là tạp chí xe hơi.",
        "dictionaryForm": ""
      },
      {
        "id": 210,
        "word": "新聞",
        "reading": "しんぶん",
        "romaji": "shinbun",
        "meaning": "Báo / Tờ báo",
        "hanViet": "Tân Văn",
        "type": "Danh từ",
        "exampleSentence": "毎朝 新聞を 読みます。",
        "exampleSentenceReading": "まいあさ しんぶんを よみます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi đều đọc báo.",
        "dictionaryForm": ""
      },
      {
        "id": 211,
        "word": "ノート",
        "reading": "ノート",
        "romaji": "nooto",
        "meaning": "Vở / Tập viết",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ノートに メモを します。",
        "exampleSentenceReading": "のーとに めもを します。",
        "exampleSentenceMeaning": "Tôi ghi chú vào vở.",
        "dictionaryForm": ""
      },
      {
        "id": 212,
        "word": "手帳",
        "reading": "てちょう",
        "romaji": "techou",
        "meaning": "Sổ tay cá nhân",
        "hanViet": "Thủ Trướng",
        "type": "Danh từ",
        "exampleSentence": "スケジュールを 手帳に 書きます。",
        "exampleSentenceReading": "すけじゅーるを てちょうに かきます。",
        "exampleSentenceMeaning": "Tôi viết lịch trình vào sổ tay.",
        "dictionaryForm": ""
      },
      {
        "id": 213,
        "word": "名刺",
        "reading": "めいし",
        "romaji": "meishi",
        "meaning": "Danh thiếp",
        "hanViet": "Danh Thứ",
        "type": "Danh từ",
        "exampleSentence": "わたしの 名刺を どうぞ。",
        "exampleSentenceReading": "わたしの めいしを どうぞ。",
        "exampleSentenceMeaning": "Xin gửi bạn danh thiếp của tôi.",
        "dictionaryForm": ""
      },
      {
        "id": 214,
        "word": "カード",
        "reading": "カード",
        "romaji": "kaado",
        "meaning": "Thẻ / Card",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "クレジットカードで 払います。",
        "exampleSentenceReading": "くれじっとかーどで はらいます。",
        "exampleSentenceMeaning": "Tôi thanh toán bằng thẻ tín dụng.",
        "dictionaryForm": ""
      },
      {
        "id": 215,
        "word": "テレホンカード",
        "reading": "テレホンカード",
        "romaji": "terehonkaado",
        "meaning": "Thẻ điện thoại",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "テレホンカードを もっていますか。",
        "exampleSentenceReading": "てれほんかーどを もっていますか。",
        "exampleSentenceMeaning": "Bạn có thẻ điện thoại không?",
        "dictionaryForm": ""
      },
      {
        "id": 216,
        "word": "鉛筆",
        "reading": "えんぴつ",
        "romaji": "enpitsu",
        "meaning": "Bút chì",
        "hanViet": "Duyên Bút",
        "type": "Danh từ",
        "exampleSentence": "鉛筆で 書いてください。",
        "exampleSentenceReading": "えんぴつで かいてください。",
        "exampleSentenceMeaning": "Xin vui lòng viết bằng bút chì.",
        "dictionaryForm": ""
      },
      {
        "id": 217,
        "word": "ボールペン",
        "reading": "ボールペン",
        "romaji": "boorupen",
        "meaning": "Bút bi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "黒い ボールペンが ありますか。",
        "exampleSentenceReading": "くろい ぼーるぺんが ありますか。",
        "exampleSentenceMeaning": "Bạn có bút bi đen không?",
        "dictionaryForm": ""
      },
      {
        "id": 218,
        "word": "シャープペンシル",
        "reading": "シャープペンシル",
        "romaji": "shaapupenshiru",
        "meaning": "Bút chì bấm / Chì kim",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "これは 新しい シャープペンシルです。",
        "exampleSentenceReading": "これは あたらしい しゃーぷぺんしるです。",
        "exampleSentenceMeaning": "Đây là chiếc bút chì bấm mới.",
        "dictionaryForm": ""
      },
      {
        "id": 219,
        "word": "鍵",
        "reading": "かぎ",
        "romaji": "kagi",
        "meaning": "Chìa khóa",
        "hanViet": "Kiện",
        "type": "Danh từ",
        "exampleSentence": "部屋の 鍵を なくしました。",
        "exampleSentenceReading": "へやの かぎを なくしました。",
        "exampleSentenceMeaning": "Tôi làm mất chìa khóa phòng rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 220,
        "word": "時計",
        "reading": "とけい",
        "romaji": "tokei",
        "meaning": "Đồng hồ",
        "hanViet": "Thời Kế",
        "type": "Danh từ",
        "exampleSentence": "この時計は 日本の です。",
        "exampleSentenceReading": "このとけいは にほんの です。",
        "exampleSentenceMeaning": "Chiếc đồng hồ này là của Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 221,
        "word": "傘",
        "reading": "かさ",
        "romaji": "kasa",
        "meaning": "Cái ô / Cái dù",
        "hanViet": "Tản",
        "type": "Danh từ",
        "exampleSentence": "雨ですから、傘を 持ちます。",
        "exampleSentenceReading": "あめですから、かさを もちます。",
        "exampleSentenceMeaning": "Vì trời mưa nên tôi mang ô theo.",
        "dictionaryForm": ""
      },
      {
        "id": 222,
        "word": "鞄",
        "reading": "かばん",
        "romaji": "kaban",
        "meaning": "Cặp sách / Túi xách",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "重い 鞄を 持ちます。",
        "exampleSentenceReading": "おもい かばんを もちます。",
        "exampleSentenceMeaning": "Tôi xách chiếc túi nặng.",
        "dictionaryForm": ""
      },
      {
        "id": 223,
        "word": "CD",
        "reading": "シーディー",
        "romaji": "shiidii",
        "meaning": "Đĩa CD",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "日本語の CDを 聞きます。",
        "exampleSentenceReading": "にほんごの CDを ききます。",
        "exampleSentenceMeaning": "Tôi nghe đĩa CD tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 224,
        "word": "テレビ",
        "reading": "テレビ",
        "romaji": "terebi",
        "meaning": "Tivi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "毎晩 テレビを 見ます。",
        "exampleSentenceReading": "まいばん てれびを みます。",
        "exampleSentenceMeaning": "Mỗi tối tôi đều xem tivi.",
        "dictionaryForm": ""
      },
      {
        "id": 225,
        "word": "ラジオ",
        "reading": "ラジオ",
        "romaji": "rajio",
        "meaning": "Đài radio",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ラジオで ニュースを 聞きます。",
        "exampleSentenceReading": "らじおで にゅーすを ききます。",
        "exampleSentenceMeaning": "Tôi nghe tin tức qua radio.",
        "dictionaryForm": ""
      },
      {
        "id": 226,
        "word": "カメラ",
        "reading": "カメラ",
        "romaji": "kamera",
        "meaning": "Máy ảnh",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "日本の カメラを 買いました。",
        "exampleSentenceReading": "にほんの かめらを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua máy ảnh của Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 227,
        "word": "コンピューター",
        "reading": "コンピューター",
        "romaji": "konpyuutaa",
        "meaning": "Máy vi tính / Máy tính",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "会社で コンピューターを 使います。",
        "exampleSentenceReading": "かいしゃで こんぴゅーたーを つかいます。",
        "exampleSentenceMeaning": "Tôi dùng máy vi tính ở công ty.",
        "dictionaryForm": ""
      },
      {
        "id": 228,
        "word": "車",
        "reading": "くるま",
        "romaji": "kuruma",
        "meaning": "Xe ô tô",
        "hanViet": "Xa",
        "type": "Danh từ",
        "exampleSentence": "父の 車は 白いです。",
        "exampleSentenceReading": "ちちの くるまは しろいです。",
        "exampleSentenceMeaning": "Xe ô tô của bố tôi màu trắng.",
        "dictionaryForm": ""
      },
      {
        "id": 229,
        "word": "机",
        "reading": "つくえ",
        "romaji": "tsukue",
        "meaning": "Bàn học / Bàn làm việc",
        "hanViet": "Cơ",
        "type": "Danh từ",
        "exampleSentence": "机の 上に 本が あります。",
        "exampleSentenceReading": "つくえの うえに ほんが あります。",
        "exampleSentenceMeaning": "Trên bàn có quyển sách.",
        "dictionaryForm": ""
      },
      {
        "id": 230,
        "word": "いす",
        "reading": "いす",
        "romaji": "isu",
        "meaning": "Cái ghế",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "いすに 座ってください。",
        "exampleSentenceReading": "いすに すわってください。",
        "exampleSentenceMeaning": "Xin mời ngồi vào ghế.",
        "dictionaryForm": ""
      },
      {
        "id": 231,
        "word": "チョコレート",
        "reading": "チョコレート",
        "romaji": "chokoreeto",
        "meaning": "Kẹo sô-cô-la",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "チョコレートを 食べました。",
        "exampleSentenceReading": "ちょこれーとを たべました。",
        "exampleSentenceMeaning": "Tôi đã ăn kẹo sô-cô-la.",
        "dictionaryForm": ""
      },
      {
        "id": 232,
        "word": "コーヒー",
        "reading": "コーヒー",
        "romaji": "koohii",
        "meaning": "Cà phê",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "朝 コーヒーを 飲みます。",
        "exampleSentenceReading": "あさ こーひーを のみます。",
        "exampleSentenceMeaning": "Buổi sáng tôi uống cà phê.",
        "dictionaryForm": ""
      },
      {
        "id": 233,
        "word": "お土産",
        "reading": "おみやげ",
        "romaji": "omiyage",
        "meaning": "Quà lưu niệm / Quà đặc sản",
        "hanViet": "Thổ Sản",
        "type": "Danh từ",
        "exampleSentence": "京都の お土産です。",
        "exampleSentenceReading": "きょうとの おみやげです。",
        "exampleSentenceMeaning": "Đây là quà đặc sản của Kyoto.",
        "dictionaryForm": ""
      },
      {
        "id": 234,
        "word": "英語",
        "reading": "えいご",
        "romaji": "eigo",
        "meaning": "Tiếng Anh",
        "hanViet": "Anh Ngữ",
        "type": "Danh từ",
        "exampleSentence": "英語を 勉強します。",
        "exampleSentenceReading": "えいごを べんきょうします。",
        "exampleSentenceMeaning": "Tôi học tiếng Anh.",
        "dictionaryForm": ""
      },
      {
        "id": 235,
        "word": "日本語",
        "reading": "にほんご",
        "romaji": "nihongo",
        "meaning": "Tiếng Nhật",
        "hanViet": "Nhật Bản Ngữ",
        "type": "Danh từ",
        "exampleSentence": "日本語が 上手に なりました。",
        "exampleSentenceReading": "にほんごが じょうずに なりました。",
        "exampleSentenceMeaning": "Tiếng Nhật của tôi đã giỏi hơn.",
        "dictionaryForm": ""
      },
      {
        "id": 236,
        "word": "何",
        "reading": "なん / なに",
        "romaji": "nan / nani",
        "meaning": "Cái gì",
        "hanViet": "Hà",
        "type": "Nghi vấn từ",
        "exampleSentence": "それは 何ですか。",
        "exampleSentenceReading": "それは なんですか。",
        "exampleSentenceMeaning": "Đó là cái gì thế?",
        "dictionaryForm": ""
      },
      {
        "id": 237,
        "word": "そう",
        "reading": "そう",
        "romaji": "sou",
        "meaning": "Đúng vậy / Phải đấy",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "はい、そうです。",
        "exampleSentenceReading": "はい、そうです。",
        "exampleSentenceMeaning": "Vâng, đúng vậy.",
        "dictionaryForm": ""
      },
      {
        "id": 238,
        "word": "違います",
        "reading": "ちがいます",
        "romaji": "chigaimasu",
        "meaning": "Không phải / Sai rồi",
        "hanViet": "Vi",
        "type": "Động từ nhóm 1",
        "exampleSentence": "いいえ、違います。",
        "exampleSentenceReading": "いいえ、ちがいます。",
        "exampleSentenceMeaning": "Không, không phải đâu.",
        "dictionaryForm": "違う (ちがう)"
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
          }
        ]
      },
      {
        "title": "この N／その N／あの N",
        "pattern": "この N／その N／あの N",
        "explanation": "Bổ nghĩa trực tiếp cho danh từ đi liền sau nó. Phải có danh từ đi kèm: このほん, そのかさ.",
        "examples": [
          {
            "japanese": "この本は わたしのです。",
            "reading": "このほんは わたしのです。",
            "vietnamese": "Quyển sách này là của tôi."
          }
        ]
      },
      {
        "title": "A ですか、B ですか (Hỏi lựa chọn)",
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
        "meaning": "Chỗ này / Ở đây (gần người nói)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "ここは きょうしつです。",
        "exampleSentenceReading": "ここは きょうしつです。",
        "exampleSentenceMeaning": "Đây là phòng học.",
        "dictionaryForm": ""
      },
      {
        "id": 302,
        "word": "そこ",
        "reading": "そこ",
        "romaji": "soko",
        "meaning": "Chỗ đó / Ở đó (gần người nghe)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "そこは うけつけです。",
        "exampleSentenceReading": "そこは うけつけです。",
        "exampleSentenceMeaning": "Đó là quầy lễ tân.",
        "dictionaryForm": ""
      },
      {
        "id": 303,
        "word": "あそこ",
        "reading": "あそこ",
        "romaji": "asoko",
        "meaning": "Chỗ kia / Đằng kia (xa cả hai)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "あそこは レストランです。",
        "exampleSentenceReading": "あそこは れすとらんです。",
        "exampleSentenceMeaning": "Đằng kia là nhà hàng.",
        "dictionaryForm": ""
      },
      {
        "id": 304,
        "word": "どこ",
        "reading": "どこ",
        "romaji": "doko",
        "meaning": "Ở đâu / Chỗ nào",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "お手洗いは どこですか。",
        "exampleSentenceReading": "おてあらいは どこですか。",
        "exampleSentenceMeaning": "Nhà vệ sinh ở đâu vậy?",
        "dictionaryForm": ""
      },
      {
        "id": 305,
        "word": "こちら",
        "reading": "こちら",
        "romaji": "kochira",
        "meaning": "Phía này / Đằng này (lịch sự của ここ)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "こちらは じむしょです。",
        "exampleSentenceReading": "こちらは じむしょです。",
        "exampleSentenceMeaning": "Phía này là văn phòng ạ.",
        "dictionaryForm": ""
      },
      {
        "id": 306,
        "word": "そちら",
        "reading": "そちら",
        "romaji": "sochira",
        "meaning": "Phía đó / Đằng đó (lịch sự của そこ)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "そちらは エレベーターです。",
        "exampleSentenceReading": "そちらは えれべーたーです。",
        "exampleSentenceMeaning": "Phía đó là thang máy ạ.",
        "dictionaryForm": ""
      },
      {
        "id": 307,
        "word": "あちら",
        "reading": "あちら",
        "romaji": "achira",
        "meaning": "Phía kia / Đằng kia (lịch sự của あそこ)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "あちらは でんわです。",
        "exampleSentenceReading": "あちらは でんわです。",
        "exampleSentenceMeaning": "Phía kia là điện thoại ạ.",
        "dictionaryForm": ""
      },
      {
        "id": 308,
        "word": "どちら",
        "reading": "どちら",
        "romaji": "dochira",
        "meaning": "Phía nào / Đâu (lịch sự của どこ)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "かいぎしつは どちらですか。",
        "exampleSentenceReading": "かいぎしつは どちらですか。",
        "exampleSentenceMeaning": "Phòng họp ở hướng nào ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 309,
        "word": "教室",
        "reading": "きょうしつ",
        "romaji": "kyoushitsu",
        "meaning": "Phòng học",
        "hanViet": "Giáo Thất",
        "type": "Danh từ",
        "exampleSentence": "教室に 学生が います。",
        "exampleSentenceReading": "きょうしつに がくせいが います。",
        "exampleSentenceMeaning": "Trong phòng học có học sinh.",
        "dictionaryForm": ""
      },
      {
        "id": 310,
        "word": "食堂",
        "reading": "しょくどう",
        "romaji": "shokudou",
        "meaning": "Nhà ăn / Căng tin",
        "hanViet": "Thực Đường",
        "type": "Danh từ",
        "exampleSentence": "食堂で 昼ご飯を 食べます。",
        "exampleSentenceReading": "しょくどうで ひるごはんを たべます。",
        "exampleSentenceMeaning": "Tôi ăn trưa ở nhà ăn.",
        "dictionaryForm": ""
      },
      {
        "id": 311,
        "word": "事務所",
        "reading": "じむしょ",
        "romaji": "jimusho",
        "meaning": "Văn phòng làm việc",
        "hanViet": "Sự Vụ Sở",
        "type": "Danh từ",
        "exampleSentence": "先生は 事務所に います。",
        "exampleSentenceReading": "せんせいは じむしょに います。",
        "exampleSentenceMeaning": "Thầy giáo đang ở văn phòng.",
        "dictionaryForm": ""
      },
      {
        "id": 312,
        "word": "会議室",
        "reading": "かいぎしつ",
        "romaji": "kaigishitsu",
        "meaning": "Phòng họp",
        "hanViet": "Hội Nghị Thất",
        "type": "Danh từ",
        "exampleSentence": "会議室で ミーティングを します。",
        "exampleSentenceReading": "かいぎしつで みーてぃんぐを します。",
        "exampleSentenceMeaning": "Chúng tôi họp ở phòng họp.",
        "dictionaryForm": ""
      },
      {
        "id": 313,
        "word": "受付",
        "reading": "うけつけ",
        "romaji": "uketsuke",
        "meaning": "Quầy tiếp tân / Lễ tân",
        "hanViet": "Thụ Phó",
        "type": "Danh từ",
        "exampleSentence": "受付で 名前を 書きます。",
        "exampleSentenceReading": "うけつけで なまえを かきます。",
        "exampleSentenceMeaning": "Tôi viết tên tại quầy lễ tân.",
        "dictionaryForm": ""
      },
      {
        "id": 314,
        "word": "ロビー",
        "reading": "ロビー",
        "romaji": "robii",
        "meaning": "Sảnh đợi / Đại sảnh",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ロビーで 友達を 待ちます。",
        "exampleSentenceReading": "ろびーで ともだちを まちます。",
        "exampleSentenceMeaning": "Tôi đợi bạn ở sảnh.",
        "dictionaryForm": ""
      },
      {
        "id": 315,
        "word": "部屋",
        "reading": "へや",
        "romaji": "heya",
        "meaning": "Căn phòng",
        "hanViet": "Bộ Ốc",
        "type": "Danh từ",
        "exampleSentence": "わたしの 部屋は 3階です。",
        "exampleSentenceReading": "わたしの へやは さんがいです。",
        "exampleSentenceMeaning": "Phòng của tôi ở tầng 3.",
        "dictionaryForm": ""
      },
      {
        "id": 316,
        "word": "トイレ",
        "reading": "トイレ",
        "romaji": "toire",
        "meaning": "Nhà vệ sinh",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "トイレは あちらです。",
        "exampleSentenceReading": "といれは あちらです。",
        "exampleSentenceMeaning": "Nhà vệ sinh ở đằng kia.",
        "dictionaryForm": ""
      },
      {
        "id": 317,
        "word": "お手洗い",
        "reading": "おてあらい",
        "romaji": "otearai",
        "meaning": "Nhà vệ sinh (lịch sự)",
        "hanViet": "Thủ Tẩy",
        "type": "Danh từ",
        "exampleSentence": "お手洗いは どこですか。",
        "exampleSentenceReading": "おてあらいは どこですか。",
        "exampleSentenceMeaning": "Cho tôi hỏi nhà vệ sinh ở đâu ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 318,
        "word": "階段",
        "reading": "かいだん",
        "romaji": "kaidan",
        "meaning": "Cầu thang bộ",
        "hanViet": "Giai Đoạn",
        "type": "Danh từ",
        "exampleSentence": "階段を 上がります。",
        "exampleSentenceReading": "かいだんを あがります。",
        "exampleSentenceMeaning": "Tôi đi lên cầu thang bộ.",
        "dictionaryForm": ""
      },
      {
        "id": 319,
        "word": "エレベーター",
        "reading": "エレベーター",
        "romaji": "erebeetaa",
        "meaning": "Thang máy",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "エレベーターで 8階へ 行きます。",
        "exampleSentenceReading": "えれべーたーで はちかいへ いきます。",
        "exampleSentenceMeaning": "Tôi đi thang máy lên tầng 8.",
        "dictionaryForm": ""
      },
      {
        "id": 320,
        "word": "エスカレーター",
        "reading": "エスカレーター",
        "romaji": "esukareetaa",
        "meaning": "Thang cuốn",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "エスカレーターは 右に あります。",
        "exampleSentenceReading": "えすかれーたーは みぎに あります。",
        "exampleSentenceMeaning": "Thang cuốn ở bên tay phải.",
        "dictionaryForm": ""
      },
      {
        "id": 321,
        "word": "自動販売機",
        "reading": "じどうはんばいき",
        "romaji": "jidouhanbaiki",
        "meaning": "Máy bán hàng tự động",
        "hanViet": "Tự Động Phán Mại Cơ",
        "type": "Danh từ",
        "exampleSentence": "自動販売機で ジュースを 買います。",
        "exampleSentenceReading": "じどうはんばいきで じゅーすを かいます。",
        "exampleSentenceMeaning": "Tôi mua nước ép ở máy bán hàng tự động.",
        "dictionaryForm": ""
      },
      {
        "id": 322,
        "word": "電話",
        "reading": "でんわ",
        "romaji": "denwa",
        "meaning": "Điện thoại / Cuộc gọi",
        "hanViet": "Điện Thoại",
        "type": "Danh từ",
        "exampleSentence": "電話を かけます。",
        "exampleSentenceReading": "でんわを かけます。",
        "exampleSentenceMeaning": "Tôi gọi điện thoại.",
        "dictionaryForm": ""
      },
      {
        "id": 323,
        "word": "お国",
        "reading": "おくにと",
        "romaji": "okuni",
        "meaning": "Đất nước của bạn (kính ngữ)",
        "hanViet": "Quốc",
        "type": "Danh từ",
        "exampleSentence": "お国は どちらですか。",
        "exampleSentenceReading": "おくには どちらですか。",
        "exampleSentenceMeaning": "Đất nước của bạn là nước nào ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 324,
        "word": "会社",
        "reading": "かいしゃ",
        "romaji": "kaisha",
        "meaning": "Công ty",
        "hanViet": "Hội Xã",
        "type": "Danh từ",
        "exampleSentence": "父の 会社は 東京に あります。",
        "exampleSentenceReading": "ちちの かいしゃは とうきょうに あります。",
        "exampleSentenceMeaning": "Công ty của bố tôi ở Tokyo.",
        "dictionaryForm": ""
      },
      {
        "id": 325,
        "word": "うち",
        "reading": "うち",
        "romaji": "uchi",
        "meaning": "Nhà / Gia đình",
        "hanViet": "Gia",
        "type": "Danh từ",
        "exampleSentence": "6時に うちへ 帰ります。",
        "exampleSentenceReading": "ろくじに うちへ かえります。",
        "exampleSentenceMeaning": "Lúc 6 giờ tôi về nhà.",
        "dictionaryForm": ""
      },
      {
        "id": 326,
        "word": "靴",
        "reading": "くつ",
        "romaji": "kutsu",
        "meaning": "Đôi giày",
        "hanViet": "Ngoa",
        "type": "Danh từ",
        "exampleSentence": "日本の 靴は いいです。",
        "exampleSentenceReading": "にほんの くつは いいです。",
        "exampleSentenceMeaning": "Giày của Nhật rất tốt.",
        "dictionaryForm": ""
      },
      {
        "id": 327,
        "word": "ネクタイ",
        "reading": "ネクタイ",
        "romaji": "nekutai",
        "meaning": "Cà vạt",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "青い ネクタイを 買いました。",
        "exampleSentenceReading": "あおい ねくたいを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua một chiếc cà vạt màu xanh.",
        "dictionaryForm": ""
      },
      {
        "id": 328,
        "word": "ワイン",
        "reading": "ワイン",
        "romaji": "wain",
        "meaning": "Rượu vang",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "フランスの ワインを 飲みます。",
        "exampleSentenceReading": "ふらんすの わいんを のみます。",
        "exampleSentenceMeaning": "Tôi uống rượu vang Pháp.",
        "dictionaryForm": ""
      },
      {
        "id": 329,
        "word": "売場",
        "reading": "うりば",
        "romaji": "uriba",
        "meaning": "Quầy bán hàng / Khu bán hàng",
        "hanViet": "Mại Trường",
        "type": "Danh từ",
        "exampleSentence": "ワイン売場は 地下に あります。",
        "exampleSentenceReading": "わいんうりばは ちかに あります。",
        "exampleSentenceMeaning": "Khu bán rượu vang ở dưới tầng hầm.",
        "dictionaryForm": ""
      },
      {
        "id": 330,
        "word": "地下",
        "reading": "ちか",
        "romaji": "chika",
        "meaning": "Dưới hầm / Lòng đất",
        "hanViet": "Địa Hạ",
        "type": "Danh từ",
        "exampleSentence": "地下に 駐車場が あります。",
        "exampleSentenceReading": "ちかに ちゅうしゃじょうが あります。",
        "exampleSentenceMeaning": "Dưới tầng hầm có bãi đỗ xe.",
        "dictionaryForm": ""
      },
      {
        "id": 331,
        "word": "～階",
        "reading": "～かい / ～がい",
        "romaji": "-kai / -gai",
        "meaning": "Tầng... (số tầng nhà)",
        "hanViet": "Giai",
        "type": "Hậu tố",
        "exampleSentence": "事務室は 2階です。",
        "exampleSentenceReading": "じむしつは にかいです。",
        "exampleSentenceMeaning": "Phòng làm việc ở tầng 2.",
        "dictionaryForm": ""
      },
      {
        "id": 332,
        "word": "何階",
        "reading": "なんがい",
        "romaji": "nangai",
        "meaning": "Tầng mấy",
        "hanViet": "Hà Giai",
        "type": "Nghi vấn từ",
        "exampleSentence": "あなたの 部屋は 何階ですか。",
        "exampleSentenceReading": "あなたの へやは なんがいですか。",
        "exampleSentenceMeaning": "Phòng của bạn ở tầng mấy?",
        "dictionaryForm": ""
      },
      {
        "id": 333,
        "word": "～円",
        "reading": "～えん",
        "romaji": "-en",
        "meaning": "Đồng Yên Nhật",
        "hanViet": "Viên",
        "type": "Đơn vị tiền tệ",
        "exampleSentence": "これは 1000円です。",
        "exampleSentenceReading": "これは せんえんです。",
        "exampleSentenceMeaning": "Cái này giá 1000 Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 334,
        "word": "いくら",
        "reading": "いくら",
        "romaji": "ikura",
        "meaning": "Bao nhiêu tiền",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "このネクタイは いくらですか。",
        "exampleSentenceReading": "このねくたいは いくらですか。",
        "exampleSentenceMeaning": "Chiếc cà vạt này bao nhiêu tiền?",
        "dictionaryForm": ""
      },
      {
        "id": 335,
        "word": "百",
        "reading": "ひゃく",
        "romaji": "hyaku",
        "meaning": "Một trăm",
        "hanViet": "Bách",
        "type": "Số từ",
        "exampleSentence": "300円 (さんびゃくえん) です。",
        "exampleSentenceReading": "さんびゃくえんです。",
        "exampleSentenceMeaning": "Giá 300 Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 336,
        "word": "千",
        "reading": "せん",
        "romaji": "sen",
        "meaning": "Một nghìn",
        "hanViet": "Thiên",
        "type": "Số từ",
        "exampleSentence": "5000円 (ごせんえん) です。",
        "exampleSentenceReading": "ごせんえんです。",
        "exampleSentenceMeaning": "Giá 5000 Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 337,
        "word": "万",
        "reading": "まん",
        "romaji": "man",
        "meaning": "Mười nghìn / Một vạn",
        "hanViet": "Vạn",
        "type": "Số từ",
        "exampleSentence": "2万円 (にまんえん) です。",
        "exampleSentenceReading": "にまんえんです。",
        "exampleSentenceMeaning": "Giá 2 vạn Yên (20.000 Yên).",
        "dictionaryForm": ""
      },
      {
        "id": 338,
        "word": "すみません",
        "reading": "すみません",
        "romaji": "sumimasen",
        "meaning": "Xin lỗi / Cho tôi hỏi...",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "すみません、これは いくらですか。",
        "exampleSentenceReading": "すみません、これは いくらですか。",
        "exampleSentenceMeaning": "Xin lỗi, cái này bao nhiêu tiền vậy?",
        "dictionaryForm": ""
      },
      {
        "id": 339,
        "word": "いらっしゃいませ",
        "reading": "いらっしゃいませ",
        "romaji": "irasshaimase",
        "meaning": "Kính chào quý khách!",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "いらっしゃいませ、何名様ですか。",
        "exampleSentenceReading": "いらっしゃいませ、なんめいさまですか。",
        "exampleSentenceMeaning": "Kính chào quý khách, quý khách đi mấy người ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 342,
        "word": "国",
        "reading": "くに",
        "romaji": "kuni",
        "meaning": "Đất nước",
        "hanViet": "Quốc",
        "type": "Danh từ",
        "exampleSentence": "お国は どちらですか。",
        "exampleSentenceReading": "おくには どちらですか。",
        "exampleSentenceMeaning": "Bạn là người nước nào?",
        "dictionaryForm": ""
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
          }
        ]
      },
      {
        "title": "N は N(địa điểm) です",
        "pattern": "N は Địa điểm です",
        "explanation": "Chỉ vị trí của một vật, một người hoặc một phòng ban.",
        "examples": [
          {
            "japanese": "お手洗いは あそこです。",
            "reading": "おてあらいは あそこです。",
            "vietnamese": "Nhà vệ sinh ở đằng kia."
          }
        ]
      },
      {
        "title": "N は いくらですか",
        "pattern": "N は いくらですか",
        "explanation": "Hỏi giá tiền của món hàng N. Trả lời bằng Số tiền + 円 (えん).",
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
        "type": "Động từ nhóm 2",
        "exampleSentence": "毎朝 6時に 起きます。",
        "exampleSentenceReading": "まいあさ ろくじに おきます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi thức dậy lúc 6 giờ.",
        "dictionaryForm": "起きる (おきる)"
      },
      {
        "id": 402,
        "word": "寝ます",
        "reading": "ねます",
        "romaji": "nemasu",
        "meaning": "Ngủ / Đi ngủ",
        "hanViet": "Tẩm",
        "type": "Động từ nhóm 2",
        "exampleSentence": "夜 11時に 寝ます。",
        "exampleSentenceReading": "よる じゅういちじに ねます。",
        "exampleSentenceMeaning": "Tôi đi ngủ lúc 11 giờ đêm.",
        "dictionaryForm": "寝る (ねる)"
      },
      {
        "id": 403,
        "word": "働きます",
        "reading": "はたらきます",
        "romaji": "hatarakimasu",
        "meaning": "Làm việc",
        "hanViet": "Động",
        "type": "Động từ nhóm 1",
        "exampleSentence": "会社で 働きます。",
        "exampleSentenceReading": "かいしゃで はたらきます。",
        "exampleSentenceMeaning": "Tôi làm việc ở công ty.",
        "dictionaryForm": "働く (はたらく)"
      },
      {
        "id": 404,
        "word": "休みます",
        "reading": "やすみます",
        "romaji": "yasumimasu",
        "meaning": "Nghỉ ngơi / Nghỉ học, làm",
        "hanViet": "Hưu",
        "type": "Động từ nhóm 1",
        "exampleSentence": "日曜日は 休みます。",
        "exampleSentenceReading": "にちようびは やすみます。",
        "exampleSentenceMeaning": "Chủ nhật tôi nghỉ ngơi.",
        "dictionaryForm": "休む (やすむ)"
      },
      {
        "id": 405,
        "word": "勉強します",
        "reading": "べんきょうします",
        "romaji": "benkyoushimasu",
        "meaning": "Học tập",
        "hanViet": "Miễn Cường",
        "type": "Động từ nhóm 3",
        "exampleSentence": "図書館で 勉強します。",
        "exampleSentenceReading": "としょかんで べんきょうします。",
        "exampleSentenceMeaning": "Tôi học bài ở thư viện.",
        "dictionaryForm": "勉強する (べんきょうする)"
      },
      {
        "id": 406,
        "word": "終わります",
        "reading": "おわります",
        "romaji": "owarimasu",
        "meaning": "Kết thúc / Xong",
        "hanViet": "Chung",
        "type": "Động từ nhóm 1",
        "exampleSentence": "授業は 5時に 終わります。",
        "exampleSentenceReading": "じゅぎょうは ごじに おわります。",
        "exampleSentenceMeaning": "Tiết học kết thúc lúc 5 giờ.",
        "dictionaryForm": "終わる (おわる)"
      },
      {
        "id": 407,
        "word": "デパート",
        "reading": "デパート",
        "romaji": "depaato",
        "meaning": "Bách hóa tổng hợp",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "デパートへ 買い物に 行きます。",
        "exampleSentenceReading": "でぱーとへ かいものに いきます。",
        "exampleSentenceMeaning": "Tôi đi trung tâm bách hóa mua sắm.",
        "dictionaryForm": ""
      },
      {
        "id": 408,
        "word": "銀行",
        "reading": "ぎんこう",
        "romaji": "ginkou",
        "meaning": "Ngân hàng",
        "hanViet": "Ngân Hàng",
        "type": "Danh từ",
        "exampleSentence": "銀行は 9時から 3時までです。",
        "exampleSentenceReading": "ぎんこうは くじから さんじまでです。",
        "exampleSentenceMeaning": "Ngân hàng mở cửa từ 9 giờ đến 3 giờ.",
        "dictionaryForm": ""
      },
      {
        "id": 409,
        "word": "郵便局",
        "reading": "ゆうびんきょく",
        "romaji": "yuubinkyoku",
        "meaning": "Bưu điện",
        "hanViet": "Bưu Tiện Cục",
        "type": "Danh từ",
        "exampleSentence": "郵便局で 切手を 買います。",
        "exampleSentenceReading": "ゆうびんきょくで きってを かいます。",
        "exampleSentenceMeaning": "Tôi mua tem ở bưu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 410,
        "word": "図書館",
        "reading": "としょかん",
        "romaji": "toshokan",
        "meaning": "Thư viện",
        "hanViet": "Đồ Thư Quán",
        "type": "Danh từ",
        "exampleSentence": "図書館で 本を 借ります。",
        "exampleSentenceReading": "としょかんで ほんを かります。",
        "exampleSentenceMeaning": "Tôi mượn sách ở thư viện.",
        "dictionaryForm": ""
      },
      {
        "id": 411,
        "word": "美術館",
        "reading": "びじゅつかん",
        "romaji": "bijutsukan",
        "meaning": "Bảo tàng mỹ thuật",
        "hanViet": "Mỹ Thuật Quán",
        "type": "Danh từ",
        "exampleSentence": "日曜日 美術館へ 行きました。",
        "exampleSentenceReading": "にちようび びじゅつかんへ いきました。",
        "exampleSentenceMeaning": "Chủ nhật tôi đã đi bảo tàng mỹ thuật.",
        "dictionaryForm": ""
      },
      {
        "id": 412,
        "word": "今",
        "reading": "いま",
        "romaji": "ima",
        "meaning": "Bây giờ / Hiện tại",
        "hanViet": "Kim",
        "type": "Danh từ",
        "exampleSentence": "今 何時ですか。",
        "exampleSentenceReading": "いま なんじですか。",
        "exampleSentenceMeaning": "Bây giờ là mấy giờ?",
        "dictionaryForm": ""
      },
      {
        "id": 413,
        "word": "～時",
        "reading": "～じ",
        "romaji": "-ji",
        "meaning": "～ giờ",
        "hanViet": "Thời",
        "type": "Hậu tố",
        "exampleSentence": "今は 10時です。",
        "exampleSentenceReading": "いまは じゅうじです。",
        "exampleSentenceMeaning": "Bây giờ là 10 giờ.",
        "dictionaryForm": ""
      },
      {
        "id": 414,
        "word": "～分",
        "reading": "～ふん / ～ぷん",
        "romaji": "-fun / -pun",
        "meaning": "～ phút",
        "hanViet": "Phân",
        "type": "Hậu tố",
        "exampleSentence": "10時 15分です。",
        "exampleSentenceReading": "じゅうじ じゅうごふんです。",
        "exampleSentenceMeaning": "Là 10 giờ 15 phút.",
        "dictionaryForm": ""
      },
      {
        "id": 415,
        "word": "半",
        "reading": "はん",
        "romaji": "han",
        "meaning": "Nửa / Rưỡi (30 phút)",
        "hanViet": "Bán",
        "type": "Danh từ",
        "exampleSentence": "7時半に 起きます。",
        "exampleSentenceReading": "しちじはんに おきます。",
        "exampleSentenceMeaning": "Tôi thức dậy lúc 7 giờ rưỡi.",
        "dictionaryForm": ""
      },
      {
        "id": 416,
        "word": "何時",
        "reading": "なんじ",
        "romaji": "nanji",
        "meaning": "Mấy giờ",
        "hanViet": "Hà Thời",
        "type": "Nghi vấn từ",
        "exampleSentence": "会議は 何時からですか。",
        "exampleSentenceReading": "かいぎは なんじからですか。",
        "exampleSentenceMeaning": "Cuộc họp từ mấy giờ thế?",
        "dictionaryForm": ""
      },
      {
        "id": 417,
        "word": "何分",
        "reading": "なんぷん",
        "romaji": "nanpun",
        "meaning": "Mấy phút",
        "hanViet": "Hà Phân",
        "type": "Nghi vấn từ",
        "exampleSentence": "今 何時 何分ですか。",
        "exampleSentenceReading": "いま なんじ なんぷんですか。",
        "exampleSentenceMeaning": "Bây giờ là mấy giờ mấy phút?",
        "dictionaryForm": ""
      },
      {
        "id": 418,
        "word": "午前",
        "reading": "ごぜん",
        "romaji": "gozen",
        "meaning": "Buổi sáng / Sáng (AM)",
        "hanViet": "Ngọ Tiền",
        "type": "Danh từ",
        "exampleSentence": "午前 9時に 始まります。",
        "exampleSentenceReading": "ごぜん くじに はじまります。",
        "exampleSentenceMeaning": "Bắt đầu lúc 9 giờ sáng.",
        "dictionaryForm": ""
      },
      {
        "id": 419,
        "word": "午後",
        "reading": "ごご",
        "romaji": "gogo",
        "meaning": "Buổi chiều / Tối (PM)",
        "hanViet": "Ngọ Hậu",
        "type": "Danh từ",
        "exampleSentence": "午後 2時に 会います。",
        "exampleSentenceReading": "ごご にじに あいます。",
        "exampleSentenceMeaning": "Gặp nhau lúc 2 giờ chiều.",
        "dictionaryForm": ""
      },
      {
        "id": 420,
        "word": "朝",
        "reading": "あさ",
        "romaji": "asa",
        "meaning": "Buổi sáng",
        "hanViet": "Triều",
        "type": "Danh từ",
        "exampleSentence": "朝 ご飯を 食べません。",
        "exampleSentenceReading": "あさ ごはんを たべません。",
        "exampleSentenceMeaning": "Buổi sáng tôi không ăn cơm.",
        "dictionaryForm": ""
      },
      {
        "id": 421,
        "word": "昼",
        "reading": "ひる",
        "romaji": "hiru",
        "meaning": "Buổi trưa",
        "hanViet": "Trú",
        "type": "Danh từ",
        "exampleSentence": "昼 友達と 食べます。",
        "exampleSentenceReading": "ひる ともだちと たべます。",
        "exampleSentenceMeaning": "Buổi trưa tôi ăn cùng bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 422,
        "word": "晩 / 夜",
        "reading": "ばん / よる",
        "romaji": "ban / yoru",
        "meaning": "Buổi tối / Đêm",
        "hanViet": "Vãn / Dạ",
        "type": "Danh từ",
        "exampleSentence": "晩 日本語を 勉強します。",
        "exampleSentenceReading": "ばん にほんごを べんきょうします。",
        "exampleSentenceMeaning": "Buổi tối tôi học tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 423,
        "word": "おととい",
        "reading": "おととい",
        "romaji": "ototoi",
        "meaning": "Hôm kia",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "おととい 雨が 降りました。",
        "exampleSentenceReading": "おととい あめが ふりました。",
        "exampleSentenceMeaning": "Hôm kia trời đã mưa.",
        "dictionaryForm": ""
      },
      {
        "id": 424,
        "word": "きのう",
        "reading": "きのう",
        "romaji": "kinou",
        "meaning": "Hôm qua",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "きのう 映画を 見ました。",
        "exampleSentenceReading": "きのう えいがを みました。",
        "exampleSentenceMeaning": "Hôm qua tôi đã xem phim.",
        "dictionaryForm": ""
      },
      {
        "id": 425,
        "word": "今日",
        "reading": "きょう",
        "romaji": "kyou",
        "meaning": "Hôm nay",
        "hanViet": "Kim Nhật",
        "type": "Danh từ",
        "exampleSentence": "今日は いい天気です。",
        "exampleSentenceReading": "きょうは いいてんきです。",
        "exampleSentenceMeaning": "Hôm nay thời tiết đẹp thật.",
        "dictionaryForm": ""
      },
      {
        "id": 426,
        "word": "明日",
        "reading": "あした",
        "romaji": "ashita",
        "meaning": "Ngày mai",
        "hanViet": "Minh Nhật",
        "type": "Danh từ",
        "exampleSentence": "明日 東京へ 行きます。",
        "exampleSentenceReading": "あした とうきょうへ いきます。",
        "exampleSentenceMeaning": "Ngày mai tôi đi Tokyo.",
        "dictionaryForm": ""
      },
      {
        "id": 427,
        "word": "あさって",
        "reading": "あさって",
        "romaji": "asatte",
        "meaning": "Ngày kia",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "あさって テストが あります。",
        "exampleSentenceReading": "あさって てすとが あります。",
        "exampleSentenceMeaning": "Ngày kia có bài kiểm tra.",
        "dictionaryForm": ""
      },
      {
        "id": 428,
        "word": "今朝",
        "reading": "けさ",
        "romaji": "kesa",
        "meaning": "Sáng nay",
        "hanViet": "Kim Triều",
        "type": "Danh từ",
        "exampleSentence": "今朝 パンを 食べました。",
        "exampleSentenceReading": "けさ ぱんを たべました。",
        "exampleSentenceMeaning": "Sáng nay tôi đã ăn bánh mì.",
        "dictionaryForm": ""
      },
      {
        "id": 429,
        "word": "今晩",
        "reading": "こんばん",
        "romaji": "konban",
        "meaning": "Tối nay",
        "hanViet": "Kim Vãn",
        "type": "Danh từ",
        "exampleSentence": "今晩 うちに います。",
        "exampleSentenceReading": "こんばん うちに います。",
        "exampleSentenceMeaning": "Tối nay tôi ở nhà.",
        "dictionaryForm": ""
      },
      {
        "id": 430,
        "word": "休み",
        "reading": "やすみ",
        "romaji": "yasumi",
        "meaning": "Nghỉ ngơi / Ngày nghỉ",
        "hanViet": "Hưu",
        "type": "Danh từ",
        "exampleSentence": "会社の 休みは 土曜日です。",
        "exampleSentenceReading": "かいしゃの やすみは どようびです。",
        "exampleSentenceMeaning": "Ngày nghỉ của công ty là thứ Bảy.",
        "dictionaryForm": ""
      },
      {
        "id": 431,
        "word": "昼休み",
        "reading": "ひるやすみ",
        "romaji": "hiruyasumi",
        "meaning": "Giờ nghỉ trưa",
        "hanViet": "Trú Hưu",
        "type": "Danh từ",
        "exampleSentence": "昼休みは 12時からです。",
        "exampleSentenceReading": "ひるやすみは じゅうにじからです。",
        "exampleSentenceMeaning": "Nghỉ trưa từ 12 giờ.",
        "dictionaryForm": ""
      },
      {
        "id": 432,
        "word": "毎朝",
        "reading": "まいあさ",
        "romaji": "maiasa",
        "meaning": "Mỗi sáng",
        "hanViet": "Mỗi Triều",
        "type": "Danh từ",
        "exampleSentence": "毎朝 走ります。",
        "exampleSentenceReading": "まいあさ はしります。",
        "exampleSentenceMeaning": "Mỗi sáng tôi đều chạy bộ.",
        "dictionaryForm": ""
      },
      {
        "id": 433,
        "word": "毎晩",
        "reading": "まいばん",
        "romaji": "maiban",
        "meaning": "Mỗi tối",
        "hanViet": "Mỗi Vãn",
        "type": "Danh từ",
        "exampleSentence": "毎晩 本を 読みます。",
        "exampleSentenceReading": "まいばん ほんを よみます。",
        "exampleSentenceMeaning": "Mỗi tối tôi đều đọc sách.",
        "dictionaryForm": ""
      },
      {
        "id": 434,
        "word": "毎日",
        "reading": "まいにち",
        "romaji": "mainichi",
        "meaning": "Mỗi ngày / Hàng ngày",
        "hanViet": "Mỗi Nhật",
        "type": "Danh từ",
        "exampleSentence": "毎日 日本語を 勉強します。",
        "exampleSentenceReading": "まいにち にほんごを べんきょうします。",
        "exampleSentenceMeaning": "Mỗi ngày tôi đều học tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 435,
        "word": "月曜日",
        "reading": "げつようび",
        "romaji": "getsuyoubi",
        "meaning": "Thứ Hai",
        "hanViet": "Nguyệt Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "月曜日に 会議が あります。",
        "exampleSentenceReading": "げつようびに かいぎが あります。",
        "exampleSentenceMeaning": "Thứ Hai có cuộc họp.",
        "dictionaryForm": ""
      },
      {
        "id": 436,
        "word": "火曜日",
        "reading": "かようび",
        "romaji": "kayoubi",
        "meaning": "Thứ Ba",
        "hanViet": "Hỏa Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "火曜日は 休みです。",
        "exampleSentenceReading": "かようびは やすみです。",
        "exampleSentenceMeaning": "Thứ Ba là ngày nghỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 437,
        "word": "水曜日",
        "reading": "すいようび",
        "romaji": "suiyoubi",
        "meaning": "Thứ Tư",
        "hanViet": "Thủy Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "水曜日に テニスを します。",
        "exampleSentenceReading": "すいようびに てにすを します。",
        "exampleSentenceMeaning": "Thứ Tư tôi chơi quần vợt.",
        "dictionaryForm": ""
      },
      {
        "id": 438,
        "word": "木曜日",
        "reading": "もくようび",
        "romaji": "mokuyoubi",
        "meaning": "Thứ Năm",
        "hanViet": "Mộc Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "木曜日は 雨でした。",
        "exampleSentenceReading": "もくようびは あめでした。",
        "exampleSentenceMeaning": "Thứ Năm trời đã mưa.",
        "dictionaryForm": ""
      },
      {
        "id": 439,
        "word": "金曜日",
        "reading": "きんようび",
        "romaji": "kinyoubi",
        "meaning": "Thứ Sáu",
        "hanViet": "Kim Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "金曜日の 夜 飲みます。",
        "exampleSentenceReading": "きんようびの よる のみます。",
        "exampleSentenceMeaning": "Tối thứ Sáu tôi đi uống.",
        "dictionaryForm": ""
      },
      {
        "id": 440,
        "word": "土曜日",
        "reading": "どようび",
        "romaji": "doyoubi",
        "meaning": "Thứ Bảy",
        "hanViet": "Thổ Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "土曜日に 買い物を します。",
        "exampleSentenceReading": "どようびに かいものを します。",
        "exampleSentenceMeaning": "Thứ Bảy tôi đi mua sắm.",
        "dictionaryForm": ""
      },
      {
        "id": 441,
        "word": "日曜日",
        "reading": "にちようび",
        "romaji": "nichiyoubi",
        "meaning": "Chủ Nhật",
        "hanViet": "Nhật Diệu Nhật",
        "type": "Danh từ",
        "exampleSentence": "日曜日は うちに います。",
        "exampleSentenceReading": "にちようびは うちに います。",
        "exampleSentenceMeaning": "Chủ Nhật tôi ở nhà.",
        "dictionaryForm": ""
      },
      {
        "id": 442,
        "word": "何曜日",
        "reading": "なんようび",
        "romaji": "nanyoubi",
        "meaning": "Thứ mấy",
        "hanViet": "Hà Diệu Nhật",
        "type": "Nghi vấn từ",
        "exampleSentence": "今日は 何曜日ですか。",
        "exampleSentenceReading": "きょうは なんようびですか。",
        "exampleSentenceMeaning": "Hôm nay là thứ mấy thế?",
        "dictionaryForm": ""
      },
      {
        "id": 443,
        "word": "大変ですね",
        "reading": "たいへんですね",
        "romaji": "taihen desu ne",
        "meaning": "Vất vả quá nhỉ / Cực quá nhỉ",
        "hanViet": "Đại Biến",
        "type": "Giao tiếp",
        "exampleSentence": "夜遅くまで、大変ですね。",
        "exampleSentenceReading": "よるおそくまで、たいへんですね。",
        "exampleSentenceMeaning": "Làm việc tới tận khuya, vất vả quá nhỉ.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "今 ～時～分 です",
        "pattern": "今 [Số giờ]時 [Số phút]分 です",
        "explanation": "Dùng để biểu thị thời gian hiện tại. Chú ý các giờ đặc biệt: 4時 (よじ), 7時 (しちじ), 9時 (くじ).",
        "examples": [
          {
            "japanese": "今 ４時５分です。",
            "reading": "いま よじごふんです。",
            "vietnamese": "Bây giờ là 4 giờ 5 phút."
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
          }
        ]
      },
      {
        "title": "N(thời gian) に V",
        "pattern": "Thời gian (có con số) + に + V",
        "explanation": "Trợ từ に đi sau mốc thời gian có chứa con số cụ thể (giờ, ngày, tháng, năm) để biểu thị thời điểm thực hiện hành động.",
        "examples": [
          {
            "japanese": "６時半に 起きます。",
            "reading": "ろくじはんに おきます。",
            "vietnamese": "Tôi thức dậy lúc 6 giờ rưỡi."
          }
        ]
      },
      {
        "title": "～から ～まで",
        "pattern": "N1 から N2 まで",
        "explanation": "から chỉ điểm bắt đầu (thời gian hoặc địa điểm), まで chỉ điểm kết thúc.",
        "examples": [
          {
            "japanese": "９時から ５時まで 働きます。",
            "reading": "くじから ごじまで はたらきます。",
            "vietnamese": "Tôi làm việc từ 9 giờ đến 5 giờ."
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
        "type": "Động từ nhóm 1",
        "exampleSentence": "スーパーへ 行きます。",
        "exampleSentenceReading": "すーぱーへ いきます。",
        "exampleSentenceMeaning": "Tôi đi siêu thị.",
        "dictionaryForm": "行く (いく)"
      },
      {
        "id": 502,
        "word": "来ます",
        "reading": "きます",
        "romaji": "kimasu",
        "meaning": "Đến",
        "hanViet": "Lai",
        "type": "Động từ nhóm 3",
        "exampleSentence": "友達が うちへ 来ます。",
        "exampleSentenceReading": "ともだちが うちへ きます。",
        "exampleSentenceMeaning": "Bạn tôi đến nhà chơi.",
        "dictionaryForm": "来る (くる)"
      },
      {
        "id": 503,
        "word": "帰ります",
        "reading": "かえります",
        "romaji": "kaerimasu",
        "meaning": "Về (nhà/nước)",
        "hanViet": "Quy",
        "type": "Động từ nhóm 1",
        "exampleSentence": "国へ 帰ります。",
        "exampleSentenceReading": "くにへ かえります。",
        "exampleSentenceMeaning": "Tôi về nước.",
        "dictionaryForm": "帰る (かえる)"
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
        "exampleSentenceMeaning": "Tôi đi đến trường.",
        "dictionaryForm": ""
      },
      {
        "id": 505,
        "word": "スーパー",
        "reading": "スーパー",
        "romaji": "suupaa",
        "meaning": "Siêu thị",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "スーパーで 肉を 買います。",
        "exampleSentenceReading": "すーぱーで にくを かいます。",
        "exampleSentenceMeaning": "Tôi mua thịt ở siêu thị.",
        "dictionaryForm": ""
      },
      {
        "id": 506,
        "word": "駅",
        "reading": "えき",
        "romaji": "eki",
        "meaning": "Nhà ga",
        "hanViet": "Dịch",
        "type": "Danh từ",
        "exampleSentence": "駅で 友達に 会います。",
        "exampleSentenceReading": "えきで ともだちに あいます。",
        "exampleSentenceMeaning": "Tôi gặp bạn ở nhà ga.",
        "dictionaryForm": ""
      },
      {
        "id": 507,
        "word": "飛行機",
        "reading": "ひこうき",
        "romaji": "hikouki",
        "meaning": "Máy bay",
        "hanViet": "Phi Hành Cơ",
        "type": "Danh từ",
        "exampleSentence": "飛行機で 日本へ 行きます。",
        "exampleSentenceReading": "ひこうきで にほんへ いきます。",
        "exampleSentenceMeaning": "Tôi đi Nhật bằng máy bay.",
        "dictionaryForm": ""
      },
      {
        "id": 508,
        "word": "船",
        "reading": "ふね",
        "romaji": "fune",
        "meaning": "Tàu thủy / Thuyền",
        "hanViet": "Thuyền",
        "type": "Danh từ",
        "exampleSentence": "船で 島へ 行きます。",
        "exampleSentenceReading": "ふねで しまへ いきます。",
        "exampleSentenceMeaning": "Tôi đi đảo bằng tàu thủy.",
        "dictionaryForm": ""
      },
      {
        "id": 509,
        "word": "電車",
        "reading": "でんしゃ",
        "romaji": "densha",
        "meaning": "Tàu điện",
        "hanViet": "Điện Xa",
        "type": "Danh từ",
        "exampleSentence": "電車で 会社へ 行きます。",
        "exampleSentenceReading": "でんしゃで かいしゃへ いきます。",
        "exampleSentenceMeaning": "Tôi đi làm bằng tàu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 510,
        "word": "地下鉄",
        "reading": "ちかてつ",
        "romaji": "chikatetsu",
        "meaning": "Tàu điện ngầm",
        "hanViet": "Địa Hạ Thiết",
        "type": "Danh từ",
        "exampleSentence": "地下鉄は 速いです。",
        "exampleSentenceReading": "ちかてつは はやいです。",
        "exampleSentenceMeaning": "Tàu điện ngầm chạy nhanh.",
        "dictionaryForm": ""
      },
      {
        "id": 511,
        "word": "新幹線",
        "reading": "しんかんせん",
        "romaji": "shinkansen",
        "meaning": "Tàu siêu tốc Shinkansen",
        "hanViet": "Tân Cán Tuyến",
        "type": "Danh từ",
        "exampleSentence": "新幹線は とても きれいです。",
        "exampleSentenceReading": "しんかんせんは とても きれいです。",
        "exampleSentenceMeaning": "Tàu Shinkansen rất đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 512,
        "word": "バス",
        "reading": "バス",
        "romaji": "basu",
        "meaning": "Xe buýt",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "バスで 病院へ 行きます。",
        "exampleSentenceReading": "ばすで びょういんへ いきます。",
        "exampleSentenceMeaning": "Tôi đi bệnh viện bằng xe buýt.",
        "dictionaryForm": ""
      },
      {
        "id": 513,
        "word": "タクシー",
        "reading": "タクシー",
        "romaji": "takushii",
        "meaning": "Xe taxi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "タクシーを 呼びます。",
        "exampleSentenceReading": "たくしーを よびます。",
        "exampleSentenceMeaning": "Tôi gọi taxi.",
        "dictionaryForm": ""
      },
      {
        "id": 514,
        "word": "自転車",
        "reading": "じてんしゃ",
        "romaji": "jitensha",
        "meaning": "Xe đạp",
        "hanViet": "Tự Chuyển Xa",
        "type": "Danh từ",
        "exampleSentence": "自転車で 公園へ 行きます。",
        "exampleSentenceReading": "じてんしゃで こうえんへ いきます。",
        "exampleSentenceMeaning": "Tôi đi công viên bằng xe đạp.",
        "dictionaryForm": ""
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
        "exampleSentenceMeaning": "Từ ga tôi đi bộ về nhà.",
        "dictionaryForm": ""
      },
      {
        "id": 516,
        "word": "人",
        "reading": "ひと",
        "romaji": "hito",
        "meaning": "Người",
        "hanViet": "Nhân",
        "type": "Danh từ",
        "exampleSentence": "あの人は 親切です。",
        "exampleSentenceReading": "あのひとは しんせつです。",
        "exampleSentenceMeaning": "Người kia rất tốt bụng.",
        "dictionaryForm": ""
      },
      {
        "id": 517,
        "word": "友達",
        "reading": "ともだち",
        "romaji": "tomodachi",
        "meaning": "Bạn bè",
        "hanViet": "Bằng Hữu",
        "type": "Danh từ",
        "exampleSentence": "友達と 遊びます。",
        "exampleSentenceReading": "ともだちと あそびます。",
        "exampleSentenceMeaning": "Tôi đi chơi với bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 518,
        "word": "彼",
        "reading": "かれ",
        "romaji": "kare",
        "meaning": "Anh ấy / Bạn trai",
        "hanViet": "Bỉ",
        "type": "Đại từ",
        "exampleSentence": "彼は 優しいです。",
        "exampleSentenceReading": "かれは やさしいです。",
        "exampleSentenceMeaning": "Anh ấy rất hiền từ.",
        "dictionaryForm": ""
      },
      {
        "id": 519,
        "word": "彼女",
        "reading": "かのじょ",
        "romaji": "kanojo",
        "meaning": "Cô ấy / Bạn gái",
        "hanViet": "Bỉ Nữ",
        "type": "Đại từ",
        "exampleSentence": "彼女は 日本人です。",
        "exampleSentenceReading": "かのじょは にほんじんです。",
        "exampleSentenceMeaning": "Cô ấy là người Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 520,
        "word": "家族",
        "reading": "かぞく",
        "romaji": "kazoku",
        "meaning": "Gia đình",
        "hanViet": "Gia Tộc",
        "type": "Danh từ",
        "exampleSentence": "家族と 旅行します。",
        "exampleSentenceReading": "かぞくと りょこうします。",
        "exampleSentenceMeaning": "Tôi đi du lịch với gia đình.",
        "dictionaryForm": ""
      },
      {
        "id": 521,
        "word": "一人で",
        "reading": "ひとりで",
        "romaji": "hitoride",
        "meaning": "Một mình",
        "hanViet": "Nhất Nhân",
        "type": "Phó từ",
        "exampleSentence": "一人で 映画を 見ました。",
        "exampleSentenceReading": "ひとりで えいがを みました。",
        "exampleSentenceMeaning": "Tôi xem phim một mình.",
        "dictionaryForm": ""
      },
      {
        "id": 522,
        "word": "先週",
        "reading": "せんしゅう",
        "romaji": "senshuu",
        "meaning": "Tuần trước",
        "hanViet": "Tiên Chu",
        "type": "Danh từ",
        "exampleSentence": "先週 京都へ 行きました。",
        "exampleSentenceReading": "せんしゅう きょうとへ いきました。",
        "exampleSentenceMeaning": "Tuần trước tôi đã đi Kyoto.",
        "dictionaryForm": ""
      },
      {
        "id": 523,
        "word": "今週",
        "reading": "こんしゅう",
        "romaji": "konshuu",
        "meaning": "Tuần này",
        "hanViet": "Kim Chu",
        "type": "Danh từ",
        "exampleSentence": "今週は 忙しいです。",
        "exampleSentenceReading": "こんしゅうは いそがしいです。",
        "exampleSentenceMeaning": "Tuần này tôi rất bận.",
        "dictionaryForm": ""
      },
      {
        "id": 524,
        "word": "来週",
        "reading": "らいしゅう",
        "romaji": "raishuu",
        "meaning": "Tuần sau",
        "hanViet": "Lai Chu",
        "type": "Danh từ",
        "exampleSentence": "来週 テストが あります。",
        "exampleSentenceReading": "らいしゅう てすとが あります。",
        "exampleSentenceMeaning": "Tuần sau có bài kiểm tra.",
        "dictionaryForm": ""
      },
      {
        "id": 525,
        "word": "先月",
        "reading": "せんげつ",
        "romaji": "sengetsu",
        "meaning": "Tháng trước",
        "hanViet": "Tiên Nguyệt",
        "type": "Danh từ",
        "exampleSentence": "先月 日本へ 来ました。",
        "exampleSentenceReading": "せんげつ にほんへ きました。",
        "exampleSentenceMeaning": "Tháng trước tôi đã đến Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 526,
        "word": "今月",
        "reading": "こんげつ",
        "romaji": "kongetsu",
        "meaning": "Tháng này",
        "hanViet": "Kim Nguyệt",
        "type": "Danh từ",
        "exampleSentence": "今月は 休みが 多いです。",
        "exampleSentenceReading": "こんげつは やすみが おおいです。",
        "exampleSentenceMeaning": "Tháng này có nhiều ngày nghỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 527,
        "word": "来月",
        "reading": "らいげつ",
        "romaji": "raigetsu",
        "meaning": "Tháng sau",
        "hanViet": "Lai Nguyệt",
        "type": "Danh từ",
        "exampleSentence": "来月 ベトナムへ 帰ります。",
        "exampleSentenceReading": "らいげつ べとなむへ かえります。",
        "exampleSentenceMeaning": "Tháng sau tôi về Việt Nam.",
        "dictionaryForm": ""
      },
      {
        "id": 528,
        "word": "去年",
        "reading": "きょねん",
        "romaji": "kyonen",
        "meaning": "Năm ngoái",
        "hanViet": "Khứ Niên",
        "type": "Danh từ",
        "exampleSentence": "去年 卒業しました。",
        "exampleSentenceReading": "きょねん そつぎょうしました。",
        "exampleSentenceMeaning": "Năm ngoái tôi đã tốt nghiệp.",
        "dictionaryForm": ""
      },
      {
        "id": 529,
        "word": "今年",
        "reading": "ことし",
        "romaji": "kotoshi",
        "meaning": "Năm nay",
        "hanViet": "Kim Niên",
        "type": "Danh từ",
        "exampleSentence": "今年 25歳に なります。",
        "exampleSentenceReading": "ことし にじゅうごさいに なります。",
        "exampleSentenceMeaning": "Năm nay tôi tròn 25 tuổi.",
        "dictionaryForm": ""
      },
      {
        "id": 530,
        "word": "来年",
        "reading": "らいねん",
        "romaji": "rainen",
        "meaning": "Năm sau",
        "hanViet": "Lai Niên",
        "type": "Danh từ",
        "exampleSentence": "来年 日本へ 行きます。",
        "exampleSentenceReading": "らいねん にほんへ いきます。",
        "exampleSentenceMeaning": "Năm sau tôi sẽ đi Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 531,
        "word": "～月",
        "reading": "～がつ",
        "romaji": "-gatsu",
        "meaning": "Tháng... (tên tháng trong năm)",
        "hanViet": "Nguyệt",
        "type": "Hậu tố",
        "exampleSentence": "4月は 桜が 咲きます。",
        "exampleSentenceReading": "しがつは さくらが さきます。",
        "exampleSentenceMeaning": "Tháng 4 hoa anh đào nở.",
        "dictionaryForm": ""
      },
      {
        "id": 532,
        "word": "何月",
        "reading": "なんがつ",
        "romaji": "nangatsu",
        "meaning": "Tháng mấy",
        "hanViet": "Hà Nguyệt",
        "type": "Nghi vấn từ",
        "exampleSentence": "誕生日は 何月ですか。",
        "exampleSentenceReading": "たんじょうびは なんがつですか。",
        "exampleSentenceMeaning": "Sinh nhật bạn là tháng mấy?",
        "dictionaryForm": ""
      },
      {
        "id": 533,
        "word": "1日",
        "reading": "ついたち",
        "romaji": "tsuitachi",
        "meaning": "Mùng 1",
        "hanViet": "Nhất Nhật",
        "type": "Danh từ",
        "exampleSentence": "1月1日は 元日です。",
        "exampleSentenceReading": "いちがつついたちは がんじつです。",
        "exampleSentenceMeaning": "Ngày mùng 1 tháng 1 là Tết.",
        "dictionaryForm": ""
      },
      {
        "id": 534,
        "word": "2日",
        "reading": "ふつか",
        "romaji": "futsuka",
        "meaning": "Mùng 2 / 2 ngày",
        "hanViet": "Nhị Nhật",
        "type": "Danh từ",
        "exampleSentence": "2日に 会いましょう。",
        "exampleSentenceReading": "ふつかに あいましょう。",
        "exampleSentenceMeaning": "Gặp nhau vào ngày mùng 2 nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 535,
        "word": "3日",
        "reading": "みっか",
        "romaji": "mikka",
        "meaning": "Mùng 3 / 3 ngày",
        "hanViet": "Tam Nhật",
        "type": "Danh từ",
        "exampleSentence": "3日間 休みます。",
        "exampleSentenceReading": "みっかかん やすみます。",
        "exampleSentenceMeaning": "Tôi nghỉ trong 3 ngày.",
        "dictionaryForm": ""
      },
      {
        "id": 536,
        "word": "4日",
        "reading": "よっか",
        "romaji": "yokka",
        "meaning": "Mùng 4 / 4 ngày",
        "hanViet": "Tứ Nhật",
        "type": "Danh từ",
        "exampleSentence": "4日は 友達の 誕生日です。",
        "exampleSentenceReading": "よっかは ともだちの たんじょうびです。",
        "exampleSentenceMeaning": "Ngày mùng 4 là sinh nhật bạn tôi.",
        "dictionaryForm": ""
      },
      {
        "id": 537,
        "word": "5日",
        "reading": "いつか",
        "romaji": "itsuka",
        "meaning": "Mùng 5 / 5 ngày",
        "hanViet": "Ngũ Nhật",
        "type": "Danh từ",
        "exampleSentence": "5日に 出発します。",
        "exampleSentenceReading": "いつかに しゅっぱつします。",
        "exampleSentenceMeaning": "Xuất phát vào ngày mùng 5.",
        "dictionaryForm": ""
      },
      {
        "id": 538,
        "word": "10日",
        "reading": "とおか",
        "romaji": "tooka",
        "meaning": "Mùng 10 / 10 ngày",
        "hanViet": "Thập Nhật",
        "type": "Danh từ",
        "exampleSentence": "10日に 荷物が 届きます。",
        "exampleSentenceReading": "とおかに にもつが とどきます。",
        "exampleSentenceMeaning": "Hàng sẽ đến vào ngày mùng 10.",
        "dictionaryForm": ""
      },
      {
        "id": 539,
        "word": "14日",
        "reading": "じゅうよっか",
        "romaji": "juuyokka",
        "meaning": "Ngày 14",
        "hanViet": "Thập Tứ Nhật",
        "type": "Danh từ",
        "exampleSentence": "14日は バレンタインデーです。",
        "exampleSentenceReading": "じゅうよっかは ばれんたいんでーです。",
        "exampleSentenceMeaning": "Ngày 14 là ngày Valentine.",
        "dictionaryForm": ""
      },
      {
        "id": 540,
        "word": "20日",
        "reading": "はつか",
        "romaji": "hatsuka",
        "meaning": "Ngày 20",
        "hanViet": "Nhị Thập Nhật",
        "type": "Danh từ",
        "exampleSentence": "20日は 給料日です。",
        "exampleSentenceReading": "はつかは きゅうりょうびです。",
        "exampleSentenceMeaning": "Ngày 20 là ngày nhận lương.",
        "dictionaryForm": ""
      },
      {
        "id": 541,
        "word": "24日",
        "reading": "にじゅうよっか",
        "romaji": "nijuuyokka",
        "meaning": "Ngày 24",
        "hanViet": "Nhị Thập Tứ Nhật",
        "type": "Danh từ",
        "exampleSentence": "24日に パーティーを します。",
        "exampleSentenceReading": "にじゅうよっかに ぱーてぃーを します。",
        "exampleSentenceMeaning": "Tổ chức tiệc vào ngày 24.",
        "dictionaryForm": ""
      },
      {
        "id": 542,
        "word": "何日",
        "reading": "なんにち",
        "romaji": "nannichi",
        "meaning": "Ngày mấy / Mấy ngày",
        "hanViet": "Hà Nhật",
        "type": "Nghi vấn từ",
        "exampleSentence": "今日は 何日ですか。",
        "exampleSentenceReading": "きょうは なんにちですか。",
        "exampleSentenceMeaning": "Hôm nay là ngày mùng mấy?",
        "dictionaryForm": ""
      },
      {
        "id": 543,
        "word": "いつ",
        "reading": "いつ",
        "romaji": "itsu",
        "meaning": "Khi nào / Bao giờ",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "いつ 日本へ 行きますか。",
        "exampleSentenceReading": "いつ にほんへ いきますか。",
        "exampleSentenceMeaning": "Khi nào bạn đi Nhật?",
        "dictionaryForm": ""
      },
      {
        "id": 544,
        "word": "誕生日",
        "reading": "たんじょうび",
        "romaji": "tanjoubi",
        "meaning": "Sinh nhật",
        "hanViet": "Đản Sinh Nhật",
        "type": "Danh từ",
        "exampleSentence": "お誕生日 おめでとうございます。",
        "exampleSentenceReading": "おたんじょうび おめでとうございます。",
        "exampleSentenceMeaning": "Chúc mừng sinh nhật bạn.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "N(địa điểm) へ 行きます／来ます／帰ります",
        "pattern": "Địa điểm + へ + Hành động di chuyển",
        "explanation": "Trợ từ へ (phát âm là 'e') biểu thị hướng đi tới đích đến.",
        "examples": [
          {
            "japanese": "わたしは 京都へ 行きます。",
            "reading": "わたしは きょうとへ いきます。",
            "vietnamese": "Tôi đi đến Kyoto."
          }
        ]
      },
      {
        "title": "どこ [へ] も 行きません",
        "pattern": "Từ để hỏi + も + Thể phủ định",
        "explanation": "Phủ định hoàn toàn (Không đi đâu cả, không ăn gì cả).",
        "examples": [
          {
            "japanese": "日曜日は どこも 行きませんでした。",
            "reading": "にちようびは どこも いきませんでした。",
            "vietnamese": "Chủ nhật tôi không đi đâu cả."
          }
        ]
      },
      {
        "title": "N(phương tiện) で 行きます",
        "pattern": "Phương tiện + で + Đi/Đến/Về",
        "explanation": "Trợ từ で chỉ phương tiện di chuyển. Riêng đi bộ dùng 歩いて (aruite), không thêm で.",
        "examples": [
          {
            "japanese": "電車で 行きます。",
            "reading": "でんしゃで いきます。",
            "vietnamese": "Tôi đi bằng tàu điện."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 6,
    "title": "Bài 6: Thức ăn & Hành động thường ngày",
    "japaneseTitle": "第６課：何をしますか",
    "description": "Trợ từ を (o) chỉ đối tượng tác động, で chỉ địa điểm hành động diễn ra, rủ rê Vませんか / Vましょう.",
    "vocabularies": [
      {
        "id": 601,
        "word": "食べます",
        "reading": "たべます",
        "romaji": "tabemasu",
        "meaning": "Ăn",
        "hanViet": "Thực",
        "type": "Động từ nhóm 2",
        "exampleSentence": "ご飯を 食べます。",
        "exampleSentenceReading": "ごはんを たべます。",
        "exampleSentenceMeaning": "Tôi ăn cơm.",
        "dictionaryForm": "食べる (たべる)"
      },
      {
        "id": 602,
        "word": "飲みます",
        "reading": "のみます",
        "romaji": "nomimasu",
        "meaning": "Uống",
        "hanViet": "Ẩm",
        "type": "Động từ nhóm 1",
        "exampleSentence": "水を 飲みます。",
        "exampleSentenceReading": "みずを のみます。",
        "exampleSentenceMeaning": "Tôi uống nước.",
        "dictionaryForm": "飲む (のむ)"
      },
      {
        "id": 603,
        "word": "吸います",
        "reading": "すいます",
        "romaji": "suimasu",
        "meaning": "Hút (thuốc)",
        "hanViet": "Hấp",
        "type": "Động từ nhóm 1",
        "exampleSentence": "たばこを 吸いません。",
        "exampleSentenceReading": "たばこを すいません。",
        "exampleSentenceMeaning": "Tôi không hút thuốc lá.",
        "dictionaryForm": "吸う (すう)"
      },
      {
        "id": 604,
        "word": "見ます",
        "reading": "みます",
        "romaji": "mimasu",
        "meaning": "Xem / Nhìn",
        "hanViet": "Kiến",
        "type": "Động từ nhóm 2",
        "exampleSentence": "映画を 見ます。",
        "exampleSentenceReading": "えいがを みます。",
        "exampleSentenceMeaning": "Tôi xem phim.",
        "dictionaryForm": "見る (みる)"
      },
      {
        "id": 605,
        "word": "聞きます",
        "reading": "ききます",
        "romaji": "kikimasu",
        "meaning": "Nghe",
        "hanViet": "Văn",
        "type": "Động từ nhóm 1",
        "exampleSentence": "音楽を 聞きます。",
        "exampleSentenceReading": "おんがくを ききます。",
        "exampleSentenceMeaning": "Tôi nghe nhạc.",
        "dictionaryForm": "聞く (きく)"
      },
      {
        "id": 606,
        "word": "読みます",
        "reading": "よみます",
        "romaji": "yomimasu",
        "meaning": "Đọc",
        "hanViet": "Độc",
        "type": "Động từ nhóm 1",
        "exampleSentence": "本を 読みます。",
        "exampleSentenceReading": "ほんを よみます。",
        "exampleSentenceMeaning": "Tôi đọc sách.",
        "dictionaryForm": "読む (よむ)"
      },
      {
        "id": 607,
        "word": "書きます",
        "reading": "かきます",
        "romaji": "kakimasu",
        "meaning": "Viết / Vẽ",
        "hanViet": "Thư",
        "type": "Động từ nhóm 1",
        "exampleSentence": "手紙を 書きます。",
        "exampleSentenceReading": "てがみを かきます。",
        "exampleSentenceMeaning": "Tôi viết thư.",
        "dictionaryForm": "書く (かく)"
      },
      {
        "id": 608,
        "word": "買います",
        "reading": "かいます",
        "romaji": "kaimasu",
        "meaning": "Mua",
        "hanViet": "Mãi",
        "type": "Động từ nhóm 1",
        "exampleSentence": "パンを 買いました。",
        "exampleSentenceReading": "ぱんを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua bánh mì.",
        "dictionaryForm": "買う (かう)"
      },
      {
        "id": 609,
        "word": "撮ります",
        "reading": "とります",
        "romaji": "torimasu",
        "meaning": "Chụp (ảnh)",
        "hanViet": "Toát",
        "type": "Động từ nhóm 1",
        "exampleSentence": "写真を 撮ります。",
        "exampleSentenceReading": "しゃしんを とります。",
        "exampleSentenceMeaning": "Tôi chụp ảnh.",
        "dictionaryForm": "撮る (とる)"
      },
      {
        "id": 610,
        "word": "します",
        "reading": "します",
        "romaji": "shimasu",
        "meaning": "Làm / Chơi (thể thao, game)",
        "hanViet": "",
        "type": "Động từ nhóm 3",
        "exampleSentence": "サッカーを します。",
        "exampleSentenceReading": "さっかーを します。",
        "exampleSentenceMeaning": "Tôi chơi bóng đá.",
        "dictionaryForm": "する"
      },
      {
        "id": 611,
        "word": "会います",
        "reading": "あいます",
        "romaji": "aimasu",
        "meaning": "Gặp gỡ (ai đó [に])",
        "hanViet": "Hội",
        "type": "Động từ nhóm 1",
        "exampleSentence": "駅で 友達に 会います。",
        "exampleSentenceReading": "えきで ともだちに あいます。",
        "exampleSentenceMeaning": "Tôi gặp bạn ở nhà ga.",
        "dictionaryForm": "会う (あう)"
      },
      {
        "id": 612,
        "word": "ご飯",
        "reading": "ごはん",
        "romaji": "gohan",
        "meaning": "Cơm / Bữa ăn",
        "hanViet": "Phạn",
        "type": "Danh từ",
        "exampleSentence": "朝ご飯を 食べましたか。",
        "exampleSentenceReading": "あさごはんを たべましたか。",
        "exampleSentenceMeaning": "Bạn đã ăn sáng chưa?",
        "dictionaryForm": ""
      },
      {
        "id": 613,
        "word": "朝ご飯",
        "reading": "あさごはん",
        "romaji": "asagohan",
        "meaning": "Bữa sáng / Cơm sáng",
        "hanViet": "Triều Phạn",
        "type": "Danh từ",
        "exampleSentence": "毎朝 朝ご飯を 食べます。",
        "exampleSentenceReading": "まいあさ あさごはんを たべます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi đều ăn sáng.",
        "dictionaryForm": ""
      },
      {
        "id": 614,
        "word": "昼ご飯",
        "reading": "ひるごはん",
        "romaji": "hirugohan",
        "meaning": "Bữa trưa / Cơm trưa",
        "hanViet": "Trú Phạn",
        "type": "Danh từ",
        "exampleSentence": "昼ご飯は ラーメンです。",
        "exampleSentenceReading": "ひるごはんは らーめんです。",
        "exampleSentenceMeaning": "Bữa trưa là mì ramen.",
        "dictionaryForm": ""
      },
      {
        "id": 615,
        "word": "晩ご飯",
        "reading": "ばんごはん",
        "romaji": "bangohan",
        "meaning": "Bữa tối / Cơm tối",
        "hanViet": "Vãn Phạn",
        "type": "Danh từ",
        "exampleSentence": "晩ご飯を 一緒に 食べましょう。",
        "exampleSentenceReading": "ばんごはんを いっしょに たべましょう。",
        "exampleSentenceMeaning": "Cùng ăn cơm tối nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 616,
        "word": "パン",
        "reading": "パン",
        "romaji": "pan",
        "meaning": "Bánh mì",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "毎朝 パンを 食べます。",
        "exampleSentenceReading": "まいあさ ぱんを たべます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi ăn bánh mì.",
        "dictionaryForm": ""
      },
      {
        "id": 617,
        "word": "卵",
        "reading": "たまご",
        "romaji": "tamago",
        "meaning": "Quả trứng",
        "hanViet": "Noãn",
        "type": "Danh từ",
        "exampleSentence": "卵を 2個 買いました。",
        "exampleSentenceReading": "たまごを にこ かいました。",
        "exampleSentenceMeaning": "Tôi đã mua 2 quả trứng.",
        "dictionaryForm": ""
      },
      {
        "id": 618,
        "word": "肉",
        "reading": "にく",
        "romaji": "niku",
        "meaning": "Thịt",
        "hanViet": "Nhục",
        "type": "Danh từ",
        "exampleSentence": "牛肉が 好きです。",
        "exampleSentenceReading": "ぎゅうにくが すきです。",
        "exampleSentenceMeaning": "Tôi thích thịt bò.",
        "dictionaryForm": ""
      },
      {
        "id": 619,
        "word": "魚",
        "reading": "さかな",
        "romaji": "sakana",
        "meaning": "Cá",
        "hanViet": "Ngư",
        "type": "Danh từ",
        "exampleSentence": "新鮮な 魚を 食べます。",
        "exampleSentenceReading": "しんせんな さかなを たべます。",
        "exampleSentenceMeaning": "Tôi ăn cá tươi.",
        "dictionaryForm": ""
      },
      {
        "id": 620,
        "word": "野菜",
        "reading": "やさい",
        "romaji": "yasai",
        "meaning": "Rau xanh / Rau củ",
        "hanViet": "Dã Thái",
        "type": "Danh từ",
        "exampleSentence": "野菜を たくさん 食べます。",
        "exampleSentenceReading": "やさいを たくさん たべます。",
        "exampleSentenceMeaning": "Tôi ăn nhiều rau xanh.",
        "dictionaryForm": ""
      },
      {
        "id": 621,
        "word": "果物",
        "reading": "くだもの",
        "romaji": "kudamono",
        "meaning": "Hoa quả / Trái cây",
        "hanViet": "Quả Vật",
        "type": "Danh từ",
        "exampleSentence": "日本の 果物は 甘いです。",
        "exampleSentenceReading": "にほんの くだものは あまいいです。",
        "exampleSentenceMeaning": "Hoa quả Nhật Bản rất ngọt.",
        "dictionaryForm": ""
      },
      {
        "id": 622,
        "word": "水",
        "reading": "みず",
        "romaji": "mizu",
        "meaning": "Nước lọc / Nước lã",
        "hanViet": "Thủy",
        "type": "Danh từ",
        "exampleSentence": "冷たい 水を ください。",
        "exampleSentenceReading": "つめたい みずを ください。",
        "exampleSentenceMeaning": "Cho tôi xin nước lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 623,
        "word": "お茶",
        "reading": "おちゃ",
        "romaji": "ocha",
        "meaning": "Trà xanh Nhật Bản",
        "hanViet": "Trà",
        "type": "Danh từ",
        "exampleSentence": "お茶を どうぞ。",
        "exampleSentenceReading": "おちゃを どうぞ。",
        "exampleSentenceMeaning": "Xin mời dùng trà.",
        "dictionaryForm": ""
      },
      {
        "id": 624,
        "word": "紅茶",
        "reading": "こうちゃ",
        "romaji": "koucha",
        "meaning": "Trà đen / Hồng trà",
        "hanViet": "Hồng Trà",
        "type": "Danh từ",
        "exampleSentence": "ミルクティーの 紅茶です。",
        "exampleSentenceReading": "みるくてぃーの こうちゃです。",
        "exampleSentenceMeaning": "Là hồng trà để pha trà sữa.",
        "dictionaryForm": ""
      },
      {
        "id": 625,
        "word": "牛乳",
        "reading": "ぎゅうにゅう",
        "romaji": "gyuunyuu",
        "meaning": "Sữa bò",
        "hanViet": "Ngưu Nhũ",
        "type": "Danh từ",
        "exampleSentence": "朝 牛乳を 飲みます。",
        "exampleSentenceReading": "あさ ぎゅうにゅうを のみます。",
        "exampleSentenceMeaning": "Buổi sáng tôi uống sữa bò.",
        "dictionaryForm": ""
      },
      {
        "id": 626,
        "word": "ジュース",
        "reading": "ジュース",
        "romaji": "juusu",
        "meaning": "Nước hoa quả / Nước ép",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "オレンジジュースを 飲みます。",
        "exampleSentenceReading": "おれんじじゅーすを のみます。",
        "exampleSentenceMeaning": "Tôi uống nước cam ép.",
        "dictionaryForm": ""
      },
      {
        "id": 627,
        "word": "ビール",
        "reading": "ビール",
        "romaji": "biiru",
        "meaning": "Bia",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "冷たい ビールで 乾杯します。",
        "exampleSentenceReading": "つめたい びーるで かんぱいします。",
        "exampleSentenceMeaning": "Nâng ly bằng bia lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 628,
        "word": "お酒",
        "reading": "おさけ",
        "romaji": "osake",
        "meaning": "Rượu / Rượu Sake Nhật",
        "hanViet": "Tửu",
        "type": "Danh từ",
        "exampleSentence": "日本のお酒を 飲みました。",
        "exampleSentenceReading": "にほんのおさけを のみました。",
        "exampleSentenceMeaning": "Tôi đã uống rượu Sake của Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 629,
        "word": "たばこ",
        "reading": "たばこ",
        "romaji": "tabako",
        "meaning": "Thuốc lá",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ここで たばこを 吸わないでください。",
        "exampleSentenceReading": "ここで たばこを すわないでください。",
        "exampleSentenceMeaning": "Xin đừng hút thuốc ở đây.",
        "dictionaryForm": ""
      },
      {
        "id": 630,
        "word": "手紙",
        "reading": "てがみ",
        "romaji": "tegami",
        "meaning": "Bức thư",
        "hanViet": "Thủ Chỉ",
        "type": "Danh từ",
        "exampleSentence": "母に 手紙を 書きました。",
        "exampleSentenceReading": "ははに てがみを かきました。",
        "exampleSentenceMeaning": "Tôi đã viết thư cho mẹ.",
        "dictionaryForm": ""
      },
      {
        "id": 631,
        "word": "レポート",
        "reading": "レポート",
        "romaji": "repooto",
        "meaning": "Bài báo cáo / Bản báo cáo",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "明日までに レポートを 出します。",
        "exampleSentenceReading": "あしたまでに れぽーとを だします。",
        "exampleSentenceMeaning": "Nộp báo cáo trước ngày mai.",
        "dictionaryForm": ""
      },
      {
        "id": 632,
        "word": "写真",
        "reading": "しゃしん",
        "romaji": "shashin",
        "meaning": "Bức ảnh",
        "hanViet": "Tả Chân",
        "type": "Danh từ",
        "exampleSentence": "家族の 写真を 見せます。",
        "exampleSentenceReading": "かぞくの しゃしんを みせます。",
        "exampleSentenceMeaning": "Tôi cho xem ảnh gia đình.",
        "dictionaryForm": ""
      },
      {
        "id": 633,
        "word": "店",
        "reading": "みせ",
        "romaji": "mise",
        "meaning": "Cửa hàng / Tiệm",
        "hanViet": "Điếm",
        "type": "Danh từ",
        "exampleSentence": "あの店は 安いです。",
        "exampleSentenceReading": "あのみせは やすいです。",
        "exampleSentenceMeaning": "Cửa hàng kia giá rẻ.",
        "dictionaryForm": ""
      },
      {
        "id": 634,
        "word": "レストラン",
        "reading": "レストラン",
        "romaji": "resutoran",
        "meaning": "Nhà hàng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "レストランで 食事します。",
        "exampleSentenceReading": "れすとらんで しょくじします。",
        "exampleSentenceMeaning": "Tôi ăn uống ở nhà hàng.",
        "dictionaryForm": ""
      },
      {
        "id": 635,
        "word": "庭",
        "reading": "にわ",
        "romaji": "niwa",
        "meaning": "Khu vườn",
        "hanViet": "Đình",
        "type": "Danh từ",
        "exampleSentence": "きれいな 庭が あります。",
        "exampleSentenceReading": "きれいな にわが あります。",
        "exampleSentenceMeaning": "Có một khu vườn rất đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 636,
        "word": "宿題",
        "reading": "しゅくだい",
        "romaji": "shukudai",
        "meaning": "Bài tập về nhà",
        "hanViet": "Túc Đề",
        "type": "Danh từ",
        "exampleSentence": "宿題を しましたか。",
        "exampleSentenceReading": "しゅくだいを しましたか。",
        "exampleSentenceMeaning": "Bạn đã làm bài tập chưa?",
        "dictionaryForm": ""
      },
      {
        "id": 637,
        "word": "テニス",
        "reading": "テニス",
        "romaji": "tenisu",
        "meaning": "Quần vợt / Tennis",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "週末 テニスを します。",
        "exampleSentenceReading": "しゅうまつ てにすを します。",
        "exampleSentenceMeaning": "Cuối tuần tôi chơi tennis.",
        "dictionaryForm": ""
      },
      {
        "id": 638,
        "word": "サッカー",
        "reading": "サッカー",
        "romaji": "sakkaa",
        "meaning": "Bóng đá",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "サッカーを 見るのが 好きです。",
        "exampleSentenceReading": "さっかーを みるのが すきです。",
        "exampleSentenceMeaning": "Tôi thích xem bóng đá.",
        "dictionaryForm": ""
      },
      {
        "id": 639,
        "word": "お花見",
        "reading": "おはなみ",
        "romaji": "ohanami",
        "meaning": "Lễ hội ngắm hoa anh đào",
        "hanViet": "Hoa Kiến",
        "type": "Danh từ",
        "exampleSentence": "春 公園で お花見を します。",
        "exampleSentenceReading": "はる こうえんで おはなみを します。",
        "exampleSentenceMeaning": "Mùa xuân đi ngắm hoa anh đào ở công viên.",
        "dictionaryForm": ""
      },
      {
        "id": 640,
        "word": "一緒に",
        "reading": "いっしょに",
        "romaji": "isshoni",
        "meaning": "Cùng nhau",
        "hanViet": "Nhất Tự",
        "type": "Phó từ",
        "exampleSentence": "一緒に 行きましょう。",
        "exampleSentenceReading": "いっしょに いきましょう。",
        "exampleSentenceMeaning": "Cùng đi nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 641,
        "word": "ちょっと",
        "reading": "ちょっと",
        "romaji": "chotto",
        "meaning": "Một chút / Một lát",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "ちょっと 待ってください。",
        "exampleSentenceReading": "ちょっと まってください。",
        "exampleSentenceMeaning": "Xin hãy đợi một lát.",
        "dictionaryForm": ""
      },
      {
        "id": 642,
        "word": "いつも",
        "reading": "いつも",
        "romaji": "itsumo",
        "meaning": "Luôn luôn / Lúc nào cũng",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "いつも ここで 買います。",
        "exampleSentenceReading": "いつも ここで かいます。",
        "exampleSentenceMeaning": "Tôi luôn mua hàng ở đây.",
        "dictionaryForm": ""
      },
      {
        "id": 643,
        "word": "時々",
        "reading": "ときどき",
        "romaji": "tokidoki",
        "meaning": "Thỉnh thoảng / Đôi khi",
        "hanViet": "Thời",
        "type": "Phó từ",
        "exampleSentence": "時々 映画を 見ます。",
        "exampleSentenceReading": "ときどき えいがを みます。",
        "exampleSentenceMeaning": "Thỉnh thoảng tôi có xem phim.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "N を V (Tác động lên đối tượng)",
        "pattern": "Danh từ + を + Động từ",
        "explanation": "Trợ từ を (phát âm là 'o') đứng sau danh từ chỉ tân ngữ chịu tác động trực tiếp của ngoại động từ.",
        "examples": [
          {
            "japanese": "ジュースを 飲みます。",
            "reading": "じゅーすを のみます。",
            "vietnamese": "Tôi uống nước hoa quả."
          },
          {
            "japanese": "本を 読みます。",
            "reading": "ほんを よみます。",
            "vietnamese": "Tôi đọc sách."
          }
        ]
      },
      {
        "title": "N(địa điểm) で V (Địa điểm xảy ra hành động)",
        "pattern": "Địa điểm + で + Hành động",
        "explanation": "Trợ từ で chỉ nơi chốn xảy ra hành động (khác với に chỉ nơi tồn tại).",
        "examples": [
          {
            "japanese": "図書館で 勉強します。",
            "reading": "としょかんで べんきょうします。",
            "vietnamese": "Học bài ở thư viện."
          },
          {
            "japanese": "レストランで ご飯を 食べました。",
            "reading": "れすとらんで ごはんを たべました。",
            "vietnamese": "Tôi đã ăn cơm ở nhà hàng."
          }
        ]
      },
      {
        "title": "Vませんか (Mời mọc / Rủ rê)",
        "pattern": "Vます(bỏ ます) + ませんか",
        "explanation": "Dùng để rủ rê, mời mọc đối phương cùng làm một việc gì đó với thái độ tôn trọng ý kiến của người nghe.",
        "examples": [
          {
            "japanese": "いっしょに 京都へ 行きませんか。ー ええ、行きましょう。",
            "reading": "いっしょに きょうとへ いきませんか。ー ええ、いきましょう。",
            "vietnamese": "Cùng đi Kyoto với tôi không? - Vâng, cùng đi nào!"
          }
        ]
      },
      {
        "title": "Vましょう (Cùng làm nhé / Đề nghị làm)",
        "pattern": "Vます(bỏ ます) + ましょう",
        "explanation": "Dùng khi người nói chủ động đề xuất cùng làm gì đó hoặc đồng ý lời mời.",
        "examples": [
          {
            "japanese": "ちょっと 休みましょう。",
            "reading": "ちょっと やすみましょう。",
            "vietnamese": "Chúng ta cùng nghỉ một chút nào."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 7,
    "title": "Bài 7: Công cụ, Phương tiện & Cho/Nhận",
    "japaneseTitle": "第７課：あげます・もらいます",
    "description": "Trợ từ で chỉ phương tiện công cụ, hành động cho あげます và nhận もらいます, trạng thái đã làm xong もう Vました.",
    "vocabularies": [
      {
        "id": 701,
        "word": "切ります",
        "reading": "きります",
        "romaji": "kirimasu",
        "meaning": "Cắt / Gọt",
        "hanViet": "Thiết",
        "type": "Động từ nhóm 1",
        "exampleSentence": "はさみで 紙を 切ります。",
        "exampleSentenceReading": "はさみで かみを きります。",
        "exampleSentenceMeaning": "Tôi dùng kéo cắt giấy.",
        "dictionaryForm": "切る (きる)"
      },
      {
        "id": 702,
        "word": "送ります",
        "reading": "おくります",
        "romaji": "okurimasu",
        "meaning": "Gửi (hàng, thư)",
        "hanViet": "Tống",
        "type": "Động từ nhóm 1",
        "exampleSentence": "荷物を 送ります。",
        "exampleSentenceReading": "にもつを おくります。",
        "exampleSentenceMeaning": "Tôi gửi kiện hàng.",
        "dictionaryForm": "送る (おくる)"
      },
      {
        "id": 703,
        "word": "あげます",
        "reading": "あげます",
        "romaji": "agemasu",
        "meaning": "Tặng / Cho (ai đó cái gì)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "友達に プレゼントを あげました。",
        "exampleSentenceReading": "ともだちに ぷれぜんとを あげました。",
        "exampleSentenceMeaning": "Tôi đã tặng quà cho bạn.",
        "dictionaryForm": "あげる"
      },
      {
        "id": 704,
        "word": "もらいます",
        "reading": "もらいます",
        "romaji": "moraimasu",
        "meaning": "Nhận (từ ai đó)",
        "hanViet": "",
        "type": "Động từ nhóm 1",
        "exampleSentence": "母に 花を もらいました。",
        "exampleSentenceReading": "ははに はなを もらいました。",
        "exampleSentenceMeaning": "Tôi đã nhận hoa từ mẹ.",
        "dictionaryForm": "もらう"
      },
      {
        "id": 705,
        "word": "貸します",
        "reading": "かします",
        "romaji": "kashimasu",
        "meaning": "Cho mượn / Cho vay",
        "hanViet": "Thải",
        "type": "Động từ nhóm 1",
        "exampleSentence": "友達に お金を 貸しました。",
        "exampleSentenceReading": "ともだちに おかねを かしました。",
        "exampleSentenceMeaning": "Tôi đã cho bạn mượn tiền.",
        "dictionaryForm": "貸す (かす)"
      },
      {
        "id": 706,
        "word": "借ります",
        "reading": "かります",
        "romaji": "karimasu",
        "meaning": "Mượn / Vay",
        "hanViet": "Tá",
        "type": "Động từ nhóm 2",
        "exampleSentence": "図書館で 本を 借ります。",
        "exampleSentenceReading": "としょかんで ほんを かります。",
        "exampleSentenceMeaning": "Tôi mượn sách ở thư viện.",
        "dictionaryForm": "借りる (かりる)"
      },
      {
        "id": 707,
        "word": "教えます",
        "reading": "おしえます",
        "romaji": "oshiemasu",
        "meaning": "Dạy học / Chỉ bảo",
        "hanViet": "Giáo",
        "type": "Động từ nhóm 2",
        "exampleSentence": "日本語を 教えます。",
        "exampleSentenceReading": "にほんごを おしえます。",
        "exampleSentenceMeaning": "Tôi dạy tiếng Nhật.",
        "dictionaryForm": "教える (おしえる)"
      },
      {
        "id": 708,
        "word": "習います",
        "reading": "ならいます",
        "romaji": "naraimasu",
        "meaning": "Học (từ ai đó)",
        "hanViet": "Tập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "先生に ピアノを 習います。",
        "exampleSentenceReading": "せんせいに ぴあのを ならいます。",
        "exampleSentenceMeaning": "Tôi học piano từ thầy giáo.",
        "dictionaryForm": "習う (ならう)"
      },
      {
        "id": 709,
        "word": "かけます",
        "reading": "かけます",
        "romaji": "kakemasu",
        "meaning": "Gọi (điện thoại)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "電話を かけます。",
        "exampleSentenceReading": "でんわを かけます。",
        "exampleSentenceMeaning": "Tôi gọi điện thoại.",
        "dictionaryForm": "かける"
      },
      {
        "id": 710,
        "word": "手",
        "reading": "て",
        "romaji": "te",
        "meaning": "Bàn tay / Tay",
        "hanViet": "Thủ",
        "type": "Danh từ",
        "exampleSentence": "手を 洗います。",
        "exampleSentenceReading": "てを あらいます。",
        "exampleSentenceMeaning": "Tôi rửa tay.",
        "dictionaryForm": ""
      },
      {
        "id": 711,
        "word": "箸",
        "reading": "はし",
        "romaji": "hashi",
        "meaning": "Đũa / Đôi đũa",
        "hanViet": "Trợ",
        "type": "Danh từ",
        "exampleSentence": "はしで 食べます。",
        "exampleSentenceReading": "はしで たべます。",
        "exampleSentenceMeaning": "Tôi ăn bằng đũa.",
        "dictionaryForm": ""
      },
      {
        "id": 712,
        "word": "スプーン",
        "reading": "スプーン",
        "romaji": "supuun",
        "meaning": "Cái thìa / muỗng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "スプーンで カレーを 食べます。",
        "exampleSentenceReading": "すぷーんで かれーを たべます。",
        "exampleSentenceMeaning": "Tôi ăn cà ri bằng thìa.",
        "dictionaryForm": ""
      },
      {
        "id": 713,
        "word": "ナイフ",
        "reading": "ナイフ",
        "romaji": "naifu",
        "meaning": "Con dao",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ナイフで 肉を 切ります。",
        "exampleSentenceReading": "ないふで にくを きります。",
        "exampleSentenceMeaning": "Tôi cắt thịt bằng dao.",
        "dictionaryForm": ""
      },
      {
        "id": 714,
        "word": "フォーク",
        "reading": "フォーク",
        "romaji": "fooku",
        "meaning": "Cái dĩa / nĩa",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "フォークを 使います。",
        "exampleSentenceReading": "ふぉーくを つかいます。",
        "exampleSentenceMeaning": "Tôi dùng dĩa.",
        "dictionaryForm": ""
      },
      {
        "id": 715,
        "word": "はさみ",
        "reading": "はさみ",
        "romaji": "hasami",
        "meaning": "Cái kéo",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "はさみで 切ってください。",
        "exampleSentenceReading": "はさみで きってください。",
        "exampleSentenceMeaning": "Xin hãy cắt bằng kéo.",
        "dictionaryForm": ""
      },
      {
        "id": 716,
        "word": "パソコン",
        "reading": "パソコン",
        "romaji": "pasokon",
        "meaning": "Máy tính cá nhân (laptop/PC)",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "パソコンで メールを 書きます。",
        "exampleSentenceReading": "ぱそこんで めーるを かきます。",
        "exampleSentenceMeaning": "Tôi viết email bằng máy tính.",
        "dictionaryForm": ""
      },
      {
        "id": 717,
        "word": "ケータイ",
        "reading": "ケータイ",
        "romaji": "keetai",
        "meaning": "Điện thoại di động",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ケータイを 忘れました。",
        "exampleSentenceReading": "けーたいを わすれました。",
        "exampleSentenceMeaning": "Tôi để quên điện thoại rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 718,
        "word": "メール",
        "reading": "メール",
        "romaji": "meeru",
        "meaning": "Thư điện tử / Email",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "メールを 送りました。",
        "exampleSentenceReading": "めーるを おくりました。",
        "exampleSentenceMeaning": "Tôi đã gửi email.",
        "dictionaryForm": ""
      },
      {
        "id": 719,
        "word": "年賀状",
        "reading": "ねんがじょう",
        "romaji": "nengajou",
        "meaning": "Thiệp chúc tết",
        "hanViet": "Niên Hạ Trạng",
        "type": "Danh từ",
        "exampleSentence": "友達に 年賀状を 送ります。",
        "exampleSentenceReading": "ともだちに ねんがじょうを おくります。",
        "exampleSentenceMeaning": "Tôi gửi thiệp chúc tết cho bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 720,
        "word": "消しゴム",
        "reading": "けしゴム",
        "romaji": "keshigomu",
        "meaning": "Cục tẩy / Cục gôm",
        "hanViet": "Tiêu",
        "type": "Danh từ",
        "exampleSentence": "消しゴムを 貸してください。",
        "exampleSentenceReading": "けしごむを かしてください。",
        "exampleSentenceMeaning": "Cho tôi mượn cục tẩy với.",
        "dictionaryForm": ""
      },
      {
        "id": 721,
        "word": "紙",
        "reading": "かみ",
        "romaji": "kami",
        "meaning": "Giấy / Tờ giấy",
        "hanViet": "Chỉ",
        "type": "Danh từ",
        "exampleSentence": "紙に 名前を 書きます。",
        "exampleSentenceReading": "かみに なまえを かきます。",
        "exampleSentenceMeaning": "Viết tên lên giấy.",
        "dictionaryForm": ""
      },
      {
        "id": 722,
        "word": "花",
        "reading": "はな",
        "romaji": "hana",
        "meaning": "Bông hoa",
        "hanViet": "Hoa",
        "type": "Danh từ",
        "exampleSentence": "きれいな 花を 買いました。",
        "exampleSentenceReading": "きれいな はなを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua những bông hoa đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 723,
        "word": "シャツ",
        "reading": "シャツ",
        "romaji": "shatsu",
        "meaning": "Áo sơ mi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "白い シャツを 着ます。",
        "exampleSentenceReading": "しろい しゃつを きます。",
        "exampleSentenceMeaning": "Tôi mặc áo sơ mi trắng.",
        "dictionaryForm": ""
      },
      {
        "id": 724,
        "word": "プレゼント",
        "reading": "プレゼント",
        "romaji": "purezento",
        "meaning": "Món quà",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "誕生日の プレゼントです。",
        "exampleSentenceReading": "たんじょうびの ぷれぜんとです。",
        "exampleSentenceMeaning": "Đây là quà sinh nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 725,
        "word": "荷物",
        "reading": "にもつ",
        "romaji": "nimotsu",
        "meaning": "Hành lý / Kiện hàng",
        "hanViet": "Hà Vật",
        "type": "Danh từ",
        "exampleSentence": "荷物を 持ちます。",
        "exampleSentenceReading": "にもつを もちます。",
        "exampleSentenceMeaning": "Tôi xách hành lý.",
        "dictionaryForm": ""
      },
      {
        "id": 726,
        "word": "お金",
        "reading": "おかね",
        "romaji": "okane",
        "meaning": "Tiền bạc",
        "hanViet": "Kim",
        "type": "Danh từ",
        "exampleSentence": "お金が ありません。",
        "exampleSentenceReading": "おかねが ありません。",
        "exampleSentenceMeaning": "Tôi không có tiền.",
        "dictionaryForm": ""
      },
      {
        "id": 727,
        "word": "切符",
        "reading": "きっぷ",
        "romaji": "kippu",
        "meaning": "Vé (tàu, xe)",
        "hanViet": "Thiết Phù",
        "type": "Danh từ",
        "exampleSentence": "電車の 切符を 買います。",
        "exampleSentenceReading": "でんしゃの きっぷを かいます。",
        "exampleSentenceMeaning": "Tôi mua vé tàu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 728,
        "word": "クリスマス",
        "reading": "クリスマス",
        "romaji": "kurisumasu",
        "meaning": "Lễ Giáng sinh / Noel",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "クリスマスに パーティーを します。",
        "exampleSentenceReading": "くりすますに ぱーてぃーを します。",
        "exampleSentenceMeaning": "Tổ chức tiệc vào lễ Giáng sinh.",
        "dictionaryForm": ""
      },
      {
        "id": 729,
        "word": "父",
        "reading": "ちち",
        "romaji": "chichi",
        "meaning": "Bố (của mình)",
        "hanViet": "Phụ",
        "type": "Danh từ",
        "exampleSentence": "父は 会社員です。",
        "exampleSentenceReading": "ちちは かいしゃいんです。",
        "exampleSentenceMeaning": "Bố tôi là nhân viên công ty.",
        "dictionaryForm": ""
      },
      {
        "id": 730,
        "word": "母",
        "reading": "はは",
        "romaji": "haha",
        "meaning": "Mẹ (của mình)",
        "hanViet": "Mẫu",
        "type": "Danh từ",
        "exampleSentence": "母は 優しいです。",
        "exampleSentenceReading": "ははは やさしいです。",
        "exampleSentenceMeaning": "Mẹ tôi rất hiền.",
        "dictionaryForm": ""
      },
      {
        "id": 731,
        "word": "お父さん",
        "reading": "おとうさん",
        "romaji": "otousan",
        "meaning": "Bố (người khác / gọi bố mình)",
        "hanViet": "Phụ",
        "type": "Danh từ",
        "exampleSentence": "お父さんは お元気ですか。",
        "exampleSentenceReading": "おとうさんは おげんきですか。",
        "exampleSentenceMeaning": "Bác trai có khỏe không ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 732,
        "word": "お母さん",
        "reading": "おかあさん",
        "romaji": "okaasan",
        "meaning": "Mẹ (người khác / gọi mẹ mình)",
        "hanViet": "Mẫu",
        "type": "Danh từ",
        "exampleSentence": "お母さんの 料理は おいしいです。",
        "exampleSentenceReading": "おかあさんの りょうりは おいしいです。",
        "exampleSentenceMeaning": "Món ăn mẹ nấu rất ngon.",
        "dictionaryForm": ""
      },
      {
        "id": 733,
        "word": "もう",
        "reading": "もう",
        "romaji": "mou",
        "meaning": "Đã... rồi",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "もう 昼ご飯を 食べました。",
        "exampleSentenceReading": "もう ひるごはんを たべました。",
        "exampleSentenceMeaning": "Tôi đã ăn trưa rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 734,
        "word": "まだ",
        "reading": "まだ",
        "romaji": "mada",
        "meaning": "Chưa / Vẫn chưa",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "いいえ、まだです。",
        "exampleSentenceReading": "いいえ、まだです。",
        "exampleSentenceMeaning": "Chưa, tôi vẫn chưa làm.",
        "dictionaryForm": ""
      },
      {
        "id": 735,
        "word": "これから",
        "reading": "これから",
        "romaji": "korekara",
        "meaning": "Từ bây giờ",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "これから 勉強します。",
        "exampleSentenceReading": "これから べんきょうします。",
        "exampleSentenceMeaning": "Từ bây giờ tôi sẽ học bài.",
        "dictionaryForm": ""
      },
      {
        "id": 736,
        "word": "電話をかけます",
        "reading": "でんわをかけます",
        "romaji": "denwa o kakemasu",
        "meaning": "Gọi điện thoại",
        "hanViet": "Điện Thoại",
        "type": "Động từ nhóm 2",
        "exampleSentence": "家族に 電話を かけます。",
        "exampleSentenceReading": "かぞくに でんわを かけます。",
        "exampleSentenceMeaning": "Gọi điện thoại cho gia đình.",
        "dictionaryForm": "電話をかける (でんわをかける)"
      }
    ],
    "grammarPoints": [
      {
        "title": "N(công cụ/phương tiện) で V",
        "pattern": "Công cụ + で + Hành động",
        "explanation": "Trợ từ で chỉ phương tiện, công cụ hoặc ngôn ngữ dùng để thực hiện hành động.",
        "examples": [
          {
            "japanese": "日本語で レポートを 書きます。",
            "reading": "にほんごで れぽーとを かきます。",
            "vietnamese": "Tôi viết báo cáo bằng tiếng Nhật."
          },
          {
            "japanese": "はさみで 切ります。",
            "reading": "はさみで きります。",
            "vietnamese": "Cắt bằng kéo."
          }
        ]
      },
      {
        "title": "N(người) に あげます (Tặng cho ai)",
        "pattern": "Người nhận + に + N + を + あげます",
        "explanation": "Người nói tặng đồ vật cho người khác (hoặc người khác tặng cho người thứ 3). Không dùng cho việc người khác tặng cho bản thân mình.",
        "examples": [
          {
            "japanese": "わたしは 木村さんに 花を あげました。",
            "reading": "わたしは きむらさんに はなを あげました。",
            "vietnamese": "Tôi đã tặng hoa cho chị Kimura."
          }
        ]
      },
      {
        "title": "N(người) に もらいます (Nhận từ ai)",
        "pattern": "Người cho + に／から + N + を + もらいます",
        "explanation": "Người nói nhận được món đồ hoặc sự giúp đỡ từ người khác.",
        "examples": [
          {
            "japanese": "わたしは 山田さんに 辞書を もらいました。",
            "reading": "わたしは やまださんに じしょを もらいました。",
            "vietnamese": "Tôi đã nhận cuốn từ điển từ anh Yamada."
          }
        ]
      },
      {
        "title": "もう Vました (Đã làm xong rồi)",
        "pattern": "もう + Vました",
        "explanation": "Diễn tả hành động đã hoàn tất tại thời điểm nói. Nếu chưa xong, trả lời bằng: いいえ、まだです (Chưa, vẫn chưa).",
        "examples": [
          {
            "japanese": "もう 荷物を 送りましたか。ー はい、もう 送りました。",
            "reading": "もう にもつを おくりましたか。ー はい、もう おくりました。",
            "vietnamese": "Bạn đã gửi hành lý chưa? - Vâng, tôi đã gửi rồi."
          },
          {
            "japanese": "もう 昼ご飯を 食べましたか。ー いいえ、まだです。",
            "reading": "もう ひるごはんを たべましたか。ー いいえ、まだです。",
            "vietnamese": "Bạn đã ăn trưa chưa? - Chưa, tôi chưa ăn."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 8,
    "title": "Bài 8: Tính từ đuôi な và い",
    "japaneseTitle": "第８課：形容詞",
    "description": "Tính từ trong tiếng Nhật (đuôi い và な), cách bổ nghĩa danh từ, phó từ とても / あまり, câu hỏi どんな N.",
    "vocabularies": [
      {
        "id": 801,
        "word": "ハンサム[な]",
        "reading": "ハンサム[な]",
        "romaji": "hansamu[na]",
        "meaning": "Đẹp trai",
        "hanViet": "",
        "type": "Tính từ -na",
        "exampleSentence": "ミラーさんは ハンサムです。",
        "exampleSentenceReading": "みらーさんは はんさむです。",
        "exampleSentenceMeaning": "Anh Miller rất đẹp trai.",
        "dictionaryForm": ""
      },
      {
        "id": 802,
        "word": "きれい[な]",
        "reading": "きれい[な]",
        "romaji": "kirei[na]",
        "meaning": "Đẹp / Sạch sẽ",
        "hanViet": "",
        "type": "Tính từ -na",
        "exampleSentence": "京都は きれいな 町です。",
        "exampleSentenceReading": "きょうとは きれいな まちです。",
        "exampleSentenceMeaning": "Kyoto là thành phố xinh đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 803,
        "word": "静か[な]",
        "reading": "しずか[な]",
        "romaji": "shizuka[na]",
        "meaning": "Yên tĩnh / Thanh bình",
        "hanViet": "Tĩnh",
        "type": "Tính từ -na",
        "exampleSentence": "図書館は 静かです。",
        "exampleSentenceReading": "としょかんは しずかです。",
        "exampleSentenceMeaning": "Thư viện rất yên tĩnh.",
        "dictionaryForm": ""
      },
      {
        "id": 804,
        "word": "にぎやか[な]",
        "reading": "にぎやか[な]",
        "romaji": "nigiyaka[na]",
        "meaning": "Náo nhiệt / Nhộn nhịp",
        "hanViet": "",
        "type": "Tính từ -na",
        "exampleSentence": "東京は にぎやかな 町です。",
        "exampleSentenceReading": "とうきょうは にぎやかな まちです。",
        "exampleSentenceMeaning": "Tokyo là thành phố nhộn nhịp.",
        "dictionaryForm": ""
      },
      {
        "id": 805,
        "word": "有名[な]",
        "reading": "ゆうめい[な]",
        "romaji": "yuumei[na]",
        "meaning": "Nổi tiếng",
        "hanViet": "Hữu Danh",
        "type": "Tính từ -na",
        "exampleSentence": "富士山は 有名です。",
        "exampleSentenceReading": "ふじさんは ゆうめいです。",
        "exampleSentenceMeaning": "Núi Phú Sĩ rất nổi tiếng.",
        "dictionaryForm": ""
      },
      {
        "id": 806,
        "word": "親切[な]",
        "reading": "しんせつ[な]",
        "romaji": "shinsetsu[na]",
        "meaning": "Thân thiện / Tốt bụng",
        "hanViet": "Thân Thiết",
        "type": "Tính từ -na",
        "exampleSentence": "先生は とても 親切です。",
        "exampleSentenceReading": "せんせいは とても しんせつです。",
        "exampleSentenceMeaning": "Thầy giáo rất tốt bụng.",
        "dictionaryForm": ""
      },
      {
        "id": 807,
        "word": "元気[な]",
        "reading": "げんき[な]",
        "romaji": "genki[na]",
        "meaning": "Khỏe mạnh / Tràn đầy sức sống",
        "hanViet": "Nguyên Khí",
        "type": "Tính từ -na",
        "exampleSentence": "お元気ですか。はい、元気です。",
        "exampleSentenceReading": "おげんきですか。はい、げんきです。",
        "exampleSentenceMeaning": "Bạn có khỏe không? Vâng, tôi khỏe.",
        "dictionaryForm": ""
      },
      {
        "id": 808,
        "word": "暇[な]",
        "reading": "ひま[な]",
        "romaji": "hima[na]",
        "meaning": "Rảnh rỗi",
        "hanViet": "Hạ",
        "type": "Tính từ -na",
        "exampleSentence": "明日は 暇ですか。",
        "exampleSentenceReading": "あしたは ひまですか。",
        "exampleSentenceMeaning": "Ngày mai bạn có rảnh không?",
        "dictionaryForm": ""
      },
      {
        "id": 809,
        "word": "便利[な]",
        "reading": "べんり[な]",
        "romaji": "benri[na]",
        "meaning": "Tiện lợi / Thuận tiện",
        "hanViet": "Tiện Lợi",
        "type": "Tính từ -na",
        "exampleSentence": "地下鉄は とても 便利です。",
        "exampleSentenceReading": "ちかてつは とても べんりです。",
        "exampleSentenceMeaning": "Tàu điện ngầm rất tiện lợi.",
        "dictionaryForm": ""
      },
      {
        "id": 810,
        "word": "すてき[な]",
        "reading": "すてき[な]",
        "romaji": "suteki[na]",
        "meaning": "Tuyệt vời / Đẹp đẽ",
        "hanViet": "",
        "type": "Tính từ -na",
        "exampleSentence": "すてきな シャツですね。",
        "exampleSentenceReading": "すてきな しゃつですね。",
        "exampleSentenceMeaning": "Chiếc áo sơ mi tuyệt quá nhỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 811,
        "word": "大きい",
        "reading": "おおきい",
        "romaji": "ookii",
        "meaning": "To lớn",
        "hanViet": "Đại",
        "type": "Tính từ -i",
        "exampleSentence": "大きい 家に 住みたいです。",
        "exampleSentenceReading": "おおきい いえに すみたいです。",
        "exampleSentenceMeaning": "Tôi muốn sống trong ngôi nhà to lớn.",
        "dictionaryForm": ""
      },
      {
        "id": 812,
        "word": "小さい",
        "reading": "ちいさい",
        "romaji": "chiisai",
        "meaning": "Nhỏ bé",
        "hanViet": "Tiểu",
        "type": "Tính từ -i",
        "exampleSentence": "小さい 車を 買いました。",
        "exampleSentenceReading": "ちいさい くるまを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua một chiếc xe nhỏ.",
        "dictionaryForm": ""
      },
      {
        "id": 813,
        "word": "新しい",
        "reading": "あたらしい",
        "romaji": "atarashii",
        "meaning": "Mới",
        "hanViet": "Tân",
        "type": "Tính từ -i",
        "exampleSentence": "新しい 本を 読みます。",
        "exampleSentenceReading": "あたらしい ほんを よみます。",
        "exampleSentenceMeaning": "Tôi đọc quyển sách mới.",
        "dictionaryForm": ""
      },
      {
        "id": 814,
        "word": "古い",
        "reading": "ふるい",
        "romaji": "furui",
        "meaning": "Cũ / Cổ kính",
        "hanViet": "Cổ",
        "type": "Tính từ -i",
        "exampleSentence": "古い お寺を 見ました。",
        "exampleSentenceReading": "ふるい おてらを みました。",
        "exampleSentenceMeaning": "Tôi đã ngắm nhìn ngôi chùa cổ.",
        "dictionaryForm": ""
      },
      {
        "id": 815,
        "word": "いい / よい",
        "reading": "いい / よい",
        "romaji": "ii / yoi",
        "meaning": "Tốt / Hay",
        "hanViet": "Lương",
        "type": "Tính từ -i",
        "exampleSentence": "今日は いい天気です。",
        "exampleSentenceReading": "きょうは いいてんきです。",
        "exampleSentenceMeaning": "Hôm nay thời tiết tốt thật.",
        "dictionaryForm": ""
      },
      {
        "id": 816,
        "word": "悪い",
        "reading": "わるい",
        "romaji": "warui",
        "meaning": "Xấu / Tồi tệ",
        "hanViet": "Ác",
        "type": "Tính từ -i",
        "exampleSentence": "気分が 悪いです。",
        "exampleSentenceReading": "きぶんが わるいです。",
        "exampleSentenceMeaning": "Tâm trạng tôi không tốt.",
        "dictionaryForm": ""
      },
      {
        "id": 817,
        "word": "暑い",
        "reading": "あつい",
        "romaji": "atsui",
        "meaning": "Nóng (thời tiết)",
        "hanViet": "Thử",
        "type": "Tính từ -i",
        "exampleSentence": "夏は とても 暑いです。",
        "exampleSentenceReading": "なつは とても あついです。",
        "exampleSentenceMeaning": "Mùa hè rất nóng.",
        "dictionaryForm": ""
      },
      {
        "id": 818,
        "word": "熱い",
        "reading": "あつい",
        "romaji": "atsui",
        "meaning": "Nóng (nước, đồ ăn)",
        "hanViet": "Nhiệt",
        "type": "Tính từ -i",
        "exampleSentence": "熱い お茶を 飲みます。",
        "exampleSentenceReading": "あつい おちゃを のみます。",
        "exampleSentenceMeaning": "Tôi uống trà nóng.",
        "dictionaryForm": ""
      },
      {
        "id": 819,
        "word": "寒い",
        "reading": "さむい",
        "romaji": "samui",
        "meaning": "Lạnh / Rét (thời tiết)",
        "hanViet": "Hàn",
        "type": "Tính từ -i",
        "exampleSentence": "冬は 寒いです。",
        "exampleSentenceReading": "ふゆは さむいです。",
        "exampleSentenceMeaning": "Mùa đông rất lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 820,
        "word": "冷たい",
        "reading": "つめたい",
        "romaji": "tsumetai",
        "meaning": "Lạnh / Mát (đồ vật, nước)",
        "hanViet": "Lãnh",
        "type": "Tính từ -i",
        "exampleSentence": "冷たい 水を ください。",
        "exampleSentenceReading": "つめたい みずを ください。",
        "exampleSentenceMeaning": "Cho tôi nước lạnh nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 821,
        "word": "難しい",
        "reading": "むずかしい",
        "romaji": "muzukashii",
        "meaning": "Khó khăn",
        "hanViet": "Nan",
        "type": "Tính từ -i",
        "exampleSentence": "漢字は 難しいです。",
        "exampleSentenceReading": "かんじは むずかしいです。",
        "exampleSentenceMeaning": "Chữ Hán rất khó.",
        "dictionaryForm": ""
      },
      {
        "id": 822,
        "word": "易しい",
        "reading": "やさしい",
        "romaji": "yasashii",
        "meaning": "Dễ dàng / Đơn giản",
        "hanViet": "Dịch",
        "type": "Tính từ -i",
        "exampleSentence": "このテストは 易しいです。",
        "exampleSentenceReading": "このてすとは やさしいです。",
        "exampleSentenceMeaning": "Bài kiểm tra này dễ.",
        "dictionaryForm": ""
      },
      {
        "id": 823,
        "word": "高い",
        "reading": "たかい",
        "romaji": "takai",
        "meaning": "Đắt / Cao",
        "hanViet": "Cao",
        "type": "Tính từ -i",
        "exampleSentence": "この時計は 高いです。",
        "exampleSentenceReading": "このとけいは たかいです。",
        "exampleSentenceMeaning": "Chiếc đồng hồ này đắt tiền.",
        "dictionaryForm": ""
      },
      {
        "id": 824,
        "word": "安い",
        "reading": "やすい",
        "romaji": "yasui",
        "meaning": "Rẻ",
        "hanViet": "An",
        "type": "Tính từ -i",
        "exampleSentence": "このスーパーは 安いです。",
        "exampleSentenceReading": "このすーぱーは やすいです。",
        "exampleSentenceMeaning": "Siêu thị này giá rẻ.",
        "dictionaryForm": ""
      },
      {
        "id": 825,
        "word": "低い",
        "reading": "ひくい",
        "romaji": "hikui",
        "meaning": "Thấp",
        "hanViet": "Đê",
        "type": "Tính từ -i",
        "exampleSentence": "あの山は 低いです。",
        "exampleSentenceReading": "あのやまは ひくいです。",
        "exampleSentenceMeaning": "Ngọn núi kia thấp.",
        "dictionaryForm": ""
      },
      {
        "id": 826,
        "word": "おもしろい",
        "reading": "おもしろい",
        "romaji": "omoshiroi",
        "meaning": "Thú vị / Hay ho",
        "hanViet": "Diện Bạch",
        "type": "Tính từ -i",
        "exampleSentence": "日本の アニメは おもしろいです。",
        "exampleSentenceReading": "にほんの あにめは おもしろいです。",
        "exampleSentenceMeaning": "Anime Nhật Bản rất thú vị.",
        "dictionaryForm": ""
      },
      {
        "id": 827,
        "word": "おいしい",
        "reading": "おいしい",
        "romaji": "oishii",
        "meaning": "Ngon miệng",
        "hanViet": "Mỹ Vị",
        "type": "Tính từ -i",
        "exampleSentence": "寿司は とても おいしいです。",
        "exampleSentenceReading": "すしは とても おいしいです。",
        "exampleSentenceMeaning": "Sushi rất ngon.",
        "dictionaryForm": ""
      },
      {
        "id": 828,
        "word": "忙しい",
        "reading": "いそがしい",
        "romaji": "isogashii",
        "meaning": "Bận rộn",
        "hanViet": "Mang",
        "type": "Tính từ -i",
        "exampleSentence": "今週は 忙しいです。",
        "exampleSentenceReading": "こんしゅうは いそがしいです。",
        "exampleSentenceMeaning": "Tuần này tôi rất bận.",
        "dictionaryForm": ""
      },
      {
        "id": 829,
        "word": "楽しい",
        "reading": "たのしい",
        "romaji": "tanoshii",
        "meaning": "Vui vẻ / Thú vị",
        "hanViet": "Lạc",
        "type": "Tính từ -i",
        "exampleSentence": "旅行は 楽しかったです。",
        "exampleSentenceReading": "りょこうは たのしかったです。",
        "exampleSentenceMeaning": "Chuyến du lịch đã rất vui.",
        "dictionaryForm": ""
      },
      {
        "id": 830,
        "word": "白い",
        "reading": "しろい",
        "romaji": "shiroi",
        "meaning": "Màu trắng",
        "hanViet": "Bạch",
        "type": "Tính từ -i",
        "exampleSentence": "白い シャツを 買いました。",
        "exampleSentenceReading": "しろい しゃつを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua áo sơ mi trắng.",
        "dictionaryForm": ""
      },
      {
        "id": 831,
        "word": "黒い",
        "reading": "くろい",
        "romaji": "kuroi",
        "meaning": "Màu đen",
        "hanViet": "Hắc",
        "type": "Tính từ -i",
        "exampleSentence": "黒い 靴を 履きます。",
        "exampleSentenceReading": "くろい くつを はきます。",
        "exampleSentenceMeaning": "Tôi đi giày màu đen.",
        "dictionaryForm": ""
      },
      {
        "id": 832,
        "word": "赤い",
        "reading": "あかい",
        "romaji": "akai",
        "meaning": "Màu đỏ",
        "hanViet": "Xích",
        "type": "Tính từ -i",
        "exampleSentence": "赤い りんごを 食べます。",
        "exampleSentenceReading": "あかい りんごを たべます。",
        "exampleSentenceMeaning": "Tôi ăn quả táo đỏ.",
        "dictionaryForm": ""
      },
      {
        "id": 833,
        "word": "青い",
        "reading": "あおい",
        "romaji": "aoi",
        "meaning": "Màu xanh da trời",
        "hanViet": "Thanh",
        "type": "Tính từ -i",
        "exampleSentence": "青い 空が きれいです。",
        "exampleSentenceReading": "あおい そらが きれいです。",
        "exampleSentenceMeaning": "Bầu trời xanh thật đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 834,
        "word": "桜",
        "reading": "さくら",
        "romaji": "sakura",
        "meaning": "Hoa anh đào",
        "hanViet": "Anh",
        "type": "Danh từ",
        "exampleSentence": "4月に 桜が 咲きます。",
        "exampleSentenceReading": "しがつに さくらが さきます。",
        "exampleSentenceMeaning": "Hoa anh đào nở vào tháng 4.",
        "dictionaryForm": ""
      },
      {
        "id": 835,
        "word": "山",
        "reading": "やま",
        "romaji": "yama",
        "meaning": "Ngọn núi",
        "hanViet": "Sơn",
        "type": "Danh từ",
        "exampleSentence": "富士山は 高い 山です。",
        "exampleSentenceReading": "ふじさんは たかい やまです。",
        "exampleSentenceMeaning": "Núi Phú Sĩ là ngọn núi cao.",
        "dictionaryForm": ""
      },
      {
        "id": 836,
        "word": "町",
        "reading": "まち",
        "romaji": "machi",
        "meaning": "Thị trấn / Thành phố",
        "hanViet": "Đinh",
        "type": "Danh từ",
        "exampleSentence": "静かな 町に 住んでいます。",
        "exampleSentenceReading": "しずかな まちに すんでいます。",
        "exampleSentenceMeaning": "Tôi sống ở một thị trấn yên bình.",
        "dictionaryForm": ""
      },
      {
        "id": 837,
        "word": "食べ物",
        "reading": "たべもの",
        "romaji": "tabemono",
        "meaning": "Đồ ăn / Thức ăn",
        "hanViet": "Thực Vật",
        "type": "Danh từ",
        "exampleSentence": "日本の 食べ物が 好きです。",
        "exampleSentenceReading": "にほんの たべものが すきです。",
        "exampleSentenceMeaning": "Tôi thích đồ ăn Nhật Bản.",
        "dictionaryForm": ""
      },
      {
        "id": 838,
        "word": "車",
        "reading": "くるま",
        "romaji": "kuruma",
        "meaning": "Xe ô tô",
        "hanViet": "Xa",
        "type": "Danh từ",
        "exampleSentence": "速い 車ですね。",
        "exampleSentenceReading": "はやい くるまですね。",
        "exampleSentenceMeaning": "Xe chạy nhanh nhỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 839,
        "word": "所",
        "reading": "ところ",
        "romaji": "tokoro",
        "meaning": "Nơi chốn / Chỗ",
        "hanViet": "Sở",
        "type": "Danh từ",
        "exampleSentence": "東京は にぎやかな 所です。",
        "exampleSentenceReading": "とうきょうは にぎやかな ところです。",
        "exampleSentenceMeaning": "Tokyo là một nơi náo nhiệt.",
        "dictionaryForm": ""
      },
      {
        "id": 840,
        "word": "寮",
        "reading": "りょう",
        "romaji": "ryou",
        "meaning": "Ký túc xá",
        "hanViet": "Liêu",
        "type": "Danh từ",
        "exampleSentence": "学校の 寮に 住んでいます。",
        "exampleSentenceReading": "がっこうの りょうに すんでいます。",
        "exampleSentenceMeaning": "Tôi sống ở ký túc xá trường.",
        "dictionaryForm": ""
      },
      {
        "id": 841,
        "word": "生活",
        "reading": "せいかつ",
        "romaji": "seikatsu",
        "meaning": "Cuộc sống / Sinh hoạt",
        "hanViet": "Sinh Hoạt",
        "type": "Danh từ",
        "exampleSentence": "日本の 生活は 楽しいです。",
        "exampleSentenceReading": "にほんの せいかつは たのしいです。",
        "exampleSentenceMeaning": "Cuộc sống ở Nhật rất vui.",
        "dictionaryForm": ""
      },
      {
        "id": 842,
        "word": "お仕事",
        "reading": "おしごと",
        "romaji": "oshigoto",
        "meaning": "Công việc (kính ngữ)",
        "hanViet": "Sĩ Sự",
        "type": "Danh từ",
        "exampleSentence": "お仕事は どうですか。",
        "exampleSentenceReading": "おしごとは どうですか。",
        "exampleSentenceMeaning": "Công việc của bạn dạo này thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 843,
        "word": "どう",
        "reading": "どう",
        "romaji": "dou",
        "meaning": "Thế nào / Ra sao",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "日本の 生活は どうですか。",
        "exampleSentenceReading": "にほんの せいかつは どうですか。",
        "exampleSentenceMeaning": "Cuộc sống ở Nhật thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 844,
        "word": "どんな～",
        "reading": "どんな～",
        "romaji": "donna-",
        "meaning": "Như thế nào (~ loại nào)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "ハノイは どんな 町ですか。",
        "exampleSentenceReading": "ハノイは どんな まちですか。",
        "exampleSentenceMeaning": "Hà Nội là thành phố như thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 845,
        "word": "とても",
        "reading": "とても",
        "romaji": "totemo",
        "meaning": "Rất / Lắm",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "とても おいしいです。",
        "exampleSentenceReading": "とても おいしいです。",
        "exampleSentenceMeaning": "Ngon lắm.",
        "dictionaryForm": ""
      },
      {
        "id": 846,
        "word": "あまり",
        "reading": "あまり",
        "romaji": "amari",
        "meaning": "Không... lắm (đi với phủ định)",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "あまり 寒くないです。",
        "exampleSentenceReading": "あまり さむくないです。",
        "exampleSentenceMeaning": "Không lạnh lắm.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Khẳng định & Phủ định tính từ",
        "pattern": "Tính từ -na: N じゃありません | Tính từ -i: Bỏ い + くないです",
        "explanation": "Tính từ đuôi な phủ định giống danh từ (じゃありません). Tính từ đuôi い phủ định bằng cách bỏ đuôi い thêm くないです.",
        "examples": [
          {
            "japanese": "この町は にぎやかじゃありません。",
            "reading": "このまちは にぎやかじゃありません。",
            "vietnamese": "Thành phố này không nhộn nhịp."
          },
          {
            "japanese": "この本は おもしろくないです。",
            "reading": "このほんは おもしろくないです。",
            "vietnamese": "Quyển sách này không thú vị."
          }
        ]
      },
      {
        "title": "Tính từ bổ nghĩa cho Danh từ",
        "pattern": "[Tính từ -na] + な + N | [Tính từ -i] + N",
        "explanation": "Tính từ đuôi な phải giữ nguyên chữ な khi đứng trước danh từ. Tính từ đuôi い đi trực tiếp với danh từ.",
        "examples": [
          {
            "japanese": "富士山は 高い 山です。",
            "reading": "ふじさんは たかい やまです。",
            "vietnamese": "Núi Phú Sĩ là một ngọn núi cao."
          },
          {
            "japanese": "親切な 人です。",
            "reading": "しんせつな ひとです。",
            "vietnamese": "Là một người thân thiện."
          }
        ]
      },
      {
        "title": "とても (Rất) & あまり (Không... lắm)",
        "pattern": "とても + Khẳng định | あまり + Phủ định",
        "explanation": "とても mang nghĩa 'rất' đi với câu khẳng định. あまり đi với câu phủ định nghĩa là 'không... lắm'.",
        "examples": [
          {
            "japanese": "日本の食べ物は とても おいしいです。",
            "reading": "にほんのたべものは とても おいしいです。",
            "vietnamese": "Đồ ăn Nhật rất ngon."
          },
          {
            "japanese": "英語は あまり 難しくないです。",
            "reading": "えいごは あまり むずかしくないです。",
            "vietnamese": "Tiếng Anh không khó lắm."
          }
        ]
      },
      {
        "title": "N1 は どんな N2 ですか (N1 là N2 như thế nào?)",
        "pattern": "N1 は どんな N2 ですか",
        "explanation": "Dùng để hỏi về tính chất, đặc điểm hoặc trạng thái của N1 trong nhóm N2.",
        "examples": [
          {
            "japanese": "ハノイは どんな 町ですか。ー にぎやかな 町です。",
            "reading": "はのいは どんな まちですか。ー にぎやかな まちです。",
            "vietnamese": "Hà Nội là thành phố như thế nào? - Là một thành phố nhộn nhịp."
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
        "word": "好き[な]",
        "reading": "すき[な]",
        "romaji": "suki[na]",
        "meaning": "Thích",
        "hanViet": "Hảo",
        "type": "Tính từ -na",
        "exampleSentence": "わたしは 寿司が 好きです。",
        "exampleSentenceReading": "わたしは すしが すきです。",
        "exampleSentenceMeaning": "Tôi thích sushi.",
        "dictionaryForm": ""
      },
      {
        "id": 902,
        "word": "嫌い[な]",
        "reading": "きらい[な]",
        "romaji": "kirai[na]",
        "meaning": "Ghét / Không thích",
        "hanViet": "Hiềm",
        "type": "Tính từ -na",
        "exampleSentence": "納豆が 嫌いです。",
        "exampleSentenceReading": "なっとうが きらいです。",
        "exampleSentenceMeaning": "Tôi ghét đậu natto.",
        "dictionaryForm": ""
      },
      {
        "id": 903,
        "word": "上手[な]",
        "reading": "じょうず[な]",
        "romaji": "jouzu[na]",
        "meaning": "Giỏi / Khéo léo",
        "hanViet": "Thượng Thủ",
        "type": "Tính từ -na",
        "exampleSentence": "たなかさんは 料理が 上手です。",
        "exampleSentenceReading": "たなかさんは りょうりが じょうずです。",
        "exampleSentenceMeaning": "Anh Tanaka nấu ăn giỏi.",
        "dictionaryForm": ""
      },
      {
        "id": 904,
        "word": "下手[な]",
        "reading": "へた[な]",
        "romaji": "heta[na]",
        "meaning": "Kém / Vụng về",
        "hanViet": "Hạ Thủ",
        "type": "Tính từ -na",
        "exampleSentence": "わたしは 絵が 下手です。",
        "exampleSentenceReading": "わたしは えが へたです。",
        "exampleSentenceMeaning": "Tôi vẽ tranh kém.",
        "dictionaryForm": ""
      },
      {
        "id": 905,
        "word": "わかります",
        "reading": "わかります",
        "romaji": "wakarimasu",
        "meaning": "Hiểu / Nắm rõ",
        "hanViet": "Phân",
        "type": "Động từ nhóm 1",
        "exampleSentence": "日本語が わかります。",
        "exampleSentenceReading": "にほんごが わかります。",
        "exampleSentenceMeaning": "Tôi hiểu tiếng Nhật.",
        "dictionaryForm": "わかる"
      },
      {
        "id": 906,
        "word": "あります",
        "reading": "あります",
        "romaji": "arimasu",
        "meaning": "Có (đồ vật, sở hữu, thời gian)",
        "hanViet": "Tại",
        "type": "Động từ nhóm 1",
        "exampleSentence": "時間が あります。",
        "exampleSentenceReading": "じかんが あります。",
        "exampleSentenceMeaning": "Tôi có thời gian.",
        "dictionaryForm": "ある"
      },
      {
        "id": 907,
        "word": "料理",
        "reading": "りょうり",
        "romaji": "ryouri",
        "meaning": "Món ăn / Việc nấu nướng",
        "hanViet": "Liệu Lý",
        "type": "Danh từ",
        "exampleSentence": "日本料理を 作ります。",
        "exampleSentenceReading": "にほんりょうりを つくります。",
        "exampleSentenceMeaning": "Tôi nấu món ăn Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 908,
        "word": "飲み物",
        "reading": "のみもの",
        "romaji": "nomimono",
        "meaning": "Đồ uống / Thức uống",
        "hanViet": "Ẩm Vật",
        "type": "Danh từ",
        "exampleSentence": "冷たい 飲み物が 欲しいです。",
        "exampleSentenceReading": "つめたい のみものが ほしいです。",
        "exampleSentenceMeaning": "Tôi muốn đồ uống lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 909,
        "word": "スポーツ",
        "reading": "スポーツ",
        "romaji": "supootsu",
        "meaning": "Thể thao",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "どんな スポーツが 好きですか。",
        "exampleSentenceReading": "どんな すぽーつが すきですか。",
        "exampleSentenceMeaning": "Bạn thích môn thể thao nào?",
        "dictionaryForm": ""
      },
      {
        "id": 910,
        "word": "野球",
        "reading": "やきゅう",
        "romaji": "yakyuu",
        "meaning": "Bóng chày",
        "hanViet": "Dã Cầu",
        "type": "Danh từ",
        "exampleSentence": "日本人は 野球が 好きです。",
        "exampleSentenceReading": "にほんじんは やきゅうが すきです。",
        "exampleSentenceMeaning": "Người Nhật rất thích bóng chày.",
        "dictionaryForm": ""
      },
      {
        "id": 911,
        "word": "ダンス",
        "reading": "ダンス",
        "romaji": "dansu",
        "meaning": "Nhảy / Khiêu vũ",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ダンスを 習います。",
        "exampleSentenceReading": "だんすを ならいます。",
        "exampleSentenceMeaning": "Tôi học nhảy khiêu vũ.",
        "dictionaryForm": ""
      },
      {
        "id": 912,
        "word": "旅行",
        "reading": "りょこう",
        "romaji": "ryokou",
        "meaning": "Du lịch",
        "hanViet": "Lữ Hành",
        "type": "Danh từ",
        "exampleSentence": "日本へ 旅行に 行きます。",
        "exampleSentenceReading": "にほんへ りょこうに いきます。",
        "exampleSentenceMeaning": "Tôi đi du lịch Nhật Bản.",
        "dictionaryForm": ""
      },
      {
        "id": 913,
        "word": "音楽",
        "reading": "おんがく",
        "romaji": "ongaku",
        "meaning": "Âm nhạc",
        "hanViet": "Âm Nhạc",
        "type": "Danh từ",
        "exampleSentence": "毎晩 音楽を 聞きます。",
        "exampleSentenceReading": "まいばん おんがくを ききます。",
        "exampleSentenceMeaning": "Mỗi tối tôi đều nghe nhạc.",
        "dictionaryForm": ""
      },
      {
        "id": 914,
        "word": "歌",
        "reading": "うた",
        "romaji": "uta",
        "meaning": "Bài hát",
        "hanViet": "Ca",
        "type": "Danh từ",
        "exampleSentence": "日本の 歌を 歌います。",
        "exampleSentenceReading": "にほんの うたを うたいます。",
        "exampleSentenceMeaning": "Tôi hát bài hát tiếng Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 915,
        "word": "クラシック",
        "reading": "クラシック",
        "romaji": "kurashikku",
        "meaning": "Nhạc cổ điển",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "クラシックが 好きです。",
        "exampleSentenceReading": "くらしっくが すきです。",
        "exampleSentenceMeaning": "Tôi thích nhạc cổ điển.",
        "dictionaryForm": ""
      },
      {
        "id": 916,
        "word": "カラオケ",
        "reading": "カラオケ",
        "romaji": "karaoke",
        "meaning": "Karaoke",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "友達と カラオケへ 行きます。",
        "exampleSentenceReading": "ともだちと からおけへ いきます。",
        "exampleSentenceMeaning": "Tôi đi hát karaoke cùng bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 917,
        "word": "歌舞伎",
        "reading": "かぶき",
        "romaji": "kabuki",
        "meaning": "Kịch truyền thống Kabuki",
        "hanViet": "Ca Vũ Kỹ",
        "type": "Danh từ",
        "exampleSentence": "歌舞伎を 見ました。",
        "exampleSentenceReading": "かぶきを みました。",
        "exampleSentenceMeaning": "Tôi đã đi xem kịch Kabuki.",
        "dictionaryForm": ""
      },
      {
        "id": 918,
        "word": "絵",
        "reading": "え",
        "romaji": "e",
        "meaning": "Bức tranh",
        "hanViet": "Hội",
        "type": "Danh từ",
        "exampleSentence": "美術館で 絵を 見ます。",
        "exampleSentenceReading": "びじゅつかんで えを みます。",
        "exampleSentenceMeaning": "Tôi ngắm tranh ở viện bảo tàng.",
        "dictionaryForm": ""
      },
      {
        "id": 919,
        "word": "字",
        "reading": "じ",
        "romaji": "ji",
        "meaning": "Chữ cái / Mặt chữ",
        "hanViet": "Tự",
        "type": "Danh từ",
        "exampleSentence": "きれいな 字を 書きます。",
        "exampleSentenceReading": "きれいな じを かきます。",
        "exampleSentenceMeaning": "Viết nét chữ rất đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 920,
        "word": "漢字",
        "reading": "かんじ",
        "romaji": "kanji",
        "meaning": "Chữ Hán / Kanji",
        "hanViet": "Hán Tự",
        "type": "Danh từ",
        "exampleSentence": "毎日 漢字を 覚えます。",
        "exampleSentenceReading": "まいにち かんじを おぼえます。",
        "exampleSentenceMeaning": "Mỗi ngày tôi đều học chữ Hán.",
        "dictionaryForm": ""
      },
      {
        "id": 921,
        "word": "細かいお金",
        "reading": "こまかいおかね",
        "romaji": "komakai okane",
        "meaning": "Tiền lẻ",
        "hanViet": "Tế Kim",
        "type": "Danh từ",
        "exampleSentence": "細かいお金が ありません。",
        "exampleSentenceReading": "こまかいおかねが ありません。",
        "exampleSentenceMeaning": "Tôi không có tiền lẻ.",
        "dictionaryForm": ""
      },
      {
        "id": 922,
        "word": "チケット",
        "reading": "チケット",
        "romaji": "chiketto",
        "meaning": "Vé (buổi hòa nhạc, phim)",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "コンサートの チケットを 買いました。",
        "exampleSentenceReading": "こんさーとの ちけっとを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua vé xem ca nhạc.",
        "dictionaryForm": ""
      },
      {
        "id": 923,
        "word": "時間",
        "reading": "じかん",
        "romaji": "jikan",
        "meaning": "Thời gian",
        "hanViet": "Thời Gian",
        "type": "Danh từ",
        "exampleSentence": "勉強する 時間が ありません。",
        "exampleSentenceReading": "べんきょうする じかんが ありません。",
        "exampleSentenceMeaning": "Tôi không có thời gian học bài.",
        "dictionaryForm": ""
      },
      {
        "id": 924,
        "word": "用事",
        "reading": "ようじ",
        "romaji": "youji",
        "meaning": "Bận việc riêng / Công chuyện",
        "hanViet": "Dụng Sự",
        "type": "Danh từ",
        "exampleSentence": "今日は 用事が あります。",
        "exampleSentenceReading": "きょうは ようじが あります。",
        "exampleSentenceMeaning": "Hôm nay tôi có việc bận.",
        "dictionaryForm": ""
      },
      {
        "id": 925,
        "word": "約束",
        "reading": "やくそく",
        "romaji": "yakusoku",
        "meaning": "Cuộc hẹn / Lời hứa",
        "hanViet": "Ước Thúc",
        "type": "Danh từ",
        "exampleSentence": "友達と 約束が あります。",
        "exampleSentenceReading": "ともだちと やくそくが あります。",
        "exampleSentenceMeaning": "Tôi có hẹn với bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 926,
        "word": "アルバイト",
        "reading": "アルバイト",
        "romaji": "arubaito",
        "meaning": "Việc làm thêm (Part-time)",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "コンビニで アルバイトを します。",
        "exampleSentenceReading": "こんびにで あるばいとを します。",
        "exampleSentenceMeaning": "Tôi làm thêm ở cửa hàng tiện lợi.",
        "dictionaryForm": ""
      },
      {
        "id": 927,
        "word": "ご主人",
        "reading": "ごしゅじん",
        "romaji": "goshujin",
        "meaning": "Chồng của người khác",
        "hanViet": "Chủ Nhân",
        "type": "Danh từ",
        "exampleSentence": "ご主人は お元気ですか。",
        "exampleSentenceReading": "ごしゅじんは おげんきですか。",
        "exampleSentenceMeaning": "Chồng chị có khỏe không ạ?",
        "dictionaryForm": ""
      },
      {
        "id": 928,
        "word": "夫 / 主人",
        "reading": "おっと / しゅじん",
        "romaji": "otto / shujin",
        "meaning": "Chồng của mình",
        "hanViet": "Phu / Chủ Nhân",
        "type": "Danh từ",
        "exampleSentence": "夫は 会社員です。",
        "exampleSentenceReading": "おっとは かいしゃいんです。",
        "exampleSentenceMeaning": "Chồng tôi là nhân viên công ty.",
        "dictionaryForm": ""
      },
      {
        "id": 929,
        "word": "奥さん",
        "reading": "おくさん",
        "romaji": "okusan",
        "meaning": "Vợ của người khác",
        "hanViet": "Áo",
        "type": "Danh từ",
        "exampleSentence": "たなかさんの 奥さんは 親切です。",
        "exampleSentenceReading": "たなかさんの おくさんは しんせつです。",
        "exampleSentenceMeaning": "Vợ anh Tanaka rất tốt bụng.",
        "dictionaryForm": ""
      },
      {
        "id": 930,
        "word": "妻 / 家内",
        "reading": "つま / かない",
        "romaji": "tsuma / kanai",
        "meaning": "Vợ của mình",
        "hanViet": "Thê / Gia Nội",
        "type": "Danh từ",
        "exampleSentence": "妻は 料理が 上手です。",
        "exampleSentenceReading": "つまは りょうりが じょうずです。",
        "exampleSentenceMeaning": "Vợ tôi nấu ăn rất ngon.",
        "dictionaryForm": ""
      },
      {
        "id": 931,
        "word": "子ども",
        "reading": "こども",
        "romaji": "kodomo",
        "meaning": "Con cái / Đứa trẻ",
        "hanViet": "Tử",
        "type": "Danh từ",
        "exampleSentence": "子どもが 2人 います。",
        "exampleSentenceReading": "こどもが ふたり います。",
        "exampleSentenceMeaning": "Tôi có 2 đứa con.",
        "dictionaryForm": ""
      },
      {
        "id": 932,
        "word": "よく",
        "reading": "よく",
        "romaji": "yoku",
        "meaning": "Rất tốt / Thường xuyên",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "よく 映画を 見ます。",
        "exampleSentenceReading": "よく えいがを みます。",
        "exampleSentenceMeaning": "Tôi rất hay xem phim.",
        "dictionaryForm": ""
      },
      {
        "id": 933,
        "word": "だいたい",
        "reading": "だいたい",
        "romaji": "daitai",
        "meaning": "Đại khái / Hầu hết",
        "hanViet": "Đại Thể",
        "type": "Phó từ",
        "exampleSentence": "だいたい わかりました。",
        "exampleSentenceReading": "だいたい わかりました。",
        "exampleSentenceMeaning": "Tôi đã hiểu đại khái rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 934,
        "word": "たくさん",
        "reading": "たくさん",
        "romaji": "takusan",
        "meaning": "Nhiều",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "本が たくさん あります。",
        "exampleSentenceReading": "ほんが たくさん あります。",
        "exampleSentenceMeaning": "Có rất nhiều sách.",
        "dictionaryForm": ""
      },
      {
        "id": 935,
        "word": "少し",
        "reading": "すこし",
        "romaji": "sukoshi",
        "meaning": "Một chút / Ít",
        "hanViet": "Thiếu",
        "type": "Phó từ",
        "exampleSentence": "少し 疲れました。",
        "exampleSentenceReading": "すこし つかれました。",
        "exampleSentenceMeaning": "Tôi hơi mệt một chút.",
        "dictionaryForm": ""
      },
      {
        "id": 936,
        "word": "全然",
        "reading": "ぜんぜん",
        "romaji": "zenzen",
        "meaning": "Hoàn toàn không (+ phủ định)",
        "hanViet": "Toàn Nhiên",
        "type": "Phó từ",
        "exampleSentence": "全然 わかりません。",
        "exampleSentenceReading": "ぜんぜん わかりません。",
        "exampleSentenceMeaning": "Tôi hoàn toàn không hiểu gì cả.",
        "dictionaryForm": ""
      },
      {
        "id": 937,
        "word": "早く",
        "reading": "はやく",
        "romaji": "hayaku",
        "meaning": "Sớm / Nhanh chóng",
        "hanViet": "Tảo",
        "type": "Phó từ",
        "exampleSentence": "早く 起きます。",
        "exampleSentenceReading": "はやく おきます。",
        "exampleSentenceMeaning": "Tôi thức dậy sớm.",
        "dictionaryForm": ""
      },
      {
        "id": 938,
        "word": "どうして",
        "reading": "どうして",
        "romaji": "doushite",
        "meaning": "Tại sao / Vì sao",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "どうして 遅れましたか。",
        "exampleSentenceReading": "どうして おくれましたか。",
        "exampleSentenceMeaning": "Tại sao bạn lại đến muộn?",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "N が 好き／嫌い／上手／下手 です",
        "pattern": "N + が + 好き／嫌い／上手／下手 です",
        "explanation": "Đối tượng của sở thích, ghét bỏ, năng lực đi với trợ từ が chứ không dùng を.",
        "examples": [
          {
            "japanese": "わたしは イタリア料理が 好きです。",
            "reading": "わたしは いたりありょうりが すきです。",
            "vietnamese": "Tôi thích món ăn Ý."
          },
          {
            "japanese": "マリアさんは 歌が 上手です。",
            "reading": "まりあさんは うたが じょうずです。",
            "vietnamese": "Chị Maria hát rất giỏi."
          }
        ]
      },
      {
        "title": "N が わかります／あります",
        "pattern": "N + が + わかります／あります",
        "explanation": "Đi với động từ chỉ tri thức/khả năng (わかります) hoặc sự sở hữu (あります) thì đối tượng nhận trợ từ が.",
        "examples": [
          {
            "japanese": "英語が わかりますか。ー はい、少し わかります。",
            "reading": "えいごが わかりますか。ー はい、すこし わかります。",
            "vietnamese": "Bạn có hiểu tiếng Anh không? - Vâng, tôi hiểu một chút."
          },
          {
            "japanese": "車が あります。",
            "reading": "くるまが あります。",
            "vietnamese": "Tôi có xe ô tô."
          }
        ]
      },
      {
        "title": "Câu 1 から、Câu 2 (Vì... nên...)",
        "pattern": "[Nguyên nhân] から、[Kết quả]",
        "explanation": "から đứng sau mệnh đề chỉ nguyên nhân, lý do. Câu hỏi lý do dùng どうして (Tại sao).",
        "examples": [
          {
            "japanese": "時間が ありませんから、タクシーで 行きます。",
            "reading": "じかんが ありませんから、たくしーで いきます。",
            "vietnamese": "Vì không có thời gian nên tôi đi bằng taxi."
          },
          {
            "japanese": "どうして きのう 早く 帰りましたか。ー 用事が ありましたから。",
            "reading": "どうして きのう はやく かえりましたか。ー ようじが ありましたから。",
            "vietnamese": "Tại sao hôm qua bạn về sớm thế? - Vì tôi có việc bận."
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
        "word": "あります",
        "reading": "あります",
        "romaji": "arimasu",
        "meaning": "Có (đồ vật, thực vật - vật vô tri)",
        "hanViet": "Tại",
        "type": "Động từ nhóm 1",
        "exampleSentence": "机の 上に 本が あります。",
        "exampleSentenceReading": "つくえの うえに ほんが あります。",
        "exampleSentenceMeaning": "Trên bàn có quyển sách.",
        "dictionaryForm": "ある"
      },
      {
        "id": 1002,
        "word": "います",
        "reading": "います",
        "romaji": "imasu",
        "meaning": "Có / Ở (người, động vật - sinh vật)",
        "hanViet": "Cư",
        "type": "Động từ nhóm 2",
        "exampleSentence": "教室に 学生が います。",
        "exampleSentenceReading": "きょうしつに がくせいが います。",
        "exampleSentenceMeaning": "Trong phòng học có học sinh.",
        "dictionaryForm": "いる"
      },
      {
        "id": 1003,
        "word": "いろいろ[な]",
        "reading": "いろいろ[な]",
        "romaji": "iroiro[na]",
        "meaning": "Đa dạng / Nhiều loại khác nhau",
        "hanViet": "Sắc",
        "type": "Tính từ -na",
        "exampleSentence": "いろいろな 国の 人が います。",
        "exampleSentenceReading": "いろいろな くにの ひとが います。",
        "exampleSentenceMeaning": "Có người đến từ nhiều quốc gia khác nhau.",
        "dictionaryForm": ""
      },
      {
        "id": 1004,
        "word": "男の人",
        "reading": "おとこのひと",
        "romaji": "otoko no hito",
        "meaning": "Người đàn ông",
        "hanViet": "Nam Nhân",
        "type": "Danh từ",
        "exampleSentence": "あの男の人は だれですか。",
        "exampleSentenceReading": "あのおとこのひとは だれですか。",
        "exampleSentenceMeaning": "Người đàn ông kia là ai?",
        "dictionaryForm": ""
      },
      {
        "id": 1005,
        "word": "女の人",
        "reading": "おんなのひと",
        "romaji": "onna no hito",
        "meaning": "Người phụ nữ",
        "hanViet": "Nữ Nhân",
        "type": "Danh từ",
        "exampleSentence": "きれいな 女の人ですね。",
        "exampleSentenceReading": "きれいな おんなのひとですね。",
        "exampleSentenceMeaning": "Người phụ nữ xinh đẹp quá nhỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 1006,
        "word": "男の子",
        "reading": "おとこのこ",
        "romaji": "otoko no ko",
        "meaning": "Bé trai / Cậu bé",
        "hanViet": "Nam Tử",
        "type": "Danh từ",
        "exampleSentence": "男の子が 走っています。",
        "exampleSentenceReading": "おとこのこが はしっています。",
        "exampleSentenceMeaning": "Bé trai đang chạy bộ.",
        "dictionaryForm": ""
      },
      {
        "id": 1007,
        "word": "女の子",
        "reading": "おんなのこ",
        "romaji": "onna no ko",
        "meaning": "Bé gái / Cô bé",
        "hanViet": "Nữ Tử",
        "type": "Danh từ",
        "exampleSentence": "女の子が 笑っています。",
        "exampleSentenceReading": "おんなのこが わらっています。",
        "exampleSentenceMeaning": "Bé gái đang cười.",
        "dictionaryForm": ""
      },
      {
        "id": 1008,
        "word": "犬",
        "reading": "いぬ",
        "romaji": "inu",
        "meaning": "Con chó",
        "hanViet": "Khuyển",
        "type": "Danh từ",
        "exampleSentence": "庭に 犬が います。",
        "exampleSentenceReading": "にわに いぬが います。",
        "exampleSentenceMeaning": "Ở ngoài vườn có một con chó.",
        "dictionaryForm": ""
      },
      {
        "id": 1009,
        "word": "猫",
        "reading": "ねこ",
        "romaji": "neko",
        "meaning": "Con mèo",
        "hanViet": "Miêu",
        "type": "Danh từ",
        "exampleSentence": "かわいい 猫ですね。",
        "exampleSentenceReading": "かわいい ねこですね。",
        "exampleSentenceMeaning": "Con mèo đáng yêu quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1010,
        "word": "パンダ",
        "reading": "パンダ",
        "romaji": "panda",
        "meaning": "Con gấu trúc",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "動物園で パンダを 見ました。",
        "exampleSentenceReading": "どうぶつえんで ぱんだを みました。",
        "exampleSentenceMeaning": "Tôi đã ngắm gấu trúc ở sở thú.",
        "dictionaryForm": ""
      },
      {
        "id": 1011,
        "word": "象",
        "reading": "ぞう",
        "romaji": "zou",
        "meaning": "Con voi",
        "hanViet": "Tượng",
        "type": "Danh từ",
        "exampleSentence": "象の 鼻は 長いです。",
        "exampleSentenceReading": "ぞうの はなは ながいです。",
        "exampleSentenceMeaning": "Vòi của con voi rất dài.",
        "dictionaryForm": ""
      },
      {
        "id": 1012,
        "word": "木",
        "reading": "き",
        "romaji": "ki",
        "meaning": "Cái cây / Gỗ",
        "hanViet": "Mộc",
        "type": "Danh từ",
        "exampleSentence": "大きな 木が あります。",
        "exampleSentenceReading": "おおきな きが あります。",
        "exampleSentenceMeaning": "Có một cái cây to lớn.",
        "dictionaryForm": ""
      },
      {
        "id": 1013,
        "word": "物",
        "reading": "もの",
        "romaji": "mono",
        "meaning": "Đồ vật / Vật dụng",
        "hanViet": "Vật",
        "type": "Danh từ",
        "exampleSentence": "いろいろな 物を 買いました。",
        "exampleSentenceReading": "いろいろな ものを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua nhiều đồ vật.",
        "dictionaryForm": ""
      },
      {
        "id": 1014,
        "word": "電池",
        "reading": "でんち",
        "romaji": "denchi",
        "meaning": "Cục pin",
        "hanViet": "Điện Trì",
        "type": "Danh từ",
        "exampleSentence": "時計の 電池を 換えます。",
        "exampleSentenceReading": "とけいの でんちを かえます。",
        "exampleSentenceMeaning": "Tôi thay pin cho đồng hồ.",
        "dictionaryForm": ""
      },
      {
        "id": 1015,
        "word": "箱",
        "reading": "はこ",
        "romaji": "hako",
        "meaning": "Cái hộp / Cái thùng",
        "hanViet": "Tương",
        "type": "Danh từ",
        "exampleSentence": "箱の 中に 何が ありますか。",
        "exampleSentenceReading": "はこの なかに なにが ありますか。",
        "exampleSentenceMeaning": "Trong hộp có cái gì thế?",
        "dictionaryForm": ""
      },
      {
        "id": 1016,
        "word": "スイッチ",
        "reading": "スイッチ",
        "romaji": "suicchi",
        "meaning": "Công tắc điện",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "スイッチを 押します。",
        "exampleSentenceReading": "すいっちを おします。",
        "exampleSentenceMeaning": "Bấm công tắc.",
        "dictionaryForm": ""
      },
      {
        "id": 1017,
        "word": "冷蔵庫",
        "reading": "れいぞうこ",
        "romaji": "reizouko",
        "meaning": "Tủ lạnh",
        "hanViet": "Lãnh Tàng Khố",
        "type": "Danh từ",
        "exampleSentence": "冷蔵庫に ビールが あります。",
        "exampleSentenceReading": "れいぞうこに びーるが あります。",
        "exampleSentenceMeaning": "Trong tủ lạnh có bia.",
        "dictionaryForm": ""
      },
      {
        "id": 1018,
        "word": "テーブル",
        "reading": "テーブル",
        "romaji": "teeburu",
        "meaning": "Bàn ăn / Bàn uống nước",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "テーブルの 上に 置きます。",
        "exampleSentenceReading": "てーぶるの うえに おきます。",
        "exampleSentenceMeaning": "Đặt lên trên bàn.",
        "dictionaryForm": ""
      },
      {
        "id": 1019,
        "word": "ベッド",
        "reading": "ベッド",
        "romaji": "beddo",
        "meaning": "Cái giường",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ベッドで 寝ます。",
        "exampleSentenceReading": "べっどで ねます。",
        "exampleSentenceMeaning": "Tôi ngủ trên giường.",
        "dictionaryForm": ""
      },
      {
        "id": 1020,
        "word": "棚",
        "reading": "たな",
        "romaji": "tana",
        "meaning": "Cái giá / Kệ sách",
        "hanViet": "Bằng",
        "type": "Danh từ",
        "exampleSentence": "本棚に 本を 並べます。",
        "exampleSentenceReading": "ほんだなに ほんを ならべます。",
        "exampleSentenceMeaning": "Xếp sách lên giá sách.",
        "dictionaryForm": ""
      },
      {
        "id": 1021,
        "word": "ドア",
        "reading": "ドア",
        "romaji": "doa",
        "meaning": "Cửa ra vào",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ドアを 開けてください。",
        "exampleSentenceReading": "どあを あけてください。",
        "exampleSentenceMeaning": "Xin hãy mở cửa.",
        "dictionaryForm": ""
      },
      {
        "id": 1022,
        "word": "窓",
        "reading": "まど",
        "romaji": "mado",
        "meaning": "Cửa sổ",
        "hanViet": "Song",
        "type": "Danh từ",
        "exampleSentence": "窓から 海が 見えます。",
        "exampleSentenceReading": "まどから うみが みえます。",
        "exampleSentenceMeaning": "Từ cửa sổ nhìn thấy biển.",
        "dictionaryForm": ""
      },
      {
        "id": 1023,
        "word": "ポスト",
        "reading": "ポスト",
        "romaji": "posuto",
        "meaning": "Hộp thư công cộng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "手紙を ポストに 入れます。",
        "exampleSentenceReading": "てがみを ぽすとに いれます。",
        "exampleSentenceMeaning": "Bỏ thư vào hòm thư.",
        "dictionaryForm": ""
      },
      {
        "id": 1024,
        "word": "ビル",
        "reading": "ビル",
        "romaji": "biru",
        "meaning": "Tòa nhà cao tầng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "高い ビルが あります。",
        "exampleSentenceReading": "たかい びるが あります。",
        "exampleSentenceMeaning": "Có những tòa nhà chọc trời.",
        "dictionaryForm": ""
      },
      {
        "id": 1025,
        "word": "公園",
        "reading": "こうえん",
        "romaji": "kouen",
        "meaning": "Công viên",
        "hanViet": "Công Viên",
        "type": "Danh từ",
        "exampleSentence": "公園を 散歩します。",
        "exampleSentenceReading": "こうえんを さんぽします。",
        "exampleSentenceMeaning": "Tôi đi dạo ở công viên.",
        "dictionaryForm": ""
      },
      {
        "id": 1026,
        "word": "喫茶店",
        "reading": "きっさてん",
        "romaji": "kissaten",
        "meaning": "Quán cà phê / Tiệm giải khát",
        "hanViet": "Khiết Trà Điếm",
        "type": "Danh từ",
        "exampleSentence": "喫茶店で コーヒーを 飲みます。",
        "exampleSentenceReading": "きっさてんで こーひーを のみます。",
        "exampleSentenceMeaning": "Uống cà phê ở quán nước.",
        "dictionaryForm": ""
      },
      {
        "id": 1027,
        "word": "本屋",
        "reading": "ほんや",
        "romaji": "honya",
        "meaning": "Hiệu sách / Cửa hàng sách",
        "hanViet": "Bổn Ốc",
        "type": "Danh từ",
        "exampleSentence": "本屋で 雑誌を 買いました。",
        "exampleSentenceReading": "ほんやで ざっしを かいました。",
        "exampleSentenceMeaning": "Tôi mua tạp chí ở hiệu sách.",
        "dictionaryForm": ""
      },
      {
        "id": 1028,
        "word": "～屋",
        "reading": "～や",
        "romaji": "-ya",
        "meaning": "Cửa hàng... / Tiệm bán...",
        "hanViet": "Ốc",
        "type": "Hậu tố",
        "exampleSentence": "花屋で バラを 買います。",
        "exampleSentenceReading": "はなやで ばらを かいます。",
        "exampleSentenceMeaning": "Mua hoa hồng ở tiệm hoa.",
        "dictionaryForm": ""
      },
      {
        "id": 1029,
        "word": "乗り場",
        "reading": "のりば",
        "romaji": "noriba",
        "meaning": "Bến chờ xe / Ga tàu xe",
        "hanViet": "Thừa Trường",
        "type": "Danh từ",
        "exampleSentence": "タクシー乗り場は あそこです。",
        "exampleSentenceReading": "たくしーのりばは あそこです。",
        "exampleSentenceMeaning": "Bến đón taxi ở đằng kia.",
        "dictionaryForm": ""
      },
      {
        "id": 1030,
        "word": "上",
        "reading": "うえ",
        "romaji": "ue",
        "meaning": "Phía trên / Bên trên",
        "hanViet": "Thượng",
        "type": "Danh từ vị trí",
        "exampleSentence": "机の 上に 本が あります。",
        "exampleSentenceReading": "つくえの うえに ほんが あります。",
        "exampleSentenceMeaning": "Trên bàn có quyển sách.",
        "dictionaryForm": ""
      },
      {
        "id": 1031,
        "word": "下",
        "reading": "した",
        "romaji": "shita",
        "meaning": "Phía dưới / Bên dưới",
        "hanViet": "Hạ",
        "type": "Danh từ vị trí",
        "exampleSentence": "椅子の 下に 猫が います。",
        "exampleSentenceReading": "いすの したに ねこが います。",
        "exampleSentenceMeaning": "Dưới ghế có con mèo.",
        "dictionaryForm": ""
      },
      {
        "id": 1032,
        "word": "前",
        "reading": "まえ",
        "romaji": "mae",
        "meaning": "Phía trước / Đằng trước",
        "hanViet": "Tiền",
        "type": "Danh từ vị trí",
        "exampleSentence": "駅の 前で 待ちます。",
        "exampleSentenceReading": "えきの まえで まちます。",
        "exampleSentenceMeaning": "Tôi đợi ở trước cửa ga.",
        "dictionaryForm": ""
      },
      {
        "id": 1033,
        "word": "後ろ",
        "reading": "うしろ",
        "romaji": "ushiro",
        "meaning": "Phía sau / Đằng sau",
        "hanViet": "Hậu",
        "type": "Danh từ vị trí",
        "exampleSentence": "車の 後ろに います。",
        "exampleSentenceReading": "くるまの うしろに います。",
        "exampleSentenceMeaning": "Đang ở sau xe ô tô.",
        "dictionaryForm": ""
      },
      {
        "id": 1034,
        "word": "右",
        "reading": "みぎ",
        "romaji": "migi",
        "meaning": "Bên phải",
        "hanViet": "Hữu",
        "type": "Danh từ vị trí",
        "exampleSentence": "右へ 曲がってください。",
        "exampleSentenceReading": "みぎへ まがってください。",
        "exampleSentenceMeaning": "Xin hãy rẽ sang bên phải.",
        "dictionaryForm": ""
      },
      {
        "id": 1035,
        "word": "左",
        "reading": "ひだり",
        "romaji": "hidari",
        "meaning": "Bên trái",
        "hanViet": "Tả",
        "type": "Danh từ vị trí",
        "exampleSentence": "左に 郵便局が あります。",
        "exampleSentenceReading": "ひだりに ゆうびんきょくが あります。",
        "exampleSentenceMeaning": "Bên trái có bưu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 1036,
        "word": "中",
        "reading": "なか",
        "romaji": "naka",
        "meaning": "Bên trong",
        "hanViet": "Trung",
        "type": "Danh từ vị trí",
        "exampleSentence": "鞄の 中に 財布が あります。",
        "exampleSentenceReading": "かばんの なかに さいふが あります。",
        "exampleSentenceMeaning": "Trong túi có chiếc ví.",
        "dictionaryForm": ""
      },
      {
        "id": 1037,
        "word": "外",
        "reading": "そと",
        "romaji": "soto",
        "meaning": "Bên ngoài",
        "hanViet": "Ngoại",
        "type": "Danh từ vị trí",
        "exampleSentence": "外は 寒いです。",
        "exampleSentenceReading": "そとは さむいです。",
        "exampleSentenceMeaning": "Bên ngoài trời rất lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 1038,
        "word": "隣",
        "reading": "となり",
        "romaji": "tonari",
        "meaning": "Bên cạnh (cùng loại)",
        "hanViet": "Lân",
        "type": "Danh từ vị trí",
        "exampleSentence": "銀行の 隣は 郵便局です。",
        "exampleSentenceReading": "ぎんこうの となりは ゆうびんきょくです。",
        "exampleSentenceMeaning": "Bên cạnh ngân hàng là bưu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 1039,
        "word": "近く",
        "reading": "ちかく",
        "romaji": "chikaku",
        "meaning": "Gần đây / Vùng phụ cận",
        "hanViet": "Cận",
        "type": "Danh từ vị trí",
        "exampleSentence": "学校の 近くに 住んでいます。",
        "exampleSentenceReading": "がっこうの ちかくに すんでいます。",
        "exampleSentenceMeaning": "Tôi sống ở gần trường học.",
        "dictionaryForm": ""
      },
      {
        "id": 1040,
        "word": "間",
        "reading": "あいだ",
        "romaji": "aida",
        "meaning": "Ở giữa",
        "hanViet": "Gian",
        "type": "Danh từ vị trí",
        "exampleSentence": "本屋と 銀行の 間です。",
        "exampleSentenceReading": "ほんやと ぎんこうの あいだです。",
        "exampleSentenceMeaning": "Ở giữa hiệu sách và ngân hàng.",
        "dictionaryForm": ""
      },
      {
        "id": 1042,
        "word": "机",
        "reading": "つくえ",
        "romaji": "tsukue",
        "meaning": "Cái bàn làm việc",
        "hanViet": "Kỷ",
        "type": "Danh từ",
        "exampleSentence": "机の 上に 本が あります。",
        "exampleSentenceReading": "つくえの うえに ほんが あります。",
        "exampleSentenceMeaning": "Trên bàn có quyển sách.",
        "dictionaryForm": ""
      },
      {
        "id": 1043,
        "word": "椅子",
        "reading": "いす",
        "romaji": "isu",
        "meaning": "Cái ghế",
        "hanViet": "Y Tử",
        "type": "Danh từ",
        "exampleSentence": "椅子に 座ります。",
        "exampleSentenceReading": "いすに すわります。",
        "exampleSentenceMeaning": "Ngồi vào ghế.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "N(địa điểm) に N が あります／います",
        "pattern": "Địa điểm + に + Vật/Người + が + あります／います",
        "explanation": "Diễn tả sự hiện hữu của đồ vật (あります) hoặc người/động vật (います) tại một địa điểm cụ thể.",
        "examples": [
          {
            "japanese": "庭に 犬が います。",
            "reading": "にわに いぬが います。",
            "vietnamese": "Trong vườn có con chó."
          },
          {
            "japanese": "部屋に テレビが あります。",
            "reading": "へやに てれびが あります。",
            "vietnamese": "Trong phòng có ti vi."
          }
        ]
      },
      {
        "title": "N1 は N2(địa điểm) に あります／います",
        "pattern": "N1 は + Địa điểm + に + あります／います",
        "explanation": "Dùng để nhấn mạnh N1 đang ở đâu (vị trí của chủ đề N1).",
        "examples": [
          {
            "japanese": "ミラーさんは 事務所に います。",
            "reading": "みらーさんは じむしょに います。",
            "vietnamese": "Anh Miller đang ở văn phòng."
          },
          {
            "japanese": "東京ディズニーランドは 千葉県に あります。",
            "reading": "とうきょうでぃずにーらんどは ちばけんに あります。",
            "vietnamese": "Tokyo Disneyland ở tỉnh Chiba."
          }
        ]
      },
      {
        "title": "N1(vật/người) の N2(vị trí)",
        "pattern": "N1 の 上／下／前／後ろ／中／外／隣／近く",
        "explanation": "Chỉ vị trí tương đối: trên bàn (つくえの上), trong túi (かばんの中), cạnh ga (えきの隣).",
        "examples": [
          {
            "japanese": "机の 上に 写真が あります。",
            "reading": "つくえの うえに しゃしんが あります。",
            "vietnamese": "Trên bàn có bức ảnh."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 11,
    "title": "Bài 11: Số lượng từ & Tần suất",
    "japaneseTitle": "第１１課：数量詞",
    "description": "Cách đếm đồ vật (ひとつ..とお), người (ひとり, ふたり), tần suất thời gian (1 tuần mấy lần) và lượng từ.",
    "vocabularies": [
      {
        "id": 1101,
        "word": "ひとつ",
        "reading": "ひとつ",
        "romaji": "hitotsu",
        "meaning": "Một cái (đồ vật)",
        "hanViet": "Nhất",
        "type": "Lượng từ",
        "exampleSentence": "りんごを ひとつ ください。",
        "exampleSentenceReading": "りんごを ひとつ ください。",
        "exampleSentenceMeaning": "Cho tôi một quả táo.",
        "dictionaryForm": ""
      },
      {
        "id": 1102,
        "word": "ふたつ",
        "reading": "ふたつ",
        "romaji": "futatsu",
        "meaning": "Hai cái (đồ vật)",
        "hanViet": "Nhị",
        "type": "Lượng từ",
        "exampleSentence": "みかんを ふたつ 食べました。",
        "exampleSentenceReading": "みかんを ふたつ たべました。",
        "exampleSentenceMeaning": "Tôi đã ăn 2 quả quýt.",
        "dictionaryForm": ""
      },
      {
        "id": 1103,
        "word": "みっつ",
        "reading": "みっつ",
        "romaji": "mittsu",
        "meaning": "Ba cái (đồ vật)",
        "hanViet": "Tam",
        "type": "Lượng từ",
        "exampleSentence": "パンを みっつ 買いました。",
        "exampleSentenceReading": "ぱんを みっつ かいました。",
        "exampleSentenceMeaning": "Tôi mua 3 cái bánh mì.",
        "dictionaryForm": ""
      },
      {
        "id": 1104,
        "word": "よっつ",
        "reading": "よっつ",
        "romaji": "yottsu",
        "meaning": "Bốn cái (đồ vật)",
        "hanViet": "Tứ",
        "type": "Lượng từ",
        "exampleSentence": "いすが よっつ あります。",
        "exampleSentenceReading": "いすが よっつ あります。",
        "exampleSentenceMeaning": "Có 4 cái ghế.",
        "dictionaryForm": ""
      },
      {
        "id": 1105,
        "word": "いつつ",
        "reading": "いつつ",
        "romaji": "itsutsu",
        "meaning": "Năm cái (đồ vật)",
        "hanViet": "Ngũ",
        "type": "Lượng từ",
        "exampleSentence": "卵が いつつ あります。",
        "exampleSentenceReading": "たまごが いつつ あります。",
        "exampleSentenceMeaning": "Có 5 quả trứng.",
        "dictionaryForm": ""
      },
      {
        "id": 1106,
        "word": "むっつ",
        "reading": "むっつ",
        "romaji": "muttsu",
        "meaning": "Sáu cái (đồ vật)",
        "hanViet": "Lục",
        "type": "Lượng từ",
        "exampleSentence": "ビールを むっつ 買います。",
        "exampleSentenceReading": "びーるを むっつ かいます。",
        "exampleSentenceMeaning": "Tôi mua 6 lon bia.",
        "dictionaryForm": ""
      },
      {
        "id": 1107,
        "word": "ななつ",
        "reading": "ななつ",
        "romaji": "nanatsu",
        "meaning": "Bảy cái (đồ vật)",
        "hanViet": "Thất",
        "type": "Lượng từ",
        "exampleSentence": "机が ななつ あります。",
        "exampleSentenceReading": "つくえが ななつ あります。",
        "exampleSentenceMeaning": "Có 7 cái bàn.",
        "dictionaryForm": ""
      },
      {
        "id": 1108,
        "word": "やっつ",
        "reading": "やっつ",
        "romaji": "yattsu",
        "meaning": "Tám cái (đồ vật)",
        "hanViet": "Bát",
        "type": "Lượng từ",
        "exampleSentence": "箱が やっつ あります。",
        "exampleSentenceReading": "はこが やっつ あります。",
        "exampleSentenceMeaning": "Có 8 cái hộp.",
        "dictionaryForm": ""
      },
      {
        "id": 1109,
        "word": "ここのつ",
        "reading": "ここのつ",
        "romaji": "kokonotsu",
        "meaning": "Chín cái (đồ vật)",
        "hanViet": "Cửu",
        "type": "Lượng từ",
        "exampleSentence": "鍵が ここのつ あります。",
        "exampleSentenceReading": "かぎが ここのつ あります。",
        "exampleSentenceMeaning": "Có 9 chiếc chìa khóa.",
        "dictionaryForm": ""
      },
      {
        "id": 1110,
        "word": "とお",
        "reading": "とお",
        "romaji": "too",
        "meaning": "Mười cái (đồ vật)",
        "hanViet": "Thập",
        "type": "Lượng từ",
        "exampleSentence": "切手を とお 買いました。",
        "exampleSentenceReading": "きってを とお かいました。",
        "exampleSentenceMeaning": "Tôi đã mua 10 con tem.",
        "dictionaryForm": ""
      },
      {
        "id": 1111,
        "word": "いくつ",
        "reading": "いくつ",
        "romaji": "ikutsu",
        "meaning": "Mấy cái / Bao nhiêu cái",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "りんごが いくつ ありますか。",
        "exampleSentenceReading": "りんごが いくつ ありますか。",
        "exampleSentenceMeaning": "Có mấy quả táo thế?",
        "dictionaryForm": ""
      },
      {
        "id": 1112,
        "word": "一人",
        "reading": "ひとり",
        "romaji": "hitori",
        "meaning": "Một người",
        "hanViet": "Nhất Nhân",
        "type": "Lượng từ",
        "exampleSentence": "一人で 行きます。",
        "exampleSentenceReading": "ひとりで いきます。",
        "exampleSentenceMeaning": "Tôi đi một mình.",
        "dictionaryForm": ""
      },
      {
        "id": 1113,
        "word": "二人",
        "reading": "ふたり",
        "romaji": "futari",
        "meaning": "Hai người",
        "hanViet": "Nhị Nhân",
        "type": "Lượng từ",
        "exampleSentence": "二人で 映画を 見ました。",
        "exampleSentenceReading": "ふたりで えいがを みました。",
        "exampleSentenceMeaning": "Hai người chúng tôi đã xem phim.",
        "dictionaryForm": ""
      },
      {
        "id": 1114,
        "word": "～人",
        "reading": "～にん",
        "romaji": "-nin",
        "meaning": "～ người",
        "hanViet": "Nhân",
        "type": "Hậu tố",
        "exampleSentence": "学生が 5人 います。",
        "exampleSentenceReading": "がくせいが ごにん います。",
        "exampleSentenceMeaning": "Có 5 học sinh.",
        "dictionaryForm": ""
      },
      {
        "id": 1115,
        "word": "～台",
        "reading": "～だい",
        "romaji": "-dai",
        "meaning": "～ chiếc, cái (xe cộ, máy móc)",
        "hanViet": "Đài",
        "type": "Hậu tố",
        "exampleSentence": "車が 2台 あります。",
        "exampleSentenceReading": "くるまが にだい あります。",
        "exampleSentenceMeaning": "Có 2 chiếc ô tô.",
        "dictionaryForm": ""
      },
      {
        "id": 1116,
        "word": "～枚",
        "reading": "～まい",
        "romaji": "-mai",
        "meaning": "～ tờ, tấm, chiếc (vật mỏng phẳng)",
        "hanViet": "Mai",
        "type": "Hậu tố",
        "exampleSentence": "紙を 3枚 ください。",
        "exampleSentenceReading": "かみを さんまい ください。",
        "exampleSentenceMeaning": "Cho tôi 3 tờ giấy.",
        "dictionaryForm": ""
      },
      {
        "id": 1117,
        "word": "～回",
        "reading": "～かい",
        "romaji": "-kai",
        "meaning": "～ lần (tần suất)",
        "hanViet": "Hồi",
        "type": "Hậu tố",
        "exampleSentence": "1週間に 2回 走ります。",
        "exampleSentenceReading": "いっしゅうかんに にかい はしります。",
        "exampleSentenceMeaning": "Mỗi tuần tôi chạy bộ 2 lần.",
        "dictionaryForm": ""
      },
      {
        "id": 1118,
        "word": "りんご",
        "reading": "りんご",
        "romaji": "ringo",
        "meaning": "Quả táo",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "赤い りんごを 食べます。",
        "exampleSentenceReading": "あかい りんごを たべます。",
        "exampleSentenceMeaning": "Tôi ăn quả táo đỏ.",
        "dictionaryForm": ""
      },
      {
        "id": 1119,
        "word": "みかん",
        "reading": "みかん",
        "romaji": "mikan",
        "meaning": "Quả quýt",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "日本の みかんは 甘いです。",
        "exampleSentenceReading": "にほんの みかんは あまいです。",
        "exampleSentenceMeaning": "Quýt Nhật Bản rất ngọt.",
        "dictionaryForm": ""
      },
      {
        "id": 1120,
        "word": "サンドイッチ",
        "reading": "サンドイッチ",
        "romaji": "sandoicchi",
        "meaning": "Bánh mì kẹp Sandwich",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "昼ご飯に サンドイッチを 食べます。",
        "exampleSentenceReading": "ひるごはんに さんどいっちを たべます。",
        "exampleSentenceMeaning": "Ăn bánh sandwich vào bữa trưa.",
        "dictionaryForm": ""
      },
      {
        "id": 1121,
        "word": "カレー",
        "reading": "カレー",
        "romaji": "karee",
        "meaning": "Món cơm cà ri",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "辛い カレーが 好きです。",
        "exampleSentenceReading": "からい かれーが すきです。",
        "exampleSentenceMeaning": "Tôi thích món cà ri cay.",
        "dictionaryForm": ""
      },
      {
        "id": 1122,
        "word": "アイスクリーム",
        "reading": "アイスクリーム",
        "romaji": "aisukuriimu",
        "meaning": "Kem / Băng kem",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "夏に アイスクリームを 食べます。",
        "exampleSentenceReading": "なつに あいすくりーむを たべます。",
        "exampleSentenceMeaning": "Mùa hè tôi ăn kem.",
        "dictionaryForm": ""
      },
      {
        "id": 1123,
        "word": "切手",
        "reading": "きって",
        "romaji": "kitte",
        "meaning": "Con tem",
        "hanViet": "Thiết Thủ",
        "type": "Danh từ",
        "exampleSentence": "80円の 切手を 買います。",
        "exampleSentenceReading": "はちじゅうえんの きってを かいます。",
        "exampleSentenceMeaning": "Tôi mua con tem 80 Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 1124,
        "word": "はがき",
        "reading": "はがき",
        "romaji": "hagaki",
        "meaning": "Tấm bưu thiếp",
        "hanViet": "Diệp Thư",
        "type": "Danh từ",
        "exampleSentence": "国へ はがきを 送ります。",
        "exampleSentenceReading": "くにへ はがきを おくります。",
        "exampleSentenceMeaning": "Tôi gửi bưu thiếp về nước.",
        "dictionaryForm": ""
      },
      {
        "id": 1125,
        "word": "封筒",
        "reading": "ふうとう",
        "romaji": "fuutou",
        "meaning": "Bì thư / Phong bì",
        "hanViet": "Phong Đồng",
        "type": "Danh từ",
        "exampleSentence": "手紙を 封筒に 入れます。",
        "exampleSentenceReading": "てがみを ふうとうに いれます。",
        "exampleSentenceMeaning": "Bỏ thư vào phong bì.",
        "dictionaryForm": ""
      },
      {
        "id": 1126,
        "word": "速達",
        "reading": "そくたつ",
        "romaji": "sokutatsu",
        "meaning": "Chuyển phát nhanh",
        "hanViet": "Tốc Đạt",
        "type": "Danh từ",
        "exampleSentence": "速達で 送ってください。",
        "exampleSentenceReading": "そくたつで おくってください。",
        "exampleSentenceMeaning": "Xin hãy gửi chuyển phát nhanh.",
        "dictionaryForm": ""
      },
      {
        "id": 1127,
        "word": "書留",
        "reading": "かきとめ",
        "romaji": "kakitome",
        "meaning": "Gửi bảo đảm",
        "hanViet": "Thư Lưu",
        "type": "Danh từ",
        "exampleSentence": "大切な書類を 書留で 送ります。",
        "exampleSentenceReading": "たいせつなしょるいを かきとめで おくります。",
        "exampleSentenceMeaning": "Gửi giấy tờ quan trọng bảo đảm.",
        "dictionaryForm": ""
      },
      {
        "id": 1128,
        "word": "エアメール",
        "reading": "エアメール",
        "romaji": "eameeru",
        "meaning": "Thư gửi đường hàng không",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ベトナムへ エアメールで 送ります。",
        "exampleSentenceReading": "べとなむへ えあめーるで おくります。",
        "exampleSentenceMeaning": "Gửi đường hàng không về VN.",
        "dictionaryForm": ""
      },
      {
        "id": 1129,
        "word": "船便",
        "reading": "ふなびん",
        "romaji": "funabin",
        "meaning": "Gửi đường biển",
        "hanViet": "Thuyền Tiện",
        "type": "Danh từ",
        "exampleSentence": "船便は 安いですが、遅いです。",
        "exampleSentenceReading": "ふなびんは やすいですが、おそいです。",
        "exampleSentenceMeaning": "Đường biển rẻ nhưng chậm.",
        "dictionaryForm": ""
      },
      {
        "id": 1130,
        "word": "両親",
        "reading": "りょうしん",
        "romaji": "ryoushin",
        "meaning": "Bố mẹ / Nhị thân",
        "hanViet": "Lưỡng Thân",
        "type": "Danh từ",
        "exampleSentence": "両親は ハノイに 住んでいます。",
        "exampleSentenceReading": "りょうしんは ハノイに すんでいます。",
        "exampleSentenceMeaning": "Bố mẹ tôi sống ở Hà Nội.",
        "dictionaryForm": ""
      },
      {
        "id": 1131,
        "word": "兄弟",
        "reading": "きょうだい",
        "romaji": "kyoudai",
        "meaning": "Anh chị em",
        "hanViet": "Huynh Đệ",
        "type": "Danh từ",
        "exampleSentence": "兄弟が 何人 いますか。",
        "exampleSentenceReading": "きょうだいが なんにん いますか。",
        "exampleSentenceMeaning": "Bạn có mấy anh chị em?",
        "dictionaryForm": ""
      },
      {
        "id": 1132,
        "word": "兄",
        "reading": "あに",
        "romaji": "ani",
        "meaning": "Anh trai (của mình)",
        "hanViet": "Huynh",
        "type": "Danh từ",
        "exampleSentence": "兄は 会社員です。",
        "exampleSentenceReading": "あには かいしゃいんです。",
        "exampleSentenceMeaning": "Anh trai tôi là nhân viên công ty.",
        "dictionaryForm": ""
      },
      {
        "id": 1133,
        "word": "お兄さん",
        "reading": "おにいさん",
        "romaji": "oniisan",
        "meaning": "Anh trai (người khác)",
        "hanViet": "Huynh",
        "type": "Danh từ",
        "exampleSentence": "お兄さんは 背が 高いです。",
        "exampleSentenceReading": "おにいさんは せが たかいです。",
        "exampleSentenceMeaning": "Anh trai bạn cao thật.",
        "dictionaryForm": ""
      },
      {
        "id": 1134,
        "word": "姉",
        "reading": "あね",
        "romaji": "ane",
        "meaning": "Chị gái (của mình)",
        "hanViet": "Tỉ",
        "type": "Danh từ",
        "exampleSentence": "姉は 銀行員です。",
        "exampleSentenceReading": "あねは ぎんこういんです。",
        "exampleSentenceMeaning": "Chị gái tôi làm ở ngân hàng.",
        "dictionaryForm": ""
      },
      {
        "id": 1135,
        "word": "お姉さん",
        "reading": "おねえさん",
        "romaji": "oneesan",
        "meaning": "Chị gái (người khác)",
        "hanViet": "Tỉ",
        "type": "Danh từ",
        "exampleSentence": "きれいな お姉さんですね。",
        "exampleSentenceReading": "きれいな おねえさんですね。",
        "exampleSentenceMeaning": "Chị gái bạn đẹp quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1136,
        "word": "どのくらい",
        "reading": "どのくらい",
        "romaji": "dono kurai",
        "meaning": "Bao lâu / Khoảng bao nhiêu",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "東京まで どのくらい かかりますか。",
        "exampleSentenceReading": "とうきょうまで どのくらい かかりますか。",
        "exampleSentenceMeaning": "Mất bao lâu để đến Tokyo?",
        "dictionaryForm": ""
      },
      {
        "id": 1137,
        "word": "全部で",
        "reading": "ぜんぶで",
        "romaji": "zenbu de",
        "meaning": "Tổng cộng là / Tất cả là",
        "hanViet": "Toàn Bộ",
        "type": "Phó từ",
        "exampleSentence": "全部で 5000円です。",
        "exampleSentenceReading": "ぜんぶで ごせんえんです。",
        "exampleSentenceMeaning": "Tất cả hết 5000 Yên.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Cách dùng số lượng từ trong câu",
        "pattern": "N + を + [Số lượng từ] + V",
        "explanation": "Số lượng từ thường đứng ngay trước động từ mà nó bổ nghĩa, không đi kèm trợ từ.",
        "examples": [
          {
            "japanese": "りんごを ４つ 買いました。",
            "reading": "りんごを よっつ かいました。",
            "vietnamese": "Tôi đã mua 4 quả táo."
          }
        ]
      },
      {
        "title": "Khoảng thời gian + に ～回 V (Tần suất)",
        "pattern": "[Khoảng thời gian] に [Số lần]回 + V",
        "explanation": "Diễn tả tần suất thực hiện một hành động trong một khoảng thời gian nhất định.",
        "examples": [
          {
            "japanese": "１か月に ２回 映画を 見ます。",
            "reading": "いっかげつに にかい えいがを みます。",
            "vietnamese": "Một tháng tôi xem phim 2 lần."
          }
        ]
      },
      {
        "title": "Lượng từ + だけ (Chỉ)",
        "pattern": "Số lượng + だけ",
        "explanation": "だけ mang nghĩa 'chỉ', biểu thị giới hạn số lượng duy nhất.",
        "examples": [
          {
            "japanese": "休みは 日曜日だけです。",
            "reading": "やすみは にちようびだけです。",
            "vietnamese": "Ngày nghỉ chỉ có mỗi ngày chủ nhật."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 12,
    "title": "Bài 12: Thì quá khứ & So sánh",
    "japaneseTitle": "第１２課：比較（より・一番）",
    "description": "Thì quá khứ của danh từ và tính từ, so sánh hơn A は B より, so sánh nhất 一番, chọn lựa どちら.",
    "vocabularies": [
      {
        "id": 1201,
        "word": "簡単[な]",
        "reading": "かんたん[な]",
        "romaji": "kantan[na]",
        "meaning": "Đơn giản / Dễ dàng",
        "hanViet": "Giản Đơn",
        "type": "Tính từ -na",
        "exampleSentence": "このテストは 簡単です。",
        "exampleSentenceReading": "このてすとは かんたんです。",
        "exampleSentenceMeaning": "Bài kiểm tra này đơn giản.",
        "dictionaryForm": ""
      },
      {
        "id": 1202,
        "word": "近い",
        "reading": "ちかい",
        "romaji": "chikai",
        "meaning": "Gần",
        "hanViet": "Cận",
        "type": "Tính từ -i",
        "exampleSentence": "駅から 家まで 近いです。",
        "exampleSentenceReading": "えきから いえまで ちかいです。",
        "exampleSentenceMeaning": "Từ ga về nhà rất gần.",
        "dictionaryForm": ""
      },
      {
        "id": 1203,
        "word": "遠い",
        "reading": "とおい",
        "romaji": "tooi",
        "meaning": "Xa",
        "hanViet": "Viễn",
        "type": "Tính từ -i",
        "exampleSentence": "学校は 家から 遠いです。",
        "exampleSentenceReading": "がっこうは いえから とおいです。",
        "exampleSentenceMeaning": "Trường học xa nhà tôi.",
        "dictionaryForm": ""
      },
      {
        "id": 1204,
        "word": "速い / 早い",
        "reading": "はやい",
        "romaji": "hayai",
        "meaning": "Nhanh / Sớm",
        "hanViet": "Tốc / Tảo",
        "type": "Tính từ -i",
        "exampleSentence": "新幹線は 速いです。",
        "exampleSentenceReading": "しんかんせんは はやいです。",
        "exampleSentenceMeaning": "Tàu Shinkansen chạy rất nhanh.",
        "dictionaryForm": ""
      },
      {
        "id": 1205,
        "word": "遅い",
        "reading": "おそい",
        "romaji": "osoi",
        "meaning": "Chậm chạp / Muộn",
        "hanViet": "Trì",
        "type": "Tính từ -i",
        "exampleSentence": "バスは 遅いです。",
        "exampleSentenceReading": "ばすは おそいです。",
        "exampleSentenceMeaning": "Xe buýt chạy chậm.",
        "dictionaryForm": ""
      },
      {
        "id": 1206,
        "word": "多い",
        "reading": "おおい",
        "romaji": "ooi",
        "meaning": "Nhiều (người, đồ)",
        "hanViet": "Đa",
        "type": "Tính từ -i",
        "exampleSentence": "人が 多いです。",
        "exampleSentenceReading": "ひとが おおいです。",
        "exampleSentenceMeaning": "Đông người quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1207,
        "word": "少ない",
        "reading": "すくない",
        "romaji": "sukunai",
        "meaning": "Ít (người, đồ)",
        "hanViet": "Thiểu",
        "type": "Tính từ -i",
        "exampleSentence": "雨が 少ないです。",
        "exampleSentenceReading": "あめが すくないです。",
        "exampleSentenceMeaning": "Ít mưa.",
        "dictionaryForm": ""
      },
      {
        "id": 1208,
        "word": "暖かい / 温かい",
        "reading": "あたたかい",
        "romaji": "atatakai",
        "meaning": "Ấm áp (thời tiết / đồ ăn nước)",
        "hanViet": "Noãn / Ôn",
        "type": "Tính từ -i",
        "exampleSentence": "春は 暖かいです。",
        "exampleSentenceReading": "はるは あたたかいです。",
        "exampleSentenceMeaning": "Mùa xuân ấm áp.",
        "dictionaryForm": ""
      },
      {
        "id": 1209,
        "word": "涼しい",
        "reading": "すずしい",
        "romaji": "suzushii",
        "meaning": "Mát mẻ",
        "hanViet": "Lương",
        "type": "Tính từ -i",
        "exampleSentence": "秋は 涼しくて 気持ちいいです。",
        "exampleSentenceReading": "あきは すずしくて きもちいいです。",
        "exampleSentenceMeaning": "Mùa thu mát mẻ sảng khoái.",
        "dictionaryForm": ""
      },
      {
        "id": 1210,
        "word": "甘い",
        "reading": "あまい",
        "romaji": "amai",
        "meaning": "Ngọt",
        "hanViet": "Cam",
        "type": "Tính từ -i",
        "exampleSentence": "このケーキは 甘いです。",
        "exampleSentenceReading": "このけーきは あまいです。",
        "exampleSentenceMeaning": "Chiếc bánh ngọt này ngọt quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1211,
        "word": "辛い",
        "reading": "からい",
        "romaji": "karai",
        "meaning": "Cay",
        "hanViet": "Tân",
        "type": "Tính từ -i",
        "exampleSentence": "キムチは 辛いです。",
        "exampleSentenceReading": "きむちは からいです。",
        "exampleSentenceMeaning": "Kim chi rất cay.",
        "dictionaryForm": ""
      },
      {
        "id": 1212,
        "word": "重い",
        "reading": "おもい",
        "romaji": "omoi",
        "meaning": "Nặng",
        "hanViet": "Trọng",
        "type": "Tính từ -i",
        "exampleSentence": "この鞄は 重いです。",
        "exampleSentenceReading": "このかばんは おもいです。",
        "exampleSentenceMeaning": "Chiếc túi này nặng.",
        "dictionaryForm": ""
      },
      {
        "id": 1213,
        "word": "軽い",
        "reading": "かるい",
        "romaji": "karui",
        "meaning": "Nhẹ",
        "hanViet": "Khinh",
        "type": "Tính từ -i",
        "exampleSentence": "このパソコンは 軽いです。",
        "exampleSentenceReading": "このぱそこんは かるいです。",
        "exampleSentenceMeaning": "Chiếc laptop này nhẹ.",
        "dictionaryForm": ""
      },
      {
        "id": 1214,
        "word": "季節",
        "reading": "きせつ",
        "romaji": "kisetsu",
        "meaning": "Mùa trong năm",
        "hanViet": "Quý Tiết",
        "type": "Danh từ",
        "exampleSentence": "どの季節が いちばん 好きですか。",
        "exampleSentenceReading": "どのきせつが いちばん すきですか。",
        "exampleSentenceMeaning": "Bạn thích mùa nào nhất?",
        "dictionaryForm": ""
      },
      {
        "id": 1215,
        "word": "春",
        "reading": "はる",
        "romaji": "haru",
        "meaning": "Mùa xuân",
        "hanViet": "Xuân",
        "type": "Danh từ",
        "exampleSentence": "春に 桜が 咲きます。",
        "exampleSentenceReading": "はるに さくらが さきます。",
        "exampleSentenceMeaning": "Hoa anh đào nở vào mùa xuân.",
        "dictionaryForm": ""
      },
      {
        "id": 1216,
        "word": "夏",
        "reading": "なつ",
        "romaji": "natsu",
        "meaning": "Mùa hè",
        "hanViet": "Hạ",
        "type": "Danh từ",
        "exampleSentence": "夏休みは 海へ 行きます。",
        "exampleSentenceReading": "なつやすみは うみへ いきます。",
        "exampleSentenceMeaning": "Nghỉ hè tôi đi biển.",
        "dictionaryForm": ""
      },
      {
        "id": 1217,
        "word": "秋",
        "reading": "あき",
        "romaji": "aki",
        "meaning": "Mùa thu",
        "hanViet": "Thu",
        "type": "Danh từ",
        "exampleSentence": "秋の 紅葉が きれいです。",
        "exampleSentenceReading": "あきの こうようが きれいです。",
        "exampleSentenceMeaning": "Lá đỏ mùa thu rất đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 1218,
        "word": "冬",
        "reading": "ふゆ",
        "romaji": "fuyu",
        "meaning": "Mùa đông",
        "hanViet": "Đông",
        "type": "Danh từ",
        "exampleSentence": "冬に スキーを します。",
        "exampleSentenceReading": "ふゆに すきーを します。",
        "exampleSentenceMeaning": "Mùa đông tôi đi trượt tuyết.",
        "dictionaryForm": ""
      },
      {
        "id": 1219,
        "word": "天気",
        "reading": "てんき",
        "romaji": "tenki",
        "meaning": "Thời tiết",
        "hanViet": "Thiên Khí",
        "type": "Danh từ",
        "exampleSentence": "今日の 天気は どうですか。",
        "exampleSentenceReading": "きょうの てんきは どうですか。",
        "exampleSentenceMeaning": "Thời tiết hôm nay thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 1220,
        "word": "雨",
        "reading": "あめ",
        "romaji": "ame",
        "meaning": "Cơn mưa",
        "hanViet": "Vũ",
        "type": "Danh từ",
        "exampleSentence": "雨が 降っています。",
        "exampleSentenceReading": "あめが ふっています。",
        "exampleSentenceMeaning": "Trời đang mưa.",
        "dictionaryForm": ""
      },
      {
        "id": 1221,
        "word": "雪",
        "reading": "ゆき",
        "romaji": "yuki",
        "meaning": "Tuyết",
        "hanViet": "Tuyết",
        "type": "Danh từ",
        "exampleSentence": "雪が たくさん 降りました。",
        "exampleSentenceReading": "ゆきが たくさん ふりました。",
        "exampleSentenceMeaning": "Tuyết đã rơi rất nhiều.",
        "dictionaryForm": ""
      },
      {
        "id": 1222,
        "word": "曇り",
        "reading": "くもり",
        "romaji": "kumori",
        "meaning": "Nhiều mây / U ám",
        "hanViet": "Đàm",
        "type": "Danh từ",
        "exampleSentence": "今日は 曇りです。",
        "exampleSentenceReading": "きょうは くもりです。",
        "exampleSentenceMeaning": "Hôm nay trời nhiều mây.",
        "dictionaryForm": ""
      },
      {
        "id": 1223,
        "word": "ホテル",
        "reading": "ホテル",
        "romaji": "hoteru",
        "meaning": "Khách sạn",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ホテルに 泊まります。",
        "exampleSentenceReading": "ほてるに とまります。",
        "exampleSentenceMeaning": "Tôi trọ ở khách sạn.",
        "dictionaryForm": ""
      },
      {
        "id": 1224,
        "word": "空港",
        "reading": "くうこう",
        "romaji": "kuukou",
        "meaning": "Sân bay",
        "hanViet": "Không Cảng",
        "type": "Danh từ",
        "exampleSentence": "空港で 友達を 迎えます。",
        "exampleSentenceReading": "くうこうで ともだちを むかえます。",
        "exampleSentenceMeaning": "Tôi đón bạn ở sân bay.",
        "dictionaryForm": ""
      },
      {
        "id": 1225,
        "word": "海",
        "reading": "うみ",
        "romaji": "umi",
        "meaning": "Biển / Bãi biển",
        "hanViet": "Hải",
        "type": "Danh từ",
        "exampleSentence": "夏 海で 泳ぎます。",
        "exampleSentenceReading": "なつ うみで およぎます。",
        "exampleSentenceMeaning": "Mùa hè bơi ở biển.",
        "dictionaryForm": ""
      },
      {
        "id": 1226,
        "word": "世界",
        "reading": "せかい",
        "romaji": "sekai",
        "meaning": "Thế giới",
        "hanViet": "Thế Giới",
        "type": "Danh từ",
        "exampleSentence": "世界を 旅行したいです。",
        "exampleSentenceReading": "せかいを りょこうしたいです。",
        "exampleSentenceMeaning": "Tôi muốn đi du lịch thế giới.",
        "dictionaryForm": ""
      },
      {
        "id": 1227,
        "word": "パーティー",
        "reading": "パーティー",
        "romaji": "paatii",
        "meaning": "Bữa tiệc",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "誕生日パーティーを します。",
        "exampleSentenceReading": "たんじょうびぱーてぃーを します。",
        "exampleSentenceMeaning": "Tổ chức tiệc sinh nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 1228,
        "word": "お祭り",
        "reading": "おまつり",
        "romaji": "omatsuri",
        "meaning": "Lễ hội",
        "hanViet": "Tế",
        "type": "Danh từ",
        "exampleSentence": "日本の 夏祭りは にぎやかです。",
        "exampleSentenceReading": "にほんの なつまつりは にぎやかです。",
        "exampleSentenceMeaning": "Lễ hội mùa hè Nhật Bản náo nhiệt.",
        "dictionaryForm": ""
      },
      {
        "id": 1229,
        "word": "すき焼き",
        "reading": "すきやき",
        "romaji": "sukiyaki",
        "meaning": "Món lẩu Sukiyaki",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "すき焼きを 食べました。",
        "exampleSentenceReading": "すきやきを たべました。",
        "exampleSentenceMeaning": "Tôi đã ăn món Sukiyaki.",
        "dictionaryForm": ""
      },
      {
        "id": 1230,
        "word": "刺身",
        "reading": "さしみ",
        "romaji": "sashimi",
        "meaning": "Món cá sống Sashimi",
        "hanViet": "Thích Thân",
        "type": "Danh từ",
        "exampleSentence": "刺身は 新鮮で おいしいです。",
        "exampleSentenceReading": "さしみは しんせんで おいしいです。",
        "exampleSentenceMeaning": "Sashimi tươi ngon.",
        "dictionaryForm": ""
      },
      {
        "id": 1231,
        "word": "寿司",
        "reading": "すし",
        "romaji": "sushi",
        "meaning": "Món cơm cuộn Sushi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "寿司を 握ります。",
        "exampleSentenceReading": "すしを にぎります。",
        "exampleSentenceMeaning": "Nắm sushi.",
        "dictionaryForm": ""
      },
      {
        "id": 1232,
        "word": "天ぷら",
        "reading": "てんぷら",
        "romaji": "tenpura",
        "meaning": "Món chiên Tempura",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "天ぷらは サクサクしています。",
        "exampleSentenceReading": "てんぷらは さくさくしています。",
        "exampleSentenceMeaning": "Tempura giòn rụm.",
        "dictionaryForm": ""
      },
      {
        "id": 1233,
        "word": "どちら",
        "reading": "どちら",
        "romaji": "dochira",
        "meaning": "Bên nào / Cái nào (trong 2 cái)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "日本と ベトナムと どちらが 暑いですか。",
        "exampleSentenceReading": "にほんと べとなむと どちらが あついですか。",
        "exampleSentenceMeaning": "Nhật và Việt Nam bên nào nóng hơn?",
        "dictionaryForm": ""
      },
      {
        "id": 1234,
        "word": "ずっと",
        "reading": "ずっと",
        "romaji": "zutto",
        "meaning": "Hơn hẳn / Suốt",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "ベトナムのほうが ずっと 暑いです。",
        "exampleSentenceReading": "べとなむのほうが ずっと あついです。",
        "exampleSentenceMeaning": "Việt Nam nóng hơn hẳn.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Quá khứ của tính từ và danh từ",
        "pattern": "Tính từ -i: かった | Tính từ -na/Danh từ: でした",
        "explanation": "Tính từ đuôi い bỏ い thêm かったです (quá khứ phủ định: くなかったです). Tính từ đuôi な và danh từ thêm でした (quá khứ phủ định: じゃありませんでした).",
        "examples": [
          {
            "japanese": "きのうは 暑かったです。",
            "reading": "きのうは あつかったです。",
            "vietnamese": "Hôm qua trời đã rất nóng."
          },
          {
            "japanese": "きのうの パーティーは にぎやかでした。",
            "reading": "きのうの ぱーてぃーは にぎやかでした。",
            "vietnamese": "Bữa tiệc hôm qua đã rất nhộn nhịp."
          }
        ]
      },
      {
        "title": "A は B より [Tính từ] です (So sánh hơn)",
        "pattern": "A は B より [Tính từ] です",
        "explanation": "Biểu thị đối tượng A có tính chất hơn đối tượng B (A hơn B).",
        "examples": [
          {
            "japanese": "新幹線は 飛行機より 安いです。",
            "reading": "しんかんせんは ひこうきより やすいです。",
            "vietnamese": "Tàu Shinkansen rẻ hơn máy bay."
          }
        ]
      },
      {
        "title": "A と B と どちらが [Tính từ] ですか (So sánh 2 vật)",
        "pattern": "A と B と どちらが [Tính từ] ですか",
        "explanation": "Dùng để hỏi giữa A và B cái nào hơn. Trả lời: A の ほうが [Tính từ] です.",
        "examples": [
          {
            "japanese": "サッカーと 野球と どちらが おもしろいですか。ー サッカーの ほうが おもしろいです。",
            "reading": "さっかーと やきゅうと どちらが おもしろいですか。ー さっかーの ほうが おもしろいです。",
            "vietnamese": "Bóng đá và bóng chày môn nào thú vị hơn? - Bóng đá thú vị hơn."
          }
        ]
      },
      {
        "title": "N の 中で [Từ để hỏi] が いちばん [Tính từ] ですか (So sánh nhất)",
        "pattern": "[Nhóm N] の 中で 何/どこ/だれ/いつ が いちばん [Tính từ] ですか",
        "explanation": "So sánh nhất trong một phạm vi hoặc một nhóm đối tượng.",
        "examples": [
          {
            "japanese": "１年の 中で いつが いちばん 暑いですか。ー ８月が いちばん 暑いです。",
            "reading": "いちねんの なかで いつが いちばん あついですか。ー はちがつが いちばん あついです。",
            "vietnamese": "Trong một năm khi nào nóng nhất? - Tháng 8 nóng nhất."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 13,
    "title": "Bài 13: Mong muốn (ほしい・たい)",
    "japaneseTitle": "第１３課：～たい・～ほしい",
    "description": "Bày tỏ mong muốn sở hữu N が ほしい, mong muốn thực hiện hành động V-stem + たい, mục đích di chuyển V-stem に 行きます.",
    "vocabularies": [
      {
        "id": 1301,
        "word": "遊びます",
        "reading": "あそびます",
        "romaji": "asobimasu",
        "meaning": "Chơi / Đi chơi",
        "hanViet": "Du",
        "type": "Động từ nhóm 1",
        "exampleSentence": "週末 友達と 遊びます。",
        "exampleSentenceReading": "しゅうまつ ともだちと あそびます。",
        "exampleSentenceMeaning": "Cuối tuần tôi đi chơi với bạn.",
        "dictionaryForm": "遊ぶ (あそぶ)"
      },
      {
        "id": 1302,
        "word": "泳ぎます",
        "reading": "およぎます",
        "romaji": "oyogimasu",
        "meaning": "Bơi lội",
        "hanViet": "Vịnh",
        "type": "Động từ nhóm 1",
        "exampleSentence": "海で 泳ぎます。",
        "exampleSentenceReading": "うみで およぎます。",
        "exampleSentenceMeaning": "Tôi bơi ở biển.",
        "dictionaryForm": "泳ぐ (およぐ)"
      },
      {
        "id": 1303,
        "word": "迎えます",
        "reading": "むかえます",
        "romaji": "mukaemasu",
        "meaning": "Đón (ai đó)",
        "hanViet": "Nghênh",
        "type": "Động từ nhóm 2",
        "exampleSentence": "空港へ 友達を 迎えに 行きます。",
        "exampleSentenceReading": "くうこうへ ともだちを むかえに いきます。",
        "exampleSentenceMeaning": "Tôi ra sân bay đón bạn.",
        "dictionaryForm": "迎える (むかえる)"
      },
      {
        "id": 1304,
        "word": "疲れます",
        "reading": "つかれます",
        "romaji": "tsukaremasu",
        "meaning": "Mệt mỏi",
        "hanViet": "Bì",
        "type": "Động từ nhóm 2",
        "exampleSentence": "たくさん 歩いて、疲れました。",
        "exampleSentenceReading": "たくさん あるいて、つかれました。",
        "exampleSentenceMeaning": "Đi bộ nhiều nên tôi mệt rồi.",
        "dictionaryForm": "疲れる (つかれる)"
      },
      {
        "id": 1305,
        "word": "出します",
        "reading": "だします",
        "romaji": "dashimasu",
        "meaning": "Gửi (thư) / Nộp (báo cáo) / Lấy ra",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 1",
        "exampleSentence": "手紙を 出します。",
        "exampleSentenceReading": "てがみを だします。",
        "exampleSentenceMeaning": "Tôi gửi thư đi.",
        "dictionaryForm": "出す (だす)"
      },
      {
        "id": 1306,
        "word": "入ります",
        "reading": "はいります",
        "romaji": "hairimasu",
        "meaning": "Đi vào / Bước vào (quán, phòng [に])",
        "hanViet": "Nhập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "喫茶店に 入ります。",
        "exampleSentenceReading": "きっさてんに はいります。",
        "exampleSentenceMeaning": "Tôi vào quán cà phê.",
        "dictionaryForm": "入る (はいる)"
      },
      {
        "id": 1307,
        "word": "出ます",
        "reading": "でます",
        "romaji": "demasu",
        "meaning": "Rời khỏi / Bước ra (khỏi nơi nào [を])",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 2",
        "exampleSentence": "部屋を 出ます。",
        "exampleSentenceReading": "へやを でます。",
        "exampleSentenceMeaning": "Tôi bước ra khỏi phòng.",
        "dictionaryForm": "出る (でる)"
      },
      {
        "id": 1308,
        "word": "結婚します",
        "reading": "けっこんします",
        "romaji": "kekkonshimasu",
        "meaning": "Kết hôn / Cưới",
        "hanViet": "Kết Hôn",
        "type": "Động từ nhóm 3",
        "exampleSentence": "来年 結婚します。",
        "exampleSentenceReading": "らいねん けっこんします。",
        "exampleSentenceMeaning": "Năm sau tôi sẽ kết hôn.",
        "dictionaryForm": "結婚する (けっこんする)"
      },
      {
        "id": 1309,
        "word": "買い物します",
        "reading": "かいものします",
        "romaji": "kaimonoshimasu",
        "meaning": "Mua sắm",
        "hanViet": "Mãi Vật",
        "type": "Động từ nhóm 3",
        "exampleSentence": "デパートで 買い物します。",
        "exampleSentenceReading": "でぱーとで かいものします。",
        "exampleSentenceMeaning": "Mua sắm ở trung tâm thương mại.",
        "dictionaryForm": "買い物する (かいものする)"
      },
      {
        "id": 1310,
        "word": "食事します",
        "reading": "しょくじします",
        "romaji": "shokujishimasu",
        "meaning": "Dùng bữa / Ăn uống",
        "hanViet": "Thực Sự",
        "type": "Động từ nhóm 3",
        "exampleSentence": "家族と 食事します。",
        "exampleSentenceReading": "かぞくと しょくじします。",
        "exampleSentenceMeaning": "Dùng bữa cùng gia đình.",
        "dictionaryForm": "食事する (しょくじする)"
      },
      {
        "id": 1311,
        "word": "散歩します",
        "reading": "さんぽします",
        "romaji": "sanposhimasu",
        "meaning": "Đi dạo",
        "hanViet": "Tản Bộ",
        "type": "Động từ nhóm 3",
        "exampleSentence": "公園を 散歩します。",
        "exampleSentenceReading": "こうえんを さんぽします。",
        "exampleSentenceMeaning": "Tôi đi dạo quanh công viên.",
        "dictionaryForm": "散歩する (さんぽする)"
      },
      {
        "id": 1312,
        "word": "大変[な]",
        "reading": "たいへん[な]",
        "romaji": "taihen[na]",
        "meaning": "Vất vả / Khó khăn",
        "hanViet": "Đại Biến",
        "type": "Tính từ -na",
        "exampleSentence": "仕事は 大変ですが、楽しいです。",
        "exampleSentenceReading": "しごとは たいへんですが、たのしいです。",
        "exampleSentenceMeaning": "Công việc vất vả nhưng rất vui.",
        "dictionaryForm": ""
      },
      {
        "id": 1313,
        "word": "欲しい",
        "reading": "ほしい",
        "romaji": "hoshii",
        "meaning": "Muốn có (danh từ + が)",
        "hanViet": "Dục",
        "type": "Tính từ -i",
        "exampleSentence": "新しい パソコンが 欲しいです。",
        "exampleSentenceReading": "あたらしい ぱそこんが ほしいです。",
        "exampleSentenceMeaning": "Tôi muốn có chiếc máy tính mới.",
        "dictionaryForm": ""
      },
      {
        "id": 1314,
        "word": "寂しい",
        "reading": "さびしい",
        "romaji": "sabishii",
        "meaning": "Cô đơn / Buồn tủi",
        "hanViet": "Tịch",
        "type": "Tính từ -i",
        "exampleSentence": "一人で 寂しいです。",
        "exampleSentenceReading": "ひとりで さびしいです。",
        "exampleSentenceMeaning": "Ở một mình nên thấy cô đơn.",
        "dictionaryForm": ""
      },
      {
        "id": 1315,
        "word": "広い",
        "reading": "ひろい",
        "romaji": "hiroi",
        "meaning": "Rộng rãi",
        "hanViet": "Quảng",
        "type": "Tính từ -i",
        "exampleSentence": "部屋は 広くて 明るいです。",
        "exampleSentenceReading": "へやは ひろくて あかるいです。",
        "exampleSentenceMeaning": "Căn phòng rộng và sáng sủa.",
        "dictionaryForm": ""
      },
      {
        "id": 1316,
        "word": "狭い",
        "reading": "せまい",
        "romaji": "semai",
        "meaning": "Chật hẹp",
        "hanViet": "Hiệp",
        "type": "Tính từ -i",
        "exampleSentence": "寮の 部屋は 狭いです。",
        "exampleSentenceReading": "りょうの へやは せまいいです。",
        "exampleSentenceMeaning": "Phòng ký túc xá chật chội.",
        "dictionaryForm": ""
      },
      {
        "id": 1317,
        "word": "市役所",
        "reading": "しやくしょ",
        "romaji": "shiyakusho",
        "meaning": "Tòa thị chính / UBND thành phố",
        "hanViet": "Thị Dịch Sở",
        "type": "Danh từ",
        "exampleSentence": "市役所へ 手続きに 行きます。",
        "exampleSentenceReading": "しやくしょへ てつづきに いきます。",
        "exampleSentenceMeaning": "Tôi đến tòa thị chính làm thủ tục.",
        "dictionaryForm": ""
      },
      {
        "id": 1318,
        "word": "プール",
        "reading": "プール",
        "romaji": "puuru",
        "meaning": "Bể bơi / Hồ bơi",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "プールで 泳ぎます。",
        "exampleSentenceReading": "ぷーるで およぎます。",
        "exampleSentenceMeaning": "Tôi bơi ở hồ bơi.",
        "dictionaryForm": ""
      },
      {
        "id": 1319,
        "word": "川",
        "reading": "かわ",
        "romaji": "kawa",
        "meaning": "Con sông",
        "hanViet": "Xuyên",
        "type": "Danh từ",
        "exampleSentence": "川で 魚を 釣ります。",
        "exampleSentenceReading": "かわで さかなを つります。",
        "exampleSentenceMeaning": "Câu cá ở bờ sông.",
        "dictionaryForm": ""
      },
      {
        "id": 1320,
        "word": "経済",
        "reading": "けいざい",
        "romaji": "keizai",
        "meaning": "Kinh tế",
        "hanViet": "Kinh Tế",
        "type": "Danh từ",
        "exampleSentence": "大学で 経済を 勉強します。",
        "exampleSentenceReading": "だいがくで けいざいを べんきょうします。",
        "exampleSentenceMeaning": "Tôi học kinh tế ở đại học.",
        "dictionaryForm": ""
      },
      {
        "id": 1321,
        "word": "美術",
        "reading": "びじゅつ",
        "romaji": "bijutsu",
        "meaning": "Mỹ thuật",
        "hanViet": "Mỹ Thuật",
        "type": "Danh từ",
        "exampleSentence": "美術に 興味が あります。",
        "exampleSentenceReading": "びじゅつに きょうみが あります。",
        "exampleSentenceMeaning": "Tôi có hứng thú với mỹ thuật.",
        "dictionaryForm": ""
      },
      {
        "id": 1322,
        "word": "釣り",
        "reading": "つり",
        "romaji": "tsuri",
        "meaning": "Việc câu cá",
        "hanViet": "Điếu",
        "type": "Danh từ",
        "exampleSentence": "週末 釣りに 行きます。",
        "exampleSentenceReading": "しゅうまつ つりに いきます。",
        "exampleSentenceMeaning": "Cuối tuần tôi đi câu cá.",
        "dictionaryForm": ""
      },
      {
        "id": 1323,
        "word": "スキー",
        "reading": "スキー",
        "romaji": "sukii",
        "meaning": "Môn trượt tuyết",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "冬 スキーを しに行きます。",
        "exampleSentenceReading": "ふゆ すきーを しにいきます。",
        "exampleSentenceMeaning": "Mùa đông tôi đi trượt tuyết.",
        "dictionaryForm": ""
      },
      {
        "id": 1324,
        "word": "会議",
        "reading": "かいぎ",
        "romaji": "kaigi",
        "meaning": "Cuộc họp",
        "hanViet": "Hội Nghị",
        "type": "Danh từ",
        "exampleSentence": "午後は 会議が あります。",
        "exampleSentenceReading": "ごごは かいぎが あります。",
        "exampleSentenceMeaning": "Buổi chiều có cuộc họp.",
        "dictionaryForm": ""
      },
      {
        "id": 1325,
        "word": "登録",
        "reading": "とうろく",
        "romaji": "touroku",
        "meaning": "Đăng ký",
        "hanViet": "Đăng Lục",
        "type": "Danh từ",
        "exampleSentence": "外国人登録を します。",
        "exampleSentenceReading": "がいこくじんとうろくを します。",
        "exampleSentenceMeaning": "Đăng ký thẻ cư trú người nước ngoài.",
        "dictionaryForm": ""
      },
      {
        "id": 1326,
        "word": "週末",
        "reading": "しゅうまつ",
        "romaji": "shuumatsu",
        "meaning": "Cuối tuần",
        "hanViet": "Chu Mạt",
        "type": "Danh từ",
        "exampleSentence": "週末 何を しますか。",
        "exampleSentenceReading": "しゅうまつ なにを しますか。",
        "exampleSentenceMeaning": "Cuối tuần bạn làm gì?",
        "dictionaryForm": ""
      },
      {
        "id": 1327,
        "word": "～ごろ",
        "reading": "～ごろ",
        "romaji": "-goro",
        "meaning": "Khoảng... (thời gian)",
        "hanViet": "",
        "type": "Hậu tố",
        "exampleSentence": "7時ごろ 起きます。",
        "exampleSentenceReading": "しちじごろ おきます。",
        "exampleSentenceMeaning": "Tôi thức dậy vào khoảng 7 giờ.",
        "dictionaryForm": ""
      },
      {
        "id": 1328,
        "word": "何か",
        "reading": "なにか",
        "romaji": "nanika",
        "meaning": "Cái gì đó",
        "hanViet": "Hà",
        "type": "Đại từ",
        "exampleSentence": "何か 食べたいです。",
        "exampleSentenceReading": "なにか たべたいです。",
        "exampleSentenceMeaning": "Tôi muốn ăn cái gì đó.",
        "dictionaryForm": ""
      },
      {
        "id": 1329,
        "word": "どこか",
        "reading": "どこか",
        "romaji": "dokoka",
        "meaning": "Nơi nào đó / Đâu đó",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "週末 どこか 行きましたか。",
        "exampleSentenceReading": "しゅうまつ どこか いきましたか。",
        "exampleSentenceMeaning": "Cuối tuần bạn có đi đâu không?",
        "dictionaryForm": ""
      },
      {
        "id": 1330,
        "word": "おなかがすきました",
        "reading": "おなかがすきました",
        "romaji": "onaka ga sukimashita",
        "meaning": "Đói bụng rồi",
        "hanViet": "",
        "type": "Giao tiếp",
        "exampleSentence": "おなかが すきましたね。ご飯を 食べましょう。",
        "exampleSentenceReading": "おなかが すきましたね。ごはんを たべましょう。",
        "exampleSentenceMeaning": "Đói bụng rồi nhỉ, cùng đi ăn cơm thôi.",
        "dictionaryForm": ""
      },
      {
        "id": 1331,
        "word": "のどがかわきました",
        "reading": "のどがかわきました",
        "romaji": "nodo ga kawakimashita",
        "meaning": "Khát nước rồi",
        "hanViet": "",
        "type": "Giao tiếp",
        "exampleSentence": "のどが かわきましたから、水を 飲みます。",
        "exampleSentenceReading": "のどが かわきましたから、みずを のみます。",
        "exampleSentenceMeaning": "Khát nước quá nên tôi uống nước.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "N が 欲しいです (Muốn có N)",
        "pattern": "N + が + 欲しいです",
        "explanation": "Biểu thị mong muốn sở hữu một đồ vật nào đó của người nói. Phủ định là 欲しくないです. Chú ý: Không dùng hỏi người bề trên.",
        "examples": [
          {
            "japanese": "わたしは パソコンが 欲しいです。",
            "reading": "わたしは ぱそこんが ほしいです。",
            "vietnamese": "Tôi muốn có một chiếc máy tính."
          }
        ]
      },
      {
        "title": "V-stem + たいです (Muốn làm V)",
        "pattern": "Vます(bỏ ます) + たいです",
        "explanation": "Biểu thị mong muốn thực hiện hành động. Tân ngữ có thể dùng trợ từ を hoặc が.",
        "examples": [
          {
            "japanese": "日本へ 行きたいです。",
            "reading": "にほんへ いきたいです。",
            "vietnamese": "Tôi muốn đi Nhật Bản."
          },
          {
            "japanese": "お茶が 飲みたいです。",
            "reading": "おちゃが のみたいです。",
            "vietnamese": "Tôi muốn uống trà."
          }
        ]
      },
      {
        "title": "Địa điểm + へ + V-stem / N + に + 行きます／来ます／帰ります",
        "pattern": "Địa điểm + へ + V-stem/Danh từ + に + 行きます",
        "explanation": "Mục đích di chuyển (Đi đâu để làm gì). Động từ bỏ ます thêm に.",
        "examples": [
          {
            "japanese": "デパートへ 買い物に 行きます。",
            "reading": "でぱーとへ かいものに いきます。",
            "vietnamese": "Tôi đi trung tâm thương mại để mua sắm."
          },
          {
            "japanese": "日本へ 経済の 勉強に 来ました。",
            "reading": "にほんへ けいざいの べんきょうに きました。",
            "vietnamese": "Tôi đến Nhật để học kinh tế."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 14,
    "title": "Bài 14: Thể て (Te-form) & Yêu cầu",
    "japaneseTitle": "第１４課：て形・～てください",
    "description": "Quy tắc chia động từ sang thể て nhóm 1, 2, 3, mẫu câu yêu cầu lịch sự Vてください, hành động đang diễn ra Vています, đề nghị Vましょうか.",
    "vocabularies": [
      {
        "id": 1401,
        "word": "つけます",
        "reading": "つけます",
        "romaji": "tsukemasu",
        "meaning": "Bật (đèn, máy lạnh)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "エアコンを つけます。",
        "exampleSentenceReading": "えあこんを つけます。",
        "exampleSentenceMeaning": "Tôi bật điều hòa.",
        "dictionaryForm": "つける"
      },
      {
        "id": 1402,
        "word": "消します",
        "reading": "けします",
        "romaji": "keshimasu",
        "meaning": "Tắt (đèn, máy lạnh) / Xóa",
        "hanViet": "Tiêu",
        "type": "Động từ nhóm 1",
        "exampleSentence": "電気を 消してください。",
        "exampleSentenceReading": "でんきを けしてください。",
        "exampleSentenceMeaning": "Xin hãy tắt đèn đi.",
        "dictionaryForm": "消す (けす)"
      },
      {
        "id": 1403,
        "word": "開けます",
        "reading": "あけます",
        "romaji": "akemasu",
        "meaning": "Mở (cửa, sách)",
        "hanViet": "Khai",
        "type": "Động từ nhóm 2",
        "exampleSentence": "窓を 開けます。",
        "exampleSentenceReading": "まどを あけます。",
        "exampleSentenceMeaning": "Tôi mở cửa sổ.",
        "dictionaryForm": "開ける (あける)"
      },
      {
        "id": 1404,
        "word": "閉めます",
        "reading": "しめます",
        "romaji": "shimemasu",
        "meaning": "Đóng (cửa, sách)",
        "hanViet": "Bế",
        "type": "Động từ nhóm 2",
        "exampleSentence": "ドアを 閉めてください。",
        "exampleSentenceReading": "どあを しめてください。",
        "exampleSentenceMeaning": "Xin vui lòng đóng cửa lại.",
        "dictionaryForm": "閉める (しめる)"
      },
      {
        "id": 1405,
        "word": "急ぎます",
        "reading": "いそぎます",
        "romaji": "isogimasu",
        "meaning": "Vội vã / Gấp rút",
        "hanViet": "Cấp",
        "type": "Động từ nhóm 1",
        "exampleSentence": "遅刻ですから、急ぎます。",
        "exampleSentenceReading": "ちこくですから、いそぎます。",
        "exampleSentenceMeaning": "Vì muộn giờ nên tôi phải vội.",
        "dictionaryForm": "急ぐ (いそぐ)"
      },
      {
        "id": 1406,
        "word": "待ちます",
        "reading": "まちます",
        "romaji": "machimasu",
        "meaning": "Chờ đợi",
        "hanViet": "Đãi",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ここで 待ってください。",
        "exampleSentenceReading": "ここで まってください。",
        "exampleSentenceMeaning": "Xin hãy đợi ở đây.",
        "dictionaryForm": "待つ (まつ)"
      },
      {
        "id": 1407,
        "word": "止めます",
        "reading": "とめます",
        "romaji": "tomemasu",
        "meaning": "Dừng lại / Đỗ (xe)",
        "hanViet": "Chỉ",
        "type": "Động từ nhóm 2",
        "exampleSentence": "ここに 車を 止めます。",
        "exampleSentenceReading": "ここに くるまを とめます。",
        "exampleSentenceMeaning": "Đỗ xe ô tô ở đây.",
        "dictionaryForm": "止める (とめる)"
      },
      {
        "id": 1408,
        "word": "曲がります",
        "reading": "まがります",
        "romaji": "magarimasu",
        "meaning": "Rẽ / Quẹo (phải, trái [へ])",
        "hanViet": "Khúc",
        "type": "Động từ nhóm 1",
        "exampleSentence": "右へ 曲がってください。",
        "exampleSentenceReading": "みぎへ まがってください。",
        "exampleSentenceMeaning": "Xin hãy rẽ sang bên phải.",
        "dictionaryForm": "曲がる (まがる)"
      },
      {
        "id": 1409,
        "word": "持ちます",
        "reading": "もちます",
        "romaji": "mochimasu",
        "meaning": "Cầm / Nắm / Mang",
        "hanViet": "Trì",
        "type": "Động từ nhóm 1",
        "exampleSentence": "荷物を 持ちましょうか。",
        "exampleSentenceReading": "にもつを もちましょうか。",
        "exampleSentenceMeaning": "Để tôi xách hộ hành lý nhé?",
        "dictionaryForm": "持つ (もつ)"
      },
      {
        "id": 1410,
        "word": "取ります",
        "reading": "とります",
        "romaji": "torimasu",
        "meaning": "Lấy (đồ vật)",
        "hanViet": "Thủ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "塩を 取ってください。",
        "exampleSentenceReading": "しおを とってください。",
        "exampleSentenceMeaning": "Lấy giùm tôi lọ muối với.",
        "dictionaryForm": "取る (とる)"
      },
      {
        "id": 1411,
        "word": "手伝います",
        "reading": "てつだいます",
        "romaji": "tetsudaimasu",
        "meaning": "Giúp đỡ / Hỗ trợ",
        "hanViet": "Thủ Truyền",
        "type": "Động từ nhóm 1",
        "exampleSentence": "仕事を 手伝います。",
        "exampleSentenceReading": "しごとを てつだいます。",
        "exampleSentenceMeaning": "Tôi giúp đỡ công việc.",
        "dictionaryForm": "手伝う (てつだう)"
      },
      {
        "id": 1412,
        "word": "呼びます",
        "reading": "よびます",
        "romaji": "yobimasu",
        "meaning": "Gọi (taxi, tên)",
        "hanViet": "Hô",
        "type": "Động từ nhóm 1",
        "exampleSentence": "タクシーを 呼びます。",
        "exampleSentenceReading": "たくしーを よびます。",
        "exampleSentenceMeaning": "Tôi gọi xe taxi.",
        "dictionaryForm": "呼ぶ (よぶ)"
      },
      {
        "id": 1413,
        "word": "話します",
        "reading": "はなします",
        "romaji": "hanashimasu",
        "meaning": "Nói chuyện",
        "hanViet": "Thoại",
        "type": "Động từ nhóm 1",
        "exampleSentence": "日本語で 話してください。",
        "exampleSentenceReading": "にほんごで はなしてください。",
        "exampleSentenceMeaning": "Xin hãy nói bằng tiếng Nhật.",
        "dictionaryForm": "話す (はなす)"
      },
      {
        "id": 1414,
        "word": "見せます",
        "reading": "みせます",
        "romaji": "misemasu",
        "meaning": "Cho xem",
        "hanViet": "Kiến",
        "type": "Động từ nhóm 2",
        "exampleSentence": "パスポートを 見せてください。",
        "exampleSentenceReading": "ぱすぽーとを みせてください。",
        "exampleSentenceMeaning": "Xin cho xem hộ chiếu.",
        "dictionaryForm": "見せる (みせる)"
      },
      {
        "id": 1415,
        "word": "教えます",
        "reading": "おしえます",
        "romaji": "oshiemasu",
        "meaning": "Cho biết / Chỉ bảo",
        "hanViet": "Giáo",
        "type": "Động từ nhóm 2",
        "exampleSentence": "住所を 教えてください。",
        "exampleSentenceReading": "じゅうしょを おしえてください。",
        "exampleSentenceMeaning": "Xin hãy cho tôi biết địa chỉ.",
        "dictionaryForm": "教える (おしえる)"
      },
      {
        "id": 1416,
        "word": "始めます",
        "reading": "はじめます",
        "romaji": "hajimemasu",
        "meaning": "Bắt đầu",
        "hanViet": "Thủy",
        "type": "Động từ nhóm 2",
        "exampleSentence": "授業を 始めましょう。",
        "exampleSentenceReading": "じゅぎょうを はじめましょう。",
        "exampleSentenceMeaning": "Chúng ta cùng bắt đầu tiết học nào.",
        "dictionaryForm": "始める (はじめる)"
      },
      {
        "id": 1417,
        "word": "降ります",
        "reading": "ふります",
        "romaji": "furimasu",
        "meaning": "Rơi (mưa, tuyết [が])",
        "hanViet": "Hàng",
        "type": "Động từ nhóm 1",
        "exampleSentence": "雨が 降っています。",
        "exampleSentenceReading": "あめが ふっています。",
        "exampleSentenceMeaning": "Trời đang đổ mưa.",
        "dictionaryForm": "降る (ふる)"
      },
      {
        "id": 1418,
        "word": "コピーします",
        "reading": "コピーします",
        "romaji": "kopiishimasu",
        "meaning": "Sao chép / Photo",
        "hanViet": "",
        "type": "Động từ nhóm 3",
        "exampleSentence": "資料を コピーします。",
        "exampleSentenceReading": "しりょうを こぴーします。",
        "exampleSentenceMeaning": "Tôi photo tài liệu.",
        "dictionaryForm": "コピーする"
      },
      {
        "id": 1419,
        "word": "エアコン",
        "reading": "エアコン",
        "romaji": "eakon",
        "meaning": "Máy điều hòa nhiệt độ",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "エアコンを つけてください。",
        "exampleSentenceReading": "えあこんを つけてください。",
        "exampleSentenceMeaning": "Xin hãy bật điều hòa lên.",
        "dictionaryForm": ""
      },
      {
        "id": 1420,
        "word": "パスポート",
        "reading": "パスポート",
        "romaji": "pasupooto",
        "meaning": "Hộ chiếu",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "パスポートを 忘れました。",
        "exampleSentenceReading": "ぱすぽーとを わすれました。",
        "exampleSentenceMeaning": "Tôi để quên hộ chiếu rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 1421,
        "word": "名前",
        "reading": "なまえ",
        "romaji": "namae",
        "meaning": "Tên",
        "hanViet": "Danh Tiền",
        "type": "Danh từ",
        "exampleSentence": "ここに 名前を 書きます。",
        "exampleSentenceReading": "ここに なまえを かきます。",
        "exampleSentenceMeaning": "Viết tên vào đây.",
        "dictionaryForm": ""
      },
      {
        "id": 1422,
        "word": "住所",
        "reading": "じゅうしょ",
        "romaji": "juusho",
        "meaning": "Địa chỉ",
        "hanViet": "Trú Sở",
        "type": "Danh từ",
        "exampleSentence": "住所は どこですか。",
        "exampleSentenceReading": "じゅうしょは どこですか。",
        "exampleSentenceMeaning": "Địa chỉ của bạn ở đâu?",
        "dictionaryForm": ""
      },
      {
        "id": 1423,
        "word": "地図",
        "reading": "ちず",
        "romaji": "chizu",
        "meaning": "Bản đồ",
        "hanViet": "Địa Đồ",
        "type": "Danh từ",
        "exampleSentence": "地図を 見ながら 行きます。",
        "exampleSentenceReading": "ちずを みながら いきます。",
        "exampleSentenceMeaning": "Tôi vừa xem bản đồ vừa đi.",
        "dictionaryForm": ""
      },
      {
        "id": 1424,
        "word": "塩",
        "reading": "しお",
        "romaji": "shio",
        "meaning": "Muối",
        "hanViet": "Diêm",
        "type": "Danh từ",
        "exampleSentence": "塩を 少し 入れます。",
        "exampleSentenceReading": "しおを すこし いれます。",
        "exampleSentenceMeaning": "Cho một chút muối vào.",
        "dictionaryForm": ""
      },
      {
        "id": 1425,
        "word": "砂糖",
        "reading": "さとう",
        "romaji": "satou",
        "meaning": "Đường",
        "hanViet": "Sa Đường",
        "type": "Danh từ",
        "exampleSentence": "コーヒーに 砂糖を 入れます。",
        "exampleSentenceReading": "こーひーに さとうを いれます。",
        "exampleSentenceMeaning": "Cho đường vào cà phê.",
        "dictionaryForm": ""
      },
      {
        "id": 1426,
        "word": "問題",
        "reading": "もんだい",
        "romaji": "mondai",
        "meaning": "Câu hỏi / Vấn đề",
        "hanViet": "Vấn Đề",
        "type": "Danh từ",
        "exampleSentence": "問題は 難しいです。",
        "exampleSentenceReading": "もんだいは むずかしいです。",
        "exampleSentenceMeaning": "Câu hỏi này khó quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1427,
        "word": "答え",
        "reading": "こたえ",
        "romaji": "kotae",
        "meaning": "Câu trả lời / Đáp án",
        "hanViet": "Đáp",
        "type": "Danh từ",
        "exampleSentence": "答えを 書いてください。",
        "exampleSentenceReading": "こたえを かいてください。",
        "exampleSentenceMeaning": "Xin hãy viết câu trả lời.",
        "dictionaryForm": ""
      },
      {
        "id": 1428,
        "word": "読み方",
        "reading": "よみかた",
        "romaji": "yomikata",
        "meaning": "Cách đọc",
        "hanViet": "Độc Phương",
        "type": "Danh từ",
        "exampleSentence": "この漢字の 読み方は 何ですか。",
        "exampleSentenceReading": "このかんじの よみかたは なんですか。",
        "exampleSentenceMeaning": "Cách đọc của chữ Hán này là gì?",
        "dictionaryForm": ""
      },
      {
        "id": 1429,
        "word": "まっすぐ",
        "reading": "まっすぐ",
        "romaji": "massugu",
        "meaning": "Đi thẳng",
        "hanViet": "Chân",
        "type": "Phó từ",
        "exampleSentence": "まっすぐ 行ってください。",
        "exampleSentenceReading": "まっすぐ いってください。",
        "exampleSentenceMeaning": "Xin hãy đi thẳng.",
        "dictionaryForm": ""
      },
      {
        "id": 1430,
        "word": "ゆっくり",
        "reading": "ゆっくり",
        "romaji": "yukkuri",
        "meaning": "Thong thả / Chậm rãi",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "ゆっくり 話してください。",
        "exampleSentenceReading": "ゆっくり はなしてください。",
        "exampleSentenceMeaning": "Xin hãy nói chậm lại một chút.",
        "dictionaryForm": ""
      },
      {
        "id": 1431,
        "word": "すぐ",
        "reading": "すぐ",
        "romaji": "sugu",
        "meaning": "Ngay lập tức",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "すぐ 行きます。",
        "exampleSentenceReading": "すぐ いきます。",
        "exampleSentenceMeaning": "Tôi sẽ đến ngay.",
        "dictionaryForm": ""
      },
      {
        "id": 1432,
        "word": "また",
        "reading": "また",
        "romaji": "mata",
        "meaning": "Lại / Hẹn gặp lại",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "また 明日 会いましょう。",
        "exampleSentenceReading": "また あした あいましょう。",
        "exampleSentenceMeaning": "Hẹn gặp lại ngày mai nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 1433,
        "word": "あとで",
        "reading": "あとで",
        "romaji": "atode",
        "meaning": "Lát nữa / Sau đó",
        "hanViet": "Hậu",
        "type": "Phó từ",
        "exampleSentence": "あとで 電話します。",
        "exampleSentenceReading": "あとで でんわします。",
        "exampleSentenceMeaning": "Lát nữa tôi sẽ gọi lại.",
        "dictionaryForm": ""
      },
      {
        "id": 1434,
        "word": "もう少し",
        "reading": "もうすこし",
        "romaji": "mou sukoshi",
        "meaning": "Thêm một chút nữa",
        "hanViet": "Thiếu",
        "type": "Phó từ",
        "exampleSentence": "もう少し 待ってください。",
        "exampleSentenceReading": "もうすこし まってください。",
        "exampleSentenceMeaning": "Xin đợi thêm một chút nữa.",
        "dictionaryForm": ""
      },
      {
        "id": 1435,
        "word": "座ります",
        "reading": "すわります",
        "romaji": "suwarimasu",
        "meaning": "Ngồi",
        "hanViet": "Tọa",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ここに 座ってください。",
        "exampleSentenceReading": "ここに すわってください。",
        "exampleSentenceMeaning": "Xin mời ngồi vào đây.",
        "dictionaryForm": "座る (すわる)"
      },
      {
        "id": 1436,
        "word": "立ちます",
        "reading": "たちます",
        "romaji": "tachimasu",
        "meaning": "Đứng",
        "hanViet": "Lập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "立ってください。",
        "exampleSentenceReading": "たってください。",
        "exampleSentenceMeaning": "Xin hãy đứng dậy.",
        "dictionaryForm": "立つ (たつ)"
      }
    ],
    "grammarPoints": [
      {
        "title": "Quy tắc chia thể て (Te-form)",
        "pattern": "Nhóm 1: い・ち・り->って | み・び・に->んで | き->いて | ぎ->いで | し->して",
        "explanation": "Động từ nhóm 2: bỏ ます + て. Nhóm 3: します->して, きます->きて.",
        "examples": [
          {
            "japanese": "かきます → かいて",
            "reading": "かきます → かいて",
            "vietnamese": "Viết → Thể te: Kaite"
          },
          {
            "japanese": "たべます → たべて",
            "reading": "たべます → たべて",
            "vietnamese": "Ăn → Thể te: Tabete"
          }
        ]
      },
      {
        "title": "Vてください (Xin hãy làm V)",
        "pattern": "Vて + ください",
        "explanation": "Mẫu câu nhờ vả, sai khiến hoặc yêu cầu ai đó làm việc gì một cách lịch sự.",
        "examples": [
          {
            "japanese": "ここに お名前を 書いて ください。",
            "reading": "ここに おなまえを かいて ください。",
            "vietnamese": "Xin hãy viết tên bạn vào đây."
          }
        ]
      },
      {
        "title": "Vています (Hành động đang diễn ra)",
        "pattern": "Vて + います",
        "explanation": "Biểu thị hành động đang diễn ra ngay tại thời điểm nói (thì hiện tại tiếp diễn).",
        "examples": [
          {
            "japanese": "今 雨が 降っています。",
            "reading": "いま あめが ふっています。",
            "vietnamese": "Bây giờ trời đang mưa."
          }
        ]
      },
      {
        "title": "Vましょうか (Để tôi làm giúp nhé?)",
        "pattern": "Vます(bỏ ます) + ましょうか",
        "explanation": "Đề nghị giúp đỡ người nghe một cách chủ động.",
        "examples": [
          {
            "japanese": "荷物を 持ちましょうか。ー ええ、お願いします。",
            "reading": "にもつを もちましょうか。ー ええ、おねがいします。",
            "vietnamese": "Để tôi xách hành lý giúp bạn nhé? - Vâng, nhờ bạn."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 15,
    "title": "Bài 15: Xin phép & Trạng thái",
    "japaneseTitle": "第１５課：～てもいいですか",
    "description": "Mẫu câu xin phép Vてもいいですか, cấm đoán Vてはいけません, trạng thái kết quả lâu dài Vています (kết hôn, nơi ở, nghề nghiệp).",
    "vocabularies": [
      {
        "id": 1501,
        "word": "立ちます",
        "reading": "たちます",
        "romaji": "tachimasu",
        "meaning": "Đứng dậy",
        "hanViet": "Lập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "立ってください。",
        "exampleSentenceReading": "たってください。",
        "exampleSentenceMeaning": "Xin mời đứng dậy.",
        "dictionaryForm": "立つ (たつ)"
      },
      {
        "id": 1502,
        "word": "座ります",
        "reading": "すわります",
        "romaji": "suwarimasu",
        "meaning": "Ngồi xuống (ghế [に])",
        "hanViet": "Tọa",
        "type": "Động từ nhóm 1",
        "exampleSentence": "いすに 座ってください。",
        "exampleSentenceReading": "いすに すわってください。",
        "exampleSentenceMeaning": "Xin mời ngồi vào ghế.",
        "dictionaryForm": "座る (すわる)"
      },
      {
        "id": 1503,
        "word": "使います",
        "reading": "つかいます",
        "romaji": "tsukaimasu",
        "meaning": "Sử dụng / Dùng",
        "hanViet": "Sử",
        "type": "Động từ nhóm 1",
        "exampleSentence": "辞書を 使います。",
        "exampleSentenceReading": "じしょを つかいます。",
        "exampleSentenceMeaning": "Tôi sử dụng từ điển.",
        "dictionaryForm": "使う (つかう)"
      },
      {
        "id": 1504,
        "word": "置きます",
        "reading": "おきます",
        "romaji": "okimasu",
        "meaning": "Đặt / Để",
        "hanViet": "Trí",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ここに 荷物を 置いてください。",
        "exampleSentenceReading": "ここに にもつを おいてください。",
        "exampleSentenceMeaning": "Xin hãy đặt hành lý ở đây.",
        "dictionaryForm": "置く (おく)"
      },
      {
        "id": 1505,
        "word": "作ります",
        "reading": "つくります",
        "romaji": "tsukurimasu",
        "meaning": "Làm / Chế tạo / Nấu (món ăn)",
        "hanViet": "Tác",
        "type": "Động từ nhóm 1",
        "exampleSentence": "晩ご飯を 作ります。",
        "exampleSentenceReading": "ばんごはんを つくります。",
        "exampleSentenceMeaning": "Tôi nấu cơm tối.",
        "dictionaryForm": "作る (つくる)"
      },
      {
        "id": 1506,
        "word": "売ります",
        "reading": "うります",
        "romaji": "urimasu",
        "meaning": "Bán",
        "hanViet": "Mại",
        "type": "Động từ nhóm 1",
        "exampleSentence": "野菜を 売っています。",
        "exampleSentenceReading": "やさいを うっています。",
        "exampleSentenceMeaning": "Đang bán rau củ.",
        "dictionaryForm": "売る (うる)"
      },
      {
        "id": 1507,
        "word": "知ります",
        "reading": "しります",
        "romaji": "shirimasu",
        "meaning": "Biết / Hiểu biết",
        "hanViet": "Tri",
        "type": "Động từ nhóm 1",
        "exampleSentence": "たなかさんを 知っていますか。",
        "exampleSentenceReading": "たなかさんを しっていますか。",
        "exampleSentenceMeaning": "Bạn có biết anh Tanaka không?",
        "dictionaryForm": "知る (しる)"
      },
      {
        "id": 1508,
        "word": "住みます",
        "reading": "すみます",
        "romaji": "sumimasu",
        "meaning": "Sống / Định cư (ở đâu [に])",
        "hanViet": "Trụ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "東京に 住んでいます。",
        "exampleSentenceReading": "とうきょうに すんでいます。",
        "exampleSentenceMeaning": "Tôi đang sống ở Tokyo.",
        "dictionaryForm": "住む (すむ)"
      },
      {
        "id": 1509,
        "word": "研究します",
        "reading": "けんきゅうします",
        "romaji": "kenkyuushimasu",
        "meaning": "Nghiên cứu",
        "hanViet": "Nghiên Cứu",
        "type": "Động từ nhóm 3",
        "exampleSentence": "大学で 研究します。",
        "exampleSentenceReading": "だいがくで けんきゅうします。",
        "exampleSentenceMeaning": "Tôi làm nghiên cứu ở đại học.",
        "dictionaryForm": "研究する (けんきゅうする)"
      },
      {
        "id": 1510,
        "word": "資料",
        "reading": "しりょう",
        "romaji": "shiryou",
        "meaning": "Tài liệu",
        "hanViet": "Tư Liệu",
        "type": "Danh từ",
        "exampleSentence": "資料を 見てください。",
        "exampleSentenceReading": "しりょうを みてください。",
        "exampleSentenceMeaning": "Xin hãy xem tài liệu.",
        "dictionaryForm": ""
      },
      {
        "id": 1511,
        "word": "カタログ",
        "reading": "カタログ",
        "romaji": "katarogu",
        "meaning": "Cuốn danh mục / Catalogue",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "新しい カタログです。",
        "exampleSentenceReading": "あたらしい かたろぐです。",
        "exampleSentenceMeaning": "Đây là cuốn danh mục mới.",
        "dictionaryForm": ""
      },
      {
        "id": 1512,
        "word": "時刻表",
        "reading": "じこくひょう",
        "romaji": "jikokuhyou",
        "meaning": "Bảng giờ tàu xe chạy",
        "hanViet": "Thời Khắc Biểu",
        "type": "Danh từ",
        "exampleSentence": "電車の 時刻表を 見ます。",
        "exampleSentenceReading": "でんしゃの じこくひょうを みます。",
        "exampleSentenceMeaning": "Xem bảng giờ tàu điện.",
        "dictionaryForm": ""
      },
      {
        "id": 1513,
        "word": "服",
        "reading": "ふく",
        "romaji": "fuku",
        "meaning": "Quần áo",
        "hanViet": "Phục",
        "type": "Danh từ",
        "exampleSentence": "新しい 服を 買いました。",
        "exampleSentenceReading": "あたらしい ふくを かいました。",
        "exampleSentenceMeaning": "Tôi mua quần áo mới.",
        "dictionaryForm": ""
      },
      {
        "id": 1514,
        "word": "製品",
        "reading": "せいひん",
        "romaji": "seihin",
        "meaning": "Sản phẩm / Hàng hóa",
        "hanViet": "Chế Phẩm",
        "type": "Danh từ",
        "exampleSentence": "日本の 製品は 素晴らしいです。",
        "exampleSentenceReading": "にほんの せいひんは すばらしいです。",
        "exampleSentenceMeaning": "Sản phẩm Nhật Bản rất tuyệt vời.",
        "dictionaryForm": ""
      },
      {
        "id": 1515,
        "word": "ソフト",
        "reading": "ソフト",
        "romaji": "sofuto",
        "meaning": "Phần mềm máy tính",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "新しい ソフトを 作ります。",
        "exampleSentenceReading": "あたらしい そふとを つくります。",
        "exampleSentenceMeaning": "Phát triển phần mềm mới.",
        "dictionaryForm": ""
      },
      {
        "id": 1516,
        "word": "電子辞書",
        "reading": "でんしじしょ",
        "romaji": "denshijisho",
        "meaning": "Từ điển điện tử",
        "hanViet": "Điện Tử Từ Thư",
        "type": "Danh từ",
        "exampleSentence": "電子辞書を 使います。",
        "exampleSentenceReading": "でんしじしょを つかいます。",
        "exampleSentenceMeaning": "Tôi dùng từ điển điện tử.",
        "dictionaryForm": ""
      },
      {
        "id": 1517,
        "word": "経済",
        "reading": "けいざい",
        "romaji": "keizai",
        "meaning": "Kinh tế",
        "hanViet": "Kinh Tế",
        "type": "Danh từ",
        "exampleSentence": "日本の 経済を 勉強します。",
        "exampleSentenceReading": "にほんの けいざいを べんきょうします。",
        "exampleSentenceMeaning": "Tôi học về kinh tế Nhật Bản.",
        "dictionaryForm": ""
      },
      {
        "id": 1518,
        "word": "市役所",
        "reading": "しやくしょ",
        "romaji": "shiyakusho",
        "meaning": "Ủy ban nhân dân / Tòa thị chính",
        "hanViet": "Thị Dịch Sở",
        "type": "Danh từ",
        "exampleSentence": "市役所で 手続きします。",
        "exampleSentenceReading": "しやくしょで てつづきします。",
        "exampleSentenceMeaning": "Làm thủ tục ở tòa thị chính.",
        "dictionaryForm": ""
      },
      {
        "id": 1519,
        "word": "高校",
        "reading": "こうこう",
        "romaji": "koukou",
        "meaning": "Trường cấp 3 / THPT",
        "hanViet": "Cao Hiệu",
        "type": "Danh từ",
        "exampleSentence": "高校の 先生です。",
        "exampleSentenceReading": "こうこうの せんせいです。",
        "exampleSentenceMeaning": "Là giáo viên cấp 3.",
        "dictionaryForm": ""
      },
      {
        "id": 1520,
        "word": "歯医者",
        "reading": "はいしゃ",
        "romaji": "haisha",
        "meaning": "Bác sĩ nha khoa / Nha sĩ",
        "hanViet": "Xỉ Y Giả",
        "type": "Danh từ",
        "exampleSentence": "歯医者へ 行きます。",
        "exampleSentenceReading": "はいしゃへ いきます。",
        "exampleSentenceMeaning": "Tôi đi khám răng.",
        "dictionaryForm": ""
      },
      {
        "id": 1521,
        "word": "独身",
        "reading": "どくしん",
        "romaji": "dokushin",
        "meaning": "Độc thân",
        "hanViet": "Độc Thân",
        "type": "Danh từ",
        "exampleSentence": "ミラーさんは 独身です。",
        "exampleSentenceReading": "みらーさんは どくしんです。",
        "exampleSentenceMeaning": "Anh Miller còn độc thân.",
        "dictionaryForm": ""
      },
      {
        "id": 1522,
        "word": "すみません",
        "reading": "すみません",
        "romaji": "sumimasen",
        "meaning": "Xin lỗi",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "すみません、写真を 撮っても いいですか。",
        "exampleSentenceReading": "すみません、しゃしんを とっても いいですか。",
        "exampleSentenceMeaning": "Xin lỗi, tôi chụp ảnh có được không?",
        "dictionaryForm": ""
      },
      {
        "id": 1523,
        "word": "皆さん",
        "reading": "みなさん",
        "romaji": "minasan",
        "meaning": "Kính thưa quý vị / Các bạn",
        "hanViet": "Giai",
        "type": "Danh từ",
        "exampleSentence": "皆さん、聞いてください。",
        "exampleSentenceReading": "みなさん、きいてください。",
        "exampleSentenceMeaning": "Mọi người xin hãy lắng nghe.",
        "dictionaryForm": ""
      },
      {
        "id": 1524,
        "word": "思い出します",
        "reading": "おもいだします",
        "romaji": "omoidashimasu",
        "meaning": "Nhớ lại / Hồi tưởng",
        "hanViet": "Tư Xuất",
        "type": "Động từ nhóm 1",
        "exampleSentence": "家族を 思い出します。",
        "exampleSentenceReading": "かぞくを おもいだします。",
        "exampleSentenceMeaning": "Tôi nhớ về gia đình.",
        "dictionaryForm": "思い出す (おもいだす)"
      },
      {
        "id": 1525,
        "word": "いらっしゃいます",
        "reading": "いらっしゃいます",
        "romaji": "irasshaimasu",
        "meaning": "Có mặt / Ở (kính ngữ của います)",
        "hanViet": "",
        "type": "Động từ nhóm 1",
        "exampleSentence": "先生は いらっしゃいますか。",
        "exampleSentenceReading": "せんせいは いらっしゃいますか。",
        "exampleSentenceMeaning": "Thầy giáo có ở đây không ạ?",
        "dictionaryForm": "いらっしゃる"
      },
      {
        "id": 1527,
        "word": "専門",
        "reading": "せんもん",
        "romaji": "senmon",
        "meaning": "Chuyên môn",
        "hanViet": "Chuyên Môn",
        "type": "Danh từ",
        "exampleSentence": "専門は 経済です。",
        "exampleSentenceReading": "せんもんは けいざいです。",
        "exampleSentenceMeaning": "Chuyên môn của tôi là kinh tế.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Vても いいですか (Làm V có được không?)",
        "pattern": "Vて + も いいですか",
        "explanation": "Mẫu câu dùng để xin phép đối phương làm việc gì đó. Trả lời: ええ、いいですよ hoặc すみません、ちょっと...",
        "examples": [
          {
            "japanese": "ここで 写真を 撮っても いいですか。ー ええ、いいですよ。",
            "reading": "ここで しゃしんを とっても いいですか。ー ええ、いいですよ。",
            "vietnamese": "Tôi chụp ảnh ở đây có được không? - Vâng, được chứ."
          }
        ]
      },
      {
        "title": "Vては いけません (Không được làm V)",
        "pattern": "Vて + は いけません",
        "explanation": "Mẫu câu cấm đoán hoặc nhắc nhở không được phép thực hiện hành động.",
        "examples": [
          {
            "japanese": "ここで たばこを 吸っては いけません。",
            "reading": "ここで たばこを すっては いけません。",
            "vietnamese": "Không được hút thuốc ở đây."
          }
        ]
      },
      {
        "title": "Vています (Biểu thị trạng thái kết quả lâu dài)",
        "pattern": "Vて + います",
        "explanation": "Dùng cho các động từ diễn tả trạng thái còn lưu lại kết quả: kết hôn (けっこんしています), biết (しっています), sống tại đâu (すんでいます).",
        "examples": [
          {
            "japanese": "わたしは 鈴木さんを 知っています。",
            "reading": "わたしは すずきさんを しっています。",
            "vietnamese": "Tôi biết anh Suzuki."
          },
          {
            "japanese": "ミラーさんは 大阪に 住んでいます。",
            "reading": "みらーさんは おおさかに すんでいます。",
            "vietnamese": "Anh Miller đang sống ở Osaka."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 16,
    "title": "Bài 16: Nối câu & Trình tự hành động",
    "japaneseTitle": "第１６課：てから・ nối tính từ",
    "description": "Nối các hành động liên tiếp Vて, thứ tự trước sau Vてから, nối tính từ (くて, で), miêu tả đặc điểm N1 は N2 が A.",
    "vocabularies": [
      {
        "id": 1601,
        "word": "乗ります",
        "reading": "のります",
        "romaji": "norimasu",
        "meaning": "Lên (xe, tàu [に])",
        "hanViet": "Thừa",
        "type": "Động từ nhóm 1",
        "exampleSentence": "電車に 乗ります。",
        "exampleSentenceReading": "でんしゃに のります。",
        "exampleSentenceMeaning": "Tôi lên tàu điện.",
        "dictionaryForm": "乗る (のる)"
      },
      {
        "id": 1602,
        "word": "降ります",
        "reading": "おります",
        "romaji": "orimasu",
        "meaning": "Xuống (xe, tàu [を])",
        "hanViet": "Hàng",
        "type": "Động từ nhóm 2",
        "exampleSentence": "駅で 電車を 降ります。",
        "exampleSentenceReading": "えきで でんしゃを おります。",
        "exampleSentenceMeaning": "Tôi xuống tàu ở nhà ga.",
        "dictionaryForm": "降りる (おりる)"
      },
      {
        "id": 1603,
        "word": "乗り換えます",
        "reading": "のりかえます",
        "romaji": "norikaemasu",
        "meaning": "Chuyển tàu / Đổi xe",
        "hanViet": "Thừa Hoán",
        "type": "Động từ nhóm 2",
        "exampleSentence": "新宿で 地下鉄に 乗り換えます。",
        "exampleSentenceReading": "しんじゅくで ちかてつに のりかえます。",
        "exampleSentenceMeaning": "Tôi đổi sang tàu ngầm ở Shinjuku.",
        "dictionaryForm": "乗り換える (のりかえる)"
      },
      {
        "id": 1604,
        "word": "浴びます",
        "reading": "あびます",
        "romaji": "abimasu",
        "meaning": "Tắm (vòi sen)",
        "hanViet": "Dục",
        "type": "Động từ nhóm 2",
        "exampleSentence": "朝 シャワーを 浴びます。",
        "exampleSentenceReading": "あさ しゃわーを あびます。",
        "exampleSentenceMeaning": "Buổi sáng tôi tắm vòi sen.",
        "dictionaryForm": "浴びる (あびる)"
      },
      {
        "id": 1605,
        "word": "入れます",
        "reading": "いれます",
        "romaji": "iremasu",
        "meaning": "Cho vào / Bỏ vào",
        "hanViet": "Nhập",
        "type": "Động từ nhóm 2",
        "exampleSentence": "コーヒーに 砂糖を 入れます。",
        "exampleSentenceReading": "こーひーに さとうを いれます。",
        "exampleSentenceMeaning": "Cho đường vào cà phê.",
        "dictionaryForm": "入れる (いれる)"
      },
      {
        "id": 1606,
        "word": "出します",
        "reading": "だします",
        "romaji": "dashimasu",
        "meaning": "Lấy ra / Rút (tiền)",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 1",
        "exampleSentence": "銀行で お金を 出します。",
        "exampleSentenceReading": "ぎんこうで おかねを だします。",
        "exampleSentenceMeaning": "Tôi rút tiền ở ngân hàng.",
        "dictionaryForm": "出す (だす)"
      },
      {
        "id": 1607,
        "word": "下ろします",
        "reading": "おろします",
        "romaji": "oroshimasu",
        "meaning": "Rút tiền (ngân hàng)",
        "hanViet": "Hạ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ATMで お金を 下ろします。",
        "exampleSentenceReading": "ATMで おかねを おろします。",
        "exampleSentenceMeaning": "Rút tiền ở cây ATM.",
        "dictionaryForm": "下ろす (おろす)"
      },
      {
        "id": 1608,
        "word": "入ります",
        "reading": "はいります",
        "romaji": "hairimasu",
        "meaning": "Vào học (đại học [に])",
        "hanViet": "Nhập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "大学に 入ります。",
        "exampleSentenceReading": "だいがくに はいります。",
        "exampleSentenceMeaning": "Tôi đỗ vào trường đại học.",
        "dictionaryForm": "入る (はいる)"
      },
      {
        "id": 1609,
        "word": "出ます",
        "reading": "でます",
        "romaji": "demasu",
        "meaning": "Tốt nghiệp (đại học [を])",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 2",
        "exampleSentence": "大学を 出ました。",
        "exampleSentenceReading": "だいがくを でました。",
        "exampleSentenceMeaning": "Tôi đã tốt nghiệp đại học.",
        "dictionaryForm": "出る (でる)"
      },
      {
        "id": 1610,
        "word": "押します",
        "reading": "おします",
        "romaji": "oshimasu",
        "meaning": "Ấn / Bấm (nút)",
        "hanViet": "Áp",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ボタンを 押します。",
        "exampleSentenceReading": "ぼたんを おします。",
        "exampleSentenceMeaning": "Bấm nút bấm.",
        "dictionaryForm": "押す (おす)"
      },
      {
        "id": 1611,
        "word": "飲みます",
        "reading": "のみます",
        "romaji": "nomimasu",
        "meaning": "Uống (rượu)",
        "hanViet": "Ẩm",
        "type": "Động từ nhóm 1",
        "exampleSentence": "友達と お酒を 飲みます。",
        "exampleSentenceReading": "ともだちと おさけを のみます。",
        "exampleSentenceMeaning": "Tôi uống rượu cùng bạn.",
        "dictionaryForm": "飲む (のむ)"
      },
      {
        "id": 1612,
        "word": "始めます",
        "reading": "はじめます",
        "romaji": "hajimemasu",
        "meaning": "Bắt đầu làm gì",
        "hanViet": "Thủy",
        "type": "Động từ nhóm 2",
        "exampleSentence": "仕事を 始めます。",
        "exampleSentenceReading": "しごとを はじめます。",
        "exampleSentenceMeaning": "Tôi bắt đầu làm việc.",
        "dictionaryForm": "始める (はじめる)"
      },
      {
        "id": 1613,
        "word": "見学します",
        "reading": "けんがくします",
        "romaji": "kengakushimasu",
        "meaning": "Tham quan học tập",
        "hanViet": "Kiến Học",
        "type": "Động từ nhóm 3",
        "exampleSentence": "工場を 見学します。",
        "exampleSentenceReading": "こうじょうを けんがくします。",
        "exampleSentenceMeaning": "Đi tham quan nhà máy.",
        "dictionaryForm": "見学する (けんがくする)"
      },
      {
        "id": 1614,
        "word": "電話します",
        "reading": "でんわします",
        "romaji": "denwashimasu",
        "meaning": "Gọi điện thoại",
        "hanViet": "Điện Thoại",
        "type": "Động từ nhóm 3",
        "exampleSentence": "家族に 電話します。",
        "exampleSentenceReading": "かぞくに でんわします。",
        "exampleSentenceMeaning": "Tôi gọi điện cho gia đình.",
        "dictionaryForm": "電話する (でんわする)"
      },
      {
        "id": 1615,
        "word": "若い",
        "reading": "わかい",
        "romaji": "wakai",
        "meaning": "Trẻ tuổi",
        "hanViet": "Nhược",
        "type": "Tính từ -i",
        "exampleSentence": "あの先生は 若いです。",
        "exampleSentenceReading": "あのせんせいは わかいです。",
        "exampleSentenceMeaning": "Thầy giáo kia trẻ tuổi.",
        "dictionaryForm": ""
      },
      {
        "id": 1616,
        "word": "長い",
        "reading": "ながい",
        "romaji": "nagai",
        "meaning": "Dài",
        "hanViet": "Trường",
        "type": "Tính từ -i",
        "exampleSentence": "髪が 長いです。",
        "exampleSentenceReading": "かみが ながいです。",
        "exampleSentenceMeaning": "Tóc dài.",
        "dictionaryForm": ""
      },
      {
        "id": 1617,
        "word": "短い",
        "reading": "みじかい",
        "romaji": "mijikai",
        "meaning": "Ngắn",
        "hanViet": "Đoản",
        "type": "Tính từ -i",
        "exampleSentence": "夏休みは 短かったです。",
        "exampleSentenceReading": "なつやすみは みじかかったです。",
        "exampleSentenceMeaning": "Kỳ nghỉ hè ngắn quá.",
        "dictionaryForm": ""
      },
      {
        "id": 1618,
        "word": "明るい",
        "reading": "あかるい",
        "romaji": "akarui",
        "meaning": "Sáng sủa / Vui tươi",
        "hanViet": "Minh",
        "type": "Tính từ -i",
        "exampleSentence": "部屋が 明るいです。",
        "exampleSentenceReading": "へやが あかるいです。",
        "exampleSentenceMeaning": "Căn phòng sáng sủa.",
        "dictionaryForm": ""
      },
      {
        "id": 1619,
        "word": "暗い",
        "reading": "くらい",
        "romaji": "kurai",
        "meaning": "Tối tăm / U ám",
        "hanViet": "Ám",
        "type": "Tính từ -i",
        "exampleSentence": "夜は 暗くて 危ないです。",
        "exampleSentenceReading": "よるは くらくて あぶないです。",
        "exampleSentenceMeaning": "Ban đêm trời tối nguy hiểm.",
        "dictionaryForm": ""
      },
      {
        "id": 1620,
        "word": "体",
        "reading": "からだ",
        "romaji": "karada",
        "meaning": "Cơ thể / Thân thể",
        "hanViet": "Thể",
        "type": "Danh từ",
        "exampleSentence": "体に 気をつけてください。",
        "exampleSentenceReading": "からだに きをつけてください。",
        "exampleSentenceMeaning": "Hãy giữ gìn sức khỏe.",
        "dictionaryForm": ""
      },
      {
        "id": 1621,
        "word": "頭",
        "reading": "あたま",
        "romaji": "atama",
        "meaning": "Đầu / Trí óc",
        "hanViet": "Đầu",
        "type": "Danh từ",
        "exampleSentence": "頭が いいですね。",
        "exampleSentenceReading": "あたまが いいですね。",
        "exampleSentenceMeaning": "Thông minh thật đấy.",
        "dictionaryForm": ""
      },
      {
        "id": 1622,
        "word": "髪",
        "reading": "かみ",
        "romaji": "kami",
        "meaning": "Tóc",
        "hanViet": "Phát",
        "type": "Danh từ",
        "exampleSentence": "黒い 髪が きれいです。",
        "exampleSentenceReading": "くろい かみが きれいです。",
        "exampleSentenceMeaning": "Mái tóc đen thật đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 1623,
        "word": "顔",
        "reading": "かお",
        "romaji": "kao",
        "meaning": "Khuôn mặt",
        "hanViet": "Nhan",
        "type": "Danh từ",
        "exampleSentence": "朝 顔を 洗います。",
        "exampleSentenceReading": "あさ かおを あらいます。",
        "exampleSentenceMeaning": "Buổi sáng tôi rửa mặt.",
        "dictionaryForm": ""
      },
      {
        "id": 1624,
        "word": "目",
        "reading": "め",
        "romaji": "me",
        "meaning": "Mắt",
        "hanViet": "Mục",
        "type": "Danh từ",
        "exampleSentence": "目が 大きいです。",
        "exampleSentenceReading": "めが おおきいです。",
        "exampleSentenceMeaning": "Đôi mắt to tròn.",
        "dictionaryForm": ""
      },
      {
        "id": 1625,
        "word": "耳",
        "reading": "みみ",
        "romaji": "mimi",
        "meaning": "Tai",
        "hanViet": "Nhĩ",
        "type": "Danh từ",
        "exampleSentence": "耳が 痛いです。",
        "exampleSentenceReading": "みみが いたいです。",
        "exampleSentenceMeaning": "Tôi bị đau tai.",
        "dictionaryForm": ""
      },
      {
        "id": 1626,
        "word": "鼻",
        "reading": "はな",
        "romaji": "hana",
        "meaning": "Mũi",
        "hanViet": "Tị",
        "type": "Danh từ",
        "exampleSentence": "鼻が 高いです。",
        "exampleSentenceReading": "はなが たかいです。",
        "exampleSentenceMeaning": "Mũi cao.",
        "dictionaryForm": ""
      },
      {
        "id": 1627,
        "word": "口",
        "reading": "くち",
        "romaji": "kuchi",
        "meaning": "Miệng",
        "hanViet": "Khẩu",
        "type": "Danh từ",
        "exampleSentence": "口を 開けてください。",
        "exampleSentenceReading": "くちを あけてください。",
        "exampleSentenceMeaning": "Xin hãy mở miệng ra.",
        "dictionaryForm": ""
      },
      {
        "id": 1628,
        "word": "歯",
        "reading": "は",
        "romaji": "ha",
        "meaning": "Răng",
        "hanViet": "Xỉ",
        "type": "Danh từ",
        "exampleSentence": "毎朝 歯を 磨きます。",
        "exampleSentenceReading": "まいあさ はを みがきます。",
        "exampleSentenceMeaning": "Mỗi sáng tôi đánh răng.",
        "dictionaryForm": ""
      },
      {
        "id": 1629,
        "word": "おなか",
        "reading": "おなか",
        "romaji": "onaka",
        "meaning": "Bụng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "おなかが 痛いです。",
        "exampleSentenceReading": "おなかが いたいです。",
        "exampleSentenceMeaning": "Tôi bị đau bụng.",
        "dictionaryForm": ""
      },
      {
        "id": 1630,
        "word": "足",
        "reading": "あし",
        "romaji": "ashi",
        "meaning": "Chân",
        "hanViet": "Túc",
        "type": "Danh từ",
        "exampleSentence": "足が 速いです。",
        "exampleSentenceReading": "あしが はやいです。",
        "exampleSentenceMeaning": "Chạy rất nhanh.",
        "dictionaryForm": ""
      },
      {
        "id": 1631,
        "word": "背",
        "reading": "せ",
        "romaji": "se",
        "meaning": "Lưng / Chiều cao",
        "hanViet": "Bối",
        "type": "Danh từ",
        "exampleSentence": "背が 高いです。",
        "exampleSentenceReading": "せが たかいです。",
        "exampleSentenceMeaning": "Dáng người cao ráo.",
        "dictionaryForm": ""
      },
      {
        "id": 1632,
        "word": "シャワー",
        "reading": "シャワー",
        "romaji": "shawaa",
        "meaning": "Vòi hoa sen",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "シャワーを 浴びます。",
        "exampleSentenceReading": "しゃわーを あびます。",
        "exampleSentenceMeaning": "Tắm vòi sen.",
        "dictionaryForm": ""
      },
      {
        "id": 1633,
        "word": "緑",
        "reading": "みどり",
        "romaji": "midori",
        "meaning": "Màu xanh lá cây",
        "hanViet": "Lục",
        "type": "Danh từ",
        "exampleSentence": "緑が 多い 町です。",
        "exampleSentenceReading": "みどりが おおい まちです。",
        "exampleSentenceMeaning": "Thành phố có nhiều cây xanh.",
        "dictionaryForm": ""
      },
      {
        "id": 1634,
        "word": "お寺",
        "reading": "おてら",
        "romaji": "otera",
        "meaning": "Chùa chiền",
        "hanViet": "Tự",
        "type": "Danh từ",
        "exampleSentence": "古い お寺を 参拝します。",
        "exampleSentenceReading": "ふるい おてらを さんぱいします。",
        "exampleSentenceMeaning": "Đi viếng ngôi chùa cổ.",
        "dictionaryForm": ""
      },
      {
        "id": 1635,
        "word": "神社",
        "reading": "じんじゃ",
        "romaji": "jinja",
        "meaning": "Đền Thần đạo (Shinto)",
        "hanViet": "Thần Xã",
        "type": "Danh từ",
        "exampleSentence": "正月に 神社へ 行きます。",
        "exampleSentenceReading": "しょうがつに じんじゃへ いきます。",
        "exampleSentenceMeaning": "Tết đi lễ đền Thần đạo.",
        "dictionaryForm": ""
      },
      {
        "id": 1636,
        "word": "どうやって",
        "reading": "どうやって",
        "romaji": "dou yatte",
        "meaning": "Làm thế nào / Đi bằng cách nào",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "大学まで どうやって 行きますか。",
        "exampleSentenceReading": "だいがくまで どうやって いきますか。",
        "exampleSentenceMeaning": "Đi đến trường bằng cách nào thế?",
        "dictionaryForm": ""
      },
      {
        "id": 1637,
        "word": "どの～",
        "reading": "どの～",
        "romaji": "dono-",
        "meaning": "Cái nào (trong số nhiều cái)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "どの傘が あなたのですか。",
        "exampleSentenceReading": "どのかさが あなたのですか。",
        "exampleSentenceMeaning": "Cái ô nào là của bạn?",
        "dictionaryForm": ""
      },
      {
        "id": 1638,
        "word": "やめます",
        "reading": "やめます",
        "romaji": "yamemasu",
        "meaning": "Bỏ / Thôi (việc)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "会社を やめます。",
        "exampleSentenceReading": "かいしゃを やめます。",
        "exampleSentenceMeaning": "Nghỉ việc công ty.",
        "dictionaryForm": "やめる"
      }
    ],
    "grammarPoints": [
      {
        "title": "V1て、V2て、... V (Nối chuỗi hành động)",
        "pattern": "V1て、V2て、[Hành động cuối]",
        "explanation": "Dùng thể て để liệt kê các hành động xảy ra theo trình tự thời gian liên tiếp nhau.",
        "examples": [
          {
            "japanese": "朝 起きて、顔を 洗って、ご飯を 食べます。",
            "reading": "あさ おきて、かおを あらって、ごはんを たべます。",
            "vietnamese": "Buổi sáng thức dậy, rửa mặt rồi ăn cơm."
          }
        ]
      },
      {
        "title": "V1てから、V2 (Sau khi làm V1 thì làm V2)",
        "pattern": "V1て + から + V2",
        "explanation": "Nhấn mạnh hành động V2 chỉ được tiến hành sau khi đã hoàn tất xong hành động V1.",
        "examples": [
          {
            "japanese": "国へ 帰ってから、父の 会社で 働きます。",
            "reading": "くにへ かえってから、ちちの かいしゃで はたらきます。",
            "vietnamese": "Sau khi về nước tôi sẽ làm việc ở công ty của bố."
          }
        ]
      },
      {
        "title": "Cách nối tính từ",
        "pattern": "Tính từ -i: Bỏ い + くて | Tính từ -na: + で",
        "explanation": "Nối các tính từ cùng loại hoặc bổ sung đặc điểm cho nhau. Tính từ -i đổi い thành くて, tính từ -na thêm で.",
        "examples": [
          {
            "japanese": "ミラーさんは 若くて、元気です。",
            "reading": "みらーさんは わかくて、げんきです。",
            "vietnamese": "Anh Miller trẻ và khỏe mạnh."
          },
          {
            "japanese": "この部屋は 静かで、きれいです。",
            "reading": "このへやは しずかで、きれいです。",
            "vietnamese": "Căn phòng này yên tĩnh và đẹp."
          }
        ]
      },
      {
        "title": "N1 は N2 が [Tính từ] (Đặc điểm bộ phận)",
        "pattern": "N1 は N2 が + Tính từ",
        "explanation": "Miêu tả thuộc tính, đặc điểm của một bộ phận N2 thuộc chủ thể N1.",
        "examples": [
          {
            "japanese": "マリアさんは 髪が 長いです。",
            "reading": "まりあさんは かみが ながいです。",
            "vietnamese": "Chị Maria có mái tóc dài."
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
        "word": "覚えます",
        "reading": "おぼえます",
        "romaji": "oboemasu",
        "meaning": "Ghi nhớ / Thuộc lòng",
        "hanViet": "Giác",
        "type": "Động từ nhóm 2",
        "exampleSentence": "漢字を 覚えます。",
        "exampleSentenceReading": "かんじを おぼえます。",
        "exampleSentenceMeaning": "Tôi học thuộc chữ Hán.",
        "dictionaryForm": "覚える (おぼえる)"
      },
      {
        "id": 1702,
        "word": "忘れます",
        "reading": "わすれます",
        "romaji": "wasuremasu",
        "meaning": "Quên / Bỏ quên",
        "hanViet": "Vong",
        "type": "Động từ nhóm 2",
        "exampleSentence": "傘を 忘れました。",
        "exampleSentenceReading": "かさを わすれました。",
        "exampleSentenceMeaning": "Tôi bỏ quên ô rồi.",
        "dictionaryForm": "忘れる (わすれる)"
      },
      {
        "id": 1703,
        "word": "なくします",
        "reading": "なくします",
        "romaji": "nakushimasu",
        "meaning": "Làm mất / Đánh rơi",
        "hanViet": "",
        "type": "Động từ nhóm 1",
        "exampleSentence": "財布を なくしました。",
        "exampleSentenceReading": "さいふを なくしました。",
        "exampleSentenceMeaning": "Tôi làm mất ví tiền.",
        "dictionaryForm": "なくす"
      },
      {
        "id": 1704,
        "word": "払います",
        "reading": "はらいます",
        "romaji": "haraimasu",
        "meaning": "Trả tiền / Thanh toán",
        "hanViet": "Phất",
        "type": "Động từ nhóm 1",
        "exampleSentence": "現金で 払います。",
        "exampleSentenceReading": "げんきんで はらいます。",
        "exampleSentenceMeaning": "Tôi trả bằng tiền mặt.",
        "dictionaryForm": "払う (はらう)"
      },
      {
        "id": 1705,
        "word": "返します",
        "reading": "かえします",
        "romaji": "kaeshimasu",
        "meaning": "Trả lại (đồ vật)",
        "hanViet": "Phản",
        "type": "Động từ nhóm 1",
        "exampleSentence": "本を 返します。",
        "exampleSentenceReading": "ほんを かえします。",
        "exampleSentenceMeaning": "Tôi trả lại sách.",
        "dictionaryForm": "返す (かえす)"
      },
      {
        "id": 1706,
        "word": "出かけます",
        "reading": "でかけます",
        "romaji": "dekakemasu",
        "meaning": "Đi ra ngoài",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 2",
        "exampleSentence": "友達と 出かけます。",
        "exampleSentenceReading": "ともだちと でかけます。",
        "exampleSentenceMeaning": "Tôi đi ra ngoài với bạn.",
        "dictionaryForm": "出かける (でかける)"
      },
      {
        "id": 1707,
        "word": "脱ぎます",
        "reading": "ぬぎます",
        "romaji": "nugimasu",
        "meaning": "Cởi (quần áo, giày dép)",
        "hanViet": "Thoát",
        "type": "Động từ nhóm 1",
        "exampleSentence": "靴を 脱いでください。",
        "exampleSentenceReading": "くつを ぬいでください。",
        "exampleSentenceMeaning": "Xin hãy cởi giày ra.",
        "dictionaryForm": "脱ぐ (ぬぐ)"
      },
      {
        "id": 1708,
        "word": "持って行きます",
        "reading": "もっていきます",
        "romaji": "motte ikimasu",
        "meaning": "Mang theo / Cầm đi",
        "hanViet": "Trì Hành",
        "type": "Động từ nhóm 1",
        "exampleSentence": "傘を 持って行きます。",
        "exampleSentenceReading": "かさを もっていきます。",
        "exampleSentenceMeaning": "Tôi mang theo ô.",
        "dictionaryForm": "持って行く (もっていく)"
      },
      {
        "id": 1709,
        "word": "持って来ます",
        "reading": "もってきます",
        "romaji": "motte kimasu",
        "meaning": "Mang đến / Cầm lại đây",
        "hanViet": "Trì Lai",
        "type": "Động từ nhóm 3",
        "exampleSentence": "パスポートを 持って来てください。",
        "exampleSentenceReading": "ぱすぽーとを もってきてください。",
        "exampleSentenceMeaning": "Xin hãy mang hộ chiếu đến.",
        "dictionaryForm": "持って来る (もってくる)"
      },
      {
        "id": 1710,
        "word": "心配します",
        "reading": "しんぱいします",
        "romaji": "shinpaishimasu",
        "meaning": "Lo lắng",
        "hanViet": "Tâm Phối",
        "type": "Động từ nhóm 3",
        "exampleSentence": "心配しないでください。",
        "exampleSentenceReading": "しんぱいしないでください。",
        "exampleSentenceMeaning": "Xin đừng lo lắng.",
        "dictionaryForm": "心配する (しんぱいする)"
      },
      {
        "id": 1711,
        "word": "残業します",
        "reading": "ざんぎょうします",
        "romaji": "zangyoushimasu",
        "meaning": "Làm thêm giờ (Overtime)",
        "hanViet": "Tàn Nghiệp",
        "type": "Động từ nhóm 3",
        "exampleSentence": "今日は 残業します。",
        "exampleSentenceReading": "きょうは ざんぎょうします。",
        "exampleSentenceMeaning": "Hôm nay tôi làm thêm giờ.",
        "dictionaryForm": "残業する (ざんぎょうする)"
      },
      {
        "id": 1712,
        "word": "出張します",
        "reading": "しゅっちょうします",
        "romaji": "shutchoushimasu",
        "meaning": "Đi công tác",
        "hanViet": "Xuất Trương",
        "type": "Động từ nhóm 3",
        "exampleSentence": "来週 大阪へ 出張します。",
        "exampleSentenceReading": "らいしゅう おおさかへ しゅっちょうします。",
        "exampleSentenceMeaning": "Tuần sau tôi đi công tác Osaka.",
        "dictionaryForm": "出張する (しゅっちょうする)"
      },
      {
        "id": 1713,
        "word": "大切[な]",
        "reading": "たいせつ[な]",
        "romaji": "taisetsu[na]",
        "meaning": "Quan trọng / Quý giá",
        "hanViet": "Đại Thiết",
        "type": "Tính từ -na",
        "exampleSentence": "大切な 約束です。",
        "exampleSentenceReading": "たいせつな やくそくです。",
        "exampleSentenceMeaning": "Một cuộc hẹn quan trọng.",
        "dictionaryForm": ""
      },
      {
        "id": 1714,
        "word": "大丈夫[な]",
        "reading": "だいじょうぶ[な]",
        "romaji": "daijoubu[na]",
        "meaning": "Không sao / Ổn thỏa",
        "hanViet": "Đại Trượng Phu",
        "type": "Tính từ -na",
        "exampleSentence": "大丈夫ですか。はい、大丈夫です。",
        "exampleSentenceReading": "だいじょうぶですか。はい、だいじょうぶです。",
        "exampleSentenceMeaning": "Bạn có sao không? Tôi không sao.",
        "dictionaryForm": ""
      },
      {
        "id": 1715,
        "word": "危ない",
        "reading": "あぶない",
        "romaji": "abunai",
        "meaning": "Nguy hiểm",
        "hanViet": "Nguy",
        "type": "Tính từ -i",
        "exampleSentence": "ここは 危ないです。",
        "exampleSentenceReading": "ここは あぶないです。",
        "exampleSentenceMeaning": "Chỗ này rất nguy hiểm.",
        "dictionaryForm": ""
      },
      {
        "id": 1716,
        "word": "禁煙",
        "reading": "きんえん",
        "romaji": "kin'en",
        "meaning": "Cấm hút thuốc",
        "hanViet": "Cấm Yên",
        "type": "Danh từ",
        "exampleSentence": "ここは 禁煙です。",
        "exampleSentenceReading": "ここは きんえんです。",
        "exampleSentenceMeaning": "Ở đây cấm hút thuốc.",
        "dictionaryForm": ""
      },
      {
        "id": 1717,
        "word": "健康保険証",
        "reading": "けんこうほけんしょう",
        "romaji": "kenkou hokenshou",
        "meaning": "Thẻ bảo hiểm y tế",
        "hanViet": "Kiện Khang Bảo Hiểm Chứng",
        "type": "Danh từ",
        "exampleSentence": "健康保険証を 見せてください。",
        "exampleSentenceReading": "けんこうほけんしょうを みせてください。",
        "exampleSentenceMeaning": "Xin hãy xuất trình thẻ BHYT.",
        "dictionaryForm": ""
      },
      {
        "id": 1718,
        "word": "熱",
        "reading": "ねつ",
        "romaji": "netsu",
        "meaning": "Sốt / Nhiệt độ cao",
        "hanViet": "Nhiệt",
        "type": "Danh từ",
        "exampleSentence": "熱が あります。",
        "exampleSentenceReading": "ねつが あります。",
        "exampleSentenceMeaning": "Tôi bị sốt rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 1719,
        "word": "病気",
        "reading": "びょうき",
        "romaji": "byouki",
        "meaning": "Ốm đau / Bệnh tật",
        "hanViet": "Bệnh Khí",
        "type": "Danh từ",
        "exampleSentence": "病気で 休みます。",
        "exampleSentenceReading": "びょうきで やすみます。",
        "exampleSentenceMeaning": "Nghỉ học vì bị ốm.",
        "dictionaryForm": ""
      },
      {
        "id": 1720,
        "word": "薬",
        "reading": "くすり",
        "romaji": "kusuri",
        "meaning": "Thuốc uống",
        "hanViet": "Dược",
        "type": "Danh từ",
        "exampleSentence": "食後に 薬を 飲みます。",
        "exampleSentenceReading": "しょくごに くすりを のみます。",
        "exampleSentenceMeaning": "Uống thuốc sau bữa ăn.",
        "dictionaryForm": ""
      },
      {
        "id": 1721,
        "word": "おふろ",
        "reading": "おふろ",
        "romaji": "ofuro",
        "meaning": "Bồn tắm kiểu Nhật",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "おふろに 入ります。",
        "exampleSentenceReading": "おふろに はいります。",
        "exampleSentenceMeaning": "Tôi đi ngâm bồn tắm.",
        "dictionaryForm": ""
      },
      {
        "id": 1722,
        "word": "上着",
        "reading": "うわぎ",
        "romaji": "uwagi",
        "meaning": "Áo khoác bên ngoài",
        "hanViet": "Thượng Trước",
        "type": "Danh từ",
        "exampleSentence": "寒いから 上着を 着ます。",
        "exampleSentenceReading": "さむいから うわぎを きます。",
        "exampleSentenceMeaning": "Vì trời lạnh nên tôi mặc áo khoác.",
        "dictionaryForm": ""
      },
      {
        "id": 1723,
        "word": "下着",
        "reading": "したぎ",
        "romaji": "shitagi",
        "meaning": "Quần áo lót",
        "hanViet": "Hạ Trước",
        "type": "Danh từ",
        "exampleSentence": "下着を 洗濯します。",
        "exampleSentenceReading": "したぎを せんたくします。",
        "exampleSentenceMeaning": "Giặt đồ lót.",
        "dictionaryForm": ""
      },
      {
        "id": 1724,
        "word": "～までに",
        "reading": "～までに",
        "romaji": "-made ni",
        "meaning": "Trước... (hạn chót)",
        "hanViet": "",
        "type": "Trợ từ",
        "exampleSentence": "5時までに レポートを 出します。",
        "exampleSentenceReading": "ごじまでに れぽーとを だします。",
        "exampleSentenceMeaning": "Nộp báo cáo trước 5 giờ.",
        "dictionaryForm": ""
      },
      {
        "id": 1725,
        "word": "ですから",
        "reading": "ですから",
        "romaji": "desukara",
        "meaning": "Vì vậy / Do đó",
        "hanViet": "",
        "type": "Liên từ",
        "exampleSentence": "雨です。ですから、傘を 持ちます。",
        "exampleSentenceReading": "あめです。ですから、かさを もちます。",
        "exampleSentenceMeaning": "Trời mưa, do đó tôi mang ô.",
        "dictionaryForm": ""
      },
      {
        "id": 1726,
        "word": "どうしましたか",
        "reading": "どうしましたか",
        "romaji": "dou shimashita ka",
        "meaning": "Bạn bị làm sao thế?",
        "hanViet": "",
        "type": "Giao tiếp",
        "exampleSentence": "顔色が 悪いです。どうしましたか。",
        "exampleSentenceReading": "かおいろが わるいです。どうしましたか。",
        "exampleSentenceMeaning": "Sắc mặt kém quá, bạn bị sao thế?",
        "dictionaryForm": ""
      },
      {
        "id": 1727,
        "word": "のど",
        "reading": "のど",
        "romaji": "nodo",
        "meaning": "Cổ họng",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "のどが 痛いです。",
        "exampleSentenceReading": "のどが いたいです。",
        "exampleSentenceMeaning": "Tôi bị đau họng.",
        "dictionaryForm": ""
      },
      {
        "id": 1728,
        "word": "痛い",
        "reading": "いたい",
        "romaji": "itai",
        "meaning": "Đau",
        "hanViet": "Thống",
        "type": "Tính từ -i",
        "exampleSentence": "頭が 痛いです。",
        "exampleSentenceReading": "あたまが いたいです。",
        "exampleSentenceMeaning": "Tôi bị đau đầu.",
        "dictionaryForm": ""
      },
      {
        "id": 1729,
        "word": "風邪",
        "reading": "かぜ",
        "romaji": "kaze",
        "meaning": "Cảm cúm / Cảm lạnh",
        "hanViet": "Phong Tà",
        "type": "Danh từ",
        "exampleSentence": "風邪を ひきました。",
        "exampleSentenceReading": "かぜを ひきました。",
        "exampleSentenceMeaning": "Tôi bị cảm cúm rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 1730,
        "word": "お大事に",
        "reading": "おだいじに",
        "romaji": "odaiji ni",
        "meaning": "Chúc mau khỏi bệnh nhé",
        "hanViet": "Đại Sự",
        "type": "Chào hỏi",
        "exampleSentence": "無理を しないで、お大事に。",
        "exampleSentenceReading": "むりを しないで、おだいじに。",
        "exampleSentenceMeaning": "Đừng gắng sức, chúc bạn mau khỏi nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 1731,
        "word": "薬を飲みます",
        "reading": "くすりをのみます",
        "romaji": "kusuri o nomimasu",
        "meaning": "Uống thuốc",
        "hanViet": "Dược",
        "type": "Động từ nhóm 1",
        "exampleSentence": "風邪の 薬を 飲みます。",
        "exampleSentenceReading": "かぜの くすりを のみます。",
        "exampleSentenceMeaning": "Uống thuốc cảm cúm.",
        "dictionaryForm": "薬を飲む (くすりをのむ)"
      }
    ],
    "grammarPoints": [
      {
        "title": "Quy tắc chia thể ない (Nai-form)",
        "pattern": "Nhóm 1: âm い chuyển sang âm あ + ない | Nhóm 2: Bỏ ます + ない | Nhóm 3: しない, こない",
        "explanation": "Chia thể phủ định ngắn (Nai-form). Chú ý いきます -> いかない, あります -> ない.",
        "examples": [
          {
            "japanese": "かきます → かかない",
            "reading": "かきます → かかない",
            "vietnamese": "Viết → Không viết"
          },
          {
            "japanese": "たべます → たべない",
            "reading": "たべます → たべない",
            "vietnamese": "Ăn → Không ăn"
          }
        ]
      },
      {
        "title": "Vないで ください (Xin đừng làm V)",
        "pattern": "Vない + で ください",
        "explanation": "Mẫu câu khuyên can, yêu cầu đối phương không thực hiện một hành động nào đó.",
        "examples": [
          {
            "japanese": "ここで 写真を 撮らないで ください。",
            "reading": "ここで しゃしんを とらないで ください。",
            "vietnamese": "Xin đừng chụp ảnh ở đây."
          }
        ]
      },
      {
        "title": "Vなければ なりません (Phải làm V)",
        "pattern": "Vない(bỏ い) + ければ なりません",
        "explanation": "Diễn tả nghĩa vụ hoặc điều bắt buộc phải thực hiện theo quy tắc hay thực tế.",
        "examples": [
          {
            "japanese": "薬を 飲まなければ なりません。",
            "reading": "くすりを のまなければ なりません。",
            "vietnamese": "Tôi phải uống thuốc."
          }
        ]
      },
      {
        "title": "Vなくても いいです (Không cần làm V cũng được)",
        "pattern": "Vない(bỏ い) + くても いいです",
        "explanation": "Diễn tả việc không cần thiết phải làm, không có tính bắt buộc.",
        "examples": [
          {
            "japanese": "あしたは 来なくても いいです。",
            "reading": "あしたは こなくても いいです。",
            "vietnamese": "Ngày mai bạn không cần đến cũng được."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 18,
    "title": "Bài 18: Thể từ điển (Jisho-form)",
    "japaneseTitle": "第１８課：辞書形・～ことができます",
    "description": "Chia thể nguyên mẫu (Jisho-kei), mẫu câu biểu thị khả năng Vことができます, sở thích 趣味は Vことです, mốc thời gian Vる前に.",
    "vocabularies": [
      {
        "id": 1801,
        "word": "できます",
        "reading": "できます",
        "romaji": "dekimasu",
        "meaning": "Có thể làm được",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "日本語を 話すことが できます。",
        "exampleSentenceReading": "にほんごを はなすことが できます。",
        "exampleSentenceMeaning": "Tôi có thể nói tiếng Nhật.",
        "dictionaryForm": "できる"
      },
      {
        "id": 1802,
        "word": "洗います",
        "reading": "あらいます",
        "romaji": "araimasu",
        "meaning": "Rửa / Giặt",
        "hanViet": "Tẩy",
        "type": "Động từ nhóm 1",
        "exampleSentence": "食事の 前に 手を 洗います。",
        "exampleSentenceReading": "しょくじの まえに てを あらいます。",
        "exampleSentenceMeaning": "Rửa tay trước khi ăn.",
        "dictionaryForm": "洗う (あらう)"
      },
      {
        "id": 1803,
        "word": "弾きます",
        "reading": "ひきます",
        "romaji": "hikimasu",
        "meaning": "Chơi (đàn piano, guitar)",
        "hanViet": "Đạn",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ピアノを 弾くことが できます。",
        "exampleSentenceReading": "ぴあのを ひくことが できます。",
        "exampleSentenceMeaning": "Tôi biết chơi đàn piano.",
        "dictionaryForm": "弾く (ひく)"
      },
      {
        "id": 1804,
        "word": "歌います",
        "reading": "うたいます",
        "romaji": "utaimasu",
        "meaning": "Hát",
        "hanViet": "Ca",
        "type": "Động từ nhóm 1",
        "exampleSentence": "カラオケで 歌います。",
        "exampleSentenceReading": "からおけで うたいます。",
        "exampleSentenceMeaning": "Tôi hát ở quán karaoke.",
        "dictionaryForm": "歌う (うたう)"
      },
      {
        "id": 1805,
        "word": "集めます",
        "reading": "あつめます",
        "romaji": "atsumemasu",
        "meaning": "Thu thập / Sưu tầm",
        "hanViet": "Tập",
        "type": "Động từ nhóm 2",
        "exampleSentence": "切手を 集めています。",
        "exampleSentenceReading": "きってを あつめています。",
        "exampleSentenceMeaning": "Tôi đang sưu tầm tem.",
        "dictionaryForm": "集める (あつめる)"
      },
      {
        "id": 1806,
        "word": "捨てます",
        "reading": "すてます",
        "romaji": "sutemasu",
        "meaning": "Vứt bỏ (rác)",
        "hanViet": "Xả",
        "type": "Động từ nhóm 2",
        "exampleSentence": "ごみを 捨てます。",
        "exampleSentenceReading": "ごみを すてます。",
        "exampleSentenceMeaning": "Vứt rác.",
        "dictionaryForm": "捨てる (すてる)"
      },
      {
        "id": 1807,
        "word": "換えます",
        "reading": "かえます",
        "romaji": "kaemasu",
        "meaning": "Đổi (tiền, đồ)",
        "hanViet": "Hoán",
        "type": "Động từ nhóm 2",
        "exampleSentence": "お金を 換えます。",
        "exampleSentenceReading": "おかねを かえます。",
        "exampleSentenceMeaning": "Tôi đổi tiền.",
        "dictionaryForm": "換える (かえる)"
      },
      {
        "id": 1808,
        "word": "運転します",
        "reading": "うんてんします",
        "romaji": "untenshimasu",
        "meaning": "Lái xe",
        "hanViet": "Vận Chuyển",
        "type": "Động từ nhóm 3",
        "exampleSentence": "車を 運転することが できます。",
        "exampleSentenceReading": "くるまを うんてんすることが できます。",
        "exampleSentenceMeaning": "Tôi có thể lái xe ô tô.",
        "dictionaryForm": "運転する (うんてんする)"
      },
      {
        "id": 1809,
        "word": "予約します",
        "reading": "よやくします",
        "romaji": "yoyakushimasu",
        "meaning": "Đặt trước / Đặt chỗ",
        "hanViet": "Dư Ước",
        "type": "Động từ nhóm 3",
        "exampleSentence": "ホテルを 予約します。",
        "exampleSentenceReading": "ほてるを よやくします。",
        "exampleSentenceMeaning": "Tôi đặt trước khách sạn.",
        "dictionaryForm": "予約する (よやくする)"
      },
      {
        "id": 1810,
        "word": "ピアノ",
        "reading": "ピアノ",
        "romaji": "piano",
        "meaning": "Đàn Piano",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ピアノの 音が きれいです。",
        "exampleSentenceReading": "ぴあのの おとが きれいです。",
        "exampleSentenceMeaning": "Âm thanh đàn piano thật hay.",
        "dictionaryForm": ""
      },
      {
        "id": 1811,
        "word": "～メートル",
        "reading": "～メートル",
        "romaji": "-meetoru",
        "meaning": "～ mét",
        "hanViet": "",
        "type": "Hậu tố",
        "exampleSentence": "50メートル 泳ぎます。",
        "exampleSentenceReading": "ごじゅうめーとる およぎます。",
        "exampleSentenceMeaning": "Bơi được 50 mét.",
        "dictionaryForm": ""
      },
      {
        "id": 1812,
        "word": "現金",
        "reading": "げんきん",
        "romaji": "genkin",
        "meaning": "Tiền mặt",
        "hanViet": "Hiện Kim",
        "type": "Danh từ",
        "exampleSentence": "現金で 払います。",
        "exampleSentenceReading": "げんきんで はらいます。",
        "exampleSentenceMeaning": "Tôi trả bằng tiền mặt.",
        "dictionaryForm": ""
      },
      {
        "id": 1813,
        "word": "趣味",
        "reading": "しゅみ",
        "romaji": "shumi",
        "meaning": "Sở thích",
        "hanViet": "Thú Vị",
        "type": "Danh từ",
        "exampleSentence": "趣味は 読書です。",
        "exampleSentenceReading": "しゅみは どくしょです。",
        "exampleSentenceMeaning": "Sở thích của tôi là đọc sách.",
        "dictionaryForm": ""
      },
      {
        "id": 1814,
        "word": "日記",
        "reading": "にっき",
        "romaji": "nikki",
        "meaning": "Nhật ký",
        "hanViet": "Nhật Ký",
        "type": "Danh từ",
        "exampleSentence": "毎日 日記を 書きます。",
        "exampleSentenceReading": "まいにち にっきを かきます。",
        "exampleSentenceMeaning": "Mỗi ngày tôi viết nhật ký.",
        "dictionaryForm": ""
      },
      {
        "id": 1815,
        "word": "お祈り",
        "reading": "おいのり",
        "romaji": "oinori",
        "meaning": "Cầu nguyện",
        "hanViet": "Kỳ",
        "type": "Danh từ",
        "exampleSentence": "教会で お祈りを します。",
        "exampleSentenceReading": "きょうかいで おいのりを します。",
        "exampleSentenceMeaning": "Tôi cầu nguyện ở nhà thờ.",
        "dictionaryForm": ""
      },
      {
        "id": 1816,
        "word": "課長",
        "reading": "かちょう",
        "romaji": "kachou",
        "meaning": "Trưởng phòng",
        "hanViet": "Khóa Trưởng",
        "type": "Danh từ",
        "exampleSentence": "課長に 相談します。",
        "exampleSentenceReading": "かちょうに そうだんします。",
        "exampleSentenceMeaning": "Tôi trao đổi với trưởng phòng.",
        "dictionaryForm": ""
      },
      {
        "id": 1817,
        "word": "部長",
        "reading": "ぶちょう",
        "romaji": "buchou",
        "meaning": "Trưởng ban / Giám đốc bộ phận",
        "hanViet": "Bộ Trưởng",
        "type": "Danh từ",
        "exampleSentence": "部長は 出張中です。",
        "exampleSentenceReading": "ぶちょうは しゅっちょうちゅうです。",
        "exampleSentenceMeaning": "Trưởng ban đang đi công tác.",
        "dictionaryForm": ""
      },
      {
        "id": 1818,
        "word": "社長",
        "reading": "しゃちょう",
        "romaji": "shachou",
        "meaning": "Giám đốc / Tổng giám đốc",
        "hanViet": "Xã Trưởng",
        "type": "Danh từ",
        "exampleSentence": "社長の 話を 聞きます。",
        "exampleSentenceReading": "しゃちょうの はなしを ききます。",
        "exampleSentenceMeaning": "Lắng nghe lời phát biểu của giám đốc.",
        "dictionaryForm": ""
      },
      {
        "id": 1819,
        "word": "動物",
        "reading": "どうぶつ",
        "romaji": "doubutsu",
        "meaning": "Động vật",
        "hanViet": "Động Vật",
        "type": "Danh từ",
        "exampleSentence": "動物が 好きです。",
        "exampleSentenceReading": "どうぶつが すきです。",
        "exampleSentenceMeaning": "Tôi thích động vật.",
        "dictionaryForm": ""
      },
      {
        "id": 1820,
        "word": "馬",
        "reading": "うま",
        "romaji": "uma",
        "meaning": "Con ngựa",
        "hanViet": "Mã",
        "type": "Danh từ",
        "exampleSentence": "馬に 乗ったことが あります。",
        "exampleSentenceReading": "うまに のったことが あります。",
        "exampleSentenceMeaning": "Tôi từng cưỡi ngựa rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 1821,
        "word": "インターネット",
        "reading": "インターネット",
        "romaji": "intaanetto",
        "meaning": "Mạng Internet",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "インターネットで 調べます。",
        "exampleSentenceReading": "いんたーねっとで しらべます。",
        "exampleSentenceMeaning": "Tìm kiếm trên mạng Internet.",
        "dictionaryForm": ""
      },
      {
        "id": 1822,
        "word": "特に",
        "reading": "とくに",
        "romaji": "tokuni",
        "meaning": "Đặc biệt là",
        "hanViet": "Đặc",
        "type": "Phó từ",
        "exampleSentence": "日本の 料理、特に 寿司が 好きです。",
        "exampleSentenceReading": "にほんの りょうり、とくに すしが すきです。",
        "exampleSentenceMeaning": "Đồ ăn Nhật, đặc biệt tôi thích sushi.",
        "dictionaryForm": ""
      },
      {
        "id": 1823,
        "word": "なかなか",
        "reading": "なかなか",
        "romaji": "nakanaka",
        "meaning": "Mãi mà không (+ phủ định) / Khá là",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "バスが なかなか 来ません。",
        "exampleSentenceReading": "ばすが なかなか きません。",
        "exampleSentenceMeaning": "Xe buýt mãi mà không thấy tới.",
        "dictionaryForm": ""
      },
      {
        "id": 1824,
        "word": "ぜひ",
        "reading": "ぜひ",
        "romaji": "zehi",
        "meaning": "Nhất định",
        "hanViet": "Thị Phi",
        "type": "Phó từ",
        "exampleSentence": "ぜひ ベトナムへ 来てください。",
        "exampleSentenceReading": "ぜひ べとなむへ きてください。",
        "exampleSentenceMeaning": "Nhất định hãy đến Việt Nam chơi nhé.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Quy tắc chia thể từ điển (Jisho-form)",
        "pattern": "Nhóm 1: âm い chuyển sang âm う | Nhóm 2: Bỏ ます + る | Nhóm 3: する, くる",
        "explanation": "Thể nguyên mẫu xuất hiện trong từ điển. Kaku, Iku, Nomu, Taberu, Miru, Suru, Kuru.",
        "examples": [
          {
            "japanese": "かきます → かく",
            "reading": "かきます → かく",
            "vietnamese": "Viết (thể từ điển)"
          },
          {
            "japanese": "たべます → たべる",
            "reading": "たべます → たべる",
            "vietnamese": "Ăn (thể từ điển)"
          }
        ]
      },
      {
        "title": "V(thể từ điển) ことが できます (Có thể làm V)",
        "pattern": "V(Jisho) + ことが できます",
        "explanation": "Biểu thị khả năng, năng lực của bản thân hoặc sự cho phép trong hoàn cảnh.",
        "examples": [
          {
            "japanese": "ミラーさんは 日本語を 話す ことが できます。",
            "reading": "みらーさんは にほんごを はなす ことが できます。",
            "vietnamese": "Anh Miller có thể nói tiếng Nhật."
          }
        ]
      },
      {
        "title": "趣味は V(thể từ điển) ことです (Sở thích là...)",
        "pattern": "趣味は + V(Jisho) + ことです",
        "explanation": "Danh từ hóa động từ bằng こと để diễn tả sở thích là làm một việc gì đó.",
        "examples": [
          {
            "japanese": "わたしの 趣味は 写真を 撮る ことです。",
            "reading": "わたしの しゅみは しゃしんを とる ことです。",
            "vietnamese": "Sở thích của tôi là chụp ảnh."
          }
        ]
      },
      {
        "title": "V1(thể từ điển) 前に、V2 (Trước khi làm V1 thì làm V2)",
        "pattern": "V(Jisho) / Danh từ の + 前に、V2",
        "explanation": "Diễn tả hành động V2 xảy ra trước hành động V1.",
        "examples": [
          {
            "japanese": "ご飯を 食べる 前に、手を 洗います。",
            "reading": "ごはんを たべる まえに、てを あらいます。",
            "vietnamese": "Trước khi ăn cơm tôi rửa tay."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 19,
    "title": "Bài 19: Thể た (Ta-form) & Kinh nghiệm",
    "japaneseTitle": "第１９課：た形・～たことがあります",
    "description": "Chia thể quá khứ ngắn (thể た), kinh nghiệm từng làm gì Vたことがあります, liệt kê hành động Vたり Vたり します, biến đổi に/く なります.",
    "vocabularies": [
      {
        "id": 1901,
        "word": "登ります",
        "reading": "のぼります",
        "romaji": "noborimasu",
        "meaning": "Leo (núi [に])",
        "hanViet": "Đăng",
        "type": "Động từ nhóm 1",
        "exampleSentence": "富士山に 登ります。",
        "exampleSentenceReading": "ふじさんに のぼります。",
        "exampleSentenceMeaning": "Tôi leo núi Phú Sĩ.",
        "dictionaryForm": "登る (のぼる)"
      },
      {
        "id": 1902,
        "word": "泊まります",
        "reading": "とまります",
        "romaji": "tomarimasu",
        "meaning": "Trọ lại / Nghỉ lại (khách sạn [に])",
        "hanViet": "Bạc",
        "type": "Động từ nhóm 1",
        "exampleSentence": "旅館に 泊まりました。",
        "exampleSentenceReading": "りょかんに とまりました。",
        "exampleSentenceMeaning": "Tôi đã trọ lại lữ quán kiểu Nhật.",
        "dictionaryForm": "泊まる (とまる)"
      },
      {
        "id": 1903,
        "word": "掃除します",
        "reading": "そうじします",
        "romaji": "soujishimasu",
        "meaning": "Dọn dẹp vệ sinh",
        "hanViet": "Tảo Trừ",
        "type": "Động từ nhóm 3",
        "exampleSentence": "部屋を 掃除します。",
        "exampleSentenceReading": "へやを そうじします。",
        "exampleSentenceMeaning": "Tôi dọn dẹp phòng.",
        "dictionaryForm": "掃除する (そうじする)"
      },
      {
        "id": 1904,
        "word": "洗濯します",
        "reading": "せんたくします",
        "romaji": "sentakushimasu",
        "meaning": "Giặt giũ quần áo",
        "hanViet": "Tẩy Trạc",
        "type": "Động từ nhóm 3",
        "exampleSentence": "休みに 服を 洗濯します。",
        "exampleSentenceReading": "やすみに ふくを せんたくします。",
        "exampleSentenceMeaning": "Ngày nghỉ tôi giặt quần áo.",
        "dictionaryForm": "洗濯する (せんたくする)"
      },
      {
        "id": 1905,
        "word": "練習します",
        "reading": "れんしゅうします",
        "romaji": "renshuushimasu",
        "meaning": "Luyện tập",
        "hanViet": "Luyện Tập",
        "type": "Động từ nhóm 3",
        "exampleSentence": "会話を 練習します。",
        "exampleSentenceReading": "かいわを れんしゅうします。",
        "exampleSentenceMeaning": "Tôi luyện tập hội thoại.",
        "dictionaryForm": "練習する (れんしゅうする)"
      },
      {
        "id": 1906,
        "word": "なります",
        "reading": "なります",
        "romaji": "narimasu",
        "meaning": "Trở thành / Trở nên",
        "hanViet": "",
        "type": "Động từ nhóm 1",
        "exampleSentence": "先生に なりたいです。",
        "exampleSentenceReading": "せんせいに なりたいです。",
        "exampleSentenceMeaning": "Tôi muốn trở thành giáo viên.",
        "dictionaryForm": "なる"
      },
      {
        "id": 1907,
        "word": "眠い",
        "reading": "ねむい",
        "romaji": "nemui",
        "meaning": "Buồn ngủ",
        "hanViet": "Miên",
        "type": "Tính từ -i",
        "exampleSentence": "とても 眠いです。",
        "exampleSentenceReading": "とても ねむいです。",
        "exampleSentenceMeaning": "Tôi rất buồn ngủ.",
        "dictionaryForm": ""
      },
      {
        "id": 1908,
        "word": "強い",
        "reading": "つよい",
        "romaji": "tsuyoi",
        "meaning": "Mạnh mẽ",
        "hanViet": "Cường",
        "type": "Tính từ -i",
        "exampleSentence": "風が 強いです。",
        "exampleSentenceReading": "かぜが つよいです。",
        "exampleSentenceMeaning": "Gió thổi mạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 1909,
        "word": "弱い",
        "reading": "よわい",
        "romaji": "yowai",
        "meaning": "Yếu ớt",
        "hanViet": "Nhược",
        "type": "Tính từ -i",
        "exampleSentence": "体が 弱いです。",
        "exampleSentenceReading": "からだが よわいです。",
        "exampleSentenceMeaning": "Thể trạng tôi yếu.",
        "dictionaryForm": ""
      },
      {
        "id": 1910,
        "word": "調子",
        "reading": "ちょうし",
        "romaji": "choushi",
        "meaning": "Tình trạng sức khỏe / máy móc",
        "hanViet": "Điều Tử",
        "type": "Danh từ",
        "exampleSentence": "体の 調子は どうですか。",
        "exampleSentenceReading": "からだの ちょうしは どうですか。",
        "exampleSentenceMeaning": "Tình trạng sức khỏe của bạn thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 1911,
        "word": "一度",
        "reading": "いちど",
        "romaji": "ichido",
        "meaning": "Một lần",
        "hanViet": "Nhất Độ",
        "type": "Phó từ",
        "exampleSentence": "一度 日本へ 行きたいです。",
        "exampleSentenceReading": "いちど にほんへ いきたいです。",
        "exampleSentenceMeaning": "Tôi muốn đến Nhật một lần.",
        "dictionaryForm": ""
      },
      {
        "id": 1912,
        "word": "一度も",
        "reading": "いちども",
        "romaji": "ichidomo",
        "meaning": "Chưa một lần nào (+ phủ định)",
        "hanViet": "Nhất Độ",
        "type": "Phó từ",
        "exampleSentence": "一度も 寿司を 食べたことが ありません。",
        "exampleSentenceReading": "いちども すしを たべたことが ありません。",
        "exampleSentenceMeaning": "Tôi chưa từng ăn sushi lần nào.",
        "dictionaryForm": ""
      },
      {
        "id": 1913,
        "word": "だんだん",
        "reading": "だんだん",
        "romaji": "dandan",
        "meaning": "Dần dần / Từ từ",
        "hanViet": "Đoạn",
        "type": "Phó từ",
        "exampleSentence": "だんだん 寒く なります。",
        "exampleSentenceReading": "だんだん さむく なります。",
        "exampleSentenceMeaning": "Trời dần trở nên lạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 1914,
        "word": "もうすぐ",
        "reading": "もうすぐ",
        "romaji": "mousugu",
        "meaning": "Sắp sửa / Chẳng mấy chốc",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "もうすぐ 正月ですね。",
        "exampleSentenceReading": "もうすぐ しょうがつですね。",
        "exampleSentenceMeaning": "Sắp Tết rồi nhỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 1915,
        "word": "おかげさまで",
        "reading": "おかげさまで",
        "romaji": "okagesama de",
        "meaning": "Nhờ ơn trời / Ơn may mắn",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "おかげさまで、元気です。",
        "exampleSentenceReading": "おかげさまで、げんきです。",
        "exampleSentenceMeaning": "Nhờ ơn bạn tôi vẫn khỏe mạnh.",
        "dictionaryForm": ""
      },
      {
        "id": 1916,
        "word": "乾杯",
        "reading": "かんぱい",
        "romaji": "kanpai",
        "meaning": "Cạn ly! / Nâng ly chúc mừng",
        "hanViet": "Can Bôi",
        "type": "Chào hỏi",
        "exampleSentence": "みんなで 乾杯しましょう！",
        "exampleSentenceReading": "みんなで かんぱいしましょう！",
        "exampleSentenceMeaning": "Mọi người cùng nâng ly nào!",
        "dictionaryForm": ""
      },
      {
        "id": 1917,
        "word": "実は",
        "reading": "じつは",
        "romaji": "jitsu wa",
        "meaning": "Thực ra là / Sự thật là",
        "hanViet": "Thực",
        "type": "Phó từ",
        "exampleSentence": "実は、来月 帰国します。",
        "exampleSentenceReading": "じつは、らいげつ きこくします。",
        "exampleSentenceMeaning": "Thực ra tháng sau tôi về nước.",
        "dictionaryForm": ""
      },
      {
        "id": 1918,
        "word": "ダイエット",
        "reading": "ダイエット",
        "romaji": "daietto",
        "meaning": "Ăn kiêng giảm cân",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ダイエットを しています。",
        "exampleSentenceReading": "だいえっとを しています。",
        "exampleSentenceMeaning": "Tôi đang ăn kiêng giảm cân.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Quy tắc chia thể た (Ta-form)",
        "pattern": "Cách chia hoàn toàn giống thể て, chỉ thay て bằng た, で bằng だ",
        "explanation": "Chia thể quá khứ ngắn (Ta-form). Viết: かいた, Ăn: たべた, Đi: いった, Làm: した.",
        "examples": [
          {
            "japanese": "いきました → いった",
            "reading": "いきました → いった",
            "vietnamese": "Đã đi (thể ta)"
          },
          {
            "japanese": "のみました → のんだ",
            "reading": "のみました → のんだ",
            "vietnamese": "Đã uống (thể ta)"
          }
        ]
      },
      {
        "title": "Vた ことが あります (Đã từng làm V - Kinh nghiệm)",
        "pattern": "Vた + ことが あります",
        "explanation": "Diễn tả kinh nghiệm đã từng trải qua trong quá khứ.",
        "examples": [
          {
            "japanese": "富士山に 登った ことが あります。",
            "reading": "ふじさんに のぼった ことが あります。",
            "vietnamese": "Tôi đã từng leo núi Phú Sĩ."
          }
        ]
      },
      {
        "title": "V1たり、V2たり します (Liệt kê hành động tiêu biểu)",
        "pattern": "V1たり、V2たり します",
        "explanation": "Liệt kê một vài hành động tiêu biểu trong số nhiều hành động, không nhất thiết theo thứ tự thời gian.",
        "examples": [
          {
            "japanese": "日曜日は 掃除したり、洗濯したり します。",
            "reading": "にちようびは そうじしたり、せんたくしたり します。",
            "vietnamese": "Chủ nhật tôi dọn dẹp, rồi giặt giũ..."
          }
        ]
      },
      {
        "title": "Tính từ / Danh từ + に／く なります (Trở nên / Trở thành)",
        "pattern": "Tính từ -i: Bỏ い + くなる | Tính từ -na/Danh từ: + になる",
        "explanation": "Biểu thị sự biến đổi trạng thái theo thời gian.",
        "examples": [
          {
            "japanese": "だんだん 寒く なります。",
            "reading": "だんだん さむく なります。",
            "vietnamese": "Trời dần trở nên lạnh."
          },
          {
            "japanese": "春に なりました。",
            "reading": "はるに なりました。",
            "vietnamese": "Đã sang mùa xuân rồi."
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
        "word": "要ります",
        "reading": "いります",
        "romaji": "irimasu",
        "meaning": "Cần có (cái gì [が])",
        "hanViet": "Yếu",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ビザが 要ります。",
        "exampleSentenceReading": "びざが いります。",
        "exampleSentenceMeaning": "Cần phải có thị thực visa.",
        "dictionaryForm": "要る (いる)"
      },
      {
        "id": 2002,
        "word": "調べます",
        "reading": "しらべます",
        "romaji": "shirabemasu",
        "meaning": "Tra cứu / Điều tra",
        "hanViet": "Điệu",
        "type": "Động từ nhóm 2",
        "exampleSentence": "辞書で 言葉を 調べます。",
        "exampleSentenceReading": "じしょで ことばを しらべます。",
        "exampleSentenceMeaning": "Tôi tra từ vựng bằng từ điển.",
        "dictionaryForm": "調べる (しらべる)"
      },
      {
        "id": 2003,
        "word": "直します",
        "reading": "なおします",
        "romaji": "naoshimasu",
        "meaning": "Sửa chữa / Chỉnh sửa",
        "hanViet": "Trực",
        "type": "Động từ nhóm 1",
        "exampleSentence": "作文を 直します。",
        "exampleSentenceReading": "さくぶんを なおします。",
        "exampleSentenceMeaning": "Tôi sửa bài văn.",
        "dictionaryForm": "直す (なおす)"
      },
      {
        "id": 2004,
        "word": "修理します",
        "reading": "しゅうりします",
        "romaji": "shuurishimasu",
        "meaning": "Sửa chữa (máy móc, xe cộ)",
        "hanViet": "Tu Lý",
        "type": "Động từ nhóm 3",
        "exampleSentence": "車を 修理します。",
        "exampleSentenceReading": "くるまを しゅうりします。",
        "exampleSentenceMeaning": "Tôi sửa xe ô tô.",
        "dictionaryForm": "修理する (しゅうりする)"
      },
      {
        "id": 2005,
        "word": "電話します",
        "reading": "でんわします",
        "romaji": "denwashimasu",
        "meaning": "Gọi điện thoại",
        "hanViet": "Điện Thoại",
        "type": "Động từ nhóm 3",
        "exampleSentence": "友達に 電話します。",
        "exampleSentenceReading": "ともだちに でんわします。",
        "exampleSentenceMeaning": "Tôi gọi điện cho bạn.",
        "dictionaryForm": "電話する (でんわする)"
      },
      {
        "id": 2006,
        "word": "僕",
        "reading": "ぼく",
        "romaji": "boku",
        "meaning": "Tớ / Mình (con trai xưng thân mật)",
        "hanViet": "Bộc",
        "type": "Đại từ",
        "exampleSentence": "僕も 行くよ。",
        "exampleSentenceReading": "ぼくも いくよ。",
        "exampleSentenceMeaning": "Tớ cũng đi nữa đấy.",
        "dictionaryForm": ""
      },
      {
        "id": 2007,
        "word": "君",
        "reading": "きみ",
        "romaji": "kimi",
        "meaning": "Cậu / Mày (gọi thân mật)",
        "hanViet": "Quân",
        "type": "Đại từ",
        "exampleSentence": "君は どう思う？",
        "exampleSentenceReading": "きみは どうおもう？",
        "exampleSentenceMeaning": "Cậu nghĩ thế nào?",
        "dictionaryForm": ""
      },
      {
        "id": 2008,
        "word": "うん",
        "reading": "うん",
        "romaji": "un",
        "meaning": "Ừ (thể thân mật của はい)",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "うん、分かった。",
        "exampleSentenceReading": "うん、わかった。",
        "exampleSentenceMeaning": "Ừ, tớ hiểu rồi.",
        "dictionaryForm": ""
      },
      {
        "id": 2009,
        "word": "ううん",
        "reading": "ううん",
        "romaji": "uun",
        "meaning": "Không (thể thân mật của いいえ)",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "ううん、行かない。",
        "exampleSentenceReading": "ううん、いかない。",
        "exampleSentenceMeaning": "Không, tớ không đi đâu.",
        "dictionaryForm": ""
      },
      {
        "id": 2010,
        "word": "サラリーマン",
        "reading": "サラリーマン",
        "romaji": "sarariiman",
        "meaning": "Người làm công ăn lương",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "父は サラリーマンです。",
        "exampleSentenceReading": "ちちは さらりーまんです。",
        "exampleSentenceMeaning": "Bố tôi là nhân viên văn phòng ăn lương.",
        "dictionaryForm": ""
      },
      {
        "id": 2011,
        "word": "言葉",
        "reading": "ことば",
        "romaji": "kotoba",
        "meaning": "Từ ngữ / Lời nói",
        "hanViet": "Ngôn Diệp",
        "type": "Danh từ",
        "exampleSentence": "新しい 言葉を 覚えます。",
        "exampleSentenceReading": "あたらしい ことばを おぼえます。",
        "exampleSentenceMeaning": "Học thuộc từ mới.",
        "dictionaryForm": ""
      },
      {
        "id": 2012,
        "word": "物価",
        "reading": "ぶっか",
        "romaji": "bukka",
        "meaning": "Giá cả hàng hóa",
        "hanViet": "Vật Giá",
        "type": "Danh từ",
        "exampleSentence": "東京は 物価が 高いです。",
        "exampleSentenceReading": "とうきょうは ぶっかが たかいです。",
        "exampleSentenceMeaning": "Giá cả ở Tokyo đắt đỏ.",
        "dictionaryForm": ""
      },
      {
        "id": 2013,
        "word": "着物",
        "reading": "きもの",
        "romaji": "kimono",
        "meaning": "Trang phục truyền thống Kimono",
        "hanViet": "Trước Vật",
        "type": "Danh từ",
        "exampleSentence": "きれいな 着物を 着ました。",
        "exampleSentenceReading": "きれいな きものを きました。",
        "exampleSentenceMeaning": "Tôi đã mặc bộ Kimono đẹp.",
        "dictionaryForm": ""
      },
      {
        "id": 2014,
        "word": "ビザ",
        "reading": "ビザ",
        "romaji": "biza",
        "meaning": "Thị thực / Visa",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "ビザを 申請します。",
        "exampleSentenceReading": "びざを しんせいします。",
        "exampleSentenceMeaning": "Tôi xin cấp visa.",
        "dictionaryForm": ""
      },
      {
        "id": 2015,
        "word": "初め",
        "reading": "はじめ",
        "romaji": "hajime",
        "meaning": "Ban đầu / Lúc đầu",
        "hanViet": "Sơ",
        "type": "Danh từ",
        "exampleSentence": "初めは 難しかったです。",
        "exampleSentenceReading": "はじめは むずかしかったです。",
        "exampleSentenceMeaning": "Lúc đầu thì rất khó.",
        "dictionaryForm": ""
      },
      {
        "id": 2016,
        "word": "終わり",
        "reading": "おわり",
        "romaji": "owari",
        "meaning": "Kết thúc / Lúc cuối",
        "hanViet": "Chung",
        "type": "Danh từ",
        "exampleSentence": "映画の 終わりが おもしろいです。",
        "exampleSentenceReading": "えいがの おわりが おもしろいです。",
        "exampleSentenceMeaning": "Phần kết của bộ phim rất hay.",
        "dictionaryForm": ""
      },
      {
        "id": 2017,
        "word": "こっち",
        "reading": "こっち",
        "romaji": "kocchi",
        "meaning": "Phía này (thân mật của こちら)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "こっちへ おいで。",
        "exampleSentenceReading": "こっちへ おいで。",
        "exampleSentenceMeaning": "Lại phía này đi.",
        "dictionaryForm": ""
      },
      {
        "id": 2018,
        "word": "そっち",
        "reading": "そっち",
        "romaji": "socchi",
        "meaning": "Phía đó (thân mật của そちら)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "そっちは 危ないよ。",
        "exampleSentenceReading": "そっちは あぶないよ。",
        "exampleSentenceMeaning": "Phía đó nguy hiểm đấy.",
        "dictionaryForm": ""
      },
      {
        "id": 2019,
        "word": "あっち",
        "reading": "あっち",
        "romaji": "acchi",
        "meaning": "Phía kia (thân mật của あちら)",
        "hanViet": "",
        "type": "Đại từ",
        "exampleSentence": "あっちへ 行こう。",
        "exampleSentenceReading": "あっちへ いこう。",
        "exampleSentenceMeaning": "Cùng sang đằng kia đi.",
        "dictionaryForm": ""
      },
      {
        "id": 2020,
        "word": "どっち",
        "reading": "どっち",
        "romaji": "docchi",
        "meaning": "Phía nào (thân mật của どちら)",
        "hanViet": "",
        "type": "Nghi vấn từ",
        "exampleSentence": "どっちが 好き？",
        "exampleSentenceReading": "どっちが すき？",
        "exampleSentenceMeaning": "Cậu thích cái nào hơn?",
        "dictionaryForm": ""
      },
      {
        "id": 2021,
        "word": "うん / ううん",
        "reading": "うん／ううん",
        "romaji": "un / uun",
        "meaning": "Ừ / Không (thân mật của はい/いいえ)",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "うん、行くよ。",
        "exampleSentenceReading": "うん、いくよ。",
        "exampleSentenceMeaning": "Ừ, đi chứ.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Thể thông thường (Futsuu-kei) của Động từ",
        "pattern": "Vます->Vる | Vません->Vない | Vました->Vた | Vませんでした->Vなかった",
        "explanation": "Dùng khi trò chuyện với bạn bè, người thân, hoặc làm mệnh đề phụ trong câu phức.",
        "examples": [
          {
            "japanese": "ご飯を 食べる？ ー うん、食べる。",
            "reading": "ごはんを たべる？ ー うん、たべる。",
            "vietnamese": "Ăn cơm không? - Ừ, ăn chứ."
          }
        ]
      },
      {
        "title": "Thể thông thường của Danh từ và Tính từ đuôi な",
        "pattern": "です->だ | じゃありません->じゃない | でした->だった",
        "explanation": "Khẳng định dùng だ (nhưng trong câu hỏi bỏ だ), phủ định dùng じゃない.",
        "examples": [
          {
            "japanese": "あしたは 暇？ ー うん、暇だよ。",
            "reading": "あしたは ひま？ ー うん、ひまだよ。",
            "vietnamese": "Mai rảnh không? - Ừ, rảnh chứ."
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
        "word": "思います",
        "reading": "おもいます",
        "romaji": "omoimasu",
        "meaning": "Nghĩ rằng / Cho rằng (ý kiến)",
        "hanViet": "Tư",
        "type": "Động từ nhóm 1",
        "exampleSentence": "明日は 雨が 降ると 思います。",
        "exampleSentenceReading": "あしたは あめが ふると おもいます。",
        "exampleSentenceMeaning": "Tôi nghĩ ngày mai trời sẽ mưa.",
        "dictionaryForm": "思う (おもう)"
      },
      {
        "id": 2102,
        "word": "言います",
        "reading": "いいます",
        "romaji": "iimasu",
        "meaning": "Nói / Phát biểu",
        "hanViet": "Ngôn",
        "type": "Động từ nhóm 1",
        "exampleSentence": "先生は テストがあると 言いました。",
        "exampleSentenceReading": "せんせいは てすとがあると いいました。",
        "exampleSentenceMeaning": "Thầy giáo nói là có bài kiểm tra.",
        "dictionaryForm": "言う (いう)"
      },
      {
        "id": 2103,
        "word": "勝ちます",
        "reading": "かちます",
        "romaji": "kachimasu",
        "meaning": "Chiến thắng",
        "hanViet": "Thắng",
        "type": "Động từ nhóm 1",
        "exampleSentence": "日本チームが 勝ちました。",
        "exampleSentenceReading": "にほんちーむが かちました。",
        "exampleSentenceMeaning": "Đội tuyển Nhật Bản đã thắng.",
        "dictionaryForm": "勝つ (かつ)"
      },
      {
        "id": 2104,
        "word": "負けます",
        "reading": "まけます",
        "romaji": "makemasu",
        "meaning": "Thua cuộc",
        "hanViet": "Phụ",
        "type": "Động từ nhóm 2",
        "exampleSentence": "試合に 負けました。",
        "exampleSentenceReading": "しあいに まけました。",
        "exampleSentenceMeaning": "Đã thua trong trận đấu.",
        "dictionaryForm": "負ける (まける)"
      },
      {
        "id": 2105,
        "word": "役に立ちます",
        "reading": "やくにたちます",
        "romaji": "yaku ni tachimasu",
        "meaning": "Có ích / Hữu ích",
        "hanViet": "Dịch Lập",
        "type": "Động từ nhóm 1",
        "exampleSentence": "この本は とても 役に立ちます。",
        "exampleSentenceReading": "このほんは とても やくにたちます。",
        "exampleSentenceMeaning": "Quyển sách này rất hữu ích.",
        "dictionaryForm": "役に立つ (やくにたつ)"
      },
      {
        "id": 2106,
        "word": "動きます",
        "reading": "うごきます",
        "romaji": "ugokimasu",
        "meaning": "Chuyển động / Vận hành",
        "hanViet": "Động",
        "type": "Động từ nhóm 1",
        "exampleSentence": "機械が 動きます。",
        "exampleSentenceReading": "きかいが うごきます。",
        "exampleSentenceMeaning": "Máy móc đang vận hành.",
        "dictionaryForm": "動く (うごく)"
      },
      {
        "id": 2107,
        "word": "やめます",
        "reading": "やめます",
        "romaji": "yamemasu",
        "meaning": "Bỏ / Thôi (việc, học, thuốc)",
        "hanViet": "Chỉ",
        "type": "Động từ nhóm 2",
        "exampleSentence": "会社を やめます。",
        "exampleSentenceReading": "かいしゃを やめます。",
        "exampleSentenceMeaning": "Tôi thôi việc ở công ty.",
        "dictionaryForm": "やめる"
      },
      {
        "id": 2108,
        "word": "気をつけます",
        "reading": "きをつけます",
        "romaji": "ki o tsukemasu",
        "meaning": "Chú ý / Cẩn thận",
        "hanViet": "Khí",
        "type": "Động từ nhóm 2",
        "exampleSentence": "車に 気をつけてください。",
        "exampleSentenceReading": "くるまに きをつけてください。",
        "exampleSentenceMeaning": "Hãy cẩn thận xe ô tô.",
        "dictionaryForm": "気をつける (きをつける)"
      },
      {
        "id": 2109,
        "word": "留学します",
        "reading": "りゅうがくします",
        "romaji": "ryuugakushimasu",
        "meaning": "Đi du học",
        "hanViet": "Lưu Học",
        "type": "Động từ nhóm 3",
        "exampleSentence": "日本へ 留学します。",
        "exampleSentenceReading": "にほんへ りゅうがくします。",
        "exampleSentenceMeaning": "Tôi đi du học Nhật Bản.",
        "dictionaryForm": "留学する (りゅうがくする)"
      },
      {
        "id": 2110,
        "word": "むだ[な]",
        "reading": "むだ[な]",
        "romaji": "muda[na]",
        "meaning": "Lãng phí / Vô ích",
        "hanViet": "",
        "type": "Tính từ -na",
        "exampleSentence": "時間を むだに しないでください。",
        "exampleSentenceReading": "じかんを むだに しないでください。",
        "exampleSentenceMeaning": "Xin đừng lãng phí thời gian.",
        "dictionaryForm": ""
      },
      {
        "id": 2111,
        "word": "不便[な]",
        "reading": "ふべん[な]",
        "romaji": "fuben[na]",
        "meaning": "Bất tiện",
        "hanViet": "Bất Tiện",
        "type": "Tính từ -na",
        "exampleSentence": "ここは 交通が 不便です。",
        "exampleSentenceReading": "ここは こうつうが ふべんです。",
        "exampleSentenceMeaning": "Giao thông ở đây bất tiện.",
        "dictionaryForm": ""
      },
      {
        "id": 2112,
        "word": "同じ",
        "reading": "おなじ",
        "romaji": "onaji",
        "meaning": "Giống nhau / Cùng một",
        "hanViet": "Đồng",
        "type": "Tính từ -na",
        "exampleSentence": "同じ 服を 買いました。",
        "exampleSentenceReading": "おなじ ふくを かいました。",
        "exampleSentenceMeaning": "Tôi mua bộ đồ giống bạn.",
        "dictionaryForm": ""
      },
      {
        "id": 2113,
        "word": "すごい",
        "reading": "すごい",
        "romaji": "sugoi",
        "meaning": "Kinh khủng / Tuyệt vời / Siêu quá",
        "hanViet": "",
        "type": "Tính từ -i",
        "exampleSentence": "日本語が とても 上手ですね。すごいです！",
        "exampleSentenceReading": "にほんごが とても じょうずですね。すごいです！",
        "exampleSentenceMeaning": "Tiếng Nhật của bạn giỏi quá. Siêu thật!",
        "dictionaryForm": ""
      },
      {
        "id": 2114,
        "word": "首相",
        "reading": "しゅしょう",
        "romaji": "shushou",
        "meaning": "Thủ tướng",
        "hanViet": "Thủ Tướng",
        "type": "Danh từ",
        "exampleSentence": "日本の 首相が スピーチを します。",
        "exampleSentenceReading": "にほんの しゅしょうが すぴーちを します。",
        "exampleSentenceMeaning": "Thủ tướng Nhật phát biểu.",
        "dictionaryForm": ""
      },
      {
        "id": 2115,
        "word": "大統領",
        "reading": "だいとうりょう",
        "romaji": "daitouryou",
        "meaning": "Tổng thống",
        "hanViet": "Đại Thống Lĩnh",
        "type": "Danh từ",
        "exampleSentence": "アメリカの 大統領です。",
        "exampleSentenceReading": "あめりかの だいとうりょうです。",
        "exampleSentenceMeaning": "Là tổng thống Mỹ.",
        "dictionaryForm": ""
      },
      {
        "id": 2116,
        "word": "政治",
        "reading": "せいじ",
        "romaji": "seiji",
        "meaning": "Chính trị",
        "hanViet": "Chính Trị",
        "type": "Danh từ",
        "exampleSentence": "政治の ニュースを 見ます。",
        "exampleSentenceReading": "せいじの にゅーすを みます。",
        "exampleSentenceMeaning": "Tôi xem tin tức chính trị.",
        "dictionaryForm": ""
      },
      {
        "id": 2117,
        "word": "ニュース",
        "reading": "ニュース",
        "romaji": "nyuusu",
        "meaning": "Bản tin / Tin tức",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "毎晩 ニュースを 見ます。",
        "exampleSentenceReading": "まいばん にゅーすを みます。",
        "exampleSentenceMeaning": "Mỗi tối tôi xem thời sự.",
        "dictionaryForm": ""
      },
      {
        "id": 2118,
        "word": "スピーチ",
        "reading": "スピーチ",
        "romaji": "supiichi",
        "meaning": "Bài diễn văn / Phát biểu",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "スピーチを します。",
        "exampleSentenceReading": "すぴーちを します。",
        "exampleSentenceMeaning": "Tôi đọc bài phát biểu.",
        "dictionaryForm": ""
      },
      {
        "id": 2119,
        "word": "試合",
        "reading": "しあい",
        "romaji": "shiai",
        "meaning": "Trận thi đấu",
        "hanViet": "Thí Hợp",
        "type": "Danh từ",
        "exampleSentence": "サッカーの 試合を 見ました。",
        "exampleSentenceReading": "さっかーの しあいを みました。",
        "exampleSentenceMeaning": "Tôi đã xem trận bóng đá.",
        "dictionaryForm": ""
      },
      {
        "id": 2120,
        "word": "意見",
        "reading": "いけん",
        "romaji": "iken",
        "meaning": "Ý kiến / Quan điểm",
        "hanViet": "Ý Kiến",
        "type": "Danh từ",
        "exampleSentence": "自分の 意見を 言います。",
        "exampleSentenceReading": "じぶんの いけんを いいます。",
        "exampleSentenceMeaning": "Tôi nói ra ý kiến của mình.",
        "dictionaryForm": ""
      },
      {
        "id": 2121,
        "word": "嘘",
        "reading": "うそ",
        "romaji": "uso",
        "meaning": "Lời nói dối / Chuyện bịa",
        "hanViet": "Hư",
        "type": "Danh từ",
        "exampleSentence": "嘘を ついては いけません。",
        "exampleSentenceReading": "うそを ついては いけません。",
        "exampleSentenceMeaning": "Không được nói dối.",
        "dictionaryForm": ""
      },
      {
        "id": 2122,
        "word": "交通",
        "reading": "こうつう",
        "romaji": "koutsuu",
        "meaning": "Giao thông",
        "hanViet": "Giao Thông",
        "type": "Danh từ",
        "exampleSentence": "東京は 交通が 便利です。",
        "exampleSentenceReading": "とうきょうは こうつうが べんりです。",
        "exampleSentenceMeaning": "Giao thông Tokyo rất thuận tiện.",
        "dictionaryForm": ""
      },
      {
        "id": 2123,
        "word": "ラッシュ",
        "reading": "ラッシュ",
        "romaji": "rasshu",
        "meaning": "Giờ cao điểm",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "朝の ラッシュは 大変です。",
        "exampleSentenceReading": "あさの らっしゅは たいへんです。",
        "exampleSentenceMeaning": "Giờ cao điểm buổi sáng thật kinh khủng.",
        "dictionaryForm": ""
      },
      {
        "id": 2124,
        "word": "最近",
        "reading": "さいきん",
        "romaji": "saikin",
        "meaning": "Gần đây / Dạo này",
        "hanViet": "Tối Cận",
        "type": "Danh từ",
        "exampleSentence": "最近 とても 忙しいです。",
        "exampleSentenceReading": "さいきん とても いそがしいです。",
        "exampleSentenceMeaning": "Dạo này tôi rất bận.",
        "dictionaryForm": ""
      },
      {
        "id": 2125,
        "word": "たぶん",
        "reading": "たぶん",
        "romaji": "tabun",
        "meaning": "Có lẽ / Chắc là",
        "hanViet": "Đa Phân",
        "type": "Phó từ",
        "exampleSentence": "たぶん 明日は 晴れでしょう。",
        "exampleSentenceReading": "たぶん あしたは はれでしょう。",
        "exampleSentenceMeaning": "Có lẽ ngày mai trời sẽ nắng.",
        "dictionaryForm": ""
      },
      {
        "id": 2126,
        "word": "きっと",
        "reading": "きっと",
        "romaji": "kitto",
        "meaning": "Chắc chắn",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "きっと 合格しますよ。",
        "exampleSentenceReading": "きっと ごうかくしますよ。",
        "exampleSentenceMeaning": "Chắc chắn bạn sẽ đỗ thôi.",
        "dictionaryForm": ""
      },
      {
        "id": 2127,
        "word": "本当に",
        "reading": "ほんとうに",
        "romaji": "hontou ni",
        "meaning": "Thật sự là",
        "hanViet": "Bản Đương",
        "type": "Phó từ",
        "exampleSentence": "本当に ありがとうございます。",
        "exampleSentenceReading": "ほんとうに ありがとうございます。",
        "exampleSentenceMeaning": "Thật sự cảm ơn bạn rất nhiều.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "[Thể thông thường] と 思います (Tôi nghĩ rằng...)",
        "pattern": "[Thể ngắn] + と 思います",
        "explanation": "Dùng để bày tỏ ý kiến, phỏng đoán hoặc quan điểm cá nhân của người nói.",
        "examples": [
          {
            "japanese": "あしたは 雨が 降ると 思います。",
            "reading": "あしたは あめが ふると おもいます。",
            "vietnamese": "Tôi nghĩ là ngày mai trời sẽ mưa."
          }
        ]
      },
      {
        "title": "[Câu nói / Thể thông thường] と 言いました (Ai đó đã nói rằng...)",
        "pattern": "Câu / [Thể ngắn] + と 言いました",
        "explanation": "Dùng để trích dẫn trực tiếp hoặc gián tiếp lời phát biểu của người khác.",
        "examples": [
          {
            "japanese": "田中さんは 「来週 休む」と 言いました。",
            "reading": "たなかさんは 「らいしゅう やすむ」と いいました。",
            "vietnamese": "Anh Tanaka đã nói là 'Tuần sau tôi nghỉ'."
          }
        ]
      },
      {
        "title": "[Thể thông thường] でしょう？ (Phải không?)",
        "pattern": "[Thể ngắn] + でしょう？",
        "explanation": "Dùng khi người nói kỳ vọng người nghe sẽ đồng tình với nhận định của mình.",
        "examples": [
          {
            "japanese": "あしたの パーティーに 行くでしょう？ ー ええ、行きますよ。",
            "reading": "あしたの ぱーてぃーに いくでしょう？ ー ええ、いきますよ。",
            "vietnamese": "Mai cậu sẽ đi tiệc chứ? - Ừ, đi chứ."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 22,
    "title": "Bài 22: Mệnh đề bổ ngữ cho danh từ",
    "japaneseTitle": "第２２課：連体修飾",
    "description": "Mệnh đề định ngữ: Dùng mệnh đề động từ thể ngắn để bổ nghĩa cho danh từ đứng sau.",
    "vocabularies": [
      {
        "id": 2201,
        "word": "着ます",
        "reading": "きます",
        "romaji": "kimasu",
        "meaning": "Mặc (áo sơ mi, áo khoác, đồ từ thắt lưng trở lên)",
        "hanViet": "Trước",
        "type": "Động từ nhóm 2",
        "exampleSentence": "シャツを 着ます。",
        "exampleSentenceReading": "しゃつを きます。",
        "exampleSentenceMeaning": "Tôi mặc áo sơ mi.",
        "dictionaryForm": "着る (きる)"
      },
      {
        "id": 2202,
        "word": "履きます",
        "reading": "はきます",
        "romaji": "hakimasu",
        "meaning": "Xỏ / Đi / Mặc (quần, tất, giày - từ thắt lưng trở xuống)",
        "hanViet": "Lý",
        "type": "Động từ nhóm 1",
        "exampleSentence": "靴を 履きます。",
        "exampleSentenceReading": "くつを はきます。",
        "exampleSentenceMeaning": "Tôi xỏ giày.",
        "dictionaryForm": "履く (はく)"
      },
      {
        "id": 2203,
        "word": "かぶります",
        "reading": "かぶります",
        "romaji": "kaburimasu",
        "meaning": "Đội (mũ, nón)",
        "hanViet": "Bị",
        "type": "Động từ nhóm 1",
        "exampleSentence": "帽子を かぶります。",
        "exampleSentenceReading": "ぼうしを かぶります。",
        "exampleSentenceMeaning": "Tôi đội mũ.",
        "dictionaryForm": "かぶる"
      },
      {
        "id": 2204,
        "word": "かけます",
        "reading": "かけます",
        "romaji": "kakemasu",
        "meaning": "Đeo (kính mắt)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "眼鏡を かけます。",
        "exampleSentenceReading": "めがねを かけます。",
        "exampleSentenceMeaning": "Tôi đeo kính mắt.",
        "dictionaryForm": "かける"
      },
      {
        "id": 2205,
        "word": "します",
        "reading": "します",
        "romaji": "shimasu",
        "meaning": "Đeo (cà vạt, đồng hồ, phụ kiện)",
        "hanViet": "",
        "type": "Động từ nhóm 3",
        "exampleSentence": "ネクタイを します。",
        "exampleSentenceReading": "ねくたいを します。",
        "exampleSentenceMeaning": "Tôi thắt cà vạt.",
        "dictionaryForm": "する"
      },
      {
        "id": 2206,
        "word": "生まれます",
        "reading": "うまれます",
        "romaji": "umaremasu",
        "meaning": "Được sinh ra / Ra đời",
        "hanViet": "Sinh",
        "type": "Động từ nhóm 2",
        "exampleSentence": "1998年に 生まれました。",
        "exampleSentenceReading": "1998ねんに うまれました。",
        "exampleSentenceMeaning": "Tôi sinh năm 1998.",
        "dictionaryForm": "生まれる (うまれる)"
      },
      {
        "id": 2207,
        "word": "コート",
        "reading": "コート",
        "romaji": "kooto",
        "meaning": "Áo khoác dài / Áo măng-tô",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "冬は コートを 着ます。",
        "exampleSentenceReading": "ふゆは こーとを きます。",
        "exampleSentenceMeaning": "Mùa đông tôi mặc áo khoác dài.",
        "dictionaryForm": ""
      },
      {
        "id": 2208,
        "word": "スーツ",
        "reading": "スーツ",
        "romaji": "suutsu",
        "meaning": "Bộ vest / Âu phục",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "面接で スーツを 着ます。",
        "exampleSentenceReading": "めんせつで すーつを きます。",
        "exampleSentenceMeaning": "Tôi mặc vest đi phỏng vấn.",
        "dictionaryForm": ""
      },
      {
        "id": 2209,
        "word": "セーター",
        "reading": "セーター",
        "romaji": "seetaa",
        "meaning": "Áo len",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "暖かい セーターを 買いました。",
        "exampleSentenceReading": "あたたかい せーたーを かいました。",
        "exampleSentenceMeaning": "Tôi mua áo len ấm áp.",
        "dictionaryForm": ""
      },
      {
        "id": 2210,
        "word": "帽子",
        "reading": "ぼうし",
        "romaji": "boushi",
        "meaning": "Mũ / Nón",
        "hanViet": "Mạo Tử",
        "type": "Danh từ",
        "exampleSentence": "かわいい 帽子ですね。",
        "exampleSentenceReading": "かわいい ぼうしですね。",
        "exampleSentenceMeaning": "Chiếc mũ xinh xắn ghê.",
        "dictionaryForm": ""
      },
      {
        "id": 2211,
        "word": "眼鏡",
        "reading": "めがね",
        "romaji": "megane",
        "meaning": "Kính mắt",
        "hanViet": "Nhãn Kính",
        "type": "Danh từ",
        "exampleSentence": "眼鏡を 探しています。",
        "exampleSentenceReading": "めがねを さがしています。",
        "exampleSentenceMeaning": "Tôi đang tìm kính mắt.",
        "dictionaryForm": ""
      },
      {
        "id": 2212,
        "word": "ケーキ",
        "reading": "ケーキ",
        "romaji": "keeki",
        "meaning": "Bánh ngọt / Bánh kem",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "誕生日ケーキを 作ります。",
        "exampleSentenceReading": "たんじょうびけーきを つくります。",
        "exampleSentenceMeaning": "Tôi làm bánh kem sinh nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 2213,
        "word": "お弁当",
        "reading": "おべんとう",
        "romaji": "obentou",
        "meaning": "Cơm hộp kiểu Nhật (Bento)",
        "hanViet": "Biện Đương",
        "type": "Danh từ",
        "exampleSentence": "毎日 お弁当を 作ります。",
        "exampleSentenceReading": "まいにち おべんとうを つくります。",
        "exampleSentenceMeaning": "Mỗi ngày tôi đều làm cơm hộp.",
        "dictionaryForm": ""
      },
      {
        "id": 2214,
        "word": "都合",
        "reading": "つごう",
        "romaji": "tsugou",
        "meaning": "Sự thuận tiện / Điều kiện thời gian",
        "hanViet": "Đô Hợp",
        "type": "Danh từ",
        "exampleSentence": "明日の 都合は どうですか。",
        "exampleSentenceReading": "あしたの つごうは どうですか。",
        "exampleSentenceMeaning": "Thời gian ngày mai của bạn có tiện không?",
        "dictionaryForm": ""
      },
      {
        "id": 2215,
        "word": "よく",
        "reading": "よく",
        "romaji": "yoku",
        "meaning": "Hay / Thường xuyên",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "あの喫茶店へ よく 行きます。",
        "exampleSentenceReading": "あのきっさてんへ よく いきます。",
        "exampleSentenceMeaning": "Tôi hay ghé quán cà phê kia.",
        "dictionaryForm": ""
      },
      {
        "id": 2216,
        "word": "えーと",
        "reading": "えーと",
        "romaji": "eeto",
        "meaning": "Ừm... / Để xem nào...",
        "hanViet": "",
        "type": "Thán từ",
        "exampleSentence": "えーと、何時でしたっけ。",
        "exampleSentenceReading": "えーと、なんじでしたっけ。",
        "exampleSentenceMeaning": "Ừm... lúc mấy giờ nhỉ.",
        "dictionaryForm": ""
      },
      {
        "id": 2217,
        "word": "おめでとう",
        "reading": "おめでとう",
        "romaji": "omedetou",
        "meaning": "Chúc mừng nhé!",
        "hanViet": "",
        "type": "Chào hỏi",
        "exampleSentence": "お誕生日 おめでとうございます！",
        "exampleSentenceReading": "おたんじょうび おめでとうございます！",
        "exampleSentenceMeaning": "Chúc mừng sinh nhật bạn!",
        "dictionaryForm": ""
      },
      {
        "id": 2218,
        "word": "家賃",
        "reading": "やちん",
        "romaji": "yachin",
        "meaning": "Tiền thuê nhà",
        "hanViet": "Gia Thẫm",
        "type": "Danh từ",
        "exampleSentence": "家賃は 1か月 6万円です。",
        "exampleSentenceReading": "やちんは いっかげつ ろくまんえんです。",
        "exampleSentenceMeaning": "Tiền thuê nhà 1 tháng là 6 vạn Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 2219,
        "word": "和室",
        "reading": "わしつ",
        "romaji": "washitsu",
        "meaning": "Phòng kiểu truyền thống Nhật (chiếu tatami)",
        "hanViet": "Hòa Thất",
        "type": "Danh từ",
        "exampleSentence": "和室で 布団を 敷きます。",
        "exampleSentenceReading": "わしつで ふとんを しきます。",
        "exampleSentenceMeaning": "Trải đệm nằm trong phòng kiểu Nhật.",
        "dictionaryForm": ""
      },
      {
        "id": 2220,
        "word": "押し入れ",
        "reading": "おしいれ",
        "romaji": "oshiire",
        "meaning": "Tủ âm tường truyền thống",
        "hanViet": "Áp Nhập",
        "type": "Danh từ",
        "exampleSentence": "押し入れに 布団を 入れます。",
        "exampleSentenceReading": "おしいれに ふとんを いれます。",
        "exampleSentenceMeaning": "Cất đệm vào tủ âm tường.",
        "dictionaryForm": ""
      },
      {
        "id": 2221,
        "word": "布団",
        "reading": "ふとん",
        "romaji": "futon",
        "meaning": "Đệm / Chăn đệm kiểu Nhật",
        "hanViet": "Bố Đoàn",
        "type": "Danh từ",
        "exampleSentence": "暖かい 布団で 寝ます。",
        "exampleSentenceReading": "あたたかい ふとんで ねます。",
        "exampleSentenceMeaning": "Ngủ trong chăn đệm ấm áp.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Mệnh đề bổ nghĩa cho danh từ (Định ngữ)",
        "pattern": "[Mệnh đề động từ thể ngắn] + Danh từ",
        "explanation": "Trong tiếng Nhật, mệnh đề bổ nghĩa luôn luôn đứng TRƯỚC danh từ được bổ nghĩa.",
        "examples": [
          {
            "japanese": "これは ミラーさんが 住んでいる 家です。",
            "reading": "これは みらーさんが すんでいる いえです。",
            "vietnamese": "Đây là ngôi nhà mà anh Miller đang ở."
          },
          {
            "japanese": "あそこで 本を 読んでいる 人は だれですか。",
            "reading": "あそこで ほんを よんでいる ひとは だれですか。",
            "vietnamese": "Người đang đọc sách ở đằng kia là ai thế?"
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 23,
    "title": "Bài 23: Khi nào (とき) & Hễ mà (と)",
    "japaneseTitle": "第２３課：～とき・～と",
    "description": "Diễn tả thời điểm hành động xảy ra với とき (khi), điều kiện tự nhiên, chỉ đường với と (hễ mà).",
    "vocabularies": [
      {
        "id": 2301,
        "word": "聞きます",
        "reading": "ききます",
        "romaji": "kikimasu",
        "meaning": "Hỏi (thầy cô, người khác [に])",
        "hanViet": "Văn",
        "type": "Động từ nhóm 1",
        "exampleSentence": "先生に 聞いてください。",
        "exampleSentenceReading": "せんせいに きいてください。",
        "exampleSentenceMeaning": "Xin hãy hỏi thầy giáo.",
        "dictionaryForm": "聞く (きく)"
      },
      {
        "id": 2302,
        "word": "回します",
        "reading": "まわします",
        "romaji": "mawashimasu",
        "meaning": "Xoay / Vặn (núm điều khiển)",
        "hanViet": "Hồi",
        "type": "Động từ nhóm 1",
        "exampleSentence": "つまみを 右へ 回します。",
        "exampleSentenceReading": "つまみを みぎへ まわします。",
        "exampleSentenceMeaning": "Vặn núm sang phải.",
        "dictionaryForm": "回す (まわす)"
      },
      {
        "id": 2303,
        "word": "引きます",
        "reading": "ひきます",
        "romaji": "hikimasu",
        "meaning": "Kéo (cửa)",
        "hanViet": "Dẫn",
        "type": "Động từ nhóm 1",
        "exampleSentence": "ドアを 引いてください。",
        "exampleSentenceReading": "どあを ひいてください。",
        "exampleSentenceMeaning": "Xin hãy kéo cửa ra.",
        "dictionaryForm": "引く (ひく)"
      },
      {
        "id": 2304,
        "word": "変えます",
        "reading": "かえます",
        "romaji": "kaemasu",
        "meaning": "Thay đổi / Đổi mới",
        "hanViet": "Biến",
        "type": "Động từ nhóm 2",
        "exampleSentence": "時間を 変えます。",
        "exampleSentenceReading": "じかんを かえます。",
        "exampleSentenceMeaning": "Tôi đổi giờ hẹn.",
        "dictionaryForm": "変える (かえる)"
      },
      {
        "id": 2305,
        "word": "触ります",
        "reading": "さわります",
        "romaji": "sawarimasu",
        "meaning": "Chạm vào / Sờ vào (đồ vật [に])",
        "hanViet": "Xúc",
        "type": "Động từ nhóm 1",
        "exampleSentence": "機械に 触らないでください。",
        "exampleSentenceReading": "きかいに さわらないでください。",
        "exampleSentenceMeaning": "Xin đừng chạm vào máy móc.",
        "dictionaryForm": "触る (さわる)"
      },
      {
        "id": 2306,
        "word": "出ます",
        "reading": "でます",
        "romaji": "demasu",
        "meaning": "Chảy ra (tiền thừa, nước [が])",
        "hanViet": "Xuất",
        "type": "Động từ nhóm 2",
        "exampleSentence": "おつりが 出ます。",
        "exampleSentenceReading": "おつりが でます。",
        "exampleSentenceMeaning": "Tiền thối tiền thừa chạy ra.",
        "dictionaryForm": "出る (でる)"
      },
      {
        "id": 2307,
        "word": "動きます",
        "reading": "うごきます",
        "romaji": "ugokimasu",
        "meaning": "Chuyển động / Vận hành",
        "hanViet": "Động",
        "type": "Động từ nhóm 1",
        "exampleSentence": "時計が 動きません。",
        "exampleSentenceReading": "とけいが うごきません。",
        "exampleSentenceMeaning": "Đồng hồ không chạy.",
        "dictionaryForm": "動く (うごく)"
      },
      {
        "id": 2308,
        "word": "歩きます",
        "reading": "あるきます",
        "romaji": "arukimasu",
        "meaning": "Đi bộ (trên đường [を])",
        "hanViet": "Bộ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "道を 歩きます。",
        "exampleSentenceReading": "みちを あるきます。",
        "exampleSentenceMeaning": "Tôi đi bộ trên đường phố.",
        "dictionaryForm": "歩く (あるく)"
      },
      {
        "id": 2309,
        "word": "渡ります",
        "reading": "わたります",
        "romaji": "watarimasu",
        "meaning": "Băng qua (cầu, đường [を])",
        "hanViet": "Độ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "橋を 渡ります。",
        "exampleSentenceReading": "はしを わたりまします。",
        "exampleSentenceMeaning": "Tôi băng qua cầu.",
        "dictionaryForm": "渡る (わたる)"
      },
      {
        "id": 2310,
        "word": "気をつけます",
        "reading": "きをつけます",
        "romaji": "ki o tsukemasu",
        "meaning": "Cẩn thận / Đề phòng",
        "hanViet": "Khí",
        "type": "Động từ nhóm 2",
        "exampleSentence": "車に 気をつけて 渡ります。",
        "exampleSentenceReading": "くるまに きをつけて わたります。",
        "exampleSentenceMeaning": "Cẩn thận xe cộ khi qua đường.",
        "dictionaryForm": "気をつける (きをつける)"
      },
      {
        "id": 2311,
        "word": "引っ越しします",
        "reading": "ひっこしします",
        "romaji": "hikkoshishimasu",
        "meaning": "Chuyển nhà",
        "hanViet": "Dẫn Việt",
        "type": "Động từ nhóm 3",
        "exampleSentence": "来月 引っ越しします。",
        "exampleSentenceReading": "らいげつ ひっこしします。",
        "exampleSentenceMeaning": "Tháng sau tôi chuyển nhà.",
        "dictionaryForm": "引っ越しする (ひっこしする)"
      },
      {
        "id": 2312,
        "word": "電気屋",
        "reading": "でんきや",
        "romaji": "denkiya",
        "meaning": "Cửa hàng đồ điện",
        "hanViet": "Điện Khí Ốc",
        "type": "Danh từ",
        "exampleSentence": "電気屋で 洗濯機を 買います。",
        "exampleSentenceReading": "でんきやで せんたくきを かいます。",
        "exampleSentenceMeaning": "Mua máy giặt ở tiệm điện máy.",
        "dictionaryForm": ""
      },
      {
        "id": 2313,
        "word": "音",
        "reading": "おと",
        "romaji": "oto",
        "meaning": "Âm thanh / Tiếng động",
        "hanViet": "Âm",
        "type": "Danh từ",
        "exampleSentence": "テレビの 音を 大きくします。",
        "exampleSentenceReading": "てれびの おとを おおきくします。",
        "exampleSentenceMeaning": "Mở to âm thanh tivi.",
        "dictionaryForm": ""
      },
      {
        "id": 2314,
        "word": "機械",
        "reading": "きかい",
        "romaji": "kikai",
        "meaning": "Máy móc / Thiết bị",
        "hanViet": "Cơ Giới",
        "type": "Danh từ",
        "exampleSentence": "この機械の 使い方を 教えてください。",
        "exampleSentenceReading": "このきかいの つかいかたを おしえてください。",
        "exampleSentenceMeaning": "Chỉ cho tôi cách dùng máy này với.",
        "dictionaryForm": ""
      },
      {
        "id": 2315,
        "word": "つまみ",
        "reading": "つまみ",
        "romaji": "tsumami",
        "meaning": "Núm vặn xoay",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "音の つまみを 回します。",
        "exampleSentenceReading": "おとの つまみを まわします。",
        "exampleSentenceMeaning": "Vặn núm chỉnh âm lượng.",
        "dictionaryForm": ""
      },
      {
        "id": 2316,
        "word": "故障",
        "reading": "こしょう",
        "romaji": "koshou",
        "meaning": "Hỏng hóc / Trục trặc",
        "hanViet": "Cố Chướng",
        "type": "Danh từ",
        "exampleSentence": "エレベーターが 故障しました。",
        "exampleSentenceReading": "えれべーたーが こしょうしました。",
        "exampleSentenceMeaning": "Thang máy đã bị hỏng.",
        "dictionaryForm": ""
      },
      {
        "id": 2317,
        "word": "道",
        "reading": "みち",
        "romaji": "michi",
        "meaning": "Con đường",
        "hanViet": "Đạo",
        "type": "Danh từ",
        "exampleSentence": "道を まっすぐ 行きます。",
        "exampleSentenceReading": "みちを まっすぐ いきます。",
        "exampleSentenceMeaning": "Đi thẳng theo con đường này.",
        "dictionaryForm": ""
      },
      {
        "id": 2318,
        "word": "交差点",
        "reading": "こうさてん",
        "romaji": "kousaten",
        "meaning": "Ngã tư / Điểm giao lộ",
        "hanViet": "Giao Sai Điểm",
        "type": "Danh từ",
        "exampleSentence": "次の 交差点を 右へ 曲がります。",
        "exampleSentenceReading": "つぎの こうさてんを みぎへ まがります。",
        "exampleSentenceMeaning": "Rẽ phải ở ngã tư tiếp theo.",
        "dictionaryForm": ""
      },
      {
        "id": 2319,
        "word": "信号",
        "reading": "しんごう",
        "romaji": "shingou",
        "meaning": "Đèn giao thông / Tín hiệu",
        "hanViet": "Tín Hiệu",
        "type": "Danh từ",
        "exampleSentence": "信号が 赤に なりました。",
        "exampleSentenceReading": "しんごうが あかに なりました。",
        "exampleSentenceMeaning": "Đèn tín hiệu đã chuyển sang đỏ.",
        "dictionaryForm": ""
      },
      {
        "id": 2320,
        "word": "角",
        "reading": "かど",
        "romaji": "kado",
        "meaning": "Góc phố / Khúc cua",
        "hanViet": "Giác",
        "type": "Danh từ",
        "exampleSentence": "角を 左へ 曲がります。",
        "exampleSentenceReading": "かどを ひだりへ まがります。",
        "exampleSentenceMeaning": "Rẽ trái ở khúc quanh.",
        "dictionaryForm": ""
      },
      {
        "id": 2321,
        "word": "橋",
        "reading": "はし",
        "romaji": "hashi",
        "meaning": "Cây cầu",
        "hanViet": "Kiều",
        "type": "Danh từ",
        "exampleSentence": "大きな 橋を 渡ります。",
        "exampleSentenceReading": "おおきな はしを わたりまします。",
        "exampleSentenceMeaning": "Băng qua cây cầu lớn.",
        "dictionaryForm": ""
      },
      {
        "id": 2322,
        "word": "駐車場",
        "reading": "ちゅうしゃじょう",
        "romaji": "chuushajou",
        "meaning": "Bãi đỗ xe",
        "hanViet": "Trú Xa Trường",
        "type": "Danh từ",
        "exampleSentence": "駐車場は どこですか。",
        "exampleSentenceReading": "ちゅうしゃじょうは どこですか。",
        "exampleSentenceMeaning": "Bãi đỗ xe ở đâu thế?",
        "dictionaryForm": ""
      },
      {
        "id": 2323,
        "word": "建物",
        "reading": "たてもの",
        "romaji": "tatemono",
        "meaning": "Tòa nhà / Công trình",
        "hanViet": "Kiến Vật",
        "type": "Danh từ",
        "exampleSentence": "高い 建物が 並んでいます。",
        "exampleSentenceReading": "たかい たてものが ならんでいます。",
        "exampleSentenceMeaning": "Những tòa nhà cao tầng san sát nhau.",
        "dictionaryForm": ""
      },
      {
        "id": 2324,
        "word": "曲がります",
        "reading": "まがります",
        "romaji": "magarimasu",
        "meaning": "Rẽ (phải, trái)",
        "hanViet": "Khúc",
        "type": "Động từ nhóm 1",
        "exampleSentence": "右へ 曲がります。",
        "exampleSentenceReading": "みぎへ まがります。",
        "exampleSentenceMeaning": "Rẽ sang phải.",
        "dictionaryForm": "曲がる (まがる)"
      }
    ],
    "grammarPoints": [
      {
        "title": "Vる／Vない／Aい／Aな／Nの + とき (Khi...)",
        "pattern": "[Thể điều kiện] + とき",
        "explanation": "Biểu thị thời điểm một sự việc xảy ra.",
        "examples": [
          {
            "japanese": "新聞を 読む とき、眼鏡を かけます。",
            "reading": "しんぶんを よむ とき、めがねを かけます。",
            "vietnamese": "Khi đọc báo, tôi đeo kính."
          },
          {
            "japanese": "暇な とき、音楽を 聞きます。",
            "reading": "ひまな とき、おんがくを ききます。",
            "vietnamese": "Khi rảnh rỗi, tôi nghe nhạc."
          }
        ]
      },
      {
        "title": "Vる + と (Hễ mà... thì...)",
        "pattern": "V(thể từ điển) + と、[Kết quả tất yếu]",
        "explanation": "Dùng để chỉ đường hoặc kết quả tự nhiên tất yếu khi một hành động diễn ra.",
        "examples": [
          {
            "japanese": "このボタンを 押す と、お釣りが 出ます。",
            "reading": "このぼたんを おす と、おつりが でます。",
            "vietnamese": "Hễ bấm nút này thì tiền thừa sẽ chạy ra."
          },
          {
            "japanese": "右へ 曲がる と、銀行が あります。",
            "reading": "みぎへ まがる と、ぎんこうが あります。",
            "vietnamese": "Hễ rẽ phải là thấy ngân hàng."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 24,
    "title": "Bài 24: Cho và nhận hành động (Cho/Nhận giúp đỡ)",
    "japaneseTitle": "第２４課：～てくれます・～てあげます",
    "description": "Làm giúp ai Vてあげます, được ai làm giúp Vてもらいます, ai đó làm giúp mình Vてくれます.",
    "vocabularies": [
      {
        "id": 2401,
        "word": "くれます",
        "reading": "くれます",
        "romaji": "kuremasu",
        "meaning": "Cho / Tặng (cho tôi hoặc người thân của tôi)",
        "hanViet": "",
        "type": "Động từ nhóm 2",
        "exampleSentence": "佐藤さんが 花を くれました。",
        "exampleSentenceReading": "さとうさんが はなを くれました。",
        "exampleSentenceMeaning": "Chị Sato đã tặng hoa cho tôi.",
        "dictionaryForm": "くれる"
      },
      {
        "id": 2402,
        "word": "直します",
        "reading": "なおします",
        "romaji": "naoshimasu",
        "meaning": "Sửa chữa / Chữa (lỗi)",
        "hanViet": "Trực",
        "type": "Động từ nhóm 1",
        "exampleSentence": "時計を 直してくれました。",
        "exampleSentenceReading": "とけいを なおしてくれました。",
        "exampleSentenceMeaning": "Anh ấy sửa đồng hồ giúp tôi.",
        "dictionaryForm": "直す (なおす)"
      },
      {
        "id": 2403,
        "word": "連れて行きます",
        "reading": "つれていきます",
        "romaji": "tsurete ikimasu",
        "meaning": "Dắt đi / Dẫn đi",
        "hanViet": "Liên Hành",
        "type": "Động từ nhóm 1",
        "exampleSentence": "子どもを 公園へ 連れて行きます。",
        "exampleSentenceReading": "こどもを こうえんへ つれていきます。",
        "exampleSentenceMeaning": "Tôi dắt con đi công viên.",
        "dictionaryForm": "連れて行く (つれていく)"
      },
      {
        "id": 2404,
        "word": "連れて来ます",
        "reading": "つれてきます",
        "romaji": "tsurete kimasu",
        "meaning": "Dắt đến / Dẫn lại đây",
        "hanViet": "Liên Lai",
        "type": "Động từ nhóm 3",
        "exampleSentence": "友達を うちへ 連れて来ました。",
        "exampleSentenceReading": "ともだちを うちへ つれてきました。",
        "exampleSentenceMeaning": "Tôi dẫn bạn về nhà chơi.",
        "dictionaryForm": "連れて来る (つれてくる)"
      },
      {
        "id": 2405,
        "word": "送ります",
        "reading": "おくります",
        "romaji": "okurimasu",
        "meaning": "Tiễn / Đưa (ai đó về nhà [を])",
        "hanViet": "Tống",
        "type": "Động từ nhóm 1",
        "exampleSentence": "駅まで 車で 送ります。",
        "exampleSentenceReading": "えきまで くるまで おくります。",
        "exampleSentenceMeaning": "Tôi lái xe chở tiễn bạn ra ga.",
        "dictionaryForm": "送る (おくる)"
      },
      {
        "id": 2406,
        "word": "紹介します",
        "reading": "しょうかいします",
        "romaji": "shoukaishimasu",
        "meaning": "Giới thiệu",
        "hanViet": "Thiệu Giới",
        "type": "Động từ nhóm 3",
        "exampleSentence": "友達を 先生に 紹介します。",
        "exampleSentenceReading": "ともだちを せんせいに しょうかいします。",
        "exampleSentenceMeaning": "Tôi giới thiệu bạn với thầy giáo.",
        "dictionaryForm": "紹介する (しょうかいする)"
      },
      {
        "id": 2407,
        "word": "案内します",
        "reading": "あんないします",
        "romaji": "annaishimasu",
        "meaning": "Hướng dẫn / Dẫn đường",
        "hanViet": "Án Nội",
        "type": "Động từ nhóm 3",
        "exampleSentence": "町を 案内します。",
        "exampleSentenceReading": "まちを あんないします。",
        "exampleSentenceMeaning": "Tôi hướng dẫn bạn tham quan thành phố.",
        "dictionaryForm": "案内する (あんないする)"
      },
      {
        "id": 2408,
        "word": "説明します",
        "reading": "せつめいします",
        "romaji": "setsumeishimasu",
        "meaning": "Giải thích / Thuyết minh",
        "hanViet": "Thuyết Minh",
        "type": "Động từ nhóm 3",
        "exampleSentence": "使い方を 説明します。",
        "exampleSentenceReading": "つかいかたを せつめいします。",
        "exampleSentenceMeaning": "Tôi giải thích cách sử dụng.",
        "dictionaryForm": "説明する (せつめいする)"
      },
      {
        "id": 2409,
        "word": "おじいさん / おじいちゃん",
        "reading": "おじいさん",
        "romaji": "ojiisan",
        "meaning": "Ông nội / Ông ngoại / Cụ già",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "おじいさんは 毎朝 散歩します。",
        "exampleSentenceReading": "おじいさんは まいあさ さんぽします。",
        "exampleSentenceMeaning": "Ông tôi mỗi sáng đều đi dạo.",
        "dictionaryForm": ""
      },
      {
        "id": 2410,
        "word": "おばあさん / おばあちゃん",
        "reading": "おばあさん",
        "romaji": "obaasan",
        "meaning": "Bà nội / Bà ngoại / Cụ bà",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "おばあさんは 親切です。",
        "exampleSentenceReading": "おばあさんは しんせつです。",
        "exampleSentenceMeaning": "Bà tôi rất hiền từ.",
        "dictionaryForm": ""
      },
      {
        "id": 2411,
        "word": "準備",
        "reading": "じゅんび",
        "romaji": "junbi",
        "meaning": "Chuẩn bị",
        "hanViet": "Chuẩn Bị",
        "type": "Danh từ",
        "exampleSentence": "旅行の 準備を します。",
        "exampleSentenceReading": "りょこうの じゅんびを します。",
        "exampleSentenceMeaning": "Tôi chuẩn bị cho chuyến du lịch.",
        "dictionaryForm": ""
      },
      {
        "id": 2412,
        "word": "引っ越し",
        "reading": "ひっこし",
        "romaji": "hikkoshi",
        "meaning": "Việc chuyển nhà",
        "hanViet": "Dẫn Việt",
        "type": "Danh từ",
        "exampleSentence": "引っ越しの 手伝いを します。",
        "exampleSentenceReading": "ひっこしの てつだいを します。",
        "exampleSentenceMeaning": "Tôi giúp đỡ việc chuyển nhà.",
        "dictionaryForm": ""
      },
      {
        "id": 2413,
        "word": "お菓子",
        "reading": "おかし",
        "romaji": "okashi",
        "meaning": "Bánh kẹo",
        "hanViet": "Quả Tử",
        "type": "Danh từ",
        "exampleSentence": "おいしい お菓子を 買いました。",
        "exampleSentenceReading": "おいしい おかしを かいました。",
        "exampleSentenceMeaning": "Tôi đã mua bánh kẹo ngon.",
        "dictionaryForm": ""
      },
      {
        "id": 2414,
        "word": "ホームステイ",
        "reading": "ホームステイ",
        "romaji": "hoomusutei",
        "meaning": "Ở homestay cùng gia đình bản xứ",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "夏休みに ホームステイを します。",
        "exampleSentenceReading": "なつやすみに ほーむすていを します。",
        "exampleSentenceMeaning": "Kỳ nghỉ hè tôi ở homestay.",
        "dictionaryForm": ""
      },
      {
        "id": 2415,
        "word": "全部",
        "reading": "ぜんぶ",
        "romaji": "zenbu",
        "meaning": "Tất cả / Toàn bộ",
        "hanViet": "Toàn Bộ",
        "type": "Phó từ",
        "exampleSentence": "宿題を 全部 終わりました。",
        "exampleSentenceReading": "しゅくだいを ぜんぶ おわりました。",
        "exampleSentenceMeaning": "Tôi đã làm xong toàn bộ bài tập.",
        "dictionaryForm": ""
      },
      {
        "id": 2416,
        "word": "自分で",
        "reading": "じぶんで",
        "romaji": "jibun de",
        "meaning": "Tự mình",
        "hanViet": "Tự Phân",
        "type": "Phó từ",
        "exampleSentence": "自分で 料理を 作ります。",
        "exampleSentenceReading": "じぶんで りょうりを つくります。",
        "exampleSentenceMeaning": "Tôi tự mình nấu ăn.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "Vて あげます (Làm việc gì giúp cho ai)",
        "pattern": "Người nhận + に + Vて + あげます",
        "explanation": "Người nói làm một hành động có lợi cho người khác.",
        "examples": [
          {
            "japanese": "わたしは 木村さんに 傘を 貸して あげました。",
            "reading": "わたしは きむらさんに かさを かして あげました。",
            "vietnamese": "Tôi đã cho chị Kimura mượn ô."
          }
        ]
      },
      {
        "title": "Vて もらいます (Được ai làm giúp cho việc gì)",
        "pattern": "Người làm + に + Vて + もらいます",
        "explanation": "Người nói nhận được sự giúp đỡ từ người khác.",
        "examples": [
          {
            "japanese": "わたしは 鈴木さんに 日本語を 教えて もらいました。",
            "reading": "わたしは すずきさんに にほんごを おしえて もらいました。",
            "vietnamese": "Tôi đã được anh Suzuki dạy tiếng Nhật."
          }
        ]
      },
      {
        "title": "Vて くれます (Ai đó làm giúp việc gì cho tôi)",
        "pattern": "Người làm + が + [わたしに] + Vて + くれます",
        "explanation": "Ai đó chủ động thực hiện hành động giúp đỡ người nói (hoặc người nhà của người nói).",
        "examples": [
          {
            "japanese": "友達が 引っ越しを 手伝って くれました。",
            "reading": "ともだちが ひっこしを てつだって くれました。",
            "vietnamese": "Bạn bè đã giúp tôi chuyển nhà."
          }
        ]
      }
    ]
  },
  {
    "lessonNumber": 25,
    "title": "Bài 25: Điều kiện (たら・ても)",
    "japaneseTitle": "第２５課：～たら・～ても",
    "description": "Câu điều kiện giả định / sau khi Vたら (nếu/sau khi), câu điều kiện tương phản dù... nhưng Vても.",
    "vocabularies": [
      {
        "id": 2501,
        "word": "考えます",
        "reading": "かんがえます",
        "romaji": "kangaemasu",
        "meaning": "Suy nghĩ / Cân nhắc",
        "hanViet": "Khảo",
        "type": "Động từ nhóm 2",
        "exampleSentence": "よく 考えてください。",
        "exampleSentenceReading": "よく かんがえてください。",
        "exampleSentenceMeaning": "Hãy suy nghĩ cho kỹ nhé.",
        "dictionaryForm": "考える (かんがえる)"
      },
      {
        "id": 2502,
        "word": "着きます",
        "reading": "つきます",
        "romaji": "tsukimasu",
        "meaning": "Đến nơi (nhà ga [に])",
        "hanViet": "Trước",
        "type": "Động từ nhóm 1",
        "exampleSentence": "7時に 駅に 着きます。",
        "exampleSentenceReading": "しちじに えきに つきます。",
        "exampleSentenceMeaning": "Tôi đến ga lúc 7 giờ.",
        "dictionaryForm": "着く (つく)"
      },
      {
        "id": 2503,
        "word": "留学します",
        "reading": "りゅうがくします",
        "romaji": "ryuugakushimasu",
        "meaning": "Đi du học",
        "hanViet": "Lưu Học",
        "type": "Động từ nhóm 3",
        "exampleSentence": "来年 日本へ 留学します。",
        "exampleSentenceReading": "らいねん にほんへ りゅうがくします。",
        "exampleSentenceMeaning": "Năm sau tôi đi du học Nhật.",
        "dictionaryForm": "留学する (りゅうがくする)"
      },
      {
        "id": 2504,
        "word": "年を取ります",
        "reading": "としをとります",
        "romaji": "toshi o torimasu",
        "meaning": "Thêm tuổi / Già đi",
        "hanViet": "Niên Thủ",
        "type": "Động từ nhóm 1",
        "exampleSentence": "年を 取ったら、田舎に 住みたいです。",
        "exampleSentenceReading": "としを とったら、いなかにつみたいです。",
        "exampleSentenceMeaning": "Khi về già, tôi muốn sống ở quê.",
        "dictionaryForm": "年を取る (としをとる)"
      },
      {
        "id": 2505,
        "word": "足ります",
        "reading": "たります",
        "romaji": "tarimasu",
        "meaning": "Đủ / Đầy đủ",
        "hanViet": "Túc",
        "type": "Động từ nhóm 2",
        "exampleSentence": "時間が 足りません。",
        "exampleSentenceReading": "じかんが たりません。",
        "exampleSentenceMeaning": "Không đủ thời gian.",
        "dictionaryForm": "足りる (たりる)"
      },
      {
        "id": 2506,
        "word": "田舎",
        "reading": "いなか",
        "romaji": "inaka",
        "meaning": "Quê hương / Nông thôn",
        "hanViet": "Điền Xá",
        "type": "Danh từ",
        "exampleSentence": "わたしの 田舎は 静かです。",
        "exampleSentenceReading": "わたしの いなかは しずかです。",
        "exampleSentenceMeaning": "Quê tôi rất yên bình.",
        "dictionaryForm": ""
      },
      {
        "id": 2507,
        "word": "チャンス",
        "reading": "チャンス",
        "romaji": "chansu",
        "meaning": "Cơ hội",
        "hanViet": "",
        "type": "Danh từ",
        "exampleSentence": "留学の チャンスが あります。",
        "exampleSentenceReading": "りゅうがくの ちゃんすが あります。",
        "exampleSentenceMeaning": "Có cơ hội đi du học.",
        "dictionaryForm": ""
      },
      {
        "id": 2508,
        "word": "億",
        "reading": "おく",
        "romaji": "oku",
        "meaning": "Trăm triệu (100.000.000)",
        "hanViet": "Ức",
        "type": "Số từ",
        "exampleSentence": "宝くじで 1億円 当たりました。",
        "exampleSentenceReading": "たからくじで いちおくえん あたりました。",
        "exampleSentenceMeaning": "Trúng xổ số 100 triệu Yên.",
        "dictionaryForm": ""
      },
      {
        "id": 2509,
        "word": "もし",
        "reading": "もし",
        "romaji": "moshi",
        "meaning": "Nếu như / Giả sử (đi với ～たら)",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "もし 雨が 降ったら、行きません。",
        "exampleSentenceReading": "もし あめが ふったら、いきません。",
        "exampleSentenceMeaning": "Nếu trời mưa thì tôi sẽ không đi.",
        "dictionaryForm": ""
      },
      {
        "id": 2510,
        "word": "いくら",
        "reading": "いくら",
        "romaji": "ikura",
        "meaning": "Dù cho bao nhiêu / Cho dù thế nào (đi với ～ても)",
        "hanViet": "",
        "type": "Phó từ",
        "exampleSentence": "いくら 考えても、わかりません。",
        "exampleSentenceReading": "いくら かんがえても、わかりません。",
        "exampleSentenceMeaning": "Dù suy nghĩ bao nhiêu cũng không hiểu.",
        "dictionaryForm": ""
      },
      {
        "id": 2511,
        "word": "転勤",
        "reading": "てんきん",
        "romaji": "tenkin",
        "meaning": "Chuyển công tác",
        "hanViet": "Chuyển Cần",
        "type": "Danh từ",
        "exampleSentence": "東京へ 転勤に なりました。",
        "exampleSentenceReading": "とうきょうへ てんきんに なりました。",
        "exampleSentenceMeaning": "Tôi được điều chuyển công tác lên Tokyo.",
        "dictionaryForm": ""
      },
      {
        "id": 2512,
        "word": "一杯飲みましょう",
        "reading": "いっぱいのみましょう",
        "romaji": "ippai nomimashou",
        "meaning": "Cùng uống một ly nhé!",
        "hanViet": "Nhất Bôi Ẩm",
        "type": "Giao tiếp",
        "exampleSentence": "仕事の あと、一杯 飲みましょう。",
        "exampleSentenceReading": "しごとの あと、いっぱい のみましょう。",
        "exampleSentenceMeaning": "Sau giờ làm cùng làm một ly nhé.",
        "dictionaryForm": ""
      },
      {
        "id": 2513,
        "word": "お世話になりました",
        "reading": "おせわになりました",
        "romaji": "osewa ni narimashita",
        "meaning": "Cảm ơn vì đã giúp đỡ tôi suốt thời gian qua",
        "hanViet": "Thế Thoại",
        "type": "Chào hỏi",
        "exampleSentence": "今まで どうも お世話になりました。",
        "exampleSentenceReading": "いままで どうも おせわになりました。",
        "exampleSentenceMeaning": "Thời gian qua thật lòng cảm ơn vì đã giúp đỡ tôi.",
        "dictionaryForm": ""
      },
      {
        "id": 2514,
        "word": "頑張ってください",
        "reading": "がんばってください",
        "romaji": "ganbatte kudasai",
        "meaning": "Hãy cố gắng lên nhé!",
        "hanViet": "Ngoan Trương",
        "type": "Chào hỏi",
        "exampleSentence": "試験、頑張ってください！",
        "exampleSentenceReading": "しけん、がんばってください！",
        "exampleSentenceMeaning": "Kỳ thi hãy cố gắng lên nhé!",
        "dictionaryForm": ""
      },
      {
        "id": 2515,
        "word": "どうぞお元気で",
        "reading": "どうぞおげんきで",
        "romaji": "douzo ogenki de",
        "meaning": "Chúc bạn luôn mạnh khỏe bình an",
        "hanViet": "Nguyên Khí",
        "type": "Chào hỏi",
        "exampleSentence": "お体に 気をつけて、どうぞお元気で。",
        "exampleSentenceReading": "おからだに きをつけて、どうぞおげんきで。",
        "exampleSentenceMeaning": "Giữ gìn sức khỏe, chúc bạn luôn bình an nhé.",
        "dictionaryForm": ""
      }
    ],
    "grammarPoints": [
      {
        "title": "～たら (Nếu / Sau khi... thì...)",
        "pattern": "[Thể Ta] + ら、[Hành động]",
        "explanation": "Diễn tả điều kiện giả định 'Nếu...' hoặc mốc thời gian 'Sau khi hoàn thành... thì sẽ làm...'.",
        "examples": [
          {
            "japanese": "お金が あったら、旅行します。",
            "reading": "おかねが あったら、りょこうします。",
            "vietnamese": "Nếu có tiền tôi sẽ đi du lịch."
          },
          {
            "japanese": "１０時に なったら、出かけましょう。",
            "reading": "じゅうじに なったら、でかけましょう。",
            "vietnamese": "Đến 10 giờ thì chúng ta xuất phát nhé."
          }
        ]
      },
      {
        "title": "～ても (Dù... nhưng...)",
        "pattern": "[Thể Te] + も、[Hành động]",
        "explanation": "Diễn tả điều kiện tương phản 'Cho dù... nhưng vẫn...'. Tính từ -i: くて + も, tính từ -na / danh từ: で + も.",
        "examples": [
          {
            "japanese": "雨が 降っても、サッカーを します。",
            "reading": "あめが ふっても、さっかーを します。",
            "vietnamese": "Cho dù trời mưa chúng tôi vẫn chơi bóng đá."
          },
          {
            "japanese": "高くても、このパソコンを 買いたいです。",
            "reading": "たかくても、このぱそこんを かいたいです。",
            "vietnamese": "Dù đắt tôi vẫn muốn mua chiếc máy tính này."
          }
        ]
      }
    ]
  }
]"""
    val TESTS_RAW_JSON = """[
  {
    "id": "test_n5_01",
    "title": "Đề thi thử JLPT N5 - Đề số 1 (Tổng hợp 3 kỹ năng - Cơ bản)",
    "description": "Đề thi đầy đủ 3 phần chuẩn JLPT N5 (55 câu): Chữ Hán - Từ vựng (Mondai 1–4), Ngữ pháp - Đọc hiểu (Mondai 5–10) và Nghe hiểu Choukai (Mondai 1–4 có phát âm thanh hội thoại).",
    "durationMinutes": 90,
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
          "にぼん",
          "ひほん",
          "にっぽんご"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [日本] (Nhật Bản) đọc là 「にほん」.",
        "audioScript": ""
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この [本]は わたしのです。",
        "options": [
          "ぼん",
          "もと",
          "ほん",
          "ぽん"
        ],
        "correctIndex": 2,
        "explanation": "Chữ Hán [本] (Bản - quyển sách) đọc là 「ほん」.",
        "audioScript": ""
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "あした [友だち]と 会います。",
        "options": [
          "ゆうだち",
          "ゆうち",
          "ともだち",
          "ともたち"
        ],
        "correctIndex": 2,
        "explanation": "Chữ Hán [友だち] (Hữu - bạn bè) đọc là 「ともだち」.",
        "audioScript": ""
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "まいにち [水]を 飲みます。",
        "options": [
          "おちゃ",
          "すい",
          "みず",
          "ゆ"
        ],
        "correctIndex": 2,
        "explanation": "Chữ Hán [水] (Thủy - nước) đứng độc lập đọc âm Kun là 「みず」.",
        "audioScript": ""
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "たなか[先生]は とても しんせつです。",
        "options": [
          "せんぜい",
          "せいせん",
          "さきせい",
          "せんせい"
        ],
        "correctIndex": 3,
        "explanation": "Chữ Hán [先生] (Tiên sinh - giáo viên) đọc là 「せんせい」.",
        "audioScript": ""
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "きょうは [一人]で べんきょうします。",
        "options": [
          "ひとり",
          "ひとつ",
          "いちにん",
          "いちひと"
        ],
        "correctIndex": 0,
        "explanation": "[一人] (một người) là cách đọc đặc biệt, đọc là 「ひとり」.",
        "audioScript": ""
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[来週]の 火曜日に テストが あります。",
        "options": [
          "こんしゅう",
          "らいしゅ",
          "らいしゅう",
          "せんしゅう"
        ],
        "correctIndex": 2,
        "explanation": "[来週] (Lai Chu - tuần sau) đọc là 「らいしゅう」 (có trường âm う).",
        "audioScript": ""
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "えきの [まえ]で まちます。",
        "options": [
          "後",
          "外",
          "中",
          "前"
        ],
        "correctIndex": 3,
        "explanation": "まえ (phía trước) viết bằng Kanji là [前] (Tiền).",
        "audioScript": ""
      },
      {
        "id": 9,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "あの [くるま]は あかいです。",
        "options": [
          "電車",
          "自転車",
          "車",
          "東"
        ],
        "correctIndex": 2,
        "explanation": "くるま (xe ô tô) viết bằng Kanji là [車] (Xa).",
        "audioScript": ""
      },
      {
        "id": 10,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "これは [なに]ですか。",
        "options": [
          "何",
          "語",
          "名",
          "先"
        ],
        "correctIndex": 0,
        "explanation": "なに (cái gì) viết bằng Kanji là [何] (Hà).",
        "audioScript": ""
      },
      {
        "id": 11,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "まいあさ 7じはんに [がっこう]へ いきます。",
        "options": [
          "学校",
          "学枚",
          "覚校",
          "字校"
        ],
        "correctIndex": 0,
        "explanation": "がっこう (trường học) viết bằng Kanji là [学校] (Học Hiệu).",
        "audioScript": ""
      },
      {
        "id": 12,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "この [カメラ]は とても かるいです。",
        "options": [
          "カメラ",
          "カヌラ",
          "カメフ",
          "力メラ"
        ],
        "correctIndex": 0,
        "explanation": "カメラ (máy ảnh - camera). Chú ý phân biệt chữ メ (me) và ヌ (nu), ラ (ra) và フ (fu).",
        "audioScript": ""
      },
      {
        "id": 13,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あさごはんを たべて、( 　 )を みがきます。",
        "options": [
          "あし",
          "て",
          "は",
          "め"
        ],
        "correctIndex": 2,
        "explanation": "Cụm từ cố định: はを みがきます (đánh răng). め: mắt, て: tay, あし: chân.",
        "audioScript": ""
      },
      {
        "id": 14,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あめが ふっていますから、( 　 )を さします。",
        "options": [
          "くつ",
          "かさ",
          "ぼうし",
          "かばん"
        ],
        "correctIndex": 1,
        "explanation": "かさを さします nghĩa là che ô / bật dù khi trời mưa.",
        "audioScript": ""
      },
      {
        "id": 15,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "へやが くらいですから、でんきを ( 　 ) ください。",
        "options": [
          "しめて",
          "あけて",
          "けして",
          "つけて"
        ],
        "correctIndex": 3,
        "explanation": "Vì phòng tối (くらい) nên hãy bật điện (でんきを つけてください).",
        "audioScript": ""
      },
      {
        "id": 16,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "きのう デパートで あたらしい シャツを ( 　 )。",
        "options": [
          "かいました",
          "ききました",
          "のみました",
          "よみました"
        ],
        "correctIndex": 0,
        "explanation": "Ở trung tâm thương mại (デパート), hành động phù hợp với áo sơ mi (シャツ) là mua (かいました).",
        "audioScript": ""
      },
      {
        "id": 17,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "この コーヒーは さとうが はいって いませんから、( 　 )です。",
        "options": [
          "しおからい",
          "からい",
          "にがい",
          "あまい"
        ],
        "correctIndex": 2,
        "explanation": "Cà phê không bỏ đường (さとうが はいっていません) nên có vị đắng (にがい).",
        "audioScript": ""
      },
      {
        "id": 18,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "きょうは てんきが いいです。",
        "options": [
          "きょうは はれています。",
          "きょうは あめです。",
          "きょうは くもりです。",
          "きょうは ゆきです。"
        ],
        "correctIndex": 0,
        "explanation": "てんきが いい (thời tiết đẹp) đồng nghĩa với はれています (trời nắng ráo).",
        "audioScript": ""
      },
      {
        "id": 19,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "この へやは あまり ひろくないです。",
        "options": [
          "この へやは せまいです。",
          "この へやは おおきいです。",
          "この へやは きれいです。",
          "この へやは しずかです。"
        ],
        "correctIndex": 0,
        "explanation": "あまり ひろくない (không rộng lắm) gần nghĩa nhất với せまい (chật/hẹp).",
        "audioScript": ""
      },
      {
        "id": 20,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "ちちは まいばん 8じごろ いえへ かえります。",
        "options": [
          "ちちは まいばん 8じごろ いえに もどります。",
          "ちちは まいばん 8じごろ おきます。",
          "ちちは まいばん 8じごろ ねます。",
          "ちちは まいばん 8じごろ いえを でます。"
        ],
        "correctIndex": 0,
        "explanation": "いえへ かえります (trở về nhà) đồng nghĩa với いえに もどります (quay về nhà).",
        "audioScript": ""
      },
      {
        "id": 21,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは まいにち 7じ( 　 ) おきます。",
        "options": [
          "で",
          "に",
          "を",
          "へ"
        ],
        "correctIndex": 1,
        "explanation": "Trợ từ に dùng chỉ thời điểm cụ thể xảy ra hành động (7時に: vào lúc 7 giờ).",
        "audioScript": ""
      },
      {
        "id": 22,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "スーパーで ぎゅうにゅう( 　 ) パンを かいました。",
        "options": [
          "に",
          "と",
          "が",
          "へ"
        ],
        "correctIndex": 1,
        "explanation": "Trợ từ と dùng để nối hai danh từ liệt kê đầy đủ: ぎゅうにゅうと パン (sữa và bánh mì).",
        "audioScript": ""
      },
      {
        "id": 23,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは まいあさ バス( 　 ) がっこうへ 行きます。",
        "options": [
          "へ",
          "に",
          "で",
          "を"
        ],
        "correctIndex": 2,
        "explanation": "Trợ từ で chỉ phương tiện đi lại: バスで (bằng xe buýt).",
        "audioScript": ""
      },
      {
        "id": 24,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きのう レストラン( 　 ) ひるごはんを たべました。",
        "options": [
          "を",
          "で",
          "へ",
          "に"
        ],
        "correctIndex": 1,
        "explanation": "Trợ từ で chỉ địa điểm diễn ra hành động: レストランで たべました (ăn ở nhà hàng).",
        "audioScript": ""
      },
      {
        "id": 25,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "つくえの うえに ほんが 3さつ ( 　 )。",
        "options": [
          "あります",
          "します",
          "います",
          "きます"
        ],
        "correctIndex": 0,
        "explanation": "Quyển sách (ほん) là đồ vật vô tri nên dùng あります để chỉ sự tồn tại.",
        "audioScript": ""
      },
      {
        "id": 26,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きのうの テストは あまり ( 　 )。",
        "options": [
          "むずかしいでした",
          "むずかしくなかったです",
          "むずかしかったです",
          "むずかしくないでした"
        ],
        "correctIndex": 1,
        "explanation": "Phó từ あまり đi với thể phủ định. Tính từ đuôi い ở quá khứ phủ định là ～くなかったです.",
        "audioScript": ""
      },
      {
        "id": 27,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "あした いっしょに えいがを ( 　 )。",
        "options": [
          "見ていますか",
          "見ましたか",
          "見ますか",
          "見ませんか"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu rủ rê lịch sự: Vませんか (Cùng xem phim nhé?).",
        "audioScript": ""
      },
      {
        "id": 28,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは ギターを ( 　 ) ことが できます。",
        "options": [
          "ひきます",
          "ひく",
          "ひいた",
          "ひいて"
        ],
        "correctIndex": 1,
        "explanation": "Mẫu câu chỉ năng lực/khả năng: [Động từ thể từ điển (Vる)] + ことができます (có thể chơi đàn guitar).",
        "audioScript": ""
      },
      {
        "id": 29,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "まだ 宿題を ( 　 ) から、テレビを 見ないでください。",
        "options": [
          "して いません",
          "します",
          "しました",
          "して います"
        ],
        "correctIndex": 0,
        "explanation": "まだ + Vていません: vẫn chưa làm xong (vì vẫn chưa làm bài tập nên đừng xem tivi).",
        "audioScript": ""
      },
      {
        "id": 30,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "わたしは 毎朝 [ 　 ] [ ★ ] [ 　 ] [ 　 ] 飲みます。",
        "options": [
          "いっぱい",
          "あたたかい",
          "を",
          "お茶"
        ],
        "correctIndex": 3,
        "explanation": "Thứ tự đúng: あたたかい [お茶] を いっぱい 飲みます (Mỗi sáng tôi uống một cốc trà ấm). Vị trí [★] là 「お茶」.",
        "audioScript": ""
      },
      {
        "id": 31,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "日曜日に ともだち [ 　 ] [ ★ ] [ 　 ] [ 　 ] 行きました。",
        "options": [
          "見に",
          "と",
          "いっしょに",
          "えいがを"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: ともだち と [いっしょに] えいがを 見に 行きました (Chủ nhật tôi đã đi xem phim cùng với bạn). Vị trí [★] là 「いっしょに」.",
        "audioScript": ""
      },
      {
        "id": 32,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "この 図書館には [ 　 ] [ 　 ] [ ★ ] [ 　 ] あります。",
        "options": [
          "たくさん",
          "が",
          "本",
          "外国の"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: 外国の [本] が たくさん あります (Ở thư viện này có rất nhiều sách nước ngoài). Vị trí [★] là 「本」.",
        "audioScript": ""
      },
      {
        "id": 33,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "きのう 母に [ 　 ] [ 　 ] [ ★ ] [ 　 ] もらいました。",
        "options": [
          "買って",
          "デパートで",
          "セーターを",
          "きれいな"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: デパートで きれいな [セーターを] 買って もらいました (Hôm qua tôi được mẹ mua cho chiếc áo len đẹp ở bách hóa). Vị trí [★] là 「セーターを」.",
        "audioScript": ""
      },
      {
        "id": 34,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36】\nわたしは 去年の 4月に 日本へ 来ました。毎日 日本語学校で 日本語を 勉強して います。\n学校の 授業は 午前 9時 [ 34 ] 午後 1時までです。午後は 図書館で 宿題を したり、アルバイトを したり します。\n日本の 生活は 忙しいですが、[ 35 ] 楽しいです。来月、クラスの 友だちと 京都へ 旅行に [ 36 ] と思って います。\n\nCâu 34: Chọn từ thích hợp điền vào [ 34 ]:",
        "options": [
          "ごろ",
          "から",
          "だけ",
          "まで"
        ],
        "correctIndex": 1,
        "explanation": "[ 34 ]: 午前9時から 午後1時まで (từ 9 giờ sáng đến 1 giờ chiều).",
        "audioScript": ""
      },
      {
        "id": 35,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「日本の 生活は 忙しいですが、[ 35 ] 楽しいです。」\n\nCâu 35: Chọn từ thích hợp điền vào [ 35 ]:",
        "options": [
          "あまり",
          "とても",
          "ぜんぜん",
          "すこしも"
        ],
        "correctIndex": 1,
        "explanation": "[ 35 ]: Câu khẳng định 「楽しいです」 (vui) đi với phó từ mức độ 「とても」 (rất). あまり/ぜんぜん/すこしも đi với phủ định.",
        "audioScript": ""
      },
      {
        "id": 36,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「来月、クラスの 友だちと 京都へ 旅行に [ 36 ] と思って います。」\n\nCâu 36: Chọn từ thích hợp điền vào [ 36 ]:",
        "options": [
          "行って",
          "行った",
          "行こう",
          "行く"
        ],
        "correctIndex": 2,
        "explanation": "[ 36 ]: Mẫu câu diễn tả dự định: [Thể ý chí (Vよう)] + と思っています → 行こうと思っています (Tôi dự định sẽ đi).",
        "audioScript": ""
      },
      {
        "id": 37,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【しらせ】\nにほんごの クラスは 月曜日と 木曜日です。じかんは ごご 2時から 4時までです。きょうしつは 3かいの 302です。\n\n質問：にほんごの クラスは いつですか。",
        "options": [
          "月曜日と 木曜日の ごご 2時から 4時まで",
          "火曜日と 金曜日の ごご 2時から 4時まで",
          "まいにちの ごご 2時から 4時まで",
          "月曜日と 木曜日の ごぜん 2時から 4時まで"
        ],
        "correctIndex": 0,
        "explanation": "Theo thông báo: lớp học tiếng Nhật vào Thứ Hai (月曜日) và Thứ Năm (木曜日), từ 2h chiều đến 4h chiều (ごご 2時から 4時まで).",
        "audioScript": ""
      },
      {
        "id": 38,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【メモ】\n鈴木さんへ\nさっき 山田さんから 電話が ありました。「今日の 会議は 3時から 4時に 変わりました」と 言っていました。会議室は 第1会議室です。\n田中より\n\n質問：今日の 会議は 何時からですか。",
        "options": [
          "1時から",
          "3時から",
          "4時から",
          "2時から"
        ],
        "correctIndex": 2,
        "explanation": "Lời nhắn ghi: 「今日の 会議は 3時から 4時に 変わりました」 (Cuộc họp hôm nay đã đổi từ 3 giờ sang 4 giờ). Vậy cuộc họp bắt đầu từ 4 giờ.",
        "audioScript": ""
      },
      {
        "id": 39,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 9: Đọc hiểu đoạn văn vừa",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\n先週の 日曜日、わたしは 友だちの マリアさんと 海へ 行きました。朝 7時に 駅で 会って、電車に 1時間 乗りました。海は とても きれいでしたが、風が 強くて 少し 寒かったです。だから、わたしたちは 泳ぎませんでした。海の 近くの レストランで おいしい 魚を 食べて、写真を たくさん 撮ってから 帰りました。\n\n質問：二人は 海で 何を しましたか。",
        "options": [
          "寒いから、すぐ 家へ 帰りました。",
          "電車の中で 魚を 食べました。",
          "海で たくさん 泳ぎました。",
          "魚を 食べて、写真を 撮りました。"
        ],
        "correctIndex": 3,
        "explanation": "Do gió mạnh và hơi lạnh nên hai người không bơi (泳ぎませんでした), mà ăn cá ở nhà hàng gần biển và chụp thật nhiều ảnh rồi mới về.",
        "audioScript": ""
      },
      {
        "id": 40,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 10: Tìm kiếm thông tin",
        "question": "【さくら図書館の 案内】\n・開館時間：9:30 ～ 19:00（土・日は 17:00まで）\n・休館日：毎週 月曜日\n・本を 借りる 人：1人 5冊まで（2週間）\n・CDを 借りる 人：1人 2枚まで（1週間）\n\n質問：日曜日に 本を 借りたいです。何時までに 行けば いいですか。",
        "options": [
          "日曜日は 休みです",
          "19:00まで",
          "17:00まで",
          "9:30まで"
        ],
        "correctIndex": 2,
        "explanation": "Bảng hướng dẫn ghi: Giờ mở cửa 9:30 ~ 19:00, riêng Thứ Bảy và Chủ Nhật mở đến 17:00 (土・日は 17:00まで).",
        "audioScript": ""
      },
      {
        "id": 41,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe đoạn hội thoại giữa người nam và người nữ, sau đó chọn đáp án đúng.\n質問：二人は これから どこへ 行きますか。",
        "options": [
          "スーパー (Siêu thị)",
          "カレー屋 (Quán cà ri)",
          "喫茶店 (Quán nước)",
          "ラーメン屋 (Quán mì Ramen)"
        ],
        "correctIndex": 1,
        "explanation": "Người nam rủ đi ăn mì Ramen nhưng người nữ nói hôm qua đã ăn Ramen rồi nên hôm nay muốn ăn Cà ri (きょうは カレーが いいです), và người nam đồng ý.",
        "audioScript": "男の人と女の人が話しています。二人はこれからどこへ行きますか。 女：田中さん、昼ごはんを食べに行きませんか。 男：いいですね。駅前の新しいラーメン屋はどうですか。 女：きのうラーメンを食べたから、きょうはカレーがいいです。 男：わかりました。じゃあ、そうしましょう。 二人はこれからどこへ行きますか。"
      },
      {
        "id": 42,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe giáo viên thông báo trong lớp học.\n質問：学生は あした 何を 持って 来なければ なりませんか。",
        "options": [
          "えんぴつと 消しゴムと 辞書",
          "ボールペンと 辞書",
          "えんぴつと 消しゴムだけ",
          "辞書と ノートだけ"
        ],
        "correctIndex": 0,
        "explanation": "Cô giáo dặn: Ngày mai có bài kiểm tra nên hãy mang bút chì (えんぴつ) và tẩy (消しゴム). Ngoài ra tiết sau bài kiểm tra có dùng từ điển (辞書) nên hãy mang theo cả từ điển nữa.",
        "audioScript": "先生が教室で話しています。学生はあした何を持って来なければなりませんか。 先生：みなさん、あしたは9時から漢字のテストがあります。ボールペンではなくて、えんぴつと消しゴムを持って来てください。それから、テストのあとの授業で辞書を使いますから、辞書も忘れないでくださいね。 学生はあした何を持って来なければなりませんか。"
      },
      {
        "id": 43,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc trò chuyện tại cửa hàng.\n質問：女の人は どの かばんを 買いますか。",
        "options": [
          "黒くて 小さい かばん",
          "赤くて 大きい かばん",
          "黒くて 大きい かばん",
          "赤くて 小さい かばん"
        ],
        "correctIndex": 0,
        "explanation": "Người nữ muốn túi màu đen (黒いの). Chiếc to hơi nặng nên cô ấy chọn chiếc màu đen cỡ nhỏ (この小さいのをください).",
        "audioScript": "店で女の人と店員が話しています。女の人はどのかばんを買いますか。 女：すみません、その上にあるかばんを見せてください。 男：はい、赤いのですか、黒いのですか。 女：黒いのです。 男：どうぞ。こちらは大きいサイズと小さいサイズがありますよ。 女：うーん、大きいのは少し重いですね。この小さいのをください。 女の人はどのかばんを買いますか。"
      },
      {
        "id": 44,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện giữa hai mẹ con.\n質問：男の子は まず 何を しますか。",
        "options": [
          "おやつを 食べる (Ăn bánh)",
          "テレビを 見る (Xem tivi)",
          "宿題を する (Làm bài tập)",
          "手を 洗う (Rửa tay)"
        ],
        "correctIndex": 3,
        "explanation": "Mẹ bảo: Trước khi ăn quà vặt hãy rửa tay trước (その前に まず 手を 洗ってね). Sau khi ăn xong mới làm bài tập.",
        "audioScript": "家で男の子とお母さんが話しています。男の子はまず何をしますか。 男：ただいま！お母さん、おなかがすいたよ。おやつを食べてもいい？ 女：おかえりなさい。テーブルの上にケーキがあるわよ。でも、その前にまず手を洗ってね。宿題はおやつを食べてからでいいわよ。 男：わかった！ 男の子はまず何をしますか。"
      },
      {
        "id": 45,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về lịch hẹn.\n質問：二人は 金曜日の 何時に 会いますか。",
        "options": [
          "午後 6時",
          "午後 7時",
          "午後 5時30分",
          "午後 6時30分"
        ],
        "correctIndex": 3,
        "explanation": "Ban đầu người nam hẹn 6 giờ nhưng người nữ kết thúc công việc lúc 6 giờ nên đề nghị 6 giờ rưỡi (6時半はどうですか) và người nam đồng ý.",
        "audioScript": "男の人と女の人が金曜日の約束について話しています。二人は金曜日の何時に会いますか。 男：金曜日の晩ごはん、駅の前に6時はどうですか。 女：すみません、金曜日は6時に仕事が終わりますから、6時半はどうですか。 男：いいですよ。じゃあ、6時半に駅の前で待ちましょう。 二人は金曜日の何時に会いますか。"
      },
      {
        "id": 46,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về kỳ nghỉ cuối tuần.\n質問：男の人は 日曜日に 何を しましたか。",
        "options": [
          "家で ゆっくり 休んだ",
          "友達と テニスを した",
          "病院へ 行った",
          "山へ 登りに 行った"
        ],
        "correctIndex": 0,
        "explanation": "Người nam định đi leo núi vào Chủ nhật nhưng vì trời mưa (雨が降ったから) nên đã không đi đâu cả mà nghỉ ngơi ở nhà (家でゆっくり休みました).",
        "audioScript": "女の人と男の人が週末のことについて話しています。男の人は日曜日に何をしましたか。 女：山本さんは日曜日、山へ登りに行きましたか。 男：いいえ、日曜日は朝から雨が降ったから、どこへも行かないで、家でゆっくり休みました。 女：そうですか。男の人は日曜日に何をしましたか。"
      },
      {
        "id": 47,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại tại quầy bán vé.\n質問：ぜんぶで いくらですか。",
        "options": [
          "2,000円",
          "1,000円",
          "2,500円",
          "1,500円"
        ],
        "correctIndex": 3,
        "explanation": "Vé người lớn (大人) là 1.000 yên, vé trẻ em (子供) là 500 yên. Mua 1 vé người lớn và 1 vé trẻ em tổng cộng là 1.500 yên (千五百円).",
        "audioScript": "映画館で女の人が切符を買っています。ぜんぶでいくらですか。 女：すみません、切符をお願いします。大人一枚と、子供一枚です。 男：はい、大人は千円、子供は五百円ですから、ぜんぶで千五百円になります。 ぜんぶでいくらですか。"
      },
      {
        "id": 48,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về phương tiện đi làm.\n質問：女の人は どうやって 会社へ 来ましたか。",
        "options": [
          "電車で 来た",
          "バスで 来た",
          "歩いて 来た",
          "タクシーで 来た"
        ],
        "correctIndex": 3,
        "explanation": "Bình thường cô ấy đi bằng xe buýt (いつもはバスですが), nhưng sáng nay ngủ dậy muộn nên đã đi bằng taxi (けさはタクシーで来ました).",
        "audioScript": "男の人と女の人が話しています。女の人はきょう、どうやって会社へ来ましたか。 男：佐藤さん、いつもバスで会社へ来ますか。 女：ええ、いつもはバスですが、けさは少し遅く起きたから、タクシーで来ました。 女の人はきょう、どうやって会社へ来ましたか。"
      },
      {
        "id": 49,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの ペンを 借りたいです。友だちに 何と 言いますか。",
        "options": [
          "そのペン、ちょっと 貸して くれませんか。",
          "そのペン、返して ください。",
          "そのペン、ちょっと 借りて ください。",
          "そのペンを あげましょうか。"
        ],
        "correctIndex": 0,
        "explanation": "Khi muốn mượn bút của bạn, ta nói với bạn: 「そのペン、ちょっと貸してくれませんか」(Bạn cho mình mượn cây bút đó một chút được không?).",
        "audioScript": "友だちのペンを借りたいです。友だちに何と言いますか。 1. そのペン、ちょっと 貸して くれませんか。 2. そのペン、返して ください。 3. そのペン、ちょっと 借りて ください。 4. そのペンを あげましょうか。"
      },
      {
        "id": 50,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：これから ごはんを 食べます。食べる 前に 何と 言いますか。",
        "options": [
          "いただきます。",
          "おやすみなさい。",
          "ごちそうさまでした。",
          "いってきます。"
        ],
        "correctIndex": 0,
        "explanation": "Trước khi ăn cơm người Nhật nói 「いただきます」, còn sau khi ăn xong nói 「ごちそうさまでした」.",
        "audioScript": "これからごはんを食べます。食べる前に何と言いますか。 1. いただきます。 2. おやすみなさい。 3. ごちそうさまでした。 4. いってきます。"
      },
      {
        "id": 51,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：店で 店員を 呼びたいです。何と 言いますか。",
        "options": [
          "どういたしまして。",
          "すみません。",
          "ごめんなさい。",
          "しつれいしました。"
        ],
        "correctIndex": 1,
        "explanation": "Khi muốn gọi nhân viên trong quán ăn/cửa hàng, ta nói 「すみません」.",
        "audioScript": "店で店員を呼びたいです。何と言いますか。 1. どういたしまして。 2. すみません。 3. ごめんなさい。 4. しつれいしました。"
      },
      {
        "id": 52,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「コーヒー、もう 一杯 いかがですか。」",
        "options": [
          "はい、どういたしまして。",
          "いいえ、もう けっこうです。",
          "はい、おげんきです。",
          "いいえ、ちがいます。"
        ],
        "correctIndex": 1,
        "explanation": "Khi được mời thêm một tách cà phê (もう一杯いかがですか), cách từ chối lịch sự là 「いいえ、もうけっこうです」(Dạ thôi, tôi đủ rồi ạ).",
        "audioScript": "コーヒー、もう一杯いかがですか。 1. はい、どういたしまして。 2. いいえ、もう けっこうです。 3. はい、おげんきです。 4. いいえ、ちがいます。"
      },
      {
        "id": 53,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「いってきます。」",
        "options": [
          "いってらっしゃい。",
          "ただいま。",
          "おやすみなさい。",
          "おかえりなさい。"
        ],
        "correctIndex": 0,
        "explanation": "Khi người nhà chào 「いってきます」(Tôi đi đây) lúc ra khỏi nhà, người ở nhà đáp lại là 「いってらっしゃい」(Bạn đi nhé).",
        "audioScript": "いってきます。 1. いってらっしゃい。 2. ただいま。 3. おやすみなさい。 4. おかえりなさい。"
      },
      {
        "id": 54,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「きのうは どうも ありがとう ございました。」",
        "options": [
          "すみません、お願いします。",
          "はい、そうです。",
          "いただきます。",
          "いいえ、こちらこそ。"
        ],
        "correctIndex": 3,
        "explanation": "Khi ai đó cảm ơn về chuyện hôm qua, câu đáp lịch sự tự nhiên nhất là 「いいえ、こちらこそ」(Không có gì, chính tôi mới phải cảm ơn).",
        "audioScript": "きのうはどうもありがとうございました。 1. すみません、お願いします。 2. はい、そうです。 3. いただきます。 4. いいえ、こちらこそ。"
      },
      {
        "id": 55,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、今 何時ですか。」",
        "options": [
          "ええと、3時10分です。",
          "はい、3月10日です。",
          "ええ、3時間です。",
          "いいえ、3番です。"
        ],
        "correctIndex": 0,
        "explanation": "Câu hỏi 「今 何時ですか」(Bây giờ là mấy giờ?) → Trả lời thời điểm giờ giấc: 「ええと、3時10分です」(À, 3 giờ 10 phút).",
        "audioScript": "すみません、今何時ですか。 1. ええと、3時10分です。 2. はい、3月10日です。 3. ええ、3時間です。 4. いいえ、3番です。"
      }
    ]
  },
  {
    "id": "test_n5_02",
    "title": "Đề thi thử JLPT N5 - Đề số 2 (Tổng hợp 3 kỹ năng - Tiêu chuẩn)",
    "description": "Đề thi đầy đủ 3 phần chuẩn JLPT N5 (55 câu): Trọng tâm Minna bài 1–15, thể Te (て), tính từ い/な, đọc hiểu thư tín/bảng biểu và 15 câu Nghe hiểu thực tế.",
    "durationMinutes": 90,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "毎朝 7時に [起きます]。",
        "options": [
          "おきます",
          "いきます",
          "きます",
          "あきます"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [起きます] (Khởi - thức dậy) đọc là 「おきます」.",
        "audioScript": ""
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "きのうの 晩、すしを [食べました]。",
        "options": [
          "いきました",
          "かいました",
          "たべました",
          "のみました"
        ],
        "correctIndex": 2,
        "explanation": "Chữ Hán [食べました] (Thực - ăn) đọc là 「たべました」.",
        "audioScript": ""
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "デパートへ [買いもの]に 行きます。",
        "options": [
          "かいもの",
          "たべもの",
          "のりもの",
          "のみもの"
        ],
        "correctIndex": 0,
        "explanation": "[買いもの] (Mãi - mua sắm) đọc là 「かいもの」.",
        "audioScript": ""
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この くつは [新しい]です。",
        "options": [
          "あたらしい",
          "あかい",
          "ふるい",
          "しろい"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [新しい] (Tân - mới) đọc là 「あたらしい」.",
        "audioScript": ""
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[北]の ほうは 冬 とても さむいです。",
        "options": [
          "きた",
          "にし",
          "ひがし",
          "みなみ"
        ],
        "correctIndex": 0,
        "explanation": "Chữ Hán [北] (Bắc - phía bắc) đọc là 「きた」.",
        "audioScript": ""
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "カレンダーの [八日]に まるを つけました。",
        "options": [
          "はちにち",
          "なのか",
          "ようか",
          "よっか"
        ],
        "correctIndex": 2,
        "explanation": "[八日] (ngày mùng 8) đọc đặc biệt là 「ようか」. Chú ý [四日] (mùng 4) là 「よっか」.",
        "audioScript": ""
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "あそこに [女の子]が います。",
        "options": [
          "おんなご",
          "めのこ",
          "おんなのこ",
          "おとこのこ"
        ],
        "correctIndex": 2,
        "explanation": "[女の子] (bé gái) đọc là 「おんなのこ」.",
        "audioScript": ""
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "あしたは [やすみ]です。",
        "options": [
          "本み",
          "体み",
          "休み",
          "木み"
        ],
        "correctIndex": 2,
        "explanation": "やすみ (nghỉ ngơi) viết là [休み] (Hưu). Chú ý không nhầm với [体] (Thể - cơ thể).",
        "audioScript": ""
      },
      {
        "id": 9,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "そとに [しろい] ねこが います。",
        "options": [
          "日い",
          "白い",
          "百い",
          "自い"
        ],
        "correctIndex": 1,
        "explanation": "しろい (màu trắng) viết là [白い] (Bạch).",
        "audioScript": ""
      },
      {
        "id": 10,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "ぎんこうの [みぎ]に ゆうびんきょくが あります。",
        "options": [
          "名",
          "右",
          "石",
          "左"
        ],
        "correctIndex": 1,
        "explanation": "みぎ (bên phải) viết là [右] (Hữu). Chú ý [左] (Tả - bên trái) có nét ngang + chữ エ.",
        "audioScript": ""
      },
      {
        "id": 11,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "まいにち [しんぶん]を よみます。",
        "options": [
          "新門",
          "新聞",
          "新間",
          "親聞"
        ],
        "correctIndex": 1,
        "explanation": "しんぶん (báo) viết là [新聞] (Tân Văn).",
        "audioScript": ""
      },
      {
        "id": 12,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "ホテルで [シャワー]を あびました。",
        "options": [
          "シヤワー",
          "シャワー",
          "ツャワー",
          "シャワ一"
        ],
        "correctIndex": 1,
        "explanation": "シャワー (vòi hoa sen - shower). Chú ý âm ghép シャ (sha) khác với ツ (tsu).",
        "audioScript": ""
      },
      {
        "id": 13,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "ことばの いみが わかりませんから、( 　 )を ひきます。",
        "options": [
          "きっぷ",
          "しんぶん",
          "てがみ",
          "じしょ"
        ],
        "correctIndex": 3,
        "explanation": "じしょを ひきます: tra từ điển. てがみ: thư, きっぷ: vé, しんぶん: báo.",
        "audioScript": ""
      },
      {
        "id": 14,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "てがみを かいて、( 　 )に いれました。",
        "options": [
          "ポスト",
          "プール",
          "ポケット",
          "テーブル"
        ],
        "correctIndex": 0,
        "explanation": "ポスト (hòm thư bưu điện): viết thư rồi bỏ vào hòm thư.",
        "audioScript": ""
      },
      {
        "id": 15,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "この みちは くるまが おおいですから、( 　 )です。",
        "options": [
          "やさしい",
          "つめたい",
          "あぶない",
          "おいしい"
        ],
        "correctIndex": 2,
        "explanation": "Đường đông xe cộ nên nguy hiểm (あぶない).",
        "audioScript": ""
      },
      {
        "id": 16,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "よる ねる まえに、まどを ( 　 ) ください。",
        "options": [
          "きて",
          "はいて",
          "しめて",
          "かぶって"
        ],
        "correctIndex": 2,
        "explanation": "まどを しめてください: Hãy đóng cửa sổ lại trước khi đi ngủ.",
        "audioScript": ""
      },
      {
        "id": 17,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あの えいがは とても ( 　 ) から、もう いちど 見たいです。",
        "options": [
          "おもかった",
          "つまらなかった",
          "おもしろかった",
          "みじかかった"
        ],
        "correctIndex": 2,
        "explanation": "Vì bộ phim rất thú vị/hay (おもしろかった) nên tôi muốn xem lại lần nữa.",
        "audioScript": ""
      },
      {
        "id": 18,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "わたしには あにと いもうとが います。",
        "options": [
          "わたしには こどもが います。",
          "わたしには りょうしんが います。",
          "わたしには ともだちが います。",
          "わたしには きょうだいが います。"
        ],
        "correctIndex": 3,
        "explanation": "あに (anh trai) và いもうと (em gái) gộp chung là きょうだい (anh chị em).",
        "audioScript": ""
      },
      {
        "id": 19,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "きのうの よる テレビを 見ました。",
        "options": [
          "おととい テレビを 見ました。",
          "あした テレビを 見ます。",
          "ゆうべ テレビを 見ました。",
          "けさ テレビを 見ました。"
        ],
        "correctIndex": 2,
        "explanation": "きのうの よる (tối hôm qua) đồng nghĩa với ゆうべ (đêm qua / tối qua).",
        "audioScript": ""
      },
      {
        "id": 20,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "この しごとは すぐ おわります。",
        "options": [
          "この しごとは らいしゅう おわります。",
          "この しごとは かんたんに おわります。",
          "この しごとは ぜんぜん おわりません。",
          "この しごとは おそく おわります。"
        ],
        "correctIndex": 1,
        "explanation": "すぐ おわります (xong ngay lập tức) gần nghĩa nhất với かんたんに おわります (hoàn thành nhanh/dễ dàng).",
        "audioScript": ""
      },
      {
        "id": 21,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "すみませんが、まどを ( 　 ) ください。",
        "options": [
          "あけます",
          "あけない",
          "あけた",
          "あけて"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu yêu cầu lịch sự: Vてください. Động từ あけます chuyển sang thể Te là あけて.",
        "audioScript": ""
      },
      {
        "id": 22,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "いま たなかさんは でんわを ( 　 )。",
        "options": [
          "かけました",
          "かける",
          "かけます",
          "かけて います"
        ],
        "correctIndex": 3,
        "explanation": "Chỉ hành động đang diễn ra tại thời điểm nói (いま): Vて います (đang gọi điện thoại).",
        "audioScript": ""
      },
      {
        "id": 23,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "ここで しゃしんを ( 　 )も いいですか。",
        "options": [
          "とった",
          "とる",
          "とって",
          "とります"
        ],
        "correctIndex": 2,
        "explanation": "Mẫu câu xin phép: Vても いいですか (Tôi chụp ảnh ở đây có được không?). とります → とって.",
        "audioScript": ""
      },
      {
        "id": 24,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "びょういんの なかで たばこを ( 　 )は いけません。",
        "options": [
          "すわない",
          "すって",
          "すう",
          "すいます"
        ],
        "correctIndex": 1,
        "explanation": "Mẫu câu cấm đoán: Vては いけません (Không được phép hút thuốc trong bệnh viện).",
        "audioScript": ""
      },
      {
        "id": 25,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは まいにち こうえんで 1じかん( 　 ) はしります。",
        "options": [
          "に",
          "から",
          "ごろ",
          "ぐらい"
        ],
        "correctIndex": 3,
        "explanation": "ぐらい đi sau khoảng thời gian (1時間ぐらい: khoảng 1 tiếng). ごろ chỉ đi với thời điểm (8時ごろ).",
        "audioScript": ""
      },
      {
        "id": 26,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きょうは きのう( 　 ) あついです。",
        "options": [
          "いちばん",
          "ほど",
          "のほうが",
          "より"
        ],
        "correctIndex": 3,
        "explanation": "So sánh hơn: Aは Bより [Tính từ] です (Hôm nay nóng hơn hôm qua).",
        "audioScript": ""
      },
      {
        "id": 27,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "あした テストが ありますから、今晩 勉強( 　 ) なりませんか。",
        "options": [
          "しないで",
          "したく",
          "しなくても",
          "しなければ"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu bắt buộc: Vなければ なりません (Vì mai có bài kiểm tra nên tối nay phải học).",
        "audioScript": ""
      },
      {
        "id": 28,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "日本へ 行く 前に、日本語を ( 　 ) ほうが いいですよ。",
        "options": [
          "勉強しよう",
          "勉強して",
          "勉強する",
          "勉強した"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu khuyên nhủ: [Vた] + ほうがいいです (Nên học tiếng Nhật trước khi đi Nhật).",
        "audioScript": ""
      },
      {
        "id": 29,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしの 趣味は 音楽を ( 　 ) ことです。",
        "options": [
          "聞いた",
          "聞いて",
          "聞きます",
          "聞く"
        ],
        "correctIndex": 3,
        "explanation": "Danh hóa động từ làm vị ngữ: 趣味は [Vる] ことです (Sở thích của tôi là nghe nhạc).",
        "audioScript": ""
      },
      {
        "id": 30,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "あの [ 　 ] [ 　 ] [ ★ ] [ 　 ] だれですか。",
        "options": [
          "めがねを",
          "人は",
          "かけている",
          "背が 高い"
        ],
        "correctIndex": 1,
        "explanation": "Thứ tự đúng: 背が 高い めがねを かけている [人は] だれですか (Người cao giáo đang đeo kính kia là ai?). Vị trí [★] là 「人は」.",
        "audioScript": ""
      },
      {
        "id": 31,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "きのう [ 　 ] [ ★ ] [ 　 ] [ 　 ] 寝ました。",
        "options": [
          "浴びて",
          "から",
          "すぐ",
          "シャワーを"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: シャワーを [浴びて] から すぐ 寝ました (Hôm qua sau khi tắm vòi sen xong tôi đã đi ngủ ngay). Vị trí [★] là 「浴びて」.",
        "audioScript": ""
      },
      {
        "id": 32,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "わたしは [ 　 ] [ 　 ] [ ★ ] [ 　 ] ほしいです。",
        "options": [
          "新しい",
          "小さくて",
          "辞書が",
          "便利な"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: 小さくて 便利な 新しい [辞書が] ほしいです (Tôi muốn có một cuốn từ điển mới nhỏ gọn và tiện lợi). Vị trí [★] là 「辞書が」.",
        "audioScript": ""
      },
      {
        "id": 33,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "ここに [ 　 ] [ ★ ] [ 　 ] [ 　 ] ください。",
        "options": [
          "あなたの",
          "を",
          "電話番号",
          "名前と"
        ],
        "correctIndex": 3,
        "explanation": "Thứ tự đúng: あなたの [名前と] 電話番号 を 書いて ください. Vị trí [★] là 「名前と」.",
        "audioScript": ""
      },
      {
        "id": 34,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36】\n先週の 土曜日、わたしの 家で パーティーを しました。友だちが 5人 [ 34 ]。\nわたしは 朝から スーパーへ 行って、肉や 野菜を 買いました。そして、ベトナムの 料理を 作りました。\n友だちは お菓子や 果物を 持って 来て [ 35 ]。みんなで 料理を 食べながら、いろいろな 話を しました。[ 36 ]、ギターを 弾いて 歌を 歌いました。\n\nCâu 34: Chọn từ thích hợp điền vào [ 34 ]:",
        "options": [
          "出ました",
          "帰りました",
          "来ました",
          "行きました"
        ],
        "correctIndex": 2,
        "explanation": "[ 34 ]: Bạn bè đến nhà của người nói dự tiệc nên dùng 「来ました」.",
        "audioScript": ""
      },
      {
        "id": 35,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「友だちは お菓子や 果物を 持って 来て [ 35 ]。」\n\nCâu 35: Chọn từ thích hợp điền vào [ 35 ]:",
        "options": [
          "もらいました",
          "あげました",
          "やりました",
          "くれました"
        ],
        "correctIndex": 3,
        "explanation": "[ 35 ]: Chủ ngữ là 「友だちは」 làm hành động mang bánh kẹo đến cho người nói nên dùng 「持って来てくれました」.",
        "audioScript": ""
      },
      {
        "id": 36,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「みんなで 料理を 食べながら、いろいろな 話を しました。[ 36 ]、ギターを 弾いて 歌を 歌いました。」\n\nCâu 36: Chọn từ thích hợp điền vào [ 36 ]:",
        "options": [
          "しかし",
          "それから",
          "だから",
          "でも"
        ],
        "correctIndex": 1,
        "explanation": "[ 36 ]: Nối tiếp chuỗi hành động trong buổi tiệc: 「それから」 (Sau đó / Hơn nữa).",
        "audioScript": ""
      },
      {
        "id": 37,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【病院の 入り口の 案内】\n初めて この 病院へ 来た 人は、まず 1番の 窓口で この 紙に 名前と 住所を 書いて ください。そのあと、保険証と 一緒に 2番の 窓口へ 出して ください。\n\n質問：初めて 来た 人は、1番の 窓口で 何を しますか。",
        "options": [
          "保険証を 出します。",
          "お金を 払います。",
          "紙に 名前と 住所を 書きます。",
          "薬を もらいます。"
        ],
        "correctIndex": 2,
        "explanation": "Theo hướng dẫn: Người đến khám lần đầu trước tiên viết tên và địa chỉ vào tờ giấy ở quầy số 1 (まず 1番の 窓口で この 紙に 名前と 住所を 書いて ください), sau đó mới nộp kèm thẻ bảo hiểm ở quầy số 2.",
        "audioScript": ""
      },
      {
        "id": 38,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【メール】\nキムさん\nあしたの バーベキューですが、雨が 降ったら 中止になります。天気が よかったら、朝 10時に さくら公園の 入り口に 集まって ください。飲み物は わたしが 買いますから、キムさんは 果物を お願いします。\n佐藤\n\n質問：あした 晴れたら、キムさんは 何を 持って 行きますか。",
        "options": [
          "傘",
          "肉と 野菜",
          "飲み物",
          "果物"
        ],
        "correctIndex": 3,
        "explanation": "Trong email Sato viết: Đồ uống tôi sẽ mua, nên nhờ Kim mang trái cây nhé (キムさんは 果物を お願いします).",
        "audioScript": ""
      },
      {
        "id": 39,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 9: Đọc hiểu đoạn văn vừa",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\nわたしの 家から 会社まで 電車と バスで 1時間半 かかります。毎朝 6時に 起きて、7時に 家を 出なければ なりません。電車は いつも 人が 多くて、座ることが できません。とても 疲れますから、来月 会社の 近くへ 引っ越ししたいと 思って います。会社の 近くは 家賃が 少し 高いですが、歩いて 会社へ 行くことが できます。\n\n質問：どうして この 人は 引っ越ししたいですか。",
        "options": [
          "会社の 近くには 電車の 駅が ないから。",
          "今の 家は 会社から 遠くて、毎日の 通勤が 疲れるから。",
          "もっと 大きい 家に 住みたいから。",
          "今の 家は 家賃が とても 高いから。"
        ],
        "correctIndex": 1,
        "explanation": "Từ nhà hiện tại đến công ty mất 1 tiếng rưỡi bằng tàu và buýt, tàu lại đông không ngồi được nên rất mệt (とても疲れますから), vì vậy người này muốn chuyển nhà đến gần công ty.",
        "audioScript": ""
      },
      {
        "id": 40,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 10: Tìm kiếm thông tin",
        "question": "【スポーツセンターの コース案内】\n① 水泳クラス：火・木（10:00～11:30） 月 5,000円\n② ヨガクラス：水・金（19:00～20:30） 月 4,500円\n③ テニスクラス：土（14:00～16:00） 月 6,000円\n④ ダンスクラス：日（10:00～12:00） 月 5,500円\n\n質問：リンさんは 月曜日から 金曜日まで 昼間（9:00～18:00） 会社で 働いて います。平日の 夜に 習いたいです。どの クラスに 入ることが できますか。",
        "options": [
          "① 水泳クラス",
          "② ヨガクラス",
          "③ テニスクラス",
          "④ ダンスクラス"
        ],
        "correctIndex": 1,
        "explanation": "Lin làm việc ban ngày từ thứ Hai đến thứ Sáu và muốn học vào buổi tối ngày thường (平日の夜). Lớp số ② Yoga học vào tối Thứ Tư & Thứ Sáu (19:00~20:30) là phù hợp duy nhất.",
        "audioScript": ""
      },
      {
        "id": 41,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc trò chuyện giữa chồng và vợ.\n質問：男の人は スーパーで 何を 買いますか。",
        "options": [
          "牛乳と パン",
          "卵と パン",
          "牛乳だけ",
          "牛乳と 卵"
        ],
        "correctIndex": 3,
        "explanation": "Người vợ nhờ mua sữa (牛乳). Bánh mì ở nhà vẫn còn, nhưng trứng (卵) đã hết nên nhờ mua thêm trứng nữa → Mua sữa và trứng.",
        "audioScript": "家で男の人と女の人が話しています。男の人はスーパーで何を買いますか。 男：今からスーパーへ行くけど、何か買うものはある？ 女：ありがとう。じゃあ、牛乳を1本お願い。 男：パンは買わなくてもいい？ 女：パンはまだあるわ。あ、でも卵がないから、卵も買ってきて。 男：わかった。 男の人はスーパーで何を買いますか。"
      },
      {
        "id": 42,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện tại văn phòng.\n質問：女の人は このあと まず 何を しますか。",
        "options": [
          "資料を コピーする",
          "部長に 電話を かける",
          "会議室の 予約を する",
          "コーヒーを 入れる"
        ],
        "correctIndex": 0,
        "explanation": "Trưởng phòng đã đặt phòng họp rồi nên nhờ cô ấy photo 10 bản tài liệu trước (先にこの資料を10枚コピーしてください).",
        "audioScript": "会社で男の人と女の人が話しています。女の人はこのあとまず何をしますか。 女：課長、午後の会議の準備をしましょうか。会議室の予約はしましたか。 男：ああ、会議室はもう予約したよ。先にこの資料を10枚コピーしてください。そのあとで、机を並べましょう。 女：はい、わかりました。 女の人はこのあとまず何をしますか。"
      },
      {
        "id": 43,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe bác sĩ dặn bệnh nhân.\n質問：女の人は 今晩 どうしなければ なりませんか。",
        "options": [
          "薬を 飲まないで 寝る",
          "冷たい 水を たくさん 飲む",
          "お風呂に 入らないで、早く 寝る",
          "シャワーも お風呂も 入ってから 寝る"
        ],
        "correctIndex": 2,
        "explanation": "Bác sĩ dặn: Tối nay vì đang sốt nên đừng tắm bồn (今晩はお風呂に入らないでください), hãy uống thuốc sau bữa tối và đi ngủ sớm.",
        "audioScript": "病院で医者と女の人が話しています。女の人は今晩どうしなければなりませんか。 男：熱が少しありますね。この白い薬を晩ごはんのあとに飲んでください。それから、今晩はお風呂に入らないで、早く寝てください。 女：シャワーもだめですか。 男：ええ、今日はやめてください。 女の人は今晩どうしなければなりませんか。"
      },
      {
        "id": 44,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hai bạn học sinh bàn về quà sinh nhật.\n質問：二人は 山田さんに 何を あげますか。",
        "options": [
          "スポーツの かばん",
          "料理の 本",
          "赤い ネクタイ",
          "音楽の CD"
        ],
        "correctIndex": 1,
        "explanation": "Yamada gần đây thích nấu ăn mỗi ngày nên hai người quyết định tặng sách dạy nấu ăn (料理の本にしよう).",
        "audioScript": "男の人と女の人が友達の誕生日プレゼントについて話しています。二人は山田さんに何をあげますか。 女：来週は山田さんの誕生日ですね。何をあげましょうか。音楽のCDはどうですか。 男：うーん、山田さんは最近、毎日自分で料理を作っているから、料理の本はどう？ 女：あ、それはいいですね！そうしましょう。 二人は山田さんに何をあげますか。"
      },
      {
        "id": 45,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe thông báo ở nhà ga.\n質問：東京行きの 電車は 何番線から 出ますか。",
        "options": [
          "4番線",
          "3番線",
          "2番線",
          "1番線"
        ],
        "correctIndex": 1,
        "explanation": "Thông báo nói: Tàu đi Tokyo hôm nay đổi từ đường ray số 2 sang đường ray số 3 (本日は3番線から発車します).",
        "audioScript": "駅でアナウンスを聞いています。東京行きの電車は何番線から出ますか。 まもなく、9時15分の東京行きの電車が参ります。いつもは2番線から出ますが、きょうは3番線から出ます。お間違えのないようご注意ください。 東京行きの電車は何番線から出ますか。"
      },
      {
        "id": 46,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về gia đình.\n質問：男の人の 家族は 何人ですか。",
        "options": [
          "5人",
          "2人",
          "3人",
          "4人"
        ],
        "correctIndex": 3,
        "explanation": "Gia đình người nam gồm: Bố, mẹ, chị gái và bản thân anh ấy (父と母と姉と私です) → Tổng cộng 4 người.",
        "audioScript": "女の人と男の人が家族について話しています。男の人の家族は何人ですか。 女：キムさんの家族は何人ですか。 男：両親と、姉が一人と、わたしです。 女：お姉さんは日本にいますか。 男：いいえ、家族はみんな韓国にいます。 男の人の家族は何人ですか。"
      },
      {
        "id": 47,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về kỳ nghỉ hè.\n質問：女の人は 夏休みに どのぐらい 国へ 帰りますか。",
        "options": [
          "1か月",
          "1週間",
          "3日間",
          "2週間"
        ],
        "correctIndex": 3,
        "explanation": "Người nữ nói sẽ về nước từ ngày 10 đến ngày 24 tháng 8, tức là 2 tuần (二週間帰ります).",
        "audioScript": "男の人と女の人が夏休みの予定について話しています。女の人は夏休みにどのぐらい国へ帰りますか。 男：マリアさんは夏休みに国へ帰りますか。 女：はい、8月10日から24日まで、二週間帰ります。 男：いいですね。私は一週間だけ実家へ帰ります。 女の人は夏休みにどのぐらい国へ帰りますか。"
      },
      {
        "id": 48,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về lý do đến muộn.\n質問：男の人は どうして 遅れましたか。",
        "options": [
          "バスが 来なかったから",
          "朝 寝坊したから",
          "道が 混んでいたから",
          "乗る 電車を 間違えたから"
        ],
        "correctIndex": 3,
        "explanation": "Người nam dậy sớm nhưng lại lên nhầm tàu đi hướng ngược lại (反対の電車に乗ってしまったんです).",
        "audioScript": "女の人と男の人が話しています。男の人はどうして遅れましたか。 男：すみません、遅くなりました！ 女：どうしたんですか。また朝寝坊ですか。 男：いいえ、けさは早く起きたんですが、反対の電車に乗ってしまったんです。 女：そうだったんですか。 男の人はどうして遅れましたか。"
      },
      {
        "id": 49,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの 家へ 遊びに 来ました。家の中へ 入る とき、何と 言いますか。",
        "options": [
          "ただいま。",
          "いらっしゃいませ。",
          "おじゃまします。",
          "ごめんください。"
        ],
        "correctIndex": 2,
        "explanation": "Khi bước vào nhà người khác, người Nhật nói 「おじゃまします」(Xin phép làm phiền ạ).",
        "audioScript": "友だちの家へ遊びに来ました。家の中へ入るとき、何と言いますか。 1. ただいま。 2. いらっしゃいませ。 3. おじゃまします。 4. ごめんください。"
      },
      {
        "id": 50,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：先生の 話が よく 聞こえませんでした。もう一度 聞きたい とき、何と 言いますか。",
        "options": [
          "すみません、もっと 大きく 書いてください。",
          "はい、よく わかりました。",
          "いいえ、けっこうです。",
          "すみません、もう一度 お願いします。"
        ],
        "correctIndex": 3,
        "explanation": "Khi không nghe rõ và muốn nhờ nói lại lần nữa, ta nói: 「すみません、もう一度お願いします」.",
        "audioScript": "先生の話がよく聞こえませんでした。もう一度聞きたいとき、何と言いますか。 1. すみません、もっと 大きく 書いてください。 2. はい、よく わかりました。 3. いいえ、けっこうです。 4. すみません、もう一度 お願いします。"
      },
      {
        "id": 51,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちが 病気に なりました。友だちに 何と 言いますか。",
        "options": [
          "おだいじに。",
          "おつかれさまでした。",
          "おめでとうございます。",
          "ごちそうさまでした。"
        ],
        "correctIndex": 0,
        "explanation": "Khi thăm hỏi người bị ốm/bệnh, ta nói 「おだいじに」(Hãy giữ gìn sức khỏe / Chúc mau khỏe nhé).",
        "audioScript": "友だちが病気になりました。友だちに何と言いますか。 1. おだいじに。 2. おつかれさまでした。 3. おめでとうございます。 4. ごちそうさまでした。"
      },
      {
        "id": 52,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「あした 一緒に テニスを しませんか。」",
        "options": [
          "はい、テニスをしました。",
          "いいですね。やりましょう。",
          "いいえ、しませんでした。",
          "ええ、そうです。"
        ],
        "correctIndex": 1,
        "explanation": "Khi được rủ 「～ませんか」, nếu đồng ý ta đáp 「いいですね。やりましょう」(Hay đấy, cùng chơi nào).",
        "audioScript": "あした一緒にテニスをしませんか。 1. はい、テニスをしました。 2. いいですね。やりましょう。 3. いいえ、しませんでした。 4. ええ、そうです。"
      },
      {
        "id": 53,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「その 荷物を 持ちましょうか。」",
        "options": [
          "いいえ、持ちませんでした。",
          "どういたしまして。",
          "ありがとうございます。お願いします。",
          "はい、持ってください。"
        ],
        "correctIndex": 2,
        "explanation": "Khi ai đó đề nghị giúp đỡ 「～ましょうか」(Để tôi xách hành lý giúp bạn nhé?), câu đáp lịch sự là 「ありがとうございます。お願いします」.",
        "audioScript": "その荷物を持ちましょうか。 1. いいえ、持ちませんでした。 2. どういたしまして。 3. ありがとうございます。お願いします。 4. はい、持ってください。"
      },
      {
        "id": 54,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「日本の 生活に もう 慣れましたか。」",
        "options": [
          "はい、毎日 勉強します。",
          "いいえ、日本じゃ ありません。",
          "ええ、もう すっかり 慣れました。",
          "はい、日本へ 行きたいです。"
        ],
        "correctIndex": 2,
        "explanation": "Câu hỏi 「日本の生活にもう慣れましたか」(Bạn đã quen với cuộc sống ở Nhật chưa?) → Đáp: 「ええ、もうすっかり慣れました」(Vâng, tôi đã hoàn toàn quen rồi).",
        "audioScript": "日本の生活にもう慣れましたか。 1. はい、毎日 勉強します。 2. いいえ、日本じゃ ありません。 3. ええ、もう すっかり 慣れました。 4. はい、日本へ 行きたいです。"
      },
      {
        "id": 55,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「お先に 失礼します。」",
        "options": [
          "おつかれさまでした。",
          "ごめんください。",
          "はじめまして。",
          "いらっしゃいませ。"
        ],
        "correctIndex": 0,
        "explanation": "Khi đồng nghiệp chào ra về trước 「お先に失礼します」, người ở lại đáp 「おつかれさまでした」.",
        "audioScript": "お先に失礼します。 1. おつかれさまでした。 2. ごめんください。 3. はじめまして。 4. いらっしゃいませ。"
      }
    ]
  },
  {
    "id": "test_n5_03",
    "title": "Đề thi thử JLPT N5 - Đề số 3 (Tổng hợp 3 kỹ năng - Trung bình)",
    "description": "Đề thi đầy đủ 3 phần chuẩn JLPT N5 (55 câu): Trọng tâm thể Nai (ない), thể Ta (た), liệt kê Vたり, kinh nghiệm Vたことがある, đọc hiểu đoạn văn và 15 câu Nghe hiểu.",
    "durationMinutes": 90,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "来年 大学に [入ります]。",
        "options": [
          "かります",
          "いります",
          "でます",
          "はいります"
        ],
        "correctIndex": 3,
        "explanation": "[入ります] (Nhập - bước vào / nhập học) đọc là 「はいります」.",
        "audioScript": ""
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "きのうは [雨]が たくさん 降りました。",
        "options": [
          "あめ",
          "ゆき",
          "くも",
          "かぜ"
        ],
        "correctIndex": 0,
        "explanation": "[雨] (Vũ - cơn mưa) đọc là 「あめ」.",
        "audioScript": ""
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この [電車]は 東京へ 行きますか。",
        "options": [
          "じてんしゃ",
          "でんき",
          "でんしゃ",
          "くるま"
        ],
        "correctIndex": 2,
        "explanation": "[電車] (Điện Xa - tàu điện) đọc là 「でんしゃ」.",
        "audioScript": ""
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[毎週] 日曜日に テニスを します。",
        "options": [
          "まいつき",
          "まいとし",
          "まいしゅう",
          "まいにち"
        ],
        "correctIndex": 2,
        "explanation": "[毎週] (Mỗi tuần) đọc là 「まいしゅう」.",
        "audioScript": ""
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "あそこに [高い] ビルが あります。",
        "options": [
          "ながい",
          "おおきい",
          "たかい",
          "ひくい"
        ],
        "correctIndex": 2,
        "explanation": "[高い] (Cao / Đắt) đọc là 「たかい」.",
        "audioScript": ""
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "テーブルの 上に みかんが [九つ] あります。",
        "options": [
          "ななつ",
          "やっつ",
          "ここのつ",
          "きゅうつ"
        ],
        "correctIndex": 2,
        "explanation": "[九つ] (9 cái) đọc là 「ここのつ」.",
        "audioScript": ""
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[外国]から 手紙が 来ました。",
        "options": [
          "そとこく",
          "がいこく",
          "かいこく",
          "がいごく"
        ],
        "correctIndex": 1,
        "explanation": "[外国] (Ngoại Quốc - nước ngoài) đọc là 「がいこく」.",
        "audioScript": ""
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "友だちと [はなします]。",
        "options": [
          "読します",
          "言します",
          "語します",
          "話します"
        ],
        "correctIndex": 3,
        "explanation": "はなします (nói chuyện) viết bằng Kanji là [話します] (Thoại).",
        "audioScript": ""
      },
      {
        "id": 9,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "[らいねん] 日本へ 行きたいです。",
        "options": [
          "先年",
          "米年",
          "来年",
          "本年"
        ],
        "correctIndex": 2,
        "explanation": "らいねん (năm sau) viết bằng Kanji là [来年] (Lai Niên).",
        "audioScript": ""
      },
      {
        "id": 10,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "いすの [した]に いぬが います。",
        "options": [
          "中",
          "外",
          "上",
          "下"
        ],
        "correctIndex": 3,
        "explanation": "した (bên dưới) viết bằng Kanji là [下] (Hạ).",
        "audioScript": ""
      },
      {
        "id": 11,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "わたしの へやは [ちいさい]です。",
        "options": [
          "少さい",
          "小さい",
          "太さい",
          "大さい"
        ],
        "correctIndex": 1,
        "explanation": "ちいさい (nhỏ) viết bằng Kanji là [小さい] (Tiểu). Chú ý [少し] (すこし - một chút).",
        "audioScript": ""
      },
      {
        "id": 12,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "デパートで [エレベーター]に 乗りました。",
        "options": [
          "ユレベーター",
          "エレベータ",
          "エフベーター",
          "エレベーター"
        ],
        "correctIndex": 3,
        "explanation": "エレベーター (thang máy - elevator) có trường âm ở cả ベー và ター.",
        "audioScript": ""
      },
      {
        "id": 13,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あさ 起きたら、まず かおを ( 　 )。",
        "options": [
          "みがきます",
          "あらいます",
          "きります",
          "そうじします"
        ],
        "correctIndex": 1,
        "explanation": "かおを あらいます: rửa mặt. (はを みがきます: đánh răng).",
        "audioScript": ""
      },
      {
        "id": 14,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "かぜを ひきましたから、( 　 )を のみます。",
        "options": [
          "くすり",
          "からだ",
          "いしゃ",
          "びょういん"
        ],
        "correctIndex": 0,
        "explanation": "くすりを のみます: uống thuốc (vì bị cảm).",
        "audioScript": ""
      },
      {
        "id": 15,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "ここは としょかんですから、( 　 )に してください。",
        "options": [
          "げんき",
          "ゆうめい",
          "にぎやか",
          "しずか"
        ],
        "correctIndex": 3,
        "explanation": "Ở thư viện cần giữ yên lặng: しずかに してください.",
        "audioScript": ""
      },
      {
        "id": 16,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "きのうの 晩、12時まで 働きましたから、とても ( 　 )。",
        "options": [
          "おわりました",
          "やすみました",
          "おきました",
          "つかれました"
        ],
        "correctIndex": 3,
        "explanation": "Làm việc đến 12 giờ đêm nên rất mệt (つかれました).",
        "audioScript": ""
      },
      {
        "id": 17,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "この セーターは 5万円です。ちょっと ( 　 )から、買えません。",
        "options": [
          "あたたかい",
          "かるい",
          "たかい",
          "やすい"
        ],
        "correctIndex": 2,
        "explanation": "Áo len giá 5 vạn yên (~8 triệu đồng) là đắt (たかい) nên không mua được.",
        "audioScript": ""
      },
      {
        "id": 18,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "この へやは きたないです。",
        "options": [
          "この へやは あかるくないです。",
          "この へやは きれいじゃ ありません。",
          "この へやは ひろくないです。",
          "この へやは しずかじゃ ありません。"
        ],
        "correctIndex": 1,
        "explanation": "きたない (bẩn/bừa bộn) đồng nghĩa với きれいじゃ ありません (không sạch/đẹp).",
        "audioScript": ""
      },
      {
        "id": 19,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "やまもとさんは りょうりが じょうずです。",
        "options": [
          "やまもとさんは りょうりを しません。",
          "やまもとさんは りょうりが きらいです。",
          "やまもとさんは りょうりが うまいです。",
          "やまもとさんは りょうりが へたです。"
        ],
        "correctIndex": 2,
        "explanation": "じょうず (giỏi/khéo) đồng nghĩa với うまい (giỏi/ngon).",
        "audioScript": ""
      },
      {
        "id": 20,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "もうすぐ 電車が 来ます。",
        "options": [
          "さっき 電車が 来ました。",
          "あと 少しで 電車が 来ます。",
          "きょうは 電車が 来ません。",
          "ゆっくり 電車が 来ます。"
        ],
        "correctIndex": 1,
        "explanation": "もうすぐ (sắp sửa) đồng nghĩa với あと少しで (chỉ còn một chút nữa là...).",
        "audioScript": ""
      },
      {
        "id": 21,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは 日本へ ( 　 ) ことが あります。",
        "options": [
          "行く",
          "行って",
          "行った",
          "行こう"
        ],
        "correctIndex": 2,
        "explanation": "Mẫu câu kinh nghiệm trong quá khứ: [Vた] + ことがあります (Tôi đã từng đi Nhật).",
        "audioScript": ""
      },
      {
        "id": 22,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "休みの 日は 本を ( 　 )、音楽を 聞いたり します。",
        "options": [
          "読んだり",
          "読んだ",
          "読む",
          "読んで"
        ],
        "correctIndex": 0,
        "explanation": "Mẫu câu liệt kê hành động tiêu biểu: Vたり、Vたり します. 読みます → 読んだり.",
        "audioScript": ""
      },
      {
        "id": 23,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "もう 10時ですから、そろそろ ( 　 ) なければ なりません。",
        "options": [
          "帰り",
          "帰って",
          "帰る",
          "帰ら"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu bắt buộc: Vなければ なりません (Phải về). 帰ります → 帰らない → 帰らなければ.",
        "audioScript": ""
      },
      {
        "id": 24,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "あしたは 日曜日ですから、早く ( 　 )も いいです。",
        "options": [
          "起きなくて",
          "起きた",
          "起きない",
          "起きないで"
        ],
        "correctIndex": 0,
        "explanation": "Mẫu câu không cần làm gì: Vなくても いいです (Ngày mai là Chủ nhật nên không cần dậy sớm cũng được).",
        "audioScript": ""
      },
      {
        "id": 25,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "寝る ( 　 )に、日記を 書きます。",
        "options": [
          "あと",
          "まえ",
          "ながら",
          "とき"
        ],
        "correctIndex": 1,
        "explanation": "[Vる] + まえに: Trước khi đi ngủ tôi viết nhật ký. (あとで đi với Vた, ながら đi với V bỏ ます).",
        "audioScript": ""
      },
      {
        "id": 26,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きのうの 晩、窓を ( 　 ) 寝ましたから、かぜを ひきました。",
        "options": [
          "閉めて",
          "閉めないで",
          "開けて",
          "開けないで"
        ],
        "correctIndex": 1,
        "explanation": "Vì đi ngủ mà không đóng cửa sổ (窓を閉めないで寝ました) nên đã bị cảm lạnh.",
        "audioScript": ""
      },
      {
        "id": 27,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "春に ( 　 )、暖かく なります。",
        "options": [
          "なると",
          "なら",
          "なれば",
          "なって"
        ],
        "correctIndex": 0,
        "explanation": "Mẫu câu quy luật tự nhiên: Vる + と (Hễ sang xuân thì trời trở nên ấm áp).",
        "audioScript": ""
      },
      {
        "id": 28,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは 妹( 　 ) ケーキを 作って あげました。",
        "options": [
          "で",
          "が",
          "を",
          "に"
        ],
        "correctIndex": 3,
        "explanation": "Người nhận hành động trong mẫu câu Vてあげます được đánh dấu bằng trợ từ に (làm bánh cho em gái).",
        "audioScript": ""
      },
      {
        "id": 29,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "スポーツの 中で サッカーが ( 　 ) 好きです。",
        "options": [
          "ずっと",
          "もっと",
          "いちばん",
          "よく"
        ],
        "correctIndex": 2,
        "explanation": "So sánh nhất trong một nhóm (～の中で): いちばん 好きです (thích bóng đá nhất).",
        "audioScript": ""
      },
      {
        "id": 30,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "わたしは [ 　 ] [ ★ ] [ 　 ] [ 　 ] 思いました。",
        "options": [
          "とても",
          "おもしろいと",
          "読んで",
          "この本は"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: この本は 読んで [とても] おもしろいと 思いました. Vị trí [★] là 「とても」.",
        "audioScript": ""
      },
      {
        "id": 31,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "あした 雨が [ 　 ] [ 　 ] [ ★ ] [ 　 ] 行きません。",
        "options": [
          "降ったら",
          "山へ",
          "どこへも",
          "ハイキングに"
        ],
        "correctIndex": 3,
        "explanation": "Thứ tự đúng: 雨が 降ったら 山へ [ハイキングに] どこへも 行きません → Chuẩn xác: 雨が 降ったら どこへも [ハイキングに] 山へ 行きません. Vị trí [★] là 「ハイキングに」.",
        "audioScript": ""
      },
      {
        "id": 32,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "これは 先週 [ 　 ] [ ★ ] [ 　 ] [ 　 ] 写真です。",
        "options": [
          "京都で",
          "わたしが",
          "旅行のときに",
          "撮った"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: わたしが [京都で] 旅行のときに 撮った 写真です (Đây là bức ảnh tôi đã chụp ở Kyoto trong chuyến du lịch tuần trước). Vị trí [★] là 「京都で」.",
        "audioScript": ""
      },
      {
        "id": 33,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "図書館で 本を [ 　 ] [ 　 ] [ ★ ] [ 　 ] ください。",
        "options": [
          "この",
          "カードを",
          "見せて",
          "借りるときは"
        ],
        "correctIndex": 1,
        "explanation": "Thứ tự đúng: 本を 借りるときは この [カードを] 見せて ください (Khi mượn sách ở thư viện, xin hãy xuất trình thẻ này). Vị trí [★] là 「カードを」.",
        "audioScript": ""
      },
      {
        "id": 34,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36】\nわたしの 町には 大きな 公園が あります。公園の 中には きれいな 池や テニスコートが あります。\nわたしは 毎朝 この 公園を 散歩します。朝 早く 来ると、多くの 人が [ 34 ] います。\n春には 桜の 花が たくさん 咲きますから、とても [ 35 ] なります。家族や 友だちと お弁当を [ 36 ] 来る 人も 多いです。\n\nCâu 34: Chọn từ thích hợp điền vào [ 34 ]:",
        "options": [
          "走る",
          "走った",
          "走り",
          "走って"
        ],
        "correctIndex": 3,
        "explanation": "[ 34 ]: Vて います diễn tả hành động đang diễn ra (nhiều người đang chạy bộ).",
        "audioScript": ""
      },
      {
        "id": 35,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「春には 桜の 花が たくさん 咲きますから、とても [ 35 ] なります。」\n\nCâu 35: Chọn từ thích hợp điền vào [ 35 ]:",
        "options": [
          "にぎやかな",
          "にぎやかだ",
          "にぎやかに",
          "にぎやかで"
        ],
        "correctIndex": 2,
        "explanation": "[ 35 ]: Tính từ đuôi な kết hợp với なります (trở nên): にぎやか → にぎやかに なります (trở nên nhộn nhịp).",
        "audioScript": ""
      },
      {
        "id": 36,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「家族や 友だちと お弁当を [ 36 ] 来る 人も 多いです。」\n\nCâu 36: Chọn từ thích hợp điền vào [ 36 ]:",
        "options": [
          "持って",
          "持つ",
          "持ち",
          "持った"
        ],
        "correctIndex": 0,
        "explanation": "[ 36 ]: お弁当を持って来る (mang cơm hộp đến).",
        "audioScript": ""
      },
      {
        "id": 37,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【手紙】\nアンさん、お元気ですか。来週の 日曜日に わたしの 新しい アパートで 昼ごはんを 一緒に 食べませんか。駅の 北口に 11時半に 来てください。迎えに 行きます。\nミラーより\n\n質問：二人は 来週の 日曜日に どこで 会いますか。",
        "options": [
          "レストランの 前",
          "ミラーさんの アパート",
          "駅の 北口",
          "駅の 南口"
        ],
        "correctIndex": 2,
        "explanation": "Trong thư Miller nhắn: Hãy đến cửa Bắc của nhà ga lúc 11 giờ rưỡi, tôi sẽ ra đón (駅の北口に11時半に来てください。迎えに行きます).",
        "audioScript": ""
      },
      {
        "id": 38,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【デパートの お知らせ】\n本日、7階の レストランは 工事のため 休みです。お食事の お客様は 地下1階の 喫茶店か、隣の ビルの レストランを ご利用ください。\n\n質問：今日 この デパートの 中で ごはんや コーヒーを 飲みたい 人は どこへ 行きますか。",
        "options": [
          "屋上の 公園",
          "7階の レストラン",
          "地下1階の 喫茶店",
          "1階の 案内所"
        ],
        "correctIndex": 2,
        "explanation": "Nhà hàng tầng 7 hôm nay nghỉ để sửa chữa. Ngay bên trong tòa bách hóa này có quán nước ở tầng hầm B1 (地下1階の喫茶店).",
        "audioScript": ""
      },
      {
        "id": 39,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 9: Đọc hiểu đoạn văn vừa",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\nわたしは 子どもの とき、野菜が あまり 好きでは ありませんでした。特に トマトが 嫌いでした。でも、去年 田舎の おばあちゃんの 家へ 行ったとき、おばあちゃんが 庭で 作った トマトを 食べました。その トマトは とても 甘くて おいしかったです。それから、わたしは 毎日 トマトを 食べるように なりました。\n\n質問：この 人は どうして トマトが 好きに なりましたか。",
        "options": [
          "おばあちゃんが 作った トマトが とても おいしかったから。",
          "子どもの ときから ずっと トマトが 甘かったから。",
          "スーパーで 安い トマトを たくさん 買ったから。",
          "医者に 毎日 野菜を 食べなさいと 言われたから。"
        ],
        "correctIndex": 0,
        "explanation": "Hồi nhỏ người này ghét cà chua, nhưng năm ngoái khi ăn cà chua do bà trồng trong vườn thấy rất ngọt và ngon (そのトマトはとても甘くておいしかったです) nên từ đó trở nên thích và ăn mỗi ngày.",
        "audioScript": ""
      },
      {
        "id": 40,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 10: Tìm kiếm thông tin",
        "question": "【バス旅行の ご案内】\n・Aコース（日光・温泉）：大人 8,000円 / 子供 4,000円（昼食つき・土曜日のみ）\n・Bコース（箱根・美術館）：大人 7,000円 / 子供 3,500円（昼食なし・毎日）\n・Cコース（富士山・ぶどう狩り）：大人 9,000円 / 子供 5,000円（昼食つき・日曜日のみ）\n\n質問：林さんは 日曜日に 奥さんと 二人で 昼食つきの バス旅行に 行きたいです。どの コースを 選びますか。また、二人で いくらですか。",
        "options": [
          "Bコース・14,000円",
          "Cコース・14,000円",
          "Cコース・18,000円",
          "Aコース・16,000円"
        ],
        "correctIndex": 2,
        "explanation": "Đi vào Chủ nhật (日曜日) và có kèm bữa trưa (昼食つき) → Chọn Cコース. Hai vợ chồng (2 người lớn = 大人2人) × 9,000円 = 18,000円.",
        "audioScript": ""
      },
      {
        "id": 41,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc gọi điện thoại giữa hai người bạn.\n質問：女の人は このあと どこへ 行きますか。",
        "options": [
          "映画館の 前",
          "駅の 改札",
          "喫茶店",
          "本屋の 前"
        ],
        "correctIndex": 3,
        "explanation": "Người nam đang đợi ở trước hiệu sách cạnh rạp chiếu phim (映画館の隣の本屋の前にいるよ) nên người nữ nói sẽ đến đó ngay.",
        "audioScript": "女の人と男の人が電話で話しています。女の人はこのあとどこへ行きますか。 女：もしもし、けんじくん？今駅に着いたけど、どこにいる？映画館の前？ 男：ううん、映画館の前は人が多いから、隣の本屋の前にいるよ。 女：わかった。すぐそこへ行くね。 女の人はこのあとどこへ行きますか。"
      },
      {
        "id": 42,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe nhân viên khách sạn hướng dẫn khách.\n質問：男の人は 朝ごはんを 食べる とき、どうしなければ なりませんか。",
        "options": [
          "1階の フロントで お金を 払う",
          "部屋の 鍵だけ 持って 2階へ 行く",
          "白い 券を 2階の レストランへ 持って 行く",
          "青い 券を 1階の レストランへ 持って 行く"
        ],
        "correctIndex": 3,
        "explanation": "Nhân viên dặn: Nhà hàng ăn sáng ở tầng 1, từ 7h đến 9h, khi đi hãy mang theo phiếu màu xanh (この青い券を持って行ってください).",
        "audioScript": "ホテルで受付の人と男の人が話しています。男の人は朝ごはんを食べるとき、どうしなければなりませんか。 男：すみません、明日の朝ごはんは何時からですか。 女：朝ごはんは7時から9時まででございます。場所は1階のレストランです。行かれるときは、この青い券を持って行ってください。 男：わかりました。 男の人は朝ごはんを食べるとき、どうしなければなりませんか。"
      },
      {
        "id": 43,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hai đồng nghiệp nói chuyện trong văn phòng.\n質問：男の人は これから 何を しますか。",
        "options": [
          "エアコンを 消す",
          "窓を 開ける",
          "エアコンの 温度を 下げる",
          "冷たい 水を 持って 来る"
        ],
        "correctIndex": 2,
        "explanation": "Người nữ thấy phòng hơi nóng; ngoài trời ồn nên không mở cửa sổ được, vì vậy người nam nói sẽ hạ nhiệt độ điều hòa xuống một chút (エアコンの温度を少し下げましょう).",
        "audioScript": "会社で女の人と男の人が話しています。男の人はこれから何をしますか。 女：なんだかこの部屋、少し暑くないですか。窓を開けましょうか。 男：外は工事をしていてうるさいから、窓は開けないほうがいいですよ。エアコンの温度を少し下げましょう。 女：ありがとうございます。 男の人はこれから何をしますか。"
      },
      {
        "id": 44,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe giáo viên hướng dẫn bài tập về nhà.\n質問：学生は 来週の 月曜日に 何を 出しますか。",
        "options": [
          "ワークブックの 10ページと 11ページ",
          "作文の ノート",
          "漢字の プリント 2枚",
          "教科書の 10ページから 12ページまで"
        ],
        "correctIndex": 0,
        "explanation": "Thầy giáo giao bài tập nộp vào thứ Hai tuần sau là trang 10 và 11 của sách bài tập (ワークブックの10ページと11ページです).",
        "audioScript": "先生が教室で宿題について話しています。学生は来週の月曜日に何を出しますか。 先生：今日は教科書の12ページまで勉強しましたね。宿題は、ワークブックの10ページと11ページです。12ページはまだやらなくてもいいです。来週の月曜日に出してください。 学生は来週の月曜日に何を出しますか。"
      },
      {
        "id": 45,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về sở thích.\n質問：女の人は 休みの 日に よく 何を しますか。",
        "options": [
          "デパートへ 買い物に 行く",
          "プールで 泳ぐ",
          "外で テニスを する",
          "家で 映画を 見る"
        ],
        "correctIndex": 3,
        "explanation": "Người nữ không thích vận động cho lắm nên ngày nghỉ thường ở nhà xem phim (家で映画を見ることが多いです).",
        "audioScript": "男の人と女の人が休みの日の過ごし方について話しています。女の人は休みの日によく何をしますか。 男：リンさんは休みの日にスポーツをしますか。 女：いいえ、私はあまり運動が好きじゃないんです。だから、家で映画を見ることが多いです。 男：そうですか。 女の人は休みの日によく何をしますか。"
      },
      {
        "id": 46,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại ở hiệu sách.\n質問：男の人が 探している 本は どこに ありますか。",
        "options": [
          "2階の 階段の 横",
          "2階の 一番 奥の 棚",
          "1階の 入り口の 近く",
          "地下1階の カウンター"
        ],
        "correctIndex": 1,
        "explanation": "Nhân viên chỉ: Sách học tiếng Nhật ở tầng 2, đi lên cầu thang rồi đi thẳng tới kệ trong cùng (2階の一番奥の棚にあります).",
        "audioScript": "本屋で男の人と店員が話しています。男の人が探している本はどこにありますか。 男：すみません、外国人のための日本語の教科書はどこにありますか。 女：日本語の本は2階でございます。あちらの階段を上がって、一番奥の棚にありますよ。 男：ありがとうございます。 男の人が探している本はどこにありますか。"
      },
      {
        "id": 47,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về chuyến du lịch.\n質問：女の人は 京都で 何が 一番 よかったと 言っていますか。",
        "options": [
          "ホテルの 温泉",
          "古い お寺の 庭",
          "買い物の 町",
          "京都の 食べ物"
        ],
        "correctIndex": 1,
        "explanation": "Món ăn cũng ngon nhưng điều cô ấy thấy tuyệt nhất là khu vườn của ngôi chùa cổ (特に古いお寺の庭が一番きれいでした).",
        "audioScript": "男の人と女の人が京都旅行について話しています。女の人は京都で何が一番よかったと言っていますか。 男：先週の京都旅行はどうでしたか。 女：とても楽しかったです。食べ物もおいしかったし、お寺もたくさん見ました。特に、古いお寺の庭が一番きれいでよかったです。 女の人は京都で何が一番よかったと言っていますか。"
      },
      {
        "id": 48,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại tại bưu điện.\n質問：手紙と はがきで ぜんぶで いくら かかりますか。",
        "options": [
          "150円",
          "230円",
          "80円",
          "300円"
        ],
        "correctIndex": 1,
        "explanation": "Một bức thư đi nước ngoài giá 150 yên và 1 tấm bưu thiếp trong nước giá 80 yên → Tổng cộng 150 + 80 = 230 yên.",
        "audioScript": "郵便局で男の人が手紙とはがきを出しています。ぜんぶでいくらかかりますか。 男：すみません、この手紙をベトナムまでお願いします。それから、国内のはがきも一枚ください。 女：はい、ベトナムまでの手紙が百五十円で、はがきが八十円ですから、合わせて二百三十円になります。 ぜんぶでいくらかかりますか。"
      },
      {
        "id": 49,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：電車の中で おばあさんに 席を 譲りたいです。何と 言いますか。",
        "options": [
          "どうぞ、ここに 座って ください。",
          "すみません、ここに 座っても いいですか。",
          "ここは だれの 席ですか。",
          "どうぞ、お先に 行って ください。"
        ],
        "correctIndex": 0,
        "explanation": "Khi nhường ghế cho người lớn tuổi trên tàu, ta nói: 「どうぞ、ここに座ってください」(Xin mời cụ ngồi ở đây ạ).",
        "audioScript": "電車の中でおばあさんに席を譲りたいです。何と言いますか。 1. どうぞ、ここに 座って ください。 2. すみません、ここに 座っても いいですか。 3. ここは だれの 席ですか。 4. どうぞ、お先に 行って ください。"
      },
      {
        "id": 50,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの 家から 帰ります。帰る とき、友だちに 何と 言いますか。",
        "options": [
          "そろそろ 失礼します。",
          "いらっしゃい。",
          "ただいま 帰りました。",
          "おじゃまします。"
        ],
        "correctIndex": 0,
        "explanation": "Khi chuẩn bị xin phép ra về từ nhà bạn, người Nhật nói 「そろそろ失礼します」(Đã đến lúc tôi xin phép về ạ).",
        "audioScript": "友だちの家から帰ります。帰るとき、友だちに何と言いますか。 1. そろそろ 失礼します。 2. いらっしゃい。 3. ただいま 帰りました。 4. おじゃまします。"
      },
      {
        "id": 51,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：銀行へ 行きたいですが、道が わかりません。近くの 人に 何と 聞きますか。",
        "options": [
          "すみません、銀行は どこですか。",
          "銀行で 何を しますか。",
          "ここは 銀行ですか。",
          "すみません、銀行へ 行きませんか。"
        ],
        "correctIndex": 0,
        "explanation": "Khi hỏi đường đến ngân hàng, ta hỏi: 「すみません、銀行はどこですか」.",
        "audioScript": "銀行へ行きたいですが、道がわかりません。近くの人に何と聞きますか。 1. すみません、銀行は どこですか。 2. 銀行で 何を しますか。 3. ここは 銀行ですか。 4. すみません、銀行へ 行きませんか。"
      },
      {
        "id": 52,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、この 近くに コンビニが ありますか。」",
        "options": [
          "ええ、あそこの 信号の 横に ありますよ。",
          "ええ、毎日 行きます。",
          "いいえ、コンビニじゃ ありません。",
          "はい、コンビニで 買いました。"
        ],
        "correctIndex": 0,
        "explanation": "Khi được hỏi gần đây có cửa hàng tiện lợi không, câu trả lời chỉ vị trí cụ thể: 「ええ、あそこの信号の横にありますよ」(Có đấy, ở ngay cạnh đèn giao thông đằng kia).",
        "audioScript": "すみません、この近くにコンビニがありますか。 1. ええ、あそこの 信号の 横に ありますよ。 2. ええ、毎日 行きます。 3. いいえ、コンビニじゃ ありません。 4. はい、コンビニで 買いました。"
      },
      {
        "id": 53,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「田中さんは どの 人ですか。」",
        "options": [
          "はい、わたしの 友達です。",
          "とても 親切な 人です。",
          "あの 青い シャツを 着ている 人です。",
          "田中さんは 会社員です。"
        ],
        "correctIndex": 2,
        "explanation": "Câu hỏi 「どの人ですか」(Là người nào?) dùng để nhận diện một người trong nhóm → 「あの青いシャツを着ている人です」(Là người đang mặc áo sơ mi xanh kia).",
        "audioScript": "田中さんはどの人ですか。 1. はい、わたしの 友達です。 2. とても 親切な 人です。 3. あの 青い シャツを 着ている 人です。 4. 田中さんは 会社員です。"
      },
      {
        "id": 54,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「あ、雨が 降って きましたね。傘が ありますか。」",
        "options": [
          "いいえ、晴れています。",
          "はい、雨が 降りました。",
          "いいえ、持って いません。",
          "ええ、傘を さします。"
        ],
        "correctIndex": 2,
        "explanation": "Câu hỏi 「傘がありますか」(Bạn có mang ô không?) → Đáp: 「いいえ、持っていません」(Không, tôi không mang theo).",
        "audioScript": "あ、雨が降ってきましたね。傘がありますか。 1. いいえ、晴れています。 2. はい、雨が 降りました。 3. いいえ、持って いません。 4. ええ、傘を さします。"
      },
      {
        "id": 55,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「誕生日に 何が 一番 ほしいですか。」",
        "options": [
          "はい、とても ほしいです。",
          "新しい 時計が ほしいです。",
          "誕生日は 来週です。",
          "友だちに もらいました。"
        ],
        "correctIndex": 1,
        "explanation": "Câu hỏi 「何が一番ほしいですか」(Bạn muốn thứ gì nhất?) → 「新しい時計がほしいです」(Tôi muốn một chiếc đồng hồ mới).",
        "audioScript": "誕生日に何が一番ほしいですか。 1. はい、とても ほしいです。 2. 新しい 時計が ほしいです。 3. 誕生日は 来週です。 4. 友だちに もらいました。"
      }
    ]
  },
  {
    "id": "test_n5_04",
    "title": "Đề thi thử JLPT N5 - Đề số 4 (Tổng hợp 3 kỹ năng - Khá giỏi)",
    "description": "Đề thi đầy đủ 3 phần chuẩn JLPT N5 (55 câu): Trọng tâm thể Thông thường (普通形), mệnh đề bổ nghĩa danh từ, câu điều kiện たら/と, cho nhận và 15 câu Nghe hiểu.",
    "durationMinutes": 90,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[去年]の 冬、北海道へ 行きました。",
        "options": [
          "こぞ",
          "せんねん",
          "さくねん",
          "きょねん"
        ],
        "correctIndex": 3,
        "explanation": "[去年] (Khứ Niên - năm ngoái) trong N5 đọc là 「きょねん」.",
        "audioScript": ""
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "駅の [東口]で 会いましょう。",
        "options": [
          "ひがしぐち",
          "きたぐち",
          "にしぐち",
          "みなみぐち"
        ],
        "correctIndex": 0,
        "explanation": "[東口] (Đông Khẩu - cửa Đông) đọc là 「ひがしぐち」.",
        "audioScript": ""
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "父は [会社]で 働いて います。",
        "options": [
          "かいしゃ",
          "がいしゃ",
          "あいしゃ",
          "しゃかい"
        ],
        "correctIndex": 0,
        "explanation": "[会社] (Hội Xã - công ty) đọc là 「かいしゃ」.",
        "audioScript": ""
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この 川は 水が [多い]です。",
        "options": [
          "すくない",
          "おおい",
          "ひろい",
          "ふかい"
        ],
        "correctIndex": 1,
        "explanation": "[多い] (Đa - nhiều) đọc là 「おおい」.",
        "audioScript": ""
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "もっと [大きい] 声で 話して ください。",
        "options": [
          "ちいさい",
          "おおきい",
          "たかい",
          "つよい"
        ],
        "correctIndex": 1,
        "explanation": "[大きい] (Đại - to/lớn) đọc là 「おおきい」.",
        "audioScript": ""
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "誕生日は [四月二十日]です。",
        "options": [
          "よんがつにじゅうにち",
          "しがつはつか",
          "しがつにじゅうにち",
          "よんがつはつか"
        ],
        "correctIndex": 1,
        "explanation": "[四月] đọc là 「しがつ」, [二十日] (ngày 20) đọc đặc biệt là 「はつか」.",
        "audioScript": ""
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "わたしは [音楽]が 好きです。",
        "options": [
          "おんらく",
          "おとがく",
          "おんがく",
          "ねがく"
        ],
        "correctIndex": 2,
        "explanation": "[音楽] (Âm Nhạc) đọc là 「おんがく」.",
        "audioScript": ""
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "毎朝 公園を [さんぽ]します。",
        "options": [
          "三歩",
          "散歩",
          "山歩",
          "散保"
        ],
        "correctIndex": 1,
        "explanation": "さんぽ (đi dạo) viết bằng Kanji là [散歩] (Tản Bộ).",
        "audioScript": ""
      },
      {
        "id": 9,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "[あね]は 東京に 住んで います。",
        "options": [
          "妹",
          "姉",
          "母",
          "女"
        ],
        "correctIndex": 1,
        "explanation": "あね (chị gái) viết bằng Kanji là [姉] (Tỷ). [妹] là いもうと (em gái).",
        "audioScript": ""
      },
      {
        "id": 10,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "この 映画は とても [ゆうめい]です。",
        "options": [
          "有名",
          "友名",
          "右名",
          "有明"
        ],
        "correctIndex": 0,
        "explanation": "ゆうめい (nổi tiếng) viết bằng Kanji là [有名] (Hữu Danh).",
        "audioScript": ""
      },
      {
        "id": 11,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "ぎんこうで [おかね]を おろしました。",
        "options": [
          "お全",
          "お金",
          "お今",
          "お会"
        ],
        "correctIndex": 1,
        "explanation": "おかね (tiền) viết bằng Kanji là [お金] (Kim).",
        "audioScript": ""
      },
      {
        "id": 12,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "あの レストランの [カレー]は おいしいです。",
        "options": [
          "力レー",
          "カレ一",
          "ワレー",
          "カレー"
        ],
        "correctIndex": 3,
        "explanation": "カレー (cà ri - curry). Chú ý chữ カ (ka) và レ (re) + trường âm ー.",
        "audioScript": ""
      },
      {
        "id": 13,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "あしたは テストですから、今晩は 言葉を ( 　 ) なければ なりません。",
        "options": [
          "わすれ",
          "おぼえ",
          "なくし",
          "返し"
        ],
        "correctIndex": 1,
        "explanation": "おぼえます (nhớ / học thuộc): tối nay phải học thuộc từ vựng.",
        "audioScript": ""
      },
      {
        "id": 14,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "バスを ( 　 )、それから 学校まで 5分 歩きます。",
        "options": [
          "かえて",
          "おりて",
          "のって",
          "はいって"
        ],
        "correctIndex": 1,
        "explanation": "バスを おりて: xuống xe buýt, sau đó đi bộ 5 phút tới trường.",
        "audioScript": ""
      },
      {
        "id": 15,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "この スープは 少し ( 　 ) ですから、あたためて ください。",
        "options": [
          "あまい",
          "からい",
          "あつい",
          "つめたい"
        ],
        "correctIndex": 3,
        "explanation": "Vì súp hơi nguội/lạnh (つめたい) nên hãy hâm nóng lại.",
        "audioScript": ""
      },
      {
        "id": 16,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "わたしは 毎晩 11時に ( 　 ) に 入ります。",
        "options": [
          "トイレ",
          "おふろ",
          "だいどころ",
          "げんかん"
        ],
        "correctIndex": 1,
        "explanation": "おふろに 入ります: tắm bồn.",
        "audioScript": ""
      },
      {
        "id": 17,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "すみません、ボールペンを ( 　 ) ください。",
        "options": [
          "かりて",
          "ならって",
          "かして",
          "おしえて"
        ],
        "correctIndex": 2,
        "explanation": "かして ください (Hãy cho tôi mượn bút bi).",
        "audioScript": ""
      },
      {
        "id": 18,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "ちちは 来月 外国へ 行きます。",
        "options": [
          "ちちは 来月 会社へ 行きます。",
          "ちちは 来月 東京へ 行きます。",
          "ちちは 来月 ほかの 国へ 行きます。",
          "ちちは 来月 田舎へ 行きます。"
        ],
        "correctIndex": 2,
        "explanation": "外国 (nước ngoài) đồng nghĩa với ほかの国 (đất nước khác).",
        "audioScript": ""
      },
      {
        "id": 19,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "この テストの もんだいは やさしいです。",
        "options": [
          "この テストの もんだいは むずかしいです。",
          "この テストの もんだいは おおいです。",
          "この テストの もんだいは かんたんです。",
          "この テストの もんだいは たいせつです。"
        ],
        "correctIndex": 2,
        "explanation": "やさしい (dễ) khi nói về câu hỏi/bài thi đồng nghĩa với かんたん (đơn giản/dễ).",
        "audioScript": ""
      },
      {
        "id": 20,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "まいあさ 7時に いえを でます。",
        "options": [
          "まいあさ 7時に かえります。",
          "まいあさ 7時に でかけます。",
          "まいあさ 7時に おきます。",
          "まいあさ 7時に つきます。"
        ],
        "correctIndex": 1,
        "explanation": "いえを でます (ra khỏi nhà) đồng nghĩa với でかけます (ra ngoài / khởi hành).",
        "audioScript": ""
      },
      {
        "id": 21,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "田中さんは 昨日 どこへも ( 　 ) と 言いました。",
        "options": [
          "行かなかった",
          "行かない",
          "行かないでした",
          "行きませんでした"
        ],
        "correctIndex": 0,
        "explanation": "Trích dẫn gián tiếp (～と言いました) dùng thể thông thường (普通形). Quá khứ phủ định của 行きます là 行かなかった.",
        "audioScript": ""
      },
      {
        "id": 22,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "あした 雨が ( 　 ) どうかわかりません。",
        "options": [
          "降ろう",
          "降って",
          "降るか",
          "降る"
        ],
        "correctIndex": 2,
        "explanation": "Câu hỏi gián tiếp lồng trong câu: [Thể thông thường] + かどうか わかりません (Tôi không biết ngày mai trời có mưa hay không).",
        "audioScript": ""
      },
      {
        "id": 23,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "父が 読んで ( 　 ) 新聞は これです。",
        "options": [
          "いました",
          "いよう",
          "いて",
          "いた"
        ],
        "correctIndex": 3,
        "explanation": "Mệnh đề bổ nghĩa cho danh từ 新聞 (tờ báo mà bố đang đọc lúc nãy) dùng thể thông thường: 読んでいた 新聞.",
        "audioScript": ""
      },
      {
        "id": 24,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "お金が ( 　 )、新しい パソコンを 買いたいです。",
        "options": [
          "あっても",
          "あったら",
          "あると",
          "あって"
        ],
        "correctIndex": 1,
        "explanation": "Mẫu câu điều kiện giả định: お金が あったら (Nếu có tiền, tôi muốn mua máy tính mới).",
        "audioScript": ""
      },
      {
        "id": 25,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "いくら ( 　 )、この カメラは 買いません。",
        "options": [
          "安くて",
          "安かったら",
          "安いと",
          "安くても"
        ],
        "correctIndex": 3,
        "explanation": "Phó từ いくら đi với ～ても (Cho dù rẻ bao nhiêu đi nữa tôi cũng không mua chiếc máy ảnh này).",
        "audioScript": ""
      },
      {
        "id": 26,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしの 母は 料理を ( 　 ) のが 好きです。",
        "options": [
          "作り",
          "作ります",
          "作る",
          "作って"
        ],
        "correctIndex": 2,
        "explanation": "Danh hóa động từ trước のが 好きです: [Vる] + のが 好きです (Mẹ tôi thích nấu ăn).",
        "audioScript": ""
      },
      {
        "id": 27,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きのうの パーティーは にぎやか( 　 )、楽しかったです。",
        "options": [
          "くて",
          "で",
          "な",
          "に"
        ],
        "correctIndex": 1,
        "explanation": "Nối hai tính từ mà vế đầu là tính từ đuôi な (にぎやか): にぎやかで、楽しかったです.",
        "audioScript": ""
      },
      {
        "id": 28,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "ここは 危ないですから、( 　 ) ください。",
        "options": [
          "入っては",
          "入らない",
          "入らなくて",
          "入らないで"
        ],
        "correctIndex": 3,
        "explanation": "Mẫu câu yêu cầu không làm gì: Vないで ください (Vì ở đây nguy hiểm nên xin đừng vào).",
        "audioScript": ""
      },
      {
        "id": 29,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは 友だちに 空港まで 送って ( 　 )。",
        "options": [
          "もらいました",
          "あげました",
          "やりました",
          "くれました"
        ],
        "correctIndex": 0,
        "explanation": "Chủ ngữ là わたしは, người làm hành động đi với に (友だちに) → Vて もらいました (Tôi được bạn tiễn ra sân bay).",
        "audioScript": ""
      },
      {
        "id": 30,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "来週の 日曜日に [ 　 ] [ 　 ] [ ★ ] [ 　 ] あります。",
        "options": [
          "試合が",
          "サッカーの",
          "大切な",
          "とても"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: とても 大切な サッカーの [試合が] あります. Vị trí [★] là 「試合が」.",
        "audioScript": ""
      },
      {
        "id": 31,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "わたしは [ 　 ] [ ★ ] [ 　 ] [ 　 ] 好きです。",
        "options": [
          "作った",
          "いちばん",
          "母が",
          "ケーキが"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: わたしは [母が] 作った ケーキが いちばん 好きです (Tôi thích nhất bánh ngọt do mẹ làm). Vị trí [★] là 「母が」.",
        "audioScript": ""
      },
      {
        "id": 32,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "道が わからない [ 　 ] [ 　 ] [ ★ ] [ 　 ] 聞いて ください。",
        "options": [
          "いる",
          "警官に",
          "近くの",
          "ときは"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: 道が わからない ときは 近くの 交番に いる [警官に] 聞いて ください. Vị trí [★] là 「警官に」.",
        "audioScript": ""
      },
      {
        "id": 33,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "時間が [ 　 ] [ ★ ] [ 　 ] [ 　 ] 行きましょう。",
        "options": [
          "タクシーで",
          "急いで",
          "ないですから",
          "駅まで"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: 時間が ないですから [タクシーで] 駅まで 急いで 行きましょう. Vị trí [★] là 「タクシーで」.",
        "audioScript": ""
      },
      {
        "id": 34,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36】\nわたしは 音楽が 大好きです。高校の ときから ずっと ピアノを [ 34 ] います。\n先週の 日曜日、市民ホールで ピアノの コンサートが ありました。わたしは 3か月 毎日 練習しましたが、ステージに 立った ときは とても 緊張しました。\nでも、友だちや 家族が 見に 来て [ 35 ] から、最後まで 上手に 弾くことが できました。コンサートが [ 36 ] あとで、みんなで レストランへ 行って ごはんを 食べました。\n\nCâu 34: Chọn từ thích hợp điền vào [ 34 ]:",
        "options": [
          "習った",
          "習う",
          "習い",
          "習って"
        ],
        "correctIndex": 3,
        "explanation": "[ 34 ]: ずっと ピアノを 習っています (học đàn piano suốt từ thời cấp 3 đến nay).",
        "audioScript": ""
      },
      {
        "id": 35,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「でも、友だちや 家族が 見に 来て [ 35 ] から、最後まで 上手に 弾くことが できました。」\n\nCâu 35: Chọn từ thích hợp điền vào [ 35 ]:",
        "options": [
          "もらった",
          "あげた",
          "やった",
          "くれた"
        ],
        "correctIndex": 3,
        "explanation": "[ 35 ]: Chủ ngữ 「友だちや家族が」 đến xem vì người nói → 見に来てくれたから (đứng trước から dùng thể thông thường くれた).",
        "audioScript": ""
      },
      {
        "id": 36,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「コンサートが [ 36 ] あとで、みんなで レストランへ 行って ごはんを 食べました。」\n\nCâu 36: Chọn từ thích hợp điền vào [ 36 ]:",
        "options": [
          "終わる",
          "終わり",
          "終わった",
          "終わって"
        ],
        "correctIndex": 2,
        "explanation": "[ 36 ]: Mẫu câu [Vた] + あとで (Sau khi buổi hòa nhạc kết thúc → 終わったあとで).",
        "audioScript": ""
      },
      {
        "id": 37,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【アパートの 掲示板】\n燃える ごみ（紙や 台所の ごみ）は 火曜日と 金曜日の 朝 8時までに 出してください。ペットボトルや 缶は 水曜日の 朝です。前の 日の 夜には 出さないでください。\n\n質問：ペットボトルは いつ 出しますか。",
        "options": [
          "火曜日の 夜",
          "水曜日の 夜",
          "火曜日と 金曜日の 朝",
          "水曜日の 朝 8時まで"
        ],
        "correctIndex": 3,
        "explanation": "Thông báo ghi rõ: Chai nhựa (ペットボトル) và lon đổ vào sáng Thứ Tư (水曜日の朝です), không được đem ra từ tối hôm trước.",
        "audioScript": ""
      },
      {
        "id": 38,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【メモ】\nワンさん、机の 上に ある 青い ファイルは 明日の 会議で 使いますから、本棚に 入れないで そのままに して おいてください。赤い ファイルは もう 使いませんから、本棚に 戻して ください。\n課長\n\n質問：ワンさんは 青い ファイルを どうしますか。",
        "options": [
          "本棚に 入れる。",
          "課長の 机へ 持って 行く。",
          "机の 上に そのまま 置いて おく。",
          "捨てる。"
        ],
        "correctIndex": 2,
        "explanation": "Tập hồ sơ màu xanh sẽ dùng cho cuộc họp ngày mai nên cứ để nguyên trên bàn (本棚に入れないでそのままにしておいてください).",
        "audioScript": ""
      },
      {
        "id": 39,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 9: Đọc hiểu đoạn văn vừa",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\n日本の 夏は とても 暑くて 蒸し暑いです。わたしの 国の 夏も 暑いですが、日本ほど 湿度が 高く ありません。だから、日本へ 来た ばかりの ときは、夜 なかなか 寝ることが できませんでした。友だちに 相談したら、「寝る 1時間 前に エアコンを つけて 部屋を 涼しく して おくと いいよ」と 教えて くれました。今は その やり方で 毎晩 よく 寝ることが できます。\n\n質問：この 人は 今、夜 寝る 前に どうしていますか。",
        "options": [
          "エアコンを つけないで 寝る。",
          "一晩中 冷たい シャワーを 浴びる。",
          "窓を 全部 開けて 風を 入れる。",
          "寝る 1時間 前に エアコンを つけて 部屋を 涼しく する。"
        ],
        "correctIndex": 3,
        "explanation": "Người bạn khuyên bật điều hòa trước khi ngủ 1 tiếng để làm mát phòng, và hiện tại người viết đang áp dụng cách đó mỗi tối (今はそのやり方で毎晩よく寝ることができます).",
        "audioScript": ""
      },
      {
        "id": 40,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 10: Tìm kiếm thông tin",
        "question": "【さくらカメラ店の セール案内】\n・期間：10月1日（金）～ 10月5日（火）\n・カメラA（初心者用・軽い）：25,000円（学生は 2,000円 引き）\n・カメラB（プロ用・レンズ2個）：60,000円（学生も 同じ 値段）\n・期間中に カメラを 買った 人 全員に「カメラケース」を プレゼント！\n\n質問：大学生の ナムさんは 10月3日に カメラAを 買います。いくら 払いますか。また、何を もらえますか。",
        "options": [
          "25,000円・カメラケース",
          "58,000円・カメラケース",
          "23,000円・カメラケース",
          "23,000円・レンズ"
        ],
        "correctIndex": 2,
        "explanation": "Nam là sinh viên mua Camera A (25,000円, sinh viên được giảm 2,000円 → 23,000円) vào ngày 3/10 (trong đợt sale 1/10~5/10) nên được tặng thêm bao đựng máy ảnh (カメラケース).",
        "audioScript": ""
      },
      {
        "id": 41,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc hội thoại tại tiệm cắt tóc.\n質問：男の人は どんな 髪型に なりますか。",
        "options": [
          "全体を とても 短く する",
          "前髪だけ 少し 切る",
          "横と 後ろだけ 短く する",
          "何も 切らないで 洗うだけ"
        ],
        "correctIndex": 2,
        "explanation": "Người nam nói: Phía trước giữ nguyên độ dài, chỉ cắt ngắn hai bên và phía sau cho gọn (前はあまり切らないで、横と後ろだけ短くしてください).",
        "audioScript": "美容院で男の人と店の人が話しています。男の人はどんな髪型になりますか。 女：いらっしゃいませ。今日はどうなさいますか。 男：そうですね、来週面接がありますから、すっきりしたいんですが、前髪はあまり切らないで、横と後ろだけ短くしてください。 女：かしこまりました。 男の人はどんな髪型になりますか。"
      },
      {
        "id": 42,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện giữa hai vợ chồng trước khi ra ngoài.\n質問：女の人は 出かける 前に 何を しますか。",
        "options": [
          "エアコンを 消す",
          "タクシーを 呼ぶ",
          "テレビを 消す",
          "2階の 窓を 閉める"
        ],
        "correctIndex": 3,
        "explanation": "Người chồng đã tắt điều hòa và tivi rồi, nhưng cửa sổ tầng 2 vẫn đang mở nên nhờ vợ lên đóng giúp (2階の窓がまだ開いているから、閉めてきてくれない？).",
        "audioScript": "家で男の人と女の人が出かける前に話しています。女の人は出かける前に何をしますか。 男：そろそろ時間だよ。出かけよう。 女：ちょっと待って。テレビとエアコンは消した？ 男：うん、消したよ。あ、でも2階の窓がまだ開いているから、閉めてきてくれない？僕は先に靴を履いているから。 女：わかったわ。 女の人は出かける前に何をしますか。"
      },
      {
        "id": 43,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe nhân viên thư viện hướng dẫn.\n質問：女の人は いつまでに 本を 返さなければ なりませんか。",
        "options": [
          "再来週の 火曜日",
          "来週の 火曜日",
          "来週の 水曜日",
          "今週の 金曜日"
        ],
        "correctIndex": 1,
        "explanation": "Bình thường được mượn 2 tuần, nhưng cuốn tạp chí mới này chỉ được mượn 1 tuần, hôm nay là Thứ Ba nên hạn trả là Thứ Ba tuần sau (来週の火曜日までに返してください).",
        "audioScript": "図書館で女の人と係の人が話しています。女の人はいつまでにこれを返さなければなりませんか。 女：すみません、この新しい雑誌を借りたいんですが。 男：はい、普通の本の貸出は二週間ですが、新しい雑誌は一週間だけです。今日は火曜日ですから、来週の火曜日までに返してくださいね。 女：はい、わかりました。 女の人はいつまでに返さなければなりませんか。"
      },
      {
        "id": 44,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc hội thoại tại nhà hàng.\n質問：二人は 飲み物を 何にしますか。",
        "options": [
          "アイスコーヒー 2つ",
          "オレンジジュース 1つと 紅茶 1つ",
          "ホットコーヒー 2つ",
          "アイスコーヒー 1つと ホットコーヒー 1つ"
        ],
        "correctIndex": 3,
        "explanation": "Người nam chọn cà phê đá (アイスコーヒー), người nữ chọn cà phê nóng (ホットコーヒー) → 1 đá, 1 nóng.",
        "audioScript": "レストランで男の人と女の人が注文しています。二人は飲み物を何にしますか。 男：食後の飲み物は何にする？僕はアイスコーヒーにしようかな。 女：私は少し寒いから、温かいコーヒーにするわ。 男：すみません、アイスコーヒーを一つと、ホットコーヒーを一つお願いします。 二人は飲み物を何にしますか。"
      },
      {
        "id": 45,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về việc học nấu ăn.\n質問：女の人は 誰に 日本料理の 作り方を 習いましたか。",
        "options": [
          "日本人の ボーイフレンド",
          "料理学校の 先生",
          "インターネットの 動画",
          "ホームステイの お母さん"
        ],
        "correctIndex": 3,
        "explanation": "Cô ấy không đi trường dạy nấu ăn mà được người mẹ trong gia đình homestay năm ngoái dạy cho (去年ホームステイしたとき、日本のお母さんに教えてもらったんです).",
        "audioScript": "男の人と女の人が料理について話しています。女の人は誰に日本料理の作り方を習いましたか。 男：わあ、この肉じゃが、とてもおいしいですね。料理学校で習ったんですか。 女：いいえ、去年ホームステイしたとき、ホストファミリーのお母さんに教えてもらったんです。 女の人は誰に日本料理の作り方を習いましたか。"
      },
      {
        "id": 46,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe dự báo thời tiết trên radio.\n質問：あしたの 午後の 天気は どうなりますか。",
        "options": [
          "雪が 降る",
          "雨が 降る",
          "一日中 曇り",
          "よく 晴れる"
        ],
        "correctIndex": 1,
        "explanation": "Buổi sáng trời nắng, nhưng từ buổi chiều mây kéo đến và sẽ có mưa (午後からは雨が降るでしょう).",
        "audioScript": "ラジオで天気予報を聞いています。あしたの午後の天気はどうなりますか。 明日の東京の天気です。朝のうちはよく晴れますが、昼すぎから曇りになって、午後からは雨が降るでしょう。お出かけの時は傘をお持ちください。 あしたの午後の天気はどうなりますか。"
      },
      {
        "id": 47,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe cuộc trò chuyện về bài kiểm tra.\n質問：男の人は どうして テストの 点が 悪かったですか。",
        "options": [
          "問題の 意味を 間違えて 読んだから",
          "ぜんぜん 勉強しなかったから",
          "消しゴムを 忘れたから",
          "テストの 時間に 遅れたから"
        ],
        "correctIndex": 0,
        "explanation": "Người nam có học bài kỹ, nhưng lúc làm bài vì vội quá nên đã đọc nhầm yêu cầu câu hỏi (急いでいたから、問題の意味を間違えて読んでしまったんだ).",
        "audioScript": "女の人と男の人がテストの結果について話しています。男の人はどうしてテストの点が悪かったですか。 女：トムさん、きのうの文法テスト、どうだった？よく勉強していたよね。 男：うん、勉強はしたんだけど、テストのとき急いでいたから、問題の意味を間違えて読んでしまったんだ。 女：あら、それは残念だったね。 男の人はどうしてテストの点が悪かったですか。"
      },
      {
        "id": 48,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại hỏi số điện thoại.\n質問：スポーツセンターの 電話番号は 何番ですか。",
        "options": [
          "03-5342-1089",
          "03-5432-1098",
          "03-5423-1089",
          "03-5432-1089"
        ],
        "correctIndex": 3,
        "explanation": "Số điện thoại đọc trong băng: 「ゼロサン、ゴヨンサンニの、イチゼロハチキュウ」(03-5432-1089).",
        "audioScript": "男の人と女の人が話しています。スポーツセンターの電話番号は何番ですか。 男：すみません、市民スポーツセンターの電話番号を知っていますか。 女：ええ、メモがありますよ。ゼロサン、ゴヨンサンニの、イチゼロハチキュウです。 男：ゼロサン、ゴヨンサンニの、イチゼロハチキュウですね。ありがとうございます。 スポーツセンターの電話番号は何番ですか。"
      },
      {
        "id": 49,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの 家で ごはんを ごちそうに なりました。帰る とき、お礼を 言います。何と 言いますか。",
        "options": [
          "どうも すみませんでした。",
          "今日は いただきます。また 作って ください。",
          "今日は ごちそうさまでした。とても おいしかったです。",
          "お先に 失礼します。おつかれさまでした。"
        ],
        "correctIndex": 2,
        "explanation": "Khi được chiêu đãi bữa ăn ở nhà bạn, lúc về ta cảm ơn: 「今日はごちそうさまでした。とてもおいしかったです」.",
        "audioScript": "友だちの家で晩ごはんをごちそうになりました。帰るとき、お礼を言います。何と言いますか。 1. どうも すみませんでした。 2. 今日は いただきます。また 作って ください。 3. 今日は ごちそうさまでした。とても おいしかったです。 4. お先に 失礼します。おつかれさまでした。"
      },
      {
        "id": 50,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：服の 店で、この シャツを 着て みたいです。店員に 何と 言いますか。",
        "options": [
          "すみません、これを 着て ください。",
          "すみません、これを 見せて あげますか。",
          "すみません、これを 着て みても いいですか。",
          "すみません、これを 買っても いいですか。"
        ],
        "correctIndex": 2,
        "explanation": "Khi muốn mặc thử quần áo (Vてみます + てもいいですか): 「すみません、これを着てみてもいいですか」.",
        "audioScript": "服の店で、このシャツを着てみたいです。店員に何と言いますか。 1. すみません、これを 着て ください。 2. すみません、これを 見せて あげますか。 3. すみません、これを 着て みても いいですか。 4. すみません、これを 買っても いいですか。"
      },
      {
        "id": 51,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：約束の 時間に 10分 遅れました。友だちに 会った とき、まず 何と 言いますか。",
        "options": [
          "おげんきですか。",
          "ありがとう、早かったですね。",
          "さようなら、また あした。",
          "ごめん、遅くなって すみません。"
        ],
        "correctIndex": 3,
        "explanation": "Khi trễ giờ hẹn, câu đầu tiên gặp bạn là xin lỗi vì đã đến muộn: 「ごめん、遅くなってすみません」.",
        "audioScript": "約束の時間に10分遅れました。友だちに会ったとき、まず何と言いますか。 1. おげんきですか。 2. ありがとう、早かったですね。 3. さようなら、また あした。 4. ごめん、遅くなって すみません。"
      },
      {
        "id": 52,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、駅の 近くに 銀行が ありますか。」",
        "options": [
          "ええ、北口を 出て すぐ 右に ありますよ。",
          "いいえ、駅では ありません。",
          "ええ、お金を おろします。",
          "はい、銀行へ 行きました。"
        ],
        "correctIndex": 0,
        "explanation": "Hỏi có ngân hàng gần ga không → Trả lời có và chỉ vị trí ở ngay bên phải lối ra cửa Bắc.",
        "audioScript": "すみません、駅の近くに銀行がありますか。 1. ええ、北口を 出て すぐ 右に ありますよ。 2. いいえ、駅では ありません。 3. ええ、お金を おろします。 4. はい、銀行へ 行きました。"
      },
      {
        "id": 53,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「どうぞ お入り ください。」",
        "options": [
          "いらっしゃいませ。",
          "しつれいします。",
          "ごめんください。",
          "おかえりなさい。"
        ],
        "correctIndex": 1,
        "explanation": "Khi chủ nhà/phòng mời 「どうぞお入りください」(Xin mời vào), khách đáp 「しつれいします」(Xin phép ạ).",
        "audioScript": "どうぞお入りください。 1. いらっしゃいませ。 2. しつれいします。 3. ごめんください。 4. おかえりなさい。"
      },
      {
        "id": 54,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「来週の 旅行、山田さんも 行きますよね。」",
        "options": [
          "ええ、京都でした。",
          "はい、行きましたよ。",
          "いいえ、旅行が 好きです。",
          "ええ、その つもりです。"
        ],
        "correctIndex": 3,
        "explanation": "Câu hỏi xác nhận dự định chuyến đi tuần tới → 「ええ、そのつもりです」(Vâng, tôi dự định như vậy).",
        "audioScript": "来週の旅行、山田さんも行きますよね。 1. ええ、京都でした。 2. はい、行きましたよ。 3. いいえ、旅行が 好きです。 4. ええ、その つもりです。"
      },
      {
        "id": 55,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「この ケーキ、わたしが 作ったんです。どうぞ。」",
        "options": [
          "どういたしまして。",
          "わあ、おいしそうですね。いただきます。",
          "いいえ、まだ 食べて いません。",
          "はい、わたしが 作りました。"
        ],
        "correctIndex": 1,
        "explanation": "Khi được mời ăn chiếc bánh tự làm, lời khen và nhận lời lịch sự là 「わあ、おいしそうですね。いただきます」.",
        "audioScript": "このケーキ、わたしが作ったんです。どうぞ。 1. どういたしまして。 2. わあ、おいしそうですね。いただきます。 3. いいえ、まだ 食べて いません。 4. はい、わたしが 作りました。"
      }
    ]
  },
  {
    "id": "test_n5_05",
    "title": "Đề thi thử JLPT N5 - Đề số 5 (Tổng hợp 3 kỹ năng - Sát đề thật)",
    "description": "Đề thi tổng duyệt 3 phần chuẩn JLPT N5 (55 câu): Bao quát toàn bộ 25 bài Minna no Nihongo, câu sao (★), đọc hiểu tìm kiếm thông tin và 15 câu Nghe hiểu nâng cao.",
    "durationMinutes": 90,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "来年 日本へ [留学]したいです。",
        "options": [
          "ろうがく",
          "りゅうがく",
          "るがく",
          "りゅがく"
        ],
        "correctIndex": 1,
        "explanation": "[留学] (Lưu Học - du học) đọc là 「りゅうがく」.",
        "audioScript": ""
      },
      {
        "id": 2,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "電車が 7時に 駅に [着きます]。",
        "options": [
          "あきます",
          "いきます",
          "つきます",
          "きます"
        ],
        "correctIndex": 2,
        "explanation": "[着きます] (đến nơi) đọc là 「つきます」.",
        "audioScript": ""
      },
      {
        "id": 3,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "わたしの [田舎]は とても 静かです。",
        "options": [
          "まち",
          "たなか",
          "でんしゃ",
          "いなか"
        ],
        "correctIndex": 3,
        "explanation": "[田舎] (quê hương / nông thôn) đọc đặc biệt là 「いなか」.",
        "audioScript": ""
      },
      {
        "id": 4,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この [道]を まっすぐ 行って ください。",
        "options": [
          "みち",
          "まち",
          "はし",
          "かど"
        ],
        "correctIndex": 0,
        "explanation": "[道] (Đạo - con đường) đọc là 「みち」.",
        "audioScript": ""
      },
      {
        "id": 5,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "兄は [病院]で 働いて います。",
        "options": [
          "びょういん",
          "ひょういん",
          "びょいん",
          "びよういん"
        ],
        "correctIndex": 0,
        "explanation": "[病院] (Bệnh Viện) đọc là 「びょういん」. Chú ý [美容院] (びよういん) là tiệm làm tóc.",
        "audioScript": ""
      },
      {
        "id": 6,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "[今月]は 仕事が とても 忙しいです。",
        "options": [
          "らいげつ",
          "いまつき",
          "こんげつ",
          "せんげつ"
        ],
        "correctIndex": 2,
        "explanation": "[今月] (Kim Nguyệt - tháng này) đọc là 「こんげつ」.",
        "audioScript": ""
      },
      {
        "id": 7,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 1: Cách đọc Kanji",
        "question": "この 漢字の [読み方]を 教えて ください。",
        "options": [
          "みるかた",
          "よみかた",
          "よみがた",
          "かきかた"
        ],
        "correctIndex": 1,
        "explanation": "[読み方] (cách đọc) đọc là 「よみかた」.",
        "audioScript": ""
      },
      {
        "id": 8,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "よく [かんがえて]から 答えて ください。",
        "options": [
          "考えて",
          "孝えて",
          "教えて",
          "老えて"
        ],
        "correctIndex": 0,
        "explanation": "かんがえて (suy nghĩ) viết bằng Kanji là [考えて] (Khảo).",
        "audioScript": ""
      },
      {
        "id": 9,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "毎晩 [おんがく]を 聞きます。",
        "options": [
          "音楽",
          "音楽し",
          "言楽",
          "暗楽"
        ],
        "correctIndex": 0,
        "explanation": "おんがく (âm nhạc) viết bằng Kanji là [音楽] (Âm Nhạc).",
        "audioScript": ""
      },
      {
        "id": 10,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "あしたは [てんき]が いいと 思います。",
        "options": [
          "天気",
          "元気",
          "電気",
          "大気"
        ],
        "correctIndex": 0,
        "explanation": "てんき (thời tiết) viết bằng Kanji là [天気] (Thiên Khí).",
        "audioScript": ""
      },
      {
        "id": 11,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "父は [まいあさ] ジョギングを します。",
        "options": [
          "毎明",
          "海朝",
          "母朝",
          "毎朝"
        ],
        "correctIndex": 3,
        "explanation": "まいあさ (mỗi sáng) viết bằng Kanji là [毎朝] (Mỗi Triều).",
        "audioScript": ""
      },
      {
        "id": 12,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 2: Cách viết Kanji / Katakana",
        "question": "誕生日に [チョコレート]を もらいました。",
        "options": [
          "チョコレート",
          "チョユレート",
          "チュコレート",
          "チョコヒート"
        ],
        "correctIndex": 0,
        "explanation": "チョコレート (sô-cô-la - chocolate).",
        "audioScript": ""
      },
      {
        "id": 13,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "お金が ( 　 ) から、この 本を 買うことが できません。",
        "options": [
          "かかりません",
          "ありません",
          "たりません",
          "いりません"
        ],
        "correctIndex": 2,
        "explanation": "お金が たりません: không đủ tiền.",
        "audioScript": ""
      },
      {
        "id": 14,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "パソコンが ( 　 ) ですから、買い替えたいです。",
        "options": [
          "つかれた",
          "こしょうした",
          "なおった",
          "やすんだ"
        ],
        "correctIndex": 1,
        "explanation": "こしょうした (bị hỏng): máy tính bị hỏng nên muốn mua đổi cái mới.",
        "audioScript": ""
      },
      {
        "id": 15,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "交差点の 角を 右へ ( 　 ) ください。",
        "options": [
          "わたって",
          "とまって",
          "まがって",
          "のぼって"
        ],
        "correctIndex": 2,
        "explanation": "角を 右へ まがってください: Hãy rẽ phải ở góc ngã tư.",
        "audioScript": ""
      },
      {
        "id": 16,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "来月 友だちが 結婚しますから、お祝いを ( 　 )。",
        "options": [
          "あげます",
          "もらいます",
          "かります",
          "くれます"
        ],
        "correctIndex": 0,
        "explanation": "Tháng sau bạn kết hôn nên tôi sẽ tặng quà mừng (お祝いを あげます).",
        "audioScript": ""
      },
      {
        "id": 17,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 3: Điền từ vào câu",
        "question": "飛行機の 時間が ありませんから、( 　 ) 行きましょう。",
        "options": [
          "いそいで",
          "ゆっくり",
          "ぜんぶ",
          "だんだん"
        ],
        "correctIndex": 0,
        "explanation": "Vì sắp hết giờ ra máy bay nên hãy đi nhanh/khẩn trương (いそいで 行きましょう).",
        "audioScript": ""
      },
      {
        "id": 18,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "宿題が ぜんぶ 終わりました。",
        "options": [
          "宿題が まだ 終わりません。",
          "宿題が 少し 終わりました。",
          "宿題が 半分 終わりました。",
          "宿題が みんな 終わりました。"
        ],
        "correctIndex": 3,
        "explanation": "ぜんぶ (toàn bộ / tất cả) đồng nghĩa với みんな (tất cả).",
        "audioScript": ""
      },
      {
        "id": 19,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "わたしは 自分で 晩ごはんを 作ります。",
        "options": [
          "わたしは 一人で 晩ごはんを 作ります。",
          "わたしは 晩ごはんを 買いに 行きます。",
          "わたしは 母と 晩ごはんを 作ります。",
          "わたしは レストランで 晩ごはんを 食べます。"
        ],
        "correctIndex": 0,
        "explanation": "自分で 作ります (tự mình nấu) gần nghĩa nhất với 一人で 作ります (nấu một mình không nhờ ai).",
        "audioScript": ""
      },
      {
        "id": 20,
        "section": "文字・語彙 (Chữ Hán - Từ vựng)",
        "category": "Mondai 4: Câu có nghĩa tương tự",
        "question": "この 辞書は とても 便利です。",
        "options": [
          "この 辞書は とても 使いやすいです。",
          "この 辞書は とても 古いです。",
          "この 辞書は とても 重いです。",
          "この 辞書は とても 高いです。"
        ],
        "correctIndex": 0,
        "explanation": "便利 (tiện lợi) gần nghĩa nhất với 使いやすい (dễ sử dụng).",
        "audioScript": ""
      },
      {
        "id": 21,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "日本へ ( 　 )、着物を 着て みたいです。",
        "options": [
          "行くなら",
          "行ったら",
          "行ったと",
          "行っても"
        ],
        "correctIndex": 1,
        "explanation": "Vたら: Khi đến Nhật, tôi muốn mặc thử Kimono (日本へ 行ったら).",
        "audioScript": ""
      },
      {
        "id": 22,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "説明を ( 　 )、使い方が よく わかりません。",
        "options": [
          "聞くと",
          "聞いても",
          "聞いてから",
          "聞いたら"
        ],
        "correctIndex": 1,
        "explanation": "Vても (Cho dù... nhưng vẫn...): Dù đã nghe giải thích nhưng tôi vẫn không hiểu rõ cách dùng.",
        "audioScript": ""
      },
      {
        "id": 23,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "先生は わたしに 日本の 歴史を 教えて ( 　 )。",
        "options": [
          "いたしました",
          "あげました",
          "もらいました",
          "くださいました"
        ],
        "correctIndex": 3,
        "explanation": "Chủ ngữ là 先生は làm hành động cho わたしに → くれます / kính ngữ là くださいます (教えて くださいました).",
        "audioScript": ""
      },
      {
        "id": 24,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "お父さんは いま 部屋で 新聞を ( 　 ) と 思います。",
        "options": [
          "読んで いる",
          "読みます",
          "読んだ",
          "読んで います"
        ],
        "correctIndex": 0,
        "explanation": "Trước と思います dùng thể thông thường. Đang đọc báo bây giờ (いま) → 読んでいると思います.",
        "audioScript": ""
      },
      {
        "id": 25,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "きのう 買った ケーキは あまり ( 　 ) です。",
        "options": [
          "おいしくなかった",
          "おいしくないでした",
          "おいしかった",
          "おいしいじゃなかった"
        ],
        "correctIndex": 0,
        "explanation": "あまり + phủ định quá khứ tính từ い: おいしくなかったです (đã không ngon lắm).",
        "audioScript": ""
      },
      {
        "id": 26,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "あの 交差点を 左( 　 ) 曲がると、郵便局が あります。",
        "options": [
          "から",
          "へ",
          "を",
          "で"
        ],
        "correctIndex": 1,
        "explanation": "曲がります đi với trợ từ へ hoặc に chỉ hướng rẽ (左へ 曲がる: rẽ trái).",
        "audioScript": ""
      },
      {
        "id": 27,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "わたしは パソコンが ( 　 ) から、レポートを 手で 書きました。",
        "options": [
          "いない",
          "ないでした",
          "ありませんでした",
          "ない"
        ],
        "correctIndex": 3,
        "explanation": "Trước から dùng thể thông thường hoặc lịch sự phù hợp: パソコンが ないから (vì không có máy tính).",
        "audioScript": ""
      },
      {
        "id": 28,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "パスポートを ( 　 ) なければ、外国へ 行くことが できません。",
        "options": [
          "持た",
          "持って",
          "持ち",
          "持つ"
        ],
        "correctIndex": 0,
        "explanation": "持ちます → 持たない → 持たなければ (Nếu không mang hộ chiếu thì không thể đi nước ngoài).",
        "audioScript": ""
      },
      {
        "id": 29,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 5: Ngữ pháp & Trợ từ",
        "question": "赤いのと 青いのと、( 　 ) が いいですか。",
        "options": [
          "どの",
          "どれ",
          "どこ",
          "どちら"
        ],
        "correctIndex": 3,
        "explanation": "Khi lựa chọn giữa 2 thứ (赤いのと 青いのと), dùng nghi vấn từ 「どちら」.",
        "audioScript": ""
      },
      {
        "id": 30,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "年を [ 　 ] [ ★ ] [ 　 ] [ 　 ] 住みたいです。",
        "options": [
          "取ったら",
          "空気の きれいな",
          "静かな",
          "田舎に"
        ],
        "correctIndex": 2,
        "explanation": "Thứ tự đúng: 年を 取ったら [静かな] 空気の きれいな 田舎に 住みたいです. Vị trí [★] là 「静かな」.",
        "audioScript": ""
      },
      {
        "id": 31,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "友達が 引っ越しを [ 　 ] [ 　 ] [ ★ ] [ 　 ] 終わりました。",
        "options": [
          "くれたから",
          "とても",
          "手伝って",
          "早く"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: 友達が 引っ越しを 手伝って くれたから [とても] 早く 終わりました. Vị trí [★] là 「くれたから」 hoặc 「早く」. Theo chuẩn: 手伝って くれたから とても 早く → [★] ở vị trí 3 là 「早く」/「くれたから」.",
        "audioScript": ""
      },
      {
        "id": 32,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "日本語で [ 　 ] [ ★ ] [ 　 ] [ 　 ] むずかしいです。",
        "options": [
          "のは",
          "手紙を",
          "とても",
          "書く"
        ],
        "correctIndex": 3,
        "explanation": "Thứ tự đúng: 日本語で 手紙を [書く] のは とても むずかしいです (Việc viết thư bằng tiếng Nhật rất khó). Vị trí [★] là 「書く」.",
        "audioScript": ""
      },
      {
        "id": 33,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 6: Sắp xếp câu dấu sao (★)",
        "question": "もし 1億円 [ 　 ] [ 　 ] [ ★ ] [ 　 ] したいです。",
        "options": [
          "世界を",
          "みんなで",
          "あったら",
          "家族と 旅行"
        ],
        "correctIndex": 0,
        "explanation": "Thứ tự đúng: もし 1億円 あったら 家族と みんなで [世界を] 旅行 したいです. Vị trí [★] là 「世界を」.",
        "audioScript": ""
      },
      {
        "id": 34,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36】\n来月、同じ 会社の 田中さんが 大阪へ 転勤します。田中さんは わたしが 会社に 入った ときから、いろいろな 仕事を 親切に 教えて [ 34 ]。\n仕事で 失敗した ときも、「大丈夫だよ、また 頑張ろう」と 言って くれました。だから、田中さんが 大阪へ [ 35 ] のは とても 寂しいです。\n今週の 金曜日に みんなで 送別会を します。[ 36 ]、もし 大阪へ 行く チャンスが あったら、ぜひ 田中さんに 会いに 行きたいです。\n\nCâu 34: Chọn từ thích hợp điền vào [ 34 ]:",
        "options": [
          "やりました",
          "あげました",
          "もらいました",
          "くれました"
        ],
        "correctIndex": 3,
        "explanation": "[ 34 ]: Chủ ngữ là 田中さんは đã tận tình chỉ việc cho tôi → 教えて くれました.",
        "audioScript": ""
      },
      {
        "id": 35,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「だから、田中さんが 大阪へ [ 35 ] のは とても 寂しいです。」\n\nCâu 35: Chọn từ thích hợp điền vào [ 35 ]:",
        "options": [
          "行く",
          "行きます",
          "行こう",
          "行って"
        ],
        "correctIndex": 0,
        "explanation": "[ 35 ]: Danh hóa mệnh đề trước のは 寂しいです dùng thể thông thường: 行くのは とても 寂しいです.",
        "audioScript": ""
      },
      {
        "id": 36,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 7: Ngữ pháp đoạn văn",
        "question": "【Đoạn văn câu 34–36 (tiếp)】\n「今週の 金曜日に みんなで 送別会を します。[ 36 ]、もし 大阪へ 行く チャンスが あったら、ぜひ 田中さんに 会いに 行きたいです。」\n\nCâu 36: Chọn từ thích hợp điền vào [ 36 ]:",
        "options": [
          "おととい",
          "これから",
          "さっき",
          "きのう"
        ],
        "correctIndex": 1,
        "explanation": "[ 36 ]: Nói về tương lai từ nay về sau: 「これから」(Từ nay về sau, nếu có cơ hội đi Osaka...).",
        "audioScript": ""
      },
      {
        "id": 37,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【料理教室の 案内】\n今月の カレー教室は 11月20日（土）の 10時からです。参加費は 1,000円です。野菜や 肉は 教室で 用意しますから、エプロンと タオルだけ 持って 来て ください。\n\n質問：参加する 人は 何を 持って 行かなければ なりませんか。",
        "options": [
          "タオルと 料理の 本",
          "エプロンと カレーの 皿だけ",
          "参加費 1,000円と エプロンと タオル",
          "野菜と 肉と エプロン"
        ],
        "correctIndex": 2,
        "explanation": "Theo thông báo: Lệ phí tham gia 1,000 yên; rau và thịt lớp đã chuẩn bị sẵn, học viên chỉ cần mang tạp dề (エプロン) và khăn (タオル).",
        "audioScript": ""
      },
      {
        "id": 38,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 8: Đọc hiểu đoạn ngắn",
        "question": "【駅前の 自転車置き場の 注意】\nここは 2時間まで 無料です。2時間を 過ぎると、1日 100円 かかります。赤い 線の 中には 止めないで、白い 線の 中に 並べて 止めて ください。\n\n質問：自転車を 3時間 止めたい 人は どうしますか。",
        "options": [
          "白い 線の 中に 止めて、お金は 払わなくても いい。",
          "2時間 しか 止めることが できない。",
          "白い 線の 中に 止めて、100円 払う。",
          "赤い 線の 中に 止めて、100円 払う。"
        ],
        "correctIndex": 2,
        "explanation": "Đỗ xe đến 2 tiếng thì miễn phí, quá 2 tiếng (3 tiếng) tốn 100 yên/ngày và phải đỗ trong vạch trắng (白い線の中に並べて止めてください).",
        "audioScript": ""
      },
      {
        "id": 39,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 9: Đọc hiểu đoạn văn vừa",
        "question": "【Đọc đoạn văn sau và trả lời câu hỏi】\nわたしは 毎日 電車で 大学へ 通って います。電車に 乗って いる 時間は 40分ぐらいです。以前は 電車の中で ゲームを したり 寝たり して いましたが、先月から 漢字の 本を 読む ことに しました。毎日 5つずつ 新しい 漢字を 覚えます。1か月 続けたら、150ぐらいの 漢字が 読めるように なりました。新聞や 駅の 看板が 少しずつ わかるように なって、とても うれしいです。\n\n質問：この 人は 先月から 電車の中で 何を して いますか。",
        "options": [
          "友だちと 日本語で 話して いる。",
          "新聞を 毎日 1冊 読んで いる。",
          "スマートフォンで ゲームを したり 寝たり して いる。",
          "漢字の 本を 読んで、毎日 5つずつ 漢字を 覚えて いる。"
        ],
        "correctIndex": 3,
        "explanation": "Trước đây người này chơi game hoặc ngủ trên tàu, nhưng từ tháng trước đã quyết định đọc sách Kanji và học thuộc mỗi ngày 5 chữ.",
        "audioScript": ""
      },
      {
        "id": 40,
        "section": "文法・読解 (Ngữ pháp - Đọc hiểu)",
        "category": "Mondai 10: Tìm kiếm thông tin",
        "question": "【みどりホテル 宿泊プラン】\n・シングル（1人部屋）：1泊 6,500円（朝食つき ＋800円）\n・ツイン（2人部屋）：1泊 11,000円（2人分の 値段・朝食 無料）\n・チェックイン：15:00から ／ チェックアウト：10:00まで\n※金曜・土曜に 泊まる 場合は、1部屋 ＋1,000円に なります。\n\n質問：出張で 木曜日に 1人で シングルに 1泊します。朝食も つけます。いくらに なりますか。",
        "options": [
          "7,300円",
          "6,500円",
          "8,300円",
          "11,000円"
        ],
        "correctIndex": 0,
        "explanation": "Nghỉ tối Thứ Năm (木曜日 - không phụ thu 1,000円 của T6/T7) phòng đơn 1 người: 6,500円 + ăn sáng 800円 = 7,300円.",
        "audioScript": ""
      },
      {
        "id": 41,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc trò chuyện tại cửa hàng hoa.\n質問：男の人は どの 花を 買いますか。",
        "options": [
          "赤い バラの 花束",
          "ピンクの 花だけ",
          "黄色い 花と 白い 花の セット",
          "白い 花と 赤い 花の セット"
        ],
        "correctIndex": 2,
        "explanation": "Tặng mẹ nhân dịp sinh nhật, mẹ thích màu vàng nên người nam chọn bó kết hợp hoa vàng và hoa trắng (その黄色い花と白い花のセットをください).",
        "audioScript": "花屋で男の人と店員が話しています。男の人はどの花を買いますか。 男：すみません、母の誕生日に花をあげたいんですが。 女：赤いバラやピンクの花はいかがですか。 男：母は黄色が好きなんです。あそこにある黄色い花はきれいですね。 女：ええ、こちらは黄色い花と白い花のセットになっております。 男：いいですね。じゃあ、それをください。 男の人はどの花を買いますか。"
      },
      {
        "id": 42,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe giáo viên dặn học sinh trước buổi dã ngoại.\n質問：雨が 降ったら、集合場所は どこに なりますか。",
        "options": [
          "駅の 前の 広場",
          "学校の 体育館",
          "自分の 教室",
          "バスの 駐車場"
        ],
        "correctIndex": 1,
        "explanation": "Nếu trời nắng tập trung ở quảng trường trước ga, nhưng nếu trời mưa sẽ tập trung ở nhà thi đấu của trường (雨が降ったら、学校の体育館に集まってください).",
        "audioScript": "先生が明日の遠足について話しています。雨が降ったら、集合場所はどこになりますか。 先生：明日の遠足ですが、晴れたら朝8時半に駅の前の広場に集まってください。もし雨が降ったら、遠足は中止ではなくて、バスで博物館へ行きますから、学校の体育館に集まってください。 雨が降ったら、集合場所はどこになりますか。"
      },
      {
        "id": 43,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc hội thoại giữa hai đồng nghiệp.\n質問：女の人は 帰る 前に 何を しなければ なりませんか。",
        "options": [
          "部長に メールを 送る",
          "資料を 印刷する",
          "会議室の 机を 元の 場所に 戻す",
          "エアコンを つける"
        ],
        "correctIndex": 2,
        "explanation": "Tài liệu đã in xong, chỉ còn việc xếp lại bàn trong phòng họp về vị trí cũ trước khi về (帰る前に会議室の机を元の場所に戻しておいてね).",
        "audioScript": "会社で男の人と女の人が話しています。女の人は帰る前に何をしますか。 女：先輩、明日の資料の印刷が終わりました。もう帰ってもいいですか。 男：ありがとう。あ、帰る前に、さっき使った会議室の机を元の場所に戻しておいてね。僕も手伝うよ。 女：はい、わかりました！ 女の人は帰る前に何をしますか。"
      },
      {
        "id": 44,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện tại quầy lễ tân phòng khám.\n質問：男の人は 次に 何を しますか。",
        "options": [
          "2階の 検査室へ 行く",
          "ソファーに 座って 名前を 呼ばれるまで 待つ",
          "薬局へ 薬を もらいに 行く",
          "体温計を 買いに 行く"
        ],
        "correctIndex": 1,
        "explanation": "Sau khi nộp thẻ bảo hiểm và đo nhiệt độ xong, y tá bảo anh ấy ngồi ở ghế sofa đợi đến khi được gọi tên (あちらのソファーに座って、名前を呼ばれるまでお待ちください).",
        "audioScript": "病院の受付で男の人と受付の人が話しています。男の人は次に何をしますか。 男：すみません、熱を測りました。37度5分でした。 女：はい、ありがとうございます。保険証はお返ししますね。あちらのソファーに座って、お名前を呼ばれるまでしばらくお待ちください。 男の人は次に何をしますか。"
      },
      {
        "id": 45,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về việc chuyển nhà.\n質問：新しい アパートで 女の人が 一番 気に入って いる ことは 何ですか。",
        "options": [
          "駅から 近くて スーパーが 隣に ある こと",
          "ペットと 住める こと",
          "家賃が 前より 安い こと",
          "部屋が とても 広い こと"
        ],
        "correctIndex": 0,
        "explanation": "Phòng hơi hẹp hơn chỗ cũ một chút nhưng điều cô ấy thích nhất là gần ga và có siêu thị ngay bên cạnh (駅から近いし、隣にスーパーがあってとても便利なの).",
        "audioScript": "男の人と女の人が新しいアパートについて話しています。女の人が一番気に入っていることは何ですか。 男：引っ越しはどうだった？新しいアパートは広い？ 女：うーん、部屋は前のアパートより少し狭いんだけど、駅から歩いて3分だし、隣に遅くまで開いているスーパーがあってすごく便利なの。それが一番いいわ。 女の人が一番気に入っていることは何ですか。"
      },
      {
        "id": 46,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về việc học tiếng Nhật.\n質問：男の人は 日本語の 勉強で 何が 一番 むずかしいと 言っていますか。",
        "options": [
          "テストの 聴解",
          "漢字の 読み方",
          "日本人と 話す こと",
          "ひらがなを 書く こと"
        ],
        "correctIndex": 1,
        "explanation": "Hội thoại thì vui, nhưng một chữ Kanji có nhiều cách đọc nên cách đọc Kanji là khó nhất (一つの漢字にいろいろな読み方があるから、漢字の読み方が一番難しいです).",
        "audioScript": "女の人と男の人が日本語の勉強について話しています。男の人は何が一番むずかしいと言っていますか。 女：アンさんは日本語が上手ですね。勉強で何が一番むずかしいですか。話すことですか。 男：いいえ、話すのは楽しいです。でも、一つの漢字にいろいろな読み方がありますから、漢字の読み方が一番むずかしいです。 男の人は何が一番むずかしいと言っていますか。"
      },
      {
        "id": 47,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về chiếc xe đạp.\n質問：男の人は どうして 自転車を 買いましたか。",
        "options": [
          "バス代が かからないし、運動にも なるから",
          "駅の 近くに 引っ越したから",
          "古い 自転車が 盗まれたから",
          "友達と 遠くへ 旅行するから"
        ],
        "correctIndex": 0,
        "explanation": "Đi làm bằng xe đạp vừa không tốn tiền xe buýt, vừa tốt cho việc vận động sức khỏe (バス代もかからないし、いい運動にもなるからね).",
        "audioScript": "女の人と男の人が自転車について話しています。男の人はどうして自転車を買いましたか。 女：あれ、木村さん、きれいな自転車ですね。買ったんですか。 男：うん、先月買ったんだ。今まではバスで駅まで行っていたんだけど、自転車ならバス代もかからないし、いい運動にもなるからね。 男の人はどうして自転車を買いましたか。"
      },
      {
        "id": 48,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe thông báo tại siêu thị.\n質問：今、何が 安く なって いますか。",
        "options": [
          "お弁当 ぜんぶ",
          "牛肉と 魚",
          "りんご と 牛乳",
          "パンと ケーキ"
        ],
        "correctIndex": 2,
        "explanation": "Từ 5 giờ chiều đến 6 giờ chiều là đợt giảm giá táo và sữa tươi (ただいまから1時間、りんごと牛乳がお安くなっております).",
        "audioScript": "スーパーでアナウンスを聞いています。今、何が安くなっていますか。 いらっしゃいませ。いつもご利用ありがとうございます。ただいま午後5時から6時までの1時間、果物売り場のりんごと、飲み物売り場の牛乳が大変お安くなっております。お弁当の割引は7時からでございます。 今、何が安くなっていますか。"
      },
      {
        "id": 49,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちが 来週 試験を 受けます。友だちに 何と 言いますか。",
        "options": [
          "試験、頑張って くださいね。",
          "試験、ごちそうさまでした。",
          "試験、おだいじに。",
          "試験、どういたしまして。"
        ],
        "correctIndex": 0,
        "explanation": "Khi cổ vũ bạn sắp thi, ta nói: 「試験、頑張ってくださいね」(Kỳ thi cố gắng lên nhé!).",
        "audioScript": "友だちが来週試験を受けます。友だちに何と言いますか。 1. 試験、頑張って くださいね。 2. 試験、ごちそうさまでした。 3. 試験、おだいじに。 4. 試験、どういたしまして。"
      },
      {
        "id": 50,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：会社を 辞めて 国へ 帰ります。会社の 人に あいさつを します。何と 言いますか。",
        "options": [
          "いってきます。",
          "はじめまして、どうぞ お元気で。",
          "これから よろしく お願いします。",
          "今まで どうも お世話に なりました。"
        ],
        "correctIndex": 3,
        "explanation": "Khi chia tay đồng nghiệp hoặc người đã giúp đỡ mình suốt thời gian qua, ta nói: 「今までどうもお世話になりました」.",
        "audioScript": "会社を辞めて国へ帰ります。会社の人に挨拶をします。何と言いますか。 1. いってきます。 2. はじめまして、どうぞ お元気で。 3. これから よろしく お願いします。 4. 今まで どうも お世話に なりました。"
      },
      {
        "id": 51,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：レストランで 注文が 決まりました。店員に 何と 言いますか。",
        "options": [
          "すみません、注文を お願いします。",
          "すみません、メニューを 作ってください。",
          "すみません、お会計を お願いします。",
          "すみません、ごちそうさまでした。"
        ],
        "correctIndex": 0,
        "explanation": "Khi đã chọn xong món và gọi nhân viên đặt món: 「すみません、注文をお願いします」. (お会計をお願いします là gọi tính tiền).",
        "audioScript": "レストランで注文が決まりました。店員に何と言いますか。 1. すみません、注文を お願いします。 2. すみません、メニューを 作ってください。 3. すみません、お会計を お願いします。 4. すみません、ごちそうさまでした。"
      },
      {
        "id": 52,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「もし 明日 暇だったら、買い物に 付き合って くれませんか。」",
        "options": [
          "いいえ、きのうは 暇じゃ なかったです。",
          "はい、買い物を しました。",
          "いいですよ。何時ごろ 行きますか。",
          "ええ、どういたしまして。"
        ],
        "correctIndex": 2,
        "explanation": "Khi bạn nhờ đi mua sắm cùng nếu mai rảnh → 「いいですよ。何時ごろ行きますか」(Được chứ, khoảng mấy giờ đi?).",
        "audioScript": "もし明日暇だったら、買い物に付き合ってくれませんか。 1. いいえ、きのうは 暇じゃ なかったです。 2. はい、買い物を しました。 3. いいですよ。何時ごろ 行きますか。 4. ええ、どういたしまして。"
      },
      {
        "id": 53,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「田中さんは もう 帰りましたか。」",
        "options": [
          "はい、あした 帰ります。",
          "いいえ、帰りたく ありません。",
          "ええ、田中さんは 元気です。",
          "いいえ、まだ 会議室に いますよ。"
        ],
        "correctIndex": 3,
        "explanation": "Câu hỏi 「もう帰りましたか」(Anh Tanaka đã về chưa?) → 「いいえ、まだ会議室にいますよ」(Chưa, anh ấy vẫn còn ở phòng họp đấy).",
        "audioScript": "田中さんはもう帰りましたか。 1. はい、あした 帰ります。 2. いいえ、帰りたく ありません。 3. ええ、田中さんは 元気です。 4. いいえ、まだ 会議室に いますよ。"
      },
      {
        "id": 54,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、ちょっと ペンを 落として しまいましたよ。」",
        "options": [
          "ええ、落としましょう。",
          "あ、すみません。ありがとうございます。",
          "はい、どうぞ 使って ください。",
          "いいえ、わたしの ペンじゃ ありません。"
        ],
        "correctIndex": 1,
        "explanation": "Khi người khác nhắc bạn vừa đánh rơi bút (ペンを落としてしまいましたよ), ta cảm ơn: 「あ、すみません。ありがとうございます」.",
        "audioScript": "すみません、ちょっとペンを落としてしまいましたよ。 1. ええ、落としましょう。 2. あ、すみません。ありがとうございます。 3. はい、どうぞ 使って ください。 4. いいえ、わたしの ペンじゃ ありません。"
      },
      {
        "id": 55,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「お国は どちらですか。」",
        "options": [
          "3年前に 来ました。",
          "会社員の グエンです。",
          "飛行機で 来ました。",
          "ベトナムの ハノイです。"
        ],
        "correctIndex": 3,
        "explanation": "Câu hỏi lịch sự 「お国どちらですか」(Bạn đến từ nước/quê nào?) → 「ベトナムのハノイです」(Tôi đến từ Hà Nội, Việt Nam).",
        "audioScript": "お国はどちらですか。 1. 3年前に 来ました。 2. 会社員の グエンです。 3. 飛行機で 来ました。 4. ベトナムの ハノイです。"
      }
    ]
  },
  {
    "id": "test_listening_01",
    "title": "🎧 Đề thi Nghe hiểu N5 (聴解) - Đề số 1: Giao tiếp & Đời sống",
    "description": "Đề luyện chuyên sâu kỹ năng Nghe hiểu (Choukai) JLPT N5 (25 câu - 30 phút): Đầy đủ 4 Mondai (Nghe hiểu chủ đề, Nghe điểm chính, Diễn đạt tình huống, Phản xạ nhanh).",
    "durationMinutes": 30,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại quán cà phê.\n質問：男の人は 何を 注文しますか。",
        "options": [
          "紅茶と チーズケーキ",
          "コーヒーと チーズケーキ",
          "コーヒーと チョコレートケーキ",
          "紅茶と サンドイッチ"
        ],
        "correctIndex": 1,
        "explanation": "Bánh sô-cô-la đã hết nên người nam chọn bánh phô mai (チーズケーキ) và cà phê nóng (コーヒー).",
        "audioScript": "喫茶店で男の人と店員が話しています。男の人は何を注文しますか。 男：すみません、コーヒーとチョコレートケーキをください。 女：申し訳ございません。チョコレートケーキは今日もうなくなってしまいました。チーズケーキならございますが。 男：じゃあ、コーヒーとチーズケーキをお願いします。 男の人は何を注文しますか。"
      },
      {
        "id": 2,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại giữa hai mẹ con.\n質問：女の子は どこに かばんを 置きますか。",
        "options": [
          "玄関の 棚の 上",
          "リビングの ソファーの 上",
          "自分の 部屋の 机の 上",
          "台所の いすの 上"
        ],
        "correctIndex": 2,
        "explanation": "Mẹ nhắc không được để cặp trên sofa phòng khách mà hãy mang về để trên bàn học trong phòng mình (自分の部屋の机の上に置きなさい).",
        "audioScript": "家で女の子とお母さんが話しています。女の子はどこにかばんを置きますか。 女：ただいま！お母さん、かばんはここのソファーの上に置いてもいい？ 母：だめよ、これからお客さんが来るから、自分の部屋の机の上に置きなさい。 女：はーい。 女の子はどこにかばんを置きますか。"
      },
      {
        "id": 3,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hướng dẫn của giáo viên.\n質問：学生は まず 何ページを 開きますか。",
        "options": [
          "20ページ",
          "25ページ",
          "30ページ",
          "24ページ"
        ],
        "correctIndex": 3,
        "explanation": "Hôm qua đã học xong trang 20, hôm nay trước hết mở trang 24 (今日はまず24ページを開いてください).",
        "audioScript": "教室で先生が話しています。学生はまず何ページを開きますか。 先生：みなさん、教科書を出してください。きのうは20ページまで勉強しましたね。21ページから23ページまでは宿題にしますから、今日はまず24ページを開いてください。 学生はまず何ページを開きますか。"
      },
      {
        "id": 4,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại trước khi đi siêu thị.\n質問：女の人は 何で スーパーへ 行きますか。",
        "options": [
          "車で 行く",
          "歩いて 行く",
          "自転車で 行く",
          "バスで 行く"
        ],
        "correctIndex": 1,
        "explanation": "Xe đạp đang bị hỏng lốp, trời đẹp nên cô ấy quyết định đi bộ tới siêu thị (天気がいいから歩いて行くわ).",
        "audioScript": "家で男の人と女の人が話しています。女の人は何でスーパーへ行きますか。 男：スーパーへ行くなら、自転車で行くの？ 女：ううん、自転車はきのうから故障しているのよ。今日は天気がいいから、歩いて行くわ。 女の人は何でスーパーへ行きますか。"
      },
      {
        "id": 5,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc gọi đặt bàn nhà hàng.\n質問：予約は 何日の 何人ですか。",
        "options": [
          "14日の 6人",
          "15日の 6人",
          "16日の 4人",
          "15日の 5人"
        ],
        "correctIndex": 1,
        "explanation": "Ban đầu định đặt 5 người vào ngày 15, nhưng có thêm 1 người nữa nên đặt cho 6 người vào tối ngày 15 (15日の夜7時に6人でお願いします).",
        "audioScript": "電話で女の人がレストランの予約をしています。予約は何日の何人ですか。 女：もしもし、来週の15日の夜7時に予約をお願いします。最初は5人の予定でしたが、もう1人増えたので6人でお願いします。 男：はい、15日の7時に6名様ですね。かしこまりました。 予約は何日の何人ですか。"
      },
      {
        "id": 6,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại ở cửa hàng giày.\n質問：女の人は どの 靴を 買いますか。",
        "options": [
          "黒い 23センチの 靴",
          "黒い 24センチの 靴",
          "白い 24センチの 靴",
          "白い 23センチの 靴"
        ],
        "correctIndex": 2,
        "explanation": "Đôi màu trắng cỡ 23cm hơi chật nên cô ấy đổi sang đôi màu trắng cỡ 24cm và mua đôi đó.",
        "audioScript": "靴屋で女の人と店員が話しています。女の人はどの靴を買いますか。 女：すみません、この白い靴の23センチはありますか。 男：はい、どうぞ。いかがですか。 女：うーん、少し小さいですね。24センチはありますか。 男：はい、こちらが白い24センチです。 女：あ、ちょうどいいです。これをください。 女の人はどの靴を買いますか。"
      },
      {
        "id": 7,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại công ty.\n質問：男の人は 書類を どこに 置きますか。",
        "options": [
          "本棚の 一番 上",
          "山田さんの 机の 上",
          "山田さんの 机の 引き出しの 中",
          "コピー機の 横"
        ],
        "correctIndex": 2,
        "explanation": "Vì là tài liệu quan trọng nên đừng để trên mặt bàn mà hãy cất vào ngăn kéo bàn của chị Yamada (山田さんの机の引き出しの中に入れておいてください).",
        "audioScript": "会社で女の人と男の人が話しています。男の人は書類をどこに置きますか。 男：すみません、山田さんに頼まれた書類ができたんですが、山田さんの机の上に置いておきましょうか。 女：ああ、それは大切な書類だから、机の上ではなくて、山田さんの机の引き出しの中に入れておいてください。 男：はい、わかりました。 男の人は書類をどこに置きますか。"
      },
      {
        "id": 8,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về thức uống buổi sáng.\n質問：男の人は 毎朝 何を 飲みますか。",
        "options": [
          "野菜ジュース",
          "牛乳",
          "コーヒー",
          "緑茶"
        ],
        "correctIndex": 0,
        "explanation": "Trước đây anh ấy uống cà phê mỗi sáng, nhưng từ năm nay vì sức khỏe nên mỗi sáng đều uống nước ép rau củ (今は毎朝野菜ジュースを飲んでいます).",
        "audioScript": "女の人と男の人が朝ごはんについて話しています。男の人は毎朝何を飲みますか。 女：田中さんは毎朝コーヒーを飲みますか。 男：以前は毎朝飲んでいましたが、今年からは健康のために毎朝野菜ジュースを飲んでいます。 男の人は毎朝何を飲みますか。"
      },
      {
        "id": 9,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về giờ tàu chạy.\n質問：次の 急行電車は 何時何分ですか。",
        "options": [
          "10時25分",
          "10時05分",
          "10時35分",
          "10時15分"
        ],
        "correctIndex": 0,
        "explanation": "Chuyến 10 giờ 15 phút là tàu thường (普通電車), còn chuyến tàu tốc hành (急行電車) tiếp theo là lúc 10 giờ 25 phút.",
        "audioScript": "駅で男の人と駅員が話しています。次の急行電車は何時何分ですか。 男：すみません、次の急行電車は何時ですか。10時15分ですか。 女：いいえ、10時15分は各駅に止まる普通電車です。次の急行電車は10時25分です。 次の急行電車は何時何分ですか。"
      },
      {
        "id": 10,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về ngày nghỉ của cửa hàng.\n質問：この パン屋は 何曜日が 休みですか。",
        "options": [
          "日曜日",
          "水曜日",
          "火曜日",
          "月曜日"
        ],
        "correctIndex": 1,
        "explanation": "Cửa hàng bánh mì mở cả Thứ Bảy và Chủ Nhật, chỉ nghỉ vào Thứ Tư hàng tuần (毎週水曜日が休みです).",
        "audioScript": "女の人と男の人が新しいパン屋について話しています。このパン屋は何曜日が休みですか。 女：駅前の新しいパン屋、もう行きましたか。 男：ええ、きのうの火曜日に行きましたよ。土曜日も日曜日も開いていて、毎週水曜日が休みだそうです。 このパン屋は何曜日が休みですか。"
      },
      {
        "id": 11,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về ảnh gia đình.\n質問：女の人の お兄さんは どの 人ですか。",
        "options": [
          "帽子を かぶって Tシャツを 着ている 人",
          "背が 低くて カメラを 持っている 人",
          "眼鏡を かけて スーツを 着ている 人",
          "いすに 座って 犬を 抱いている 人"
        ],
        "correctIndex": 2,
        "explanation": "Người đội mũ mặc áo phông là em trai, còn anh trai là người đeo kính mặc bộ vest đứng cạnh bố (父の隣で眼鏡をかけてスーツを着ているのが兄です).",
        "audioScript": "男の人と女の人が家族の写真を見ています。女の人のお兄さんはどの人ですか。 男：これはマリアさんの家族の写真ですか。この帽子をかぶってTシャツを着ている人がお兄さんですか。 女：いいえ、それは弟です。父の隣で眼鏡をかけてスーツを着ているのが兄です。 女の人のお兄さんはどの人ですか。"
      },
      {
        "id": 12,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về lớp học tiếng Anh.\n質問：女の人は 1か月に 何回 英語の クラスへ 行きますか。",
        "options": [
          "12回",
          "4回",
          "2回",
          "8回"
        ],
        "correctIndex": 3,
        "explanation": "Cô ấy đi học mỗi tuần 2 lần (Thứ Ba và Thứ Sáu), vậy 1 tháng (4 tuần) đi 8 lần (一か月に八回行きます).",
        "audioScript": "男の人と女の人が英語のクラスについて話しています。女の人は一か月に何回クラスへ行きますか。 男：佐藤さんは英語を習っているそうですね。毎週行くんですか。 女：ええ、毎週火曜日と金曜日の週に二回です。だから、一か月に八回行きます。 女の人は一か月に何回英語のクラスへ行きますか。"
      },
      {
        "id": 13,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về việc mua máy ảnh.\n質問：男の人は どこで カメラを 買いましたか。",
        "options": [
          "友達から 買った",
          "駅前の デパート",
          "インターネットの 店",
          "電気屋の セール"
        ],
        "correctIndex": 2,
        "explanation": "Anh ấy đã xem ở cửa hàng điện máy trước ga nhưng trên mạng rẻ hơn 5.000 yên nên đã mua ở cửa hàng trên Internet (インターネットの店で買いました).",
        "audioScript": "女の人と男の人がカメラについて話しています。男の人はどこでカメラを買いましたか。 女：いいカメラですね。駅前の電気屋で買ったんですか。 男：駅前の電気屋で見たんですが、インターネットの店のほうが五千円安かったから、インターネットで買いました。 男の人はどこでカメラを買いましたか。"
      },
      {
        "id": 14,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe đoạn hội thoại về buổi tiệc tối nay.\n質問：女の人は どうして 今晩の パーティーに 行きませんか。",
        "options": [
          "残業が たくさん あるから",
          "明日 テストが あるから",
          "国から 両親が 来るから",
          "風邪を ひいて 熱が あるから"
        ],
        "correctIndex": 2,
        "explanation": "Tối nay bố mẹ cô ấy từ quê/nước ngoài sang Nhật nên cô ấy phải ra sân bay đón bố mẹ (今晩、国から両親が日本へ来るので、空港へ迎えに行かなければならないんです).",
        "audioScript": "男の人と女の人が今晩のパーティーについて話しています。女の人はどうしてパーティーに行きませんか。 男：リンさん、今晩のクラスのパーティー、一緒に行きませんか。 女：すみません、今晩は国から両親が日本へ来るので、空港へ迎えに行かなければならないんです。 男：そうですか。それは残念ですね。 女の人はどうしてパーティーに行きませんか。"
      },
      {
        "id": 15,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：バスの中で 降りたいです。前に 人が たくさん います。何と 言いますか。",
        "options": [
          "どうぞ、乗って ください。",
          "すみません、降ります。",
          "しつれいしました。",
          "お先に どうぞ。"
        ],
        "correctIndex": 1,
        "explanation": "Khi muốn xin đường xuống xe buýt/tàu đông người, ta nói 「すみません、降ります」(Xin lỗi, cho tôi xuống xe ạ).",
        "audioScript": "バスの中で降りたいです。前に人がたくさんいます。何と言いますか。 1. どうぞ、乗って ください。 2. すみません、降ります。 3. しつれいしました。 4. お先に どうぞ。"
      },
      {
        "id": 16,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちが 新しい 家に 引っ越しました。お祝いを 言います。何と 言いますか。",
        "options": [
          "引っ越し、どうも すみませんでした。",
          "引っ越し、おめでとうございます。素敵な 家ですね。",
          "引っ越し、ごちそうさまでした。",
          "引っ越し、おだいじに してください。"
        ],
        "correctIndex": 1,
        "explanation": "Chúc mừng bạn chuyển về nhà mới: 「引っ越し、おめでとうございます。素敵な家ですね」.",
        "audioScript": "友だちが新しい家に引っ越しました。お祝いを言います。何と言いますか。 1. 引っ越し、どうも すみませんでした。 2. 引っ越し、おめでとうございます。素敵な 家ですね。 3. 引っ越し、ごちそうさまでした。 4. 引っ越し、おだいじに してください。"
      },
      {
        "id": 17,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：ホテルの 部屋の エアコンが 動きません。フロントに 電話して 何と 言いますか。",
        "options": [
          "すみません、エアコンが 動かないんですが、見て くれませんか。",
          "すみません、部屋を 掃除して ください。",
          "すみません、エアコンを 消しても いいですか。",
          "すみません、エアコンを 買いに 行きます。"
        ],
        "correctIndex": 0,
        "explanation": "Khi máy lạnh trong phòng khách sạn không chạy, gọi lễ tân nhờ kiểm tra: 「すみません、エアコンが動かないんですが、見てくれませんか」.",
        "audioScript": "ホテルの部屋のエアコンが動きません。フロントに電話して何と言いますか。 1. すみません、エアコンが 動かないんですが、見て くれませんか。 2. すみません、部屋を 掃除して ください。 3. すみません、エアコンを 消しても いいですか。 4. すみません、エアコンを 買いに 行きます。"
      },
      {
        "id": 18,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：写真の 中で 友だちの 後ろに 立って います。友だちに 写真を撮って もらいたい とき、何と 言いますか。",
        "options": [
          "写真を 撮って あげましょうか。",
          "ここで 写真を 撮っては いけません。",
          "すみません、わたしたちの 写真を 撮って くれませんか。",
          "すみません、一緒に 写真を 見ませんか。"
        ],
        "correctIndex": 2,
        "explanation": "Khi nhờ người khác chụp ảnh giúp mình: 「すみません、わたしたちの写真を撮ってくれませんか」.",
        "audioScript": "観光地で、近くの人に自分の写真を撮ってもらいたいです。何と言いますか。 1. 写真を 撮って あげましょうか。 2. ここで 写真を 撮っては いけません。 3. すみません、わたしたちの 写真を 撮って くれませんか。 4. すみません、一緒に 写真を 見ませんか。"
      },
      {
        "id": 19,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：夜 寝る 前に 家族に あいさつを します。何と 言いますか。",
        "options": [
          "おやすみなさい。",
          "いってきます。",
          "こんにちは。",
          "おはようございます。"
        ],
        "correctIndex": 0,
        "explanation": "Trước khi đi ngủ chúc người nhà ngủ ngon: 「おやすみなさい」.",
        "audioScript": "夜寝る前に家族に挨拶をします。何と言いますか。 1. おやすみなさい。 2. いってきます。 3. こんにちは。 4. おはようございます。"
      },
      {
        "id": 20,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、この 席、空いて いますか。」",
        "options": [
          "はい、わたしが 座って います。",
          "いいえ、いすでは ありません。",
          "ええ、机の 上です。",
          "ええ、どうぞ 座って ください。"
        ],
        "correctIndex": 3,
        "explanation": "Khi ai đó hỏi 「この席、空いていますか」(Ghế này có trống không?) → 「ええ、どうぞ座ってください」(Vâng, trống đấy, xin mời ngồi).",
        "audioScript": "すみません、この席、空いていますか。 1. はい、わたしが 座って います。 2. いいえ、いすでは ありません。 3. ええ、机の 上です。 4. ええ、どうぞ 座って ください。"
      },
      {
        "id": 21,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「日本の 冬は どうですか。」",
        "options": [
          "とても 寒いですが、雪が きれいですよ。",
          "いいえ、冬じゃ ありません。",
          "8月が 一番 暑いです。",
          "はい、冬が 来ました。"
        ],
        "correctIndex": 0,
        "explanation": "Hỏi cảm nhận về mùa đông Nhật Bản → 「とても寒いですが、雪がきれいですよ」(Rất lạnh nhưng tuyết rất đẹp).",
        "audioScript": "日本の冬はどうですか。 1. とても 寒いですが、雪が きれいですよ。 2. いいえ、冬じゃ ありません。 3. 8月が 一番 暑いです。 4. はい、冬が 来ました。"
      },
      {
        "id": 22,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「あしたの パーティーに 何を 持って 行きましょうか。」",
        "options": [
          "じゃあ、飲み物を お願いします。",
          "友だちの 家で します。",
          "午後 6時からです。",
          "はい、パーティーへ 行きます。"
        ],
        "correctIndex": 0,
        "explanation": "Hỏi 「何を 持って 行きましょうか」(Ngày mai tôi nên mang gì đến bữa tiệc?) → 「じゃあ、飲み物をお願いします」(Vậy nhờ bạn mang đồ uống nhé).",
        "audioScript": "あしたのパーティーに何を持って行きましょうか。 1. じゃあ、飲み物を お願いします。 2. 友だちの 家で します。 3. 午後 6時からです。 4. はい、パーティーへ 行きます。"
      },
      {
        "id": 23,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「顔色が 悪いですね。どうしたんですか。」",
        "options": [
          "いいえ、元気じゃ ありません。",
          "ちょっと おなかが 痛いんです。",
          "はい、病院へ 行きました。",
          "ええ、顔が きれいですね。"
        ],
        "correctIndex": 1,
        "explanation": "Câu hỏi thăm có ～んですか (Sắc mặt bạn kém quá, có chuyện gì vậy?) → Giải thích lý do bằng ～んです: 「ちょっとおなかが痛いんです」(Tôi hơi bị đau bụng một chút).",
        "audioScript": "顔色が悪いですね。どうしたんですか。 1. いいえ、元気じゃ ありません。 2. ちょっと おなかが 痛いんです。 3. はい、病院へ 行きました。 4. ええ、顔が きれいですね。"
      },
      {
        "id": 24,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、お会計を お願いします。」",
        "options": [
          "はい、メニューを どうぞ。",
          "いらっしゃいませ、何名様ですか。",
          "いいえ、まだ 食べて いません。",
          "はい、ぜんぶで 二千円に なります。"
        ],
        "correctIndex": 3,
        "explanation": "Khách gọi tính tiền (お会計をお願いします) → Nhân viên đáp tổng số tiền: 「はい、ぜんぶで二千円になります」.",
        "audioScript": "すみません、お会計をお願いします。 1. はい、メニューを どうぞ。 2. いらっしゃいませ、何名様ですか。 3. いいえ、まだ 食べて いません。 4. はい、ぜんぶで 二千円に なります。"
      },
      {
        "id": 25,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「ここから 駅まで 歩いて どのぐらい かかりますか。」",
        "options": [
          "3回 乗りますよ。",
          "10分ぐらいですよ。",
          "ええ、歩いて 行きます。",
          "500円ぐらいですよ。"
        ],
        "correctIndex": 1,
        "explanation": "Hỏi đi bộ từ đây ra ga mất bao lâu (どのぐらいかかりますか) → 「10分ぐらいですよ」(Khoảng 10 phút).",
        "audioScript": "ここから駅まで歩いてどのぐらいかかりますか。 1. 3回 乗りますよ。 2. 10分ぐらいですよ。 3. ええ、歩いて 行きます。 4. 500円ぐらいですよ。"
      }
    ]
  },
  {
    "id": "test_listening_02",
    "title": "🎧 Đề thi Nghe hiểu N5 (聴解) - Đề số 2: Thời gian, Mua sắm & Đi lại",
    "description": "Đề luyện chuyên sâu kỹ năng Nghe hiểu (Choukai) JLPT N5 (25 câu - 30 phút): Luyện nghe số đếm, giờ giấc, giá tiền, phương tiện giao thông, chỉ đường và hội thoại nơi công sở.",
    "durationMinutes": 30,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc hội thoại tại cửa hàng quần áo.\n質問：男の人は どの シャツを 買いますか。",
        "options": [
          "青い Mサイズの シャツ",
          "白い Lサイズの シャツ",
          "白い Mサイズの シャツ",
          "青い Lサイズの シャツ"
        ],
        "correctIndex": 3,
        "explanation": "Cỡ M hơi chật nên anh ấy lấy cỡ L, và chọn màu xanh dương thay vì màu trắng (青いLサイズをください).",
        "audioScript": "服屋で男の人と店員が話しています。男の人はどのシャツを買いますか。 男：すみません、このシャツのMサイズはありますか。 女：はい、白と青がございますが。 男：うーん、Mは少し小さいですね。Lサイズはありますか。 女：はい、Lサイズも白と青がございますよ。 男：白は家にもあるから、青いLサイズをください。 男の人はどのシャツを買いますか。"
      },
      {
        "id": 2,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện giữa hai bạn cùng phòng.\n質問：女の人は これから 何を しますか。",
        "options": [
          "お皿を 洗う",
          "部屋を 掃除する",
          "晩ごはんを 作る",
          "ごみを 出しに 行く"
        ],
        "correctIndex": 0,
        "explanation": "Người nam vừa nấu cơm xong và sẽ đi đổ rác, còn người nữ nhận rửa bát đĩa (じゃあ、私はお皿を洗うね).",
        "audioScript": "家で男の人と女の人が話しています。女の人はこれから何をしますか。 男：晩ごはん、おいしかったね。僕はこれからごみを出しに行ってくるよ。 女：ありがとう。じゃあ、私はお皿を洗うね。部屋の掃除はあしたの朝一緒にしよう。 男：うん、わかった。 女の人はこれから何をしますか。"
      },
      {
        "id": 3,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hướng dẫn đường đi.\n質問：郵便局は どこに ありますか。",
        "options": [
          "橋の 手前の 右側、銀行の 隣",
          "橋を 渡って 左側、スーパーの 隣",
          "駅の すぐ 後ろ",
          "橋を 渡って 右側、学校の 前"
        ],
        "correctIndex": 1,
        "explanation": "Đi thẳng qua cây cầu, ở phía bên trái cạnh siêu thị là bưu điện (橋を渡ると左にスーパーがあります。郵便局はその隣です).",
        "audioScript": "道で女の人と男の人が話しています。郵便局はどこにありますか。 女：すみません、郵便局はどこですか。 男：この道をまっすぐ行くと、橋があります。その橋を渡ると、左側にスーパーがありますよ。郵便局はそのスーパーの隣です。 女：橋を渡って左側ですね。ありがとうございます。 郵便局はどこにありますか。"
      },
      {
        "id": 4,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe thông báo trên tàu.\n質問：空港へ 行く 人は どうしなければ なりませんか。",
        "options": [
          "次の みなみ駅で 降りて、バスに 乗る",
          "この 電車に そのまま 乗って 終点まで 行く",
          "次の みなみ駅で 降りて、隣の 2番線の 電車に 乗る",
          "3番線の 電車に 乗り換える"
        ],
        "correctIndex": 2,
        "explanation": "Chuyến tàu này không đi tới sân bay; hành khách đi sân bay hãy xuống ở ga Minami tiếp theo và chuyển sang tàu ở đường ray số 2 bên cạnh.",
        "audioScript": "電車の中でアナウンスを聞いています。空港へ行く人はどうしなければなりませんか。 ご乗車ありがとうございます。この電車は、みなみ駅止まりです。空港へいらっしゃるお客様は、次のみなみ駅で降りて、隣の2番線の電車にお乗り換えください。 空港へ行く人はどうしなければなりませんか。"
      },
      {
        "id": 5,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại hiệu bánh.\n質問：女の人は ケーキを いくつ 買いますか。",
        "options": [
          "6つ",
          "4つ",
          "3つ",
          "5つ"
        ],
        "correctIndex": 3,
        "explanation": "Gia đình có 4 người nhưng hôm nay có cả bà đến chơi nên cô ấy mua 5 cái bánh (今日は祖母も来ているから、全部で五つください).",
        "audioScript": "ケーキ屋で女の人と店員が話しています。女の人はケーキをいくつ買いますか。 女：すみません、いちごのケーキを三つと、チョコレートのケーキを一つください。あ、そうだ、今日は祖母も家に来ているから、いちごのケーキをもう一つお願いします。 男：はい、いちごが四つと、チョコレートが一つで、全部で五つですね。 女の人はケーキをいくつ買いますか。"
      },
      {
        "id": 6,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại lớp học nấu ăn.\n質問：生徒は 野菜を 切った あと、次に 何を しますか。",
        "options": [
          "塩と 砂糖を 入れる",
          "鍋に 水を 入れて 野菜を 煮る",
          "お皿を 洗って 並べる",
          "鍋に 油を 入れて 肉を 炒める"
        ],
        "correctIndex": 3,
        "explanation": "Sau khi cắt rau xong, chưa cho rau vào ngay mà cho dầu vào nồi rồi xào thịt trước (野菜を切ったら、まず鍋に油を入れて肉を炒めてください).",
        "audioScript": "料理教室で先生が話しています。生徒は野菜を切ったあと、次に何をしますか。 先生：みなさん、人参と玉ねぎは切りましたか。野菜を切ったら、まだ鍋には入れないでください。次に、鍋に少し油を入れて、先に肉を炒めてください。肉の色が変わってから野菜を入れます。 生徒は野菜を切ったあと、次に何をしますか。"
      },
      {
        "id": 7,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc nói chuyện tại văn phòng.\n質問：男の人は 何時までに レポートを 出さなければ なりませんか。",
        "options": [
          "今日の 午後 5時",
          "明日の 朝 9時",
          "今日の 午後 3時",
          "今日の 昼 12時"
        ],
        "correctIndex": 2,
        "explanation": "Ban đầu hạn là 5 giờ chiều nhưng vì trưởng phòng phải đi công tác sớm nên đổi thành trước 3 giờ chiều hôm nay (今日の午後3時までに出してください).",
        "audioScript": "会社で女の人と男の人が話しています。男の人は何時までにレポートを出さなければなりませんか。 男：課長、このレポートは今日の夕方5時までに出せばいいですか。 女：すみません、私が夕方から出張に行くことになったから、午後3時までに出してください。 男：わかりました。急いで書きます。 男の人は何時までにレポートを出さなければなりませんか。"
      },
      {
        "id": 8,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về thời gian mở cửa của ngân hàng.\n質問：銀行の 窓口は 何時まで 開いて いますか。",
        "options": [
          "午後 6時まで",
          "午後 4時まで",
          "午後 5時まで",
          "午後 3時まで"
        ],
        "correctIndex": 3,
        "explanation": "Bưu điện mở đến 5 giờ chiều, còn quầy giao dịch ngân hàng chỉ mở đến 3 giờ chiều (銀行の窓口は午後3時までですよ).",
        "audioScript": "男の人と女の人が話しています。銀行の窓口は何時まで開いていますか。 男：すみません、今3時半ですが、銀行はまだ開いていますか。 女：郵便局は5時まで開いていますが、銀行の窓口は午後3時までですよ。キャッシュカードなら6時まで使えますけど。 銀行の窓口は何時まで開いていますか。"
      },
      {
        "id": 9,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về món quà lưu niệm.\n質問：女の人は 北海道で 何を 買いましたか。",
        "options": [
          "木で 作った 人形",
          "りんごの ジュース",
          "白い チョコレートと チーズ",
          "かに と 魚"
        ],
        "correctIndex": 2,
        "explanation": "Cá và cua khó mang về nên cô ấy đã mua sô-cô-la trắng và phô mai nổi tiếng (有名な白いチョコレートとチーズを買いました).",
        "audioScript": "男の人と女の人が北海道のお土産について話しています。女の人は北海道で何を買いましたか。 男：北海道旅行、どうでしたか。お土産に魚やカニを買いましたか。 女：魚は持って帰るのが大変だから、買いませんでした。でも、有名な白いチョコレートとチーズをたくさん買いましたよ。どうぞ食べてください。 女の人は北海道で何を買いましたか。"
      },
      {
        "id": 10,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về việc tập thể thao.\n質問：男の人は どうして 最近 プールへ 行きませんか。",
        "options": [
          "仕事が 忙しくて 帰りが 遅いから",
          "足を けがしたから",
          "プールが 工事中で 休みだから",
          "冬で 水が 冷たいから"
        ],
        "correctIndex": 0,
        "explanation": "Hồ bơi nước ấm nên mùa đông vẫn bơi được, nhưng gần đây công việc bận quá, về muộn nên anh ấy không đi được (最近仕事が忙しくて、毎日帰りが遅いから行けないんだ).",
        "audioScript": "女の人と男の人が水泳について話しています。男の人はどうして最近プールへ行きませんか。 女：山田さん、最近も毎週プールへ泳ぎに行っていますか。 男：ううん、先月までは行っていたんだけど、今月は仕事が忙しくて、毎日帰りが遅いから全然行けないんだ。 男の人はどうして最近プールへ行きませんか。"
      },
      {
        "id": 11,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại hỏi tuổi.\n質問：男の人の 弟さんは 今 何歳ですか。",
        "options": [
          "18歳",
          "20歳",
          "22歳",
          "19歳"
        ],
        "correctIndex": 3,
        "explanation": "Người nam năm nay 22 tuổi, em trai kém anh ấy 3 tuổi (僕より三つ下だから、十九歳です).",
        "audioScript": "女の人と男の人が弟について話しています。男の人の弟さんは今何歳ですか。 女：写真にいるこの男の子は、キムさんの弟さんですか。キムさんとよく似ていますね。何歳ですか。 男：僕は今二十二歳ですが、弟は僕より三つ下だから、十九歳です。大学一年生ですよ。 男の人の弟さんは今何歳ですか。"
      },
      {
        "id": 12,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về chiếc ô bị quên.\n質問：女の人の 傘は どれですか。",
        "options": [
          "小さくて 黒い 折りたたみ傘",
          "赤くて 小さい 子供の 傘",
          "長くて 青い 無地の 傘",
          "長くて 白い 花の 絵が ある 傘"
        ],
        "correctIndex": 3,
        "explanation": "Ô của cô ấy là chiếc ô dài màu trắng có hình bông hoa nhỏ ở tay cầm (長くて白い傘で、花の絵がついています).",
        "audioScript": "駅の忘れ物センターで女の人と係の人が話しています。女の人の傘はどれですか。 女：すみません、けさ電車の中に傘を忘れてしまったんですが。 男：どんな傘ですか。小さい折りたたみ傘ですか。 女：いいえ、長い傘です。色は白で、小さい花の絵がついています。 女の人の傘はどれですか。"
      },
      {
        "id": 13,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về bài kiểm tra nói tiếng Nhật.\n質問：スピーチコンテストは どこで ありますか。",
        "options": [
          "図書館の 2階",
          "3階の 301教室",
          "駅前の 市民センター",
          "大学の本館 4階の ホール"
        ],
        "correctIndex": 3,
        "explanation": "Lúc đầu định tổ chức ở phòng 301 tầng 3, nhưng vì có nhiều người đến xem nên đã đổi sang hội trường tầng 4 tòa nhà chính (本館4階のホールに変わりました).",
        "audioScript": "学生二人がスピーチコンテストについて話しています。スピーチコンテストはどこでありますか。 男：あしたの日本語スピーチコンテスト、3階の301教室だよね。 女：ううん、見に来る人がたくさんいるから、本館4階の大きいホールに変わったよ。 男：えっ、知らなかった！ありがとう。 スピーチコンテストはどこでありますか。"
      },
      {
        "id": 14,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về bữa trưa.\n質問：男の人は 昼ごはんを どうしましたか。",
        "options": [
          "自分で 作った お弁当を 食べた",
          "忙しくて 何も 食べなかった",
          "会社の 食堂で うどんを 食べた",
          "コンビニで サンドイッチを 買った"
        ],
        "correctIndex": 0,
        "explanation": "Từ tuần này anh ấy dậy sớm tự làm cơm hộp mang đi ăn trưa (今週から自分で作ったお弁当を持ってきているんだ).",
        "audioScript": "会社で女の人と男の人が昼ごはんについて話しています。男の人は昼ごはんをどうしましたか。 女：鈴木さん、いつも会社の食堂でうどんを食べていますよね。今日は行かなかったんですか。 男：ええ、今週から朝早く起きて、自分で作ったお弁当を持ってきているんです。今、会議室で食べましたよ。 男の人は昼ごはんをどうしましたか。"
      },
      {
        "id": 15,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの 家へ 行き、ドアの 前で 人を 呼びます。何と 言いますか。",
        "options": [
          "いらっしゃいませ。",
          "ただいま。",
          "ごめんください。",
          "おじゃまします。"
        ],
        "correctIndex": 2,
        "explanation": "Khi đứng trước cửa nhà người khác gọi chủ nhà ra mở cửa, người Nhật nói 「ごめんください」(Có ai ở nhà không ạ?).",
        "audioScript": "友だちの家へ行き、玄関のドアの前で家の人を呼びます。何と言いますか。 1. いらっしゃいませ。 2. ただいま。 3. ごめんください。 4. おじゃまします。"
      },
      {
        "id": 16,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：日本語の 先生に「漢字が 上手に なりましたね」と ほめられました。何と 答えますか。",
        "options": [
          "どういたしまして。",
          "はい、わたしは とても 上手です。",
          "いいえ、まだまだです。",
          "おだいじに。"
        ],
        "correctIndex": 2,
        "explanation": "Khi được khen giỏi tiếng Nhật/Kanji, cách đáp khiêm tốn tự nhiên của người Nhật là 「いいえ、まだまだです」(Dạ chưa đâu ạ, tôi vẫn còn kém lắm).",
        "audioScript": "日本語の先生に「漢字が上手になりましたね」とほめられました。何と答えますか。 1. どういたしまして。 2. はい、わたしは とても 上手です。 3. いいえ、まだまだです。 4. おだいじに。"
      },
      {
        "id": 17,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：店で 買い物を して、クレジットカードで 払いたいです。店員に 何と 言いますか。",
        "options": [
          "領収書は いりません。",
          "カードで お願いします。",
          "これは いくらですか。",
          "おつりを ください。"
        ],
        "correctIndex": 1,
        "explanation": "Khi muốn thanh toán bằng thẻ tín dụng, ta nói với nhân viên thu ngân: 「カードでお願いします」.",
        "audioScript": "店で買い物をして、クレジットカードで払いたいです。店員に何と言いますか。 1. 領収書は いりません。 2. カードで お願いします。 3. これは いくらですか。 4. おつりを ください。"
      },
      {
        "id": 18,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：電車の中で 足を 踏んで しまいました。相手の 人に 何と 言いますか。",
        "options": [
          "あ、すみません！大丈夫ですか。",
          "しつれいします。",
          "どうも ありがとう ございます。",
          "いいえ、こちらこそ。"
        ],
        "correctIndex": 0,
        "explanation": "Khi lỡ giẫm phải chân người khác trên tàu, ta xin lỗi ngay và hỏi thăm: 「あ、すみません！大丈夫ですか」.",
        "audioScript": "電車の中で隣の人の足を踏んでしまいました。相手の人に何と言いますか。 1. あ、すみません！大丈夫ですか。 2. しつれいします。 3. どうも ありがとう ございます。 4. いいえ、こちらこそ。"
      },
      {
        "id": 19,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：先生の 部屋へ 入ります。ドアを ノックして、中へ 入る とき 何と 言いますか。",
        "options": [
          "おやすみなさい。",
          "いただきます。",
          "ごめんなさい。",
          "失礼します。"
        ],
        "correctIndex": 3,
        "explanation": "Khi bước vào phòng giáo viên hoặc cấp trên, ta nói 「失礼します」(Xin phép thầy/cô ạ).",
        "audioScript": "先生の部屋へ入ります。ドアをノックして、中へ入るとき何と言いますか。 1. おやすみなさい。 2. いただきます。 3. ごめんなさい。 4. 失礼します。"
      },
      {
        "id": 20,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、1,000円札を 細かい お金に 替えて もらえませんか。」",
        "options": [
          "いいですよ。100円玉 10枚で いいですか。",
          "はい、1,000円 払いました。",
          "いいえ、おつりは ありません。",
          "ええ、高いですね。"
        ],
        "correctIndex": 0,
        "explanation": "Khi ai đó nhờ đổi tờ 1.000 yên ra tiền lẻ (細かいお金に替えてもらえませんか) → 「いいですよ。100円玉10枚でいいですか」(Được chứ, 10 đồng 100 yên có được không?).",
        "audioScript": "すみません、千円札を細かいお金に替えてもらえませんか。 1. いいですよ。100円玉 10枚で いいですか。 2. はい、1,000円 払いました。 3. いいえ、おつりは ありません。 4. ええ、高いですね。"
      },
      {
        "id": 21,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「この 漢字の 読み方を 教えて くださいませんか。」",
        "options": [
          "いいえ、読みたく ありません。",
          "ええ、日本の 本です。",
          "ああ、これは『いなか』と 読みますよ。",
          "はい、漢字を 書きました。"
        ],
        "correctIndex": 2,
        "explanation": "Nhờ chỉ cách đọc chữ Kanji này → 「ああ、これは『いなか』と読みますよ」(À, chữ này đọc là 'inaka' đấy).",
        "audioScript": "この漢字の読み方を教えてくださいませんか。 1. いいえ、読みたく ありません。 2. ええ、日本の 本です。 3. ああ、これは『いなか』と 読みますよ。 4. はい、漢字を 書きました。"
      },
      {
        "id": 22,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「きのうの サッカーの 試合、どうでしたか。」",
        "options": [
          "テレビで 見ました。",
          "とても おもしろかったですよ。",
          "はい、サッカーが 好きです。",
          "午後 7時からでした。"
        ],
        "correctIndex": 1,
        "explanation": "Hỏi cảm tưởng về trận bóng đá hôm qua (どうでしたか) → 「とてもおもしろかったですよ」(Rất kịch tính/thú vị đấy).",
        "audioScript": "きのうのサッカーの試合、どうでしたか。 1. テレビで 見ました。 2. とても おもしろかったですよ。 3. はい、サッカーが 好きです。 4. 午後 7時からでした。"
      },
      {
        "id": 23,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「もう 昼ごはんを 食べましたか。」",
        "options": [
          "ええ、ごちそうさまでした。",
          "はい、食べませんでした。",
          "いいえ、まだです。今から 食べに 行きます。",
          "いいえ、きのう 食べました。"
        ],
        "correctIndex": 2,
        "explanation": "Khi được hỏi 「もう食べましたか」(Đã ăn trưa chưa?), nếu chưa ăn thì trả lời 「いいえ、まだです。今から食べに行きます」.",
        "audioScript": "もう昼ごはんを食べましたか。 1. ええ、ごちそうさまでした。 2. はい、食べませんでした。 3. いいえ、まだです。今から 食べに 行きます。 4. いいえ、きのう 食べました。"
      },
      {
        "id": 24,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「窓を 閉めましょうか。」",
        "options": [
          "ええ、少し 寒いですから お願いします。",
          "どういたしまして。",
          "いいえ、閉めました。",
          "はい、窓が 開いて います。"
        ],
        "correctIndex": 0,
        "explanation": "Khi người khác đề nghị đóng cửa sổ giúp (窓を閉めましょうか) → 「ええ、少し寒いですからお願いします」(Vâng, hơi lạnh nên nhờ bạn đóng giúp nhé).",
        "audioScript": "窓を閉めましょうか。 1. ええ、少し 寒いですから お願いします。 2. どういたしまして。 3. いいえ、閉めました。 4. はい、窓が 開いて います。"
      },
      {
        "id": 25,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「ただいま。」",
        "options": [
          "いってきます。",
          "いってらっしゃい。",
          "おかえりなさい。",
          "おじゃまします。"
        ],
        "correctIndex": 2,
        "explanation": "Khi người đi làm/đi học về nhà nói 「ただいま」, người ở nhà đáp lại 「おかえりなさい」.",
        "audioScript": "ただいま。 1. いってきます。 2. いってらっしゃい。 3. おかえりなさい。 4. おじゃまします。"
      }
    ]
  },
  {
    "id": "test_listening_03",
    "title": "🎧 Đề thi Nghe hiểu N5 (聴解) - Đề số 3: Tổng hợp & Phản xạ thực tế",
    "description": "Đề luyện chuyên sâu kỹ năng Nghe hiểu (Choukai) JLPT N5 (25 câu - 30 phút): Các bẫy thường gặp trong bài nghe N5 (thay đổi lịch hẹn, so sánh, lý do, phản xạ tức thì).",
    "durationMinutes": 30,
    "passScore": 80,
    "maxScore": 180,
    "questions": [
      {
        "id": 1,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe cuộc hội thoại giữa hai đồng nghiệp.\n質問：女の人は このあと まず 何を しますか。",
        "options": [
          "お客さんを 1階へ 迎えに 行く",
          "資料を 20枚 コピーする",
          "ホワイトボードを きれいに 消す",
          "会議室に いすを 5つ 持って 行く"
        ],
        "correctIndex": 3,
        "explanation": "Tài liệu và bảng trắng người nam đã chuẩn bị xong, nhưng phòng họp đang thiếu 5 cái ghế nên nhờ cô ấy mang 5 cái ghế từ phòng bên cạnh sang trước.",
        "audioScript": "会社で男の人と女の人が話しています。女の人はこのあとまず何をしますか。 女：佐藤さん、10時からの会議の資料はもうコピーしましたか。 男：うん、資料のコピーも終わったし、ホワイトボードもきれいにしたよ。でも、会議室のいすが5つ足りないんだ。隣の部屋からいすを5つ持ってきてくれない？僕は1階へお客さんを迎えに行ってくるから。 女：わかりました。すぐ持って行きます。 女の人はこのあとまず何をしますか。"
      },
      {
        "id": 2,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại quầy bán vé tàu.\n質問：男の人は いくらの 切符を 買いますか。",
        "options": [
          "350円の 切符",
          "210円の 切符",
          "280円の 切符",
          "190円の 切符"
        ],
        "correctIndex": 2,
        "explanation": "Ga Sakura giá 210 yên, nhưng bệnh viện nằm ở ga Midori kế tiếp có giá 280 yên nên anh ấy mua vé 280 yên.",
        "audioScript": "駅で男の人と駅員が話しています。男の人はいくらの切符を買いますか。 男：すみません、市民病院へ行きたいんですが、さくら駅まで210円の切符を買えばいいですか。 女：市民病院なら、さくら駅ではなくて、その次のみどり駅のほうが近いですよ。みどり駅までは280円です。 男：そうですか。じゃあ、みどり駅までの切符を買います。 男の人はいくらの切符を買いますか。"
      },
      {
        "id": 3,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại chuẩn bị cho chuyến dã ngoại.\n質問：男の人は あした 何を 持って 行きますか。",
        "options": [
          "おにぎりと お茶",
          "サンドイッチと お菓子",
          "カメラと 飲み物",
          "果物と 大きい シート"
        ],
        "correctIndex": 3,
        "explanation": "Người nữ sẽ làm cơm nắm và mang trà, còn người nam nhận mang trái cây và tấm bạt trải ngồi cỡ lớn (僕は果物と、座るための大きいシートを持って行くよ).",
        "audioScript": "女の人と男の人があしたのピクニックについて話しています。男の人はあした何を持って行きますか。 女：あしたのピクニックだけど、私はおにぎりを作って、お茶を持って行くね。 男：ありがとう。じゃあ、僕は果物と、公園で座るための大きいシートを持って行くよ。 男の人はあした何を持って行きますか。"
      },
      {
        "id": 4,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại tiệm chụp ảnh.\n質問：女の人は 写真を 何枚 お願いしますか。",
        "options": [
          "パスポート用の 写真を 4枚だけ",
          "パスポート用の 写真を 2枚と 履歴書用の 写真を 4枚",
          "履歴書用の 写真を 6枚だけ",
          "パスポート用の 写真を 1枚と 履歴書用の 写真を 2枚"
        ],
        "correctIndex": 1,
        "explanation": "Cô ấy cần 2 tấm ảnh cỡ hộ chiếu và 4 tấm ảnh cỡ sơ yếu lý lịch (パスポートのサイズを2枚と、履歴書のサイズを4枚お願いします).",
        "audioScript": "写真屋で女の人と店員が話しています。女の人は写真を何枚お願いしますか。 女：すみません、証明写真を撮りたいんですが。 男：はい、パスポートのサイズですか、履歴書のサイズですか。 女：パスポートのサイズを2枚と、それから来週面接があるので履歴書のサイズも4枚お願いします。 女の人は写真を何枚お願いしますか。"
      },
      {
        "id": 5,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe bác sĩ nha khoa dặn bệnh nhân.\n質問：男の人は これから 1時間、何を しては いけませんか。",
        "options": [
          "電車に 乗ること",
          "水を 飲むこと",
          "話すこと",
          "ごはんを 食べること"
        ],
        "correctIndex": 3,
        "explanation": "Uống nước lọc thì được nhưng trong vòng 1 tiếng tới không được ăn bất cứ thứ gì (今から1時間は何も食べないでください).",
        "audioScript": "歯医者で医者と男の人が話しています。男の人はこれから1時間、何をしてはいけませんか。 女：はい、今日の治療は終わりました。今から1時間はまだ薬が効いていますから、何も食べないでください。 男：あのう、水を飲んでもいいですか。 女：ええ、お水なら飲んでも構いませんよ。 男の人はこれから1時間、何をしてはいけませんか。"
      },
      {
        "id": 6,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe hội thoại tại lớp học vẽ.\n質問：生徒は 今日 まず 何を 描きますか。",
        "options": [
          "窓の 外の 木と 空",
          "自分の 好きな 動物",
          "テーブルの 上の りんごと コップ",
          "隣に 座っている 友達の 顔"
        ],
        "correctIndex": 2,
        "explanation": "Tuần trước đã vẽ phong cảnh ngoài cửa sổ, hôm nay trước tiên vẽ quả táo và chiếc cốc đặt trên bàn bằng bút chì (今日はまずテーブルの上にあるりんごとコップを鉛筆で描いてください).",
        "audioScript": "絵の教室で先生が話しています。生徒は今日まず何を描きますか。 先生：先週は窓の外の木を描きましたね。今日はまず、テーブルの上にあるりんごとコップを鉛筆で描いてください。色を塗るのはその後です。 生徒は今日まず何を描きますか。"
      },
      {
        "id": 7,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 1: Nghe hiểu chủ đề (課題理解)",
        "question": "🎧 Nghe lời nhắn thoại của mẹ.\n質問：男の子は 家に 帰ったら まず 何を しますか。",
        "options": [
          "お風呂を 掃除する",
          "洗濯物を 部屋の 中に 入れる",
          "犬の 散歩に 行く",
          "晩ごはんの ごはんを 炊く"
        ],
        "correctIndex": 1,
        "explanation": "Trời sắp mưa nên mẹ nhắn khi về đến nhà trước tiên hãy cất quần áo phơi ngoài ban công vào trong phòng (家に帰ったらまずベランダの洗濯物を部屋の中に入れてちょうだい).",
        "audioScript": "留守番電話のメッセージを聞いています。男の子は家に帰ったらまず何をしますか。 母：たかし、お母さんです。今日は買い物をしているから、6時ごろに帰ります。もうすぐ雨が降りそうだから、学校から帰ったら、まずベランダの洗濯物を部屋の中に入れてちょうだい。犬の散歩はお母さんが帰ってから行くわね。 男の子は家に帰ったらまず何をしますか。"
      },
      {
        "id": 8,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về chuyến tàu Shinkansen.\n質問：二人は 何時の 新幹線に 乗りますか。",
        "options": [
          "9時30分",
          "9時00分",
          "8時00分",
          "8時30分"
        ],
        "correctIndex": 3,
        "explanation": "Cuộc họp bắt đầu lúc 11 giờ rưỡi ở Osaka, chuyến 9 giờ hơi sát giờ còn chuyến 8 giờ quá sớm nên hai người chọn chuyến 8 giờ 30 phút (8時30分の新幹線にしましょう).",
        "audioScript": "会社で男の人と女の人が出張の新幹線について話しています。二人は何時の新幹線に乗りますか。 男：明日の大阪での会議は11時半からですね。9時の新幹線に乗りますか。 女：9時のだと、駅から会社まで遠いから少し心配ですね。8時ちょうどは早すぎますか。 男：ええ、じゃあ、その間の8時30分の新幹線にしましょう。 二人は何時の新幹線に乗りますか。"
      },
      {
        "id": 9,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về công việc làm thêm.\n質問：女の人は どうして 本屋の アルバイトを 選びましたか。",
        "options": [
          "夜 遅くまで 働けるから",
          "時給が レストランより 高いから",
          "本が 好きだし、家から 歩いて 行けるから",
          "友達が 同じ 店で 働いているから"
        ],
        "correctIndex": 2,
        "explanation": "Lương theo giờ ở nhà hàng cao hơn, nhưng cô ấy chọn làm thêm ở hiệu sách vì vốn thích sách và có thể đi bộ từ nhà đến đó (本が好きだし、家から歩いて5分で行けるから).",
        "audioScript": "男の人と女の人がアルバイトについて話しています。女の人はどうして本屋のアルバイトを選びましたか。 男：アンさん、新しいアルバイトは決まりましたか。レストランですか。 女：いいえ、本屋にしました。時給はレストランのほうが高かったんですが、私は本が好きだし、家から歩いて5分で行けるから本屋にしたんです。 女の人はどうして本屋のアルバイトを選びましたか。"
      },
      {
        "id": 10,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại tại bảo tàng mỹ thuật.\n質問：美術館の 中で しても いい ことは 何ですか。",
        "options": [
          "飴や ガムを 食べる こと",
          "携帯電話で 話す こと",
          "カメラで 絵の 写真を 撮る こと",
          "鉛筆で メモを 書く こと"
        ],
        "correctIndex": 3,
        "explanation": "Trong bảo tàng không được chụp ảnh, gọi điện hay ăn uống; việc viết ghi chú chỉ được phép dùng bút chì (メモはボールペンではなくて、鉛筆なら書いてもいいですよ).",
        "audioScript": "美術館の入り口で係の人と男の人が話しています。美術館の中でしてもいいことは何ですか。 男：すみません、中で絵の写真を撮ってもいいですか。 女：申し訳ありません。写真はご遠慮ください。また、館内での携帯電話の通話や飲食もできません。 男：メモを取るのは大丈夫ですか。 女：はい、ボールペンは使えませんが、鉛筆ならメモを書いてもいいですよ。 美術館の中でしてもいいことは何ですか。"
      },
      {
        "id": 11,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về khóa học bơi.\n質問：男の人は 今 どのぐらい 泳ぐことが できますか。",
        "options": [
          "50メートル",
          "ぜんぜん 泳げない",
          "100メートル",
          "25メートル"
        ],
        "correctIndex": 0,
        "explanation": "Tháng trước anh ấy hoàn toàn không biết bơi, nhưng sau 1 tháng luyện tập bây giờ đã bơi được 50 mét (今は50メートル泳げるようになりました).",
        "audioScript": "女の人と男の人が水泳について話しています。男の人は今どのぐらい泳ぐことができますか。 女：ミラーさんは水泳教室に通っているそうですね。もう100メートルぐらい泳げますか。 男：いいえ、100メートルはまだ無理です。先月までは全然泳げなかったんですが、今はやっと50メートル泳げるようになりました。 男の人は今どのぐらい泳ぐことができますか。"
      },
      {
        "id": 12,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về vé xem hòa nhạc.\n質問：女の人は どうして コンサートに 行けなくなりましたか。",
        "options": [
          "おなかが 痛くて 入院したから",
          "その日に 会社の 大切な 試験が あるから",
          "チケットを なくして しまったから",
          "急に 国へ 帰らなければ ならないから"
        ],
        "correctIndex": 1,
        "explanation": "Chủ nhật tuần sau trùng với kỳ thi nâng bậc quan trọng của công ty nên cô ấy không đi xem hòa nhạc được và nhượng lại vé cho bạn.",
        "audioScript": "女の人と男の人がコンサートのチケットについて話しています。女の人はどうしてコンサートに行けなくなりましたか。 女：田中さん、来週の日曜日の音楽コンサートのチケット、いりませんか。 男：えっ、佐藤さん、楽しみにしていたのに、行かないんですか。 女：ええ、実はその日に会社の大切な試験が入ってしまったんです。 女の人はどうしてコンサートに行けなくなりましたか。"
      },
      {
        "id": 13,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về thời tiết hôm qua.\n質問：男の人の 町では きのうの 天気は どうでしたか。",
        "options": [
          "朝から 晩まで ずっと いい 天気だった",
          "午後から 強い 雨が 降った",
          "風が 強くて 寒かった",
          "雪が たくさん 降った"
        ],
        "correctIndex": 0,
        "explanation": "Ở chỗ người nữ chiều qua mưa to, nhưng ở thị trấn của người nam hôm qua nắng đẹp suốt từ sáng đến tối (わたしの町は朝から晩までずっといい天気で暖かかったですよ).",
        "audioScript": "女の人と男の人がきのうの天気について話しています。男の人の町ではきのうの天気はどうでしたか。 女：きのうの午後はすごい雨でしたね。洗濯物が全部濡れてしまいました。 男：えっ、そうですか。わたしの町は雨は全然降らないで、朝から晩までずっといい天気で暖かかったですよ。 男の人の町ではきのうの天気はどうでしたか。"
      },
      {
        "id": 14,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 2: Nghe hiểu điểm chính (ポイント理解)",
        "question": "🎧 Nghe hội thoại về việc đọc sách.\n質問：女の人は 今月 何冊 本を 読みましたか。",
        "options": [
          "6冊",
          "3冊",
          "5冊",
          "2冊"
        ],
        "correctIndex": 0,
        "explanation": "Bình thường mỗi tháng đọc 3 cuốn, nhưng tháng này có kỳ nghỉ dài nên cô ấy đã đọc gấp đôi là 6 cuốn (今月は休みが長かったから、いつもの二倍で六冊読みました).",
        "audioScript": "男の人と女の人が読書について話しています。女の人は今月何冊本を読みましたか。 男：木村さんは毎月たくさん本を読みますよね。今月は何冊読みましたか。 女：いつもは一か月に三冊ぐらいですが、今月は休みが長かったから、いつもの二倍で六冊読みました。 女の人は今月何冊本を読みましたか。"
      },
      {
        "id": 15,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちの 家で お茶と お菓子を 出して もらいました。何と 言いますか。",
        "options": [
          "どういたしまして。どうぞ。",
          "ありがとうございます。いただきます。",
          "いいえ、ちがいます。",
          "ごちそうさまでした。また 来ます。"
        ],
        "correctIndex": 1,
        "explanation": "Khi chủ nhà mang trà và bánh ra mời, ta cảm ơn và nói 「ありがとうございます。いただきます」.",
        "audioScript": "友だちの家でお茶とお菓子を出してもらいました。何と言いますか。 1. どういたしまして。どうぞ。 2. ありがとうございます。いただきます。 3. いいえ、ちがいます。 4. ごちそうさまでした。また 来ます。"
      },
      {
        "id": 16,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：病院の 受付で、予約した 山田だと 伝えます。何と 言いますか。",
        "options": [
          "すみません、10時に 予約した 山田ですが。",
          "すみません、10時に 予約したいんですが。",
          "すみません、山田先生を 呼んで ください。",
          "こんにちは、山田さんは いますか。"
        ],
        "correctIndex": 0,
        "explanation": "Khi đến quầy lễ tân báo mình là Yamada đã đặt lịch hẹn lúc 10 giờ: 「すみません、10時に予約した山田ですが」.",
        "audioScript": "病院の受付で、10時に予約した山田だと伝えます。何と言いますか。 1. すみません、10時に 予約した 山田ですが。 2. すみません、10時に 予約したいんですが。 3. すみません、山田先生を 呼んで ください。 4. こんにちは、山田さんは いますか。"
      },
      {
        "id": 17,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：電車の中で 気分が 悪く なりました。近くの 人に 助けて もらいたいです。何と 言いますか。",
        "options": [
          "すみません、お元気ですか。",
          "どうぞ、ここに 座って ください。",
          "すみません、ちょっと 気分が 悪いんですが、助けて くれませんか。",
          "ありがとうございました。もう 大丈夫です。"
        ],
        "correctIndex": 2,
        "explanation": "Khi cảm thấy mệt/khó chịu trên tàu và cần nhờ giúp đỡ: 「すみません、ちょっと気分が悪いんですが、助けてくれませんか」.",
        "audioScript": "電車の中で気分が悪くなりました。近くの人に助けてもらいたいです。何と言いますか。 1. すみません、お元気ですか。 2. どうぞ、ここに 座って ください。 3. すみません、ちょっと 気分が 悪いんですが、助けて くれませんか。 4. ありがとうございました。もう 大丈夫です。"
      },
      {
        "id": 18,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：友だちが 探している 鍵を 見つけました。友だちに 渡す とき、何と 言いますか。",
        "options": [
          "あ、ここに ありましたよ。はい、どうぞ。",
          "その 鍵を 探して ください。",
          "すみません、鍵を なくして しまいました。",
          "これは だれの 鍵ですか。"
        ],
        "correctIndex": 0,
        "explanation": "Khi tìm thấy chìa khóa bạn đang tìm và đưa cho bạn: 「あ、ここにありましたよ。はい、どうぞ」(À, nó ở đây này. Của bạn đây).",
        "audioScript": "友だちが探している鍵を見つけました。友だちに渡すとき、何と言いますか。 1. あ、ここに ありましたよ。はい、どうぞ。 2. その 鍵を 探して ください。 3. すみません、鍵を なくして しまいました。 4. これは だれの 鍵ですか。"
      },
      {
        "id": 19,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 3: Diễn đạt theo tình huống (発話表現)",
        "question": "🎧 Nghe tình huống và chọn câu nói phù hợp nhất.\nTình huống：電話で 田中さんを 呼びたいですが、別の 人が 出ました。何と 言いますか。",
        "options": [
          "もしもし、わたしが 田中です。",
          "また あとで 電話して ください。",
          "すみません、田中さんを お願いします。",
          "田中さんは もう 帰りましたよ。"
        ],
        "correctIndex": 2,
        "explanation": "Khi gọi điện thoại muốn gặp anh Tanaka: 「すみません、田中さんをお願いします」(Xin lỗi, cho tôi gặp anh Tanaka ạ).",
        "audioScript": "電話で田中さんを呼びたいですが、別の人が出ました。何と言いますか。 1. もしもし、わたしが 田中です。 2. また あとで 電話して ください。 3. すみません、田中さんを お願いします。 4. 田中さんは もう 帰りましたよ。"
      },
      {
        "id": 20,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、ここに 車を 止めても いいですか。」",
        "options": [
          "すみません、ここは 駐車禁止なんですよ。",
          "ええ、運転が できます。",
          "いいえ、車じゃ ありません。",
          "はい、車を 止めました。"
        ],
        "correctIndex": 0,
        "explanation": "Khi hỏi xin đỗ xe ở đây được không → Từ chối lịch sự bằng ～んです: 「すみません、ここは駐車禁止なんですよ」(Xin lỗi, chỗ này cấm đỗ xe đấy ạ).",
        "audioScript": "すみません、ここに車を止めてもいいですか。 1. すみません、ここは 駐車禁止なんですよ。 2. ええ、運転が できます。 3. いいえ、車じゃ ありません。 4. はい、車を 止めました。"
      },
      {
        "id": 21,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「料理を たくさん 作りましたから、たくさん 食べて くださいね。」",
        "options": [
          "はい、わたしが たくさん 作りました。",
          "わあ、おいしそうですね。遠慮なく いただきます。",
          "いいえ、もう おなかが いっぱいです。",
          "ごちそうさまでした。"
        ],
        "correctIndex": 1,
        "explanation": "Khi chủ nhà mời ăn thật nhiều món ngon mới nấu → 「わあ、おいしそうですね。遠慮なくいただきます」(Ồ, trông ngon quá, tôi xin phép ăn tự nhiên không khách sáo ạ).",
        "audioScript": "料理をたくさん作りましたから、たくさん食べてくださいね。 1. はい、わたしが たくさん 作りました。 2. わあ、おいしそうですね。遠慮なく いただきます。 3. いいえ、もう おなかが いっぱいです。 4. ごちそうさまでした。"
      },
      {
        "id": 22,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「あしたの 会議は 何時からか 知って いますか。」",
        "options": [
          "はい、会議に 出ました。",
          "ええ、あしたも 仕事です。",
          "いいえ、会議室で します。",
          "ええ、午後 2時からですよ。"
        ],
        "correctIndex": 3,
        "explanation": "Hỏi có biết cuộc họp ngày mai bắt đầu từ mấy giờ không → 「ええ、午後2時からですよ」(Biết chứ, từ 2 giờ chiều đấy).",
        "audioScript": "あしたの会議は何時からか知っていますか。 1. はい、会議に 出ました。 2. ええ、あしたも 仕事です。 3. いいえ、会議室で します。 4. ええ、午後 2時からですよ。"
      },
      {
        "id": 23,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「この かばん、軽くて 使いやすそうですね。」",
        "options": [
          "いいえ、かばんを 買いませんでした。",
          "はい、とても 重くて たいへんです。",
          "ええ、ポケットも 多くて とても 便利ですよ。",
          "ええ、1万円でした。"
        ],
        "correctIndex": 2,
        "explanation": "Khi người khác khen chiếc túi trông nhẹ và dễ dùng (軽くて使いやすそうですね) → 「ええ、ポケットも多くてとても便利ですよ」(Vâng, lại có nhiều ngăn nên rất tiện lợi đấy).",
        "audioScript": "このかばん、軽くて使いやすそうですね。 1. いいえ、かばんを 買いませんでした。 2. はい、とても 重くて たいへんです。 3. ええ、ポケットも 多くて とても 便利ですよ。 4. ええ、1万円でした。"
      },
      {
        "id": 24,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「すみません、ちょっと 塩を 取って くれませんか。」",
        "options": [
          "いただきます。",
          "いいえ、からくないです。",
          "はい、どうぞ。",
          "ええ、塩が 好きです。"
        ],
        "correctIndex": 2,
        "explanation": "Khi ai đó nhờ đưa giúp lọ muối trên bàn ăn (ちょっと塩を取ってくれませんか) → Đưa và nói 「はい、どうぞ」(Vâng, của bạn đây).",
        "audioScript": "すみません、ちょっと塩を取ってくれませんか。 1. いただきます。 2. いいえ、からくないです。 3. はい、どうぞ。 4. ええ、塩が 好きです。"
      },
      {
        "id": 25,
        "section": "聴解 (Nghe hiểu - Choukai)",
        "category": "Mondai 4: Phản xạ nhanh (即時応答)",
        "question": "🎧 Nghe câu nói ngắn và chọn câu trả lời tự nhiên nhất.\n「それでは、お体に 気をつけて、どうぞ お元気で。」",
        "options": [
          "おかえりなさい。",
          "ありがとうございます。山田さんも どうぞ お元気で。",
          "はい、はじめまして。よろしく お願いします。",
          "いいえ、どういたしまして。"
        ],
        "correctIndex": 1,
        "explanation": "Khi chia tay và được chúc giữ gìn sức khỏe, bình an (お体に気をつけて、どうぞお元気で) → Đáp lại lời cảm ơn và chúc đối phương mạnh khỏe.",
        "audioScript": "それでは、お体に気をつけて、どうぞお元気で。 1. おかえりなさい。 2. ありがとうございます。山田さんも どうぞ お元気で。 3. はい、はじめまして。よろしく お願いします。 4. いいえ、どういたしまして。"
      }
    ]
  }
]"""
}
