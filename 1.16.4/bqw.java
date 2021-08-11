/*     */ import java.util.ArrayList;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bqw
/*     */   extends ArrayList<bqv>
/*     */ {
/*     */   public bqw() {}
/*     */   
/*     */   public bqw(md ☃) {
/*  17 */     mj mj = ☃.d("Recipes", 10);
/*     */     
/*  19 */     for (int i = 0; i < mj.size(); i++) {
/*  20 */       add(new bqv(mj.a(i)));
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bqv a(bmb ☃, bmb bmb1, int i) {
/*  26 */     if (i > 0 && i < size()) {
/*     */       
/*  28 */       bqv bqv = get(i);
/*  29 */       if (bqv.a(☃, bmb1)) {
/*  30 */         return bqv;
/*     */       }
/*  32 */       return null;
/*     */     } 
/*     */     
/*  35 */     for (int j = 0; j < size(); j++) {
/*  36 */       bqv bqv = get(j);
/*  37 */       if (bqv.a(☃, bmb1)) {
/*  38 */         return bqv;
/*     */       }
/*     */     } 
/*  41 */     return null;
/*     */   }
/*     */   
/*     */   public void a(nf ☃) {
/*  45 */     ☃.writeByte((byte)(size() & 0xFF));
/*  46 */     for (int i = 0; i < size(); i++) {
/*  47 */       bqv bqv = get(i);
/*  48 */       ☃.a(bqv.a());
/*  49 */       ☃.a(bqv.d());
/*     */       
/*  51 */       bmb bmb = bqv.c();
/*  52 */       ☃.writeBoolean(!bmb.a());
/*  53 */       if (!bmb.a()) {
/*  54 */         ☃.a(bmb);
/*     */       }
/*  56 */       ☃.writeBoolean(bqv.p());
/*  57 */       ☃.writeInt(bqv.g());
/*  58 */       ☃.writeInt(bqv.i());
/*  59 */       ☃.writeInt(bqv.o());
/*  60 */       ☃.writeInt(bqv.m());
/*  61 */       ☃.writeFloat(bqv.n());
/*  62 */       ☃.writeInt(bqv.k());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static bqw b(nf ☃) {
/*  67 */     bqw bqw1 = new bqw();
/*     */     
/*  69 */     int i = ☃.readByte() & 0xFF;
/*  70 */     for (int j = 0; j < i; j++) {
/*  71 */       bmb bmb1 = ☃.n();
/*  72 */       bmb bmb2 = ☃.n();
/*     */       
/*  74 */       bmb bmb3 = bmb.b;
/*  75 */       if (☃.readBoolean()) {
/*  76 */         bmb3 = ☃.n();
/*     */       }
/*  78 */       boolean bool = ☃.readBoolean();
/*  79 */       int k = ☃.readInt();
/*  80 */       int m = ☃.readInt();
/*  81 */       int n = ☃.readInt();
/*  82 */       int i1 = ☃.readInt();
/*  83 */       float f = ☃.readFloat();
/*  84 */       int i2 = ☃.readInt();
/*     */       
/*  86 */       bqv bqv = new bqv(bmb1, bmb3, bmb2, k, m, n, f, i2);
/*  87 */       if (bool) {
/*  88 */         bqv.q();
/*     */       }
/*  90 */       bqv.b(i1);
/*     */       
/*  92 */       bqw1.add(bqv);
/*     */     } 
/*  94 */     return bqw1;
/*     */   }
/*     */   
/*     */   public md a() {
/*  98 */     md ☃ = new md();
/*     */     
/* 100 */     mj mj = new mj();
/* 101 */     for (int i = 0; i < size(); i++) {
/* 102 */       bqv bqv = get(i);
/* 103 */       mj.add(bqv.t());
/*     */     } 
/* 105 */     ☃.a("Recipes", mj);
/* 106 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */