/*    */ 
/*    */ public class cvb
/*    */ {
/*  4 */   public static final cvb[] a = new cvb[64];
/*    */   
/*  6 */   public static final cvb b = new cvb(0, 0);
/*  7 */   public static final cvb c = new cvb(1, 8368696);
/*  8 */   public static final cvb d = new cvb(2, 16247203);
/*  9 */   public static final cvb e = new cvb(3, 13092807);
/* 10 */   public static final cvb f = new cvb(4, 16711680);
/* 11 */   public static final cvb g = new cvb(5, 10526975);
/* 12 */   public static final cvb h = new cvb(6, 10987431);
/* 13 */   public static final cvb i = new cvb(7, 31744);
/* 14 */   public static final cvb j = new cvb(8, 16777215);
/* 15 */   public static final cvb k = new cvb(9, 10791096);
/* 16 */   public static final cvb l = new cvb(10, 9923917);
/* 17 */   public static final cvb m = new cvb(11, 7368816);
/* 18 */   public static final cvb n = new cvb(12, 4210943);
/* 19 */   public static final cvb o = new cvb(13, 9402184);
/* 20 */   public static final cvb p = new cvb(14, 16776437);
/* 21 */   public static final cvb q = new cvb(15, 14188339);
/* 22 */   public static final cvb r = new cvb(16, 11685080);
/* 23 */   public static final cvb s = new cvb(17, 6724056);
/* 24 */   public static final cvb t = new cvb(18, 15066419);
/* 25 */   public static final cvb u = new cvb(19, 8375321);
/* 26 */   public static final cvb v = new cvb(20, 15892389);
/* 27 */   public static final cvb w = new cvb(21, 5000268);
/* 28 */   public static final cvb x = new cvb(22, 10066329);
/* 29 */   public static final cvb y = new cvb(23, 5013401);
/* 30 */   public static final cvb z = new cvb(24, 8339378);
/* 31 */   public static final cvb A = new cvb(25, 3361970);
/* 32 */   public static final cvb B = new cvb(26, 6704179);
/* 33 */   public static final cvb C = new cvb(27, 6717235);
/* 34 */   public static final cvb D = new cvb(28, 10040115);
/* 35 */   public static final cvb E = new cvb(29, 1644825);
/* 36 */   public static final cvb F = new cvb(30, 16445005);
/* 37 */   public static final cvb G = new cvb(31, 6085589);
/* 38 */   public static final cvb H = new cvb(32, 4882687);
/* 39 */   public static final cvb I = new cvb(33, 55610);
/* 40 */   public static final cvb J = new cvb(34, 8476209);
/* 41 */   public static final cvb K = new cvb(35, 7340544);
/*    */   
/* 43 */   public static final cvb L = new cvb(36, 13742497);
/* 44 */   public static final cvb M = new cvb(37, 10441252);
/* 45 */   public static final cvb N = new cvb(38, 9787244);
/* 46 */   public static final cvb O = new cvb(39, 7367818);
/* 47 */   public static final cvb P = new cvb(40, 12223780);
/* 48 */   public static final cvb Q = new cvb(41, 6780213);
/* 49 */   public static final cvb R = new cvb(42, 10505550);
/* 50 */   public static final cvb S = new cvb(43, 3746083);
/* 51 */   public static final cvb T = new cvb(44, 8874850);
/* 52 */   public static final cvb U = new cvb(45, 5725276);
/* 53 */   public static final cvb V = new cvb(46, 8014168);
/* 54 */   public static final cvb W = new cvb(47, 4996700);
/* 55 */   public static final cvb X = new cvb(48, 4993571);
/* 56 */   public static final cvb Y = new cvb(49, 5001770);
/* 57 */   public static final cvb Z = new cvb(50, 9321518);
/* 58 */   public static final cvb aa = new cvb(51, 2430480);
/*    */   
/* 60 */   public static final cvb ab = new cvb(52, 12398641);
/* 61 */   public static final cvb ac = new cvb(53, 9715553);
/* 62 */   public static final cvb ad = new cvb(54, 6035741);
/* 63 */   public static final cvb ae = new cvb(55, 1474182);
/* 64 */   public static final cvb af = new cvb(56, 3837580);
/* 65 */   public static final cvb ag = new cvb(57, 5647422);
/* 66 */   public static final cvb ah = new cvb(58, 1356933);
/*    */   
/*    */   public final int ai;
/*    */   public final int aj;
/*    */   
/*    */   private cvb(int ☃, int i) {
/* 72 */     if (☃ < 0 || ☃ > 63) {
/* 73 */       throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/*    */     }
/* 75 */     this.aj = ☃;
/* 76 */     this.ai = i;
/* 77 */     a[☃] = this;
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 81 */     int i = 220;
/* 82 */     if (☃ == 3) {
/* 83 */       i = 135;
/*    */     }
/* 85 */     if (☃ == 2) {
/* 86 */       i = 255;
/*    */     }
/* 88 */     if (☃ == 1) {
/* 89 */       i = 220;
/*    */     }
/* 91 */     if (☃ == 0) {
/* 92 */       i = 180;
/*    */     }
/*    */     
/* 95 */     int j = (this.ai >> 16 & 0xFF) * i / 255;
/* 96 */     int k = (this.ai >> 8 & 0xFF) * i / 255;
/* 97 */     int m = (this.ai & 0xFF) * i / 255;
/*    */     
/* 99 */     return 0xFF000000 | m << 16 | k << 8 | j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */