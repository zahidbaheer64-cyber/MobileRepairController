# BaHeeR Android Repair — د APK جوړولو پروژه

دا د Android Studio لپاره د Kotlin پروژې سرچینه ده. په دې چاپېریال کې د Android SDK/Gradle جوړولو وسایل او انټرنېټ نشته، نو مستقیم APK دلته نه دی جوړ شوی. د GitHub Actions فایل د APK جوړولو اتومات کار برابروي.

## تر ټولو ساده لاره: GitHub Actions
1. ZIP فایل Extract کړه.
2. GitHub ته ننوځه او نوی Repository جوړ کړه.
3. د ZIP دننه ټول فایلونه/فولډرونه Repository ته Upload کړه؛ د `.github/workflows/build-apk.yml` فولډر هم باید موجود وي.
4. Repository کې Actions ټب خلاص کړه.
5. `Build BaHeeR Android Repair APK` انتخاب او `Run workflow` کېکاږه.
6. کله چې کار شین/Success شي، د Build د پاڼې په پای کې `Artifacts` برخه کې `BaHeeR-Android-Repair-APK` ډاونلوډ کړه.
7. ZIP خلاص کړه او `app-debug.apk` په خپل Android موبایل کې نصب کړه. کېدای شي Android د براوزر/Files لپاره د نصب اجازه وغواړي.

## په Android Studio کې
پروژه خلاصه کړه، Gradle Sync بشپړ کړه، بیا Build > Build APK(s) وټاکه.

## د اپلېکېشن حدود
دا د رسمي ملاتړ لینکونه، د Reset چک‌لېست او د Google حساب recovery لري. دا مستقیم Firmware نه فلش کوي او FRP نه تېروي. د مستقیم فلش لپاره د هر جوړونکي رسمي/مجاز وسیلې او د دقیق ماډل ملاتړ جلا اړتیا ده.
