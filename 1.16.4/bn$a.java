/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends al
/*     */ {
/*     */   private final bz.d a;
/*     */   private final bz.d b;
/*     */   private final bz.d c;
/*     */   private final bq[] d;
/*     */   
/*     */   public a(bg.b ☃, bz.d d1, bz.d d2, bz.d d3, bq[] arrayOfBq) {
/*  64 */     super(bn.b(), ☃);
/*  65 */     this.a = d1;
/*  66 */     this.b = d2;
/*  67 */     this.c = d3;
/*  68 */     this.d = arrayOfBq;
/*     */   }
/*     */   
/*     */   public static a a(bq... ☃) {
/*  72 */     return new a(bg.b.a, bz.d.e, bz.d.e, bz.d.e, ☃);
/*     */   }
/*     */   
/*     */   public static a a(brw... ☃) {
/*  76 */     bq[] arrayOfBq = new bq[☃.length];
/*  77 */     for (int i = 0; i < ☃.length; i++) {
/*  78 */       arrayOfBq[i] = new bq(null, ☃[i].h(), bz.d.e, bz.d.e, bb.b, bb.b, null, cb.a);
/*     */     }
/*  80 */     return a(arrayOfBq);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonObject a(ci ☃) {
/*  85 */     JsonObject jsonObject = super.a(☃);
/*     */     
/*  87 */     if (!this.a.c() || !this.b.c() || !this.c.c()) {
/*  88 */       JsonObject jsonObject1 = new JsonObject();
/*  89 */       jsonObject1.add("occupied", this.a.d());
/*  90 */       jsonObject1.add("full", this.b.d());
/*  91 */       jsonObject1.add("empty", this.c.d());
/*  92 */       jsonObject.add("slots", (JsonElement)jsonObject1);
/*     */     } 
/*     */     
/*  95 */     if (this.d.length > 0) {
/*  96 */       JsonArray jsonArray = new JsonArray();
/*  97 */       for (bq bq1 : this.d) {
/*  98 */         jsonArray.add(bq1.a());
/*     */       }
/* 100 */       jsonObject.add("items", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 103 */     return jsonObject;
/*     */   }
/*     */   
/*     */   public boolean a(bfv ☃, bmb bmb1, int i, int j, int k) {
/* 107 */     if (!this.b.d(i)) {
/* 108 */       return false;
/*     */     }
/* 110 */     if (!this.c.d(j)) {
/* 111 */       return false;
/*     */     }
/* 113 */     if (!this.a.d(k)) {
/* 114 */       return false;
/*     */     }
/*     */     
/* 117 */     int m = this.d.length;
/* 118 */     if (m == 0) {
/* 119 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 124 */     if (m == 1) {
/* 125 */       return (!bmb1.a() && this.d[0].a(bmb1));
/*     */     }
/*     */     
/* 128 */     ObjectArrayList objectArrayList = new ObjectArrayList((Object[])this.d);
/* 129 */     int n = ☃.Z_();
/* 130 */     for (int i1 = 0; i1 < n; i1++) {
/* 131 */       if (objectArrayList.isEmpty()) {
/* 132 */         return true;
/*     */       }
/*     */       
/* 135 */       bmb bmb2 = ☃.a(i1);
/* 136 */       if (!bmb2.a()) {
/* 137 */         objectArrayList.removeIf(bq1 -> bq1.a(☃));
/*     */       }
/*     */     } 
/* 140 */     return objectArrayList.isEmpty();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */