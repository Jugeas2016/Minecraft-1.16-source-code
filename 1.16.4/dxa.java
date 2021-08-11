/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dxa
/*     */ {
/*  17 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final djz b;
/*  20 */   private final List<dwz> c = Lists.newArrayList();
/*     */   
/*     */   public dxa(djz ☃) {
/*  23 */     this.b = ☃;
/*  24 */     a();
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/*  29 */       this.c.clear();
/*     */       
/*  31 */       md ☃ = mn.b(new File(this.b.n, "servers.dat"));
/*  32 */       if (☃ == null) {
/*     */         return;
/*     */       }
/*     */       
/*  36 */       mj mj = ☃.d("servers", 10);
/*  37 */       for (int i = 0; i < mj.size(); i++) {
/*  38 */         this.c.add(dwz.a(mj.a(i)));
/*     */       }
/*  40 */     } catch (Exception ☃) {
/*  41 */       a.error("Couldn't load server list", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/*     */     try {
/*  47 */       mj ☃ = new mj();
/*  48 */       for (dwz dwz : this.c) {
/*  49 */         ☃.add(dwz.a());
/*     */       }
/*     */       
/*  52 */       md md = new md();
/*  53 */       md.a("servers", ☃);
/*     */       
/*  55 */       File file1 = File.createTempFile("servers", ".dat", this.b.n);
/*  56 */       mn.b(md, file1);
/*     */       
/*  58 */       File file2 = new File(this.b.n, "servers.dat_old");
/*  59 */       File file3 = new File(this.b.n, "servers.dat");
/*  60 */       x.a(file3, file1, file2);
/*  61 */     } catch (Exception ☃) {
/*  62 */       a.error("Couldn't save server list", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public dwz a(int ☃) {
/*  67 */     return this.c.get(☃);
/*     */   }
/*     */   
/*     */   public void a(dwz ☃) {
/*  71 */     this.c.remove(☃);
/*     */   }
/*     */   
/*     */   public void b(dwz ☃) {
/*  75 */     this.c.add(☃);
/*     */   }
/*     */   
/*     */   public int c() {
/*  79 */     return this.c.size();
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/*  83 */     dwz dwz = a(☃);
/*  84 */     this.c.set(☃, a(i));
/*  85 */     this.c.set(i, dwz);
/*  86 */     b();
/*     */   }
/*     */   
/*     */   public void a(int ☃, dwz dwz1) {
/*  90 */     this.c.set(☃, dwz1);
/*     */   }
/*     */   
/*     */   public static void c(dwz ☃) {
/*  94 */     dxa dxa1 = new dxa(djz.C());
/*  95 */     dxa1.a();
/*     */     
/*  97 */     for (int i = 0; i < dxa1.c(); i++) {
/*  98 */       dwz dwz1 = dxa1.a(i);
/*     */       
/* 100 */       if (dwz1.a.equals(☃.a) && dwz1.b.equals(☃.b)) {
/* 101 */         dxa1.a(i, ☃);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 106 */     dxa1.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */