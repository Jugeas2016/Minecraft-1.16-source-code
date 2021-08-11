/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bpb
/*     */   implements boq<aon>
/*     */ {
/*     */   protected final bon a;
/*     */   protected final bmb b;
/*     */   private final bot<?> e;
/*     */   private final bos<?> f;
/*     */   protected final vk c;
/*     */   protected final String d;
/*     */   
/*     */   public bpb(bot<?> ☃, bos<?> bos1, vk vk1, String str, bon bon1, bmb bmb1) {
/*  21 */     this.e = ☃;
/*  22 */     this.f = bos1;
/*  23 */     this.c = vk1;
/*  24 */     this.d = str;
/*  25 */     this.a = bon1;
/*  26 */     this.b = bmb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public bot<?> g() {
/*  31 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/*  36 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk f() {
/*  41 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/*  46 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb c() {
/*  51 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public gj<bon> a() {
/*  56 */     gj<bon> ☃ = gj.a();
/*  57 */     ☃.add(this.a);
/*  58 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(aon ☃) {
/*  68 */     return this.b.i();
/*     */   }
/*     */   
/*     */   public static class a<T extends bpb> implements bos<T> {
/*     */     final a<T> v;
/*     */     
/*     */     protected a(a<T> ☃) {
/*  75 */       this.v = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T b(vk ☃, JsonObject jsonObject) {
/*     */       bon bon;
/*  84 */       String str1 = afd.a(jsonObject, "group", "");
/*     */ 
/*     */       
/*  87 */       if (afd.d(jsonObject, "ingredient")) {
/*  88 */         bon = bon.a((JsonElement)afd.u(jsonObject, "ingredient"));
/*     */       } else {
/*  90 */         bon = bon.a((JsonElement)afd.t(jsonObject, "ingredient"));
/*     */       } 
/*     */       
/*  93 */       String str2 = afd.h(jsonObject, "result");
/*  94 */       int i = afd.n(jsonObject, "count");
/*  95 */       bmb bmb = new bmb(gm.T.a(new vk(str2)), i);
/*     */       
/*  97 */       return this.v.create(☃, str1, bon, bmb);
/*     */     }
/*     */ 
/*     */     
/*     */     public T b(vk ☃, nf nf1) {
/* 102 */       String str = nf1.e(32767);
/* 103 */       bon bon = bon.b(nf1);
/* 104 */       bmb bmb = nf1.n();
/* 105 */       return this.v.create(☃, str, bon, bmb);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃, T t) {
/* 110 */       ☃.a(((bpb)t).d);
/* 111 */       ((bpb)t).a.a(☃);
/* 112 */       ☃.a(((bpb)t).b);
/*     */     }
/*     */     
/*     */     static interface a<T extends bpb> {
/*     */       T create(vk param2vk, String param2String, bon param2bon, bmb param2bmb);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */