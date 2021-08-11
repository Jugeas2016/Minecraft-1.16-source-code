/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bns
/*     */   extends blx
/*     */ {
/*     */   public bns(blx.a ☃) {
/*  43 */     super(☃);
/*     */   }
/*     */   
/*     */   public static boolean a(@Nullable md ☃) {
/*  47 */     if (!bnr.a(☃)) {
/*  48 */       return false;
/*     */     }
/*     */     
/*  51 */     if (!☃.c("title", 8)) {
/*  52 */       return false;
/*     */     }
/*  54 */     String str = ☃.l("title");
/*  55 */     if (str.length() > 32) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     return ☃.c("author", 8);
/*     */   }
/*     */   
/*     */   public static int d(bmb ☃) {
/*  63 */     return ☃.o().h("generation");
/*     */   }
/*     */   
/*     */   public static int g(bmb ☃) {
/*  67 */     md md = ☃.o();
/*  68 */     return (md != null) ? md.d("pages", 8).size() : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr h(bmb ☃) {
/*  73 */     if (☃.n()) {
/*  74 */       md md = ☃.o();
/*     */       
/*  76 */       String str = md.l("title");
/*  77 */       if (!aft.b(str)) {
/*  78 */         return new oe(str);
/*     */       }
/*     */     } 
/*  81 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/*  86 */     if (☃.n()) {
/*  87 */       md md = ☃.o();
/*     */       
/*  89 */       String str = md.l("author");
/*  90 */       if (!aft.b(str)) {
/*  91 */         list.add((new of("book.byAuthor", new Object[] { str })).a(k.h));
/*     */       }
/*     */       
/*  94 */       list.add((new of("book.generation." + md.h("generation"))).a(k.h));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/* 100 */     brx brx = ☃.p();
/* 101 */     fx fx = ☃.a();
/* 102 */     ceh ceh = brx.d_(fx);
/*     */     
/* 104 */     if (ceh.a(bup.lY)) {
/* 105 */       return bxy.a(brx, fx, ceh, ☃.m()) ? aou.a(brx.v) : aou.c;
/*     */     }
/*     */     
/* 108 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 113 */     bmb bmb = bfw1.b(aot1);
/* 114 */     bfw1.a(bmb, aot1);
/* 115 */     bfw1.b(aea.c.b(this));
/* 116 */     return aov.a(bmb, ☃.s_());
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, @Nullable db db1, @Nullable bfw bfw1) {
/* 120 */     md md = ☃.o();
/* 121 */     if (md == null || md.q("resolved")) {
/* 122 */       return false;
/*     */     }
/* 124 */     md.a("resolved", true);
/* 125 */     if (!a(md)) {
/* 126 */       return false;
/*     */     }
/* 128 */     mj mj = md.d("pages", 8);
/* 129 */     for (int i = 0; i < mj.size(); i++) {
/* 130 */       nr nr; String str = mj.j(i);
/*     */       
/*     */       try {
/* 133 */         nr = nr.a.b(str);
/* 134 */         nr = ns.a(db1, nr, bfw1, 0);
/* 135 */       } catch (Exception exception) {
/* 136 */         nr = new oe(str);
/*     */       } 
/* 138 */       mj.d(i, ms.a(nr.a.a(nr)));
/*     */     } 
/* 140 */     md.a("pages", mj);
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/* 146 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */