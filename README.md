NOTE: i = baris, j = kolom.

Langkah pengerjaan:

Tentukan banyak baris (i).
Syntax yang saya gunakan adalah for dan if
Pola yang akan saya buat adalah 0,2,G
Pola yang saya buat bentuk awalnya adalah persegi panjang yang akan dimodifikasi menggunakan "if"
Jadi yang paling awal kita buat adalah "0". Kode diatas berarti; jumlah dari baris (i) adalah 6 baris dan jumlah dari kolom (j) adalah 5. Untuk j==5 print(" ") adalah perintah untuk menghilangkan kolom kelima (saya membuatnya menjadi spasi untuk karkater berikutnya). lalu kondisi berikutnya adalah jika j ==1, j == 4, i == 1, dan i == n maka print simbol bintang, jika tidak maka print kosong/spasi. j == 1 dimana kolom pertama kita print bintang, j == 4 dimana kolom keempat kita print bintang, i == 1 dimana baris pertama kita print bintang, dan i == n dimana baris keenam kita print bintang, selain dari baris dan kolom diatas kita kosongkan dengan print spasi.
Lalu kita membuat angka "2". Syarat (i==6 || i==1 || i==3 || j==9 && j+i==11 || j==6 && j+i==10 || j==6 && j+i==11) dimana i==1,i==3,i==6 dimana akan diprint bintang pada baris ke-1, ke-3, ke-6 dan (j==6 && j+i==10) dimana jika berada pada kolom ke-6 dan memenuhi kondisi j+i==10 maka akan diprint bintang dan (j==6 && j+i==11) dimana jika kolomnya ke-6 dan memenuhi kondisi j+i==11 maka akan diprint bintang dan (j==9 && j+i==11) dimana jika berada pada kolom ke-9 dan memenuhi kondisi j+i==11 maka akan diprint bintang.
Last, untuk membuat huruf "G" kita menggunakan persegi panjang juga seperti pola sebelumnya. Untuk kondisinya yaitu (j==15) sama dengan dua angka sebelumnya saya pakai spasi untuk kondisi ini walaupun ini adalah karakter terakhir. Kemudian kondisi ke duanya itu untuk membuat hurufnya yaitu (i==1 || i==6|| j==11 || j==14 && j+i==18 || j==14 && j+i==19 || j==13 && j+i==16 || j== 14 && j+i==17). Untuk i==1 || i==6, kondisi ini berfungsi untuk memprint bintang pada baris ke-1 dan ke-6. Untuk j==11, kondisi ini berfungsi untuk memprint bintang pada kolom ke-11. Untuk j==14 && j+i==18, kondisi ini berfungsi untuk memprint bintang jka berada pada kolom ke-14 dan memenuhi syarat j+i==18. Untuk j==14 && j+i==19, kondisi ini berfungsi untuk memprint bintang jka berada pada kolom ke-14 dan memenuhi syarat j+i==19. 
Lalu pada baris terakhir jangan lupa tambahkan System.out.println(); yang berfungsi untuk jika nilai i sudah salah maka dia akan ke baris selanjutnya.
Cara yang saya gunakan ini mungkin agak berbeda dengan teman-teman lain karena dengan cara ini saya lebih mudah mengerti mengerjakan tugasnya karena bentuk awalnya adalah persegi panjang dimana panjang dan lebarnya kita tentukan sendiri dan nanti kita modifikasi sesuai dengan karakter yang diinginkan
Terima Kasih.
