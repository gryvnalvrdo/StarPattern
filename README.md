# Tugas Akhir Praktek DTI
Pertama - tama, saya inisialisasi nilai n sebesar 6 agar kolomnya sampai 6 ke bawah
Untuk angka 0 saya buat dulu starpattern biasa seperti persegi panjang dengan panjangnya sebesar 4 bintang dan lebarnya sebesar 6 bintang. Saya pakai j= 1-5 untuk angka 0 tetapi 5 nya saya pakai sebagai spasi untuk karakter berikutnya. 
Lalu untuk membuat angka 0 , saya menggunakan logika if dimana saya menghilangkan bintang-bintang di dalam persegi panjang kecuali bagian luarnya. Karena p=4 dan l=6 maka jadi saya pakai if (j==1 || j==4 || i==n || i==1) jka kondisinya memenuhi maka diberi bintang. 
Jadi (j==1) untuk bagian panjan yang pertama dan j == 4 untuk bagian panjang yang terakhir dan i==n berarti i==6 dimana n=6 yang berarti diberi bintang pada bagian lebar yang paling bawah dan i==1 berarti diberi bintang pada bagian lebar yang paling atas.
Ini awalnya :                                          Jadinya :
(i) 1 2 3 4 (j ke bawah)
 1  * * * *                                            * * * *
 2  * * * *                                            *     *
 3  * * * *                                            *     *
 4  * * * *                                            *     *
 5  * * * *                                            *     *
 6  * * * *                                            * * * *
Untuk angka 2 j nya saya pakai dari 6-10 dan sama dengan angka 0 angka terakhirnya saya pakai sebagai spasi untuk karakter berikutnya yang berarti pada kondisi ini adalah angka 10.  
Untuk algoritmanya saya pakai if (i==6 || i==1 || i==3 || j==9 && j+i==11 || j==6 && j+i==10 || j==6 && j+i==11). 
Untuk i==6 berarti bagian lebar yang paling bawah.
Untuk i==3 berarti bagian lebar yang ke 3
Untuk i==1 berarti bagian lebar yang paling atas
Ini awalnya :                                          Jadinya :
(i) 6  7  8  9 (j ke bawah)
 1  *  *  *  *                                            *  *  *  *
 2  *  *  *  *                                                     *
 3  *  *  *  *                                            *  *  *  *
 4  *  *  *  *                                            *
 5  *  *  *  *                                            *
 6  *  *  *  *                                            *  *  *  *
