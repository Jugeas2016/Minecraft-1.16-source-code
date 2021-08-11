/*     */ import com.google.common.base.Joiner;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ny
/*     */   extends nn
/*     */   implements nt
/*     */ {
/*  29 */   private static final Logger g = LogManager.getLogger(); protected final boolean d;
/*     */   protected final String e;
/*     */   @Nullable
/*     */   protected final dr.h f;
/*     */   
/*     */   public static class b extends ny { private final String g;
/*     */     @Nullable
/*     */     private final fc h;
/*     */     
/*     */     public b(String ☃, boolean bool, String str1) {
/*  39 */       super(☃, bool);
/*  40 */       this.g = str1;
/*  41 */       this.h = d(str1);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static fc d(String ☃) {
/*     */       try {
/*  47 */         fd fd = new fd(new StringReader(☃));
/*  48 */         return fd.t();
/*  49 */       } catch (CommandSyntaxException commandSyntaxException) {
/*  50 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private b(String ☃, @Nullable dr.h h1, boolean bool, String str1, @Nullable fc fc1) {
/*  55 */       super(☃, h1, bool);
/*  56 */       this.g = str1;
/*  57 */       this.h = fc1;
/*     */     }
/*     */     
/*     */     public String j() {
/*  61 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public b k() {
/*  66 */       return new b(this.e, this.f, this.d, this.g, this.h);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Stream<md> a(db ☃) throws CommandSyntaxException {
/*  71 */       if (this.h != null) {
/*  72 */         List<? extends aqa> list = this.h.b(☃);
/*  73 */         return list.stream().map(cb::b);
/*     */       } 
/*     */       
/*  76 */       return Stream.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/*  81 */       if (this == ☃) {
/*  82 */         return true;
/*     */       }
/*     */       
/*  85 */       if (☃ instanceof b) {
/*  86 */         b b1 = (b)☃;
/*  87 */         return (Objects.equals(this.g, b1.g) && 
/*  88 */           Objects.equals(this.e, b1.e) && super
/*  89 */           .equals(☃));
/*     */       } 
/*     */       
/*  92 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  97 */       return "EntityNbtComponent{selector='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */         
/* 101 */         c() + '}';
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends ny
/*     */   {
/*     */     private final String g;
/*     */     @Nullable
/*     */     private final em h;
/*     */     
/*     */     public a(String ☃, boolean bool, String str1) {
/* 113 */       super(☃, bool);
/* 114 */       this.g = str1;
/* 115 */       this.h = d(this.g);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private em d(String ☃) {
/*     */       try {
/* 121 */         return ek.a().a(new StringReader(☃));
/* 122 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 123 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private a(String ☃, @Nullable dr.h h1, boolean bool, String str1, @Nullable em em1) {
/* 128 */       super(☃, h1, bool);
/* 129 */       this.g = str1;
/* 130 */       this.h = em1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public String j() {
/* 135 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public a k() {
/* 140 */       return new a(this.e, this.f, this.d, this.g, this.h);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Stream<md> a(db ☃) {
/* 145 */       if (this.h != null) {
/* 146 */         aag aag = ☃.e();
/* 147 */         fx fx = this.h.c(☃);
/* 148 */         if (aag.p(fx)) {
/* 149 */           ccj ccj = aag.c(fx);
/*     */           
/* 151 */           if (ccj != null) {
/* 152 */             return Stream.of(ccj.a(new md()));
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 157 */       return Stream.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 162 */       if (this == ☃) {
/* 163 */         return true;
/*     */       }
/*     */       
/* 166 */       if (☃ instanceof a) {
/* 167 */         a a1 = (a)☃;
/* 168 */         return (Objects.equals(this.g, a1.g) && 
/* 169 */           Objects.equals(this.e, a1.e) && super
/* 170 */           .equals(☃));
/*     */       } 
/*     */       
/* 173 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 178 */       return "BlockPosArgument{pos='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */         
/* 182 */         c() + '}';
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c
/*     */     extends ny {
/*     */     private final vk g;
/*     */     
/*     */     public c(String ☃, boolean bool, vk vk1) {
/* 191 */       super(☃, bool);
/* 192 */       this.g = vk1;
/*     */     }
/*     */     
/*     */     public c(String ☃, @Nullable dr.h h1, boolean bool, vk vk1) {
/* 196 */       super(☃, h1, bool);
/* 197 */       this.g = vk1;
/*     */     }
/*     */     
/*     */     public vk j() {
/* 201 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public c k() {
/* 206 */       return new c(this.e, this.f, this.d, this.g);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Stream<md> a(db ☃) {
/* 211 */       md md = ☃.j().aI().a(this.g);
/* 212 */       return Stream.of(md);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 217 */       if (this == ☃) {
/* 218 */         return true;
/*     */       }
/*     */       
/* 221 */       if (☃ instanceof c) {
/* 222 */         c c1 = (c)☃;
/* 223 */         return (Objects.equals(this.g, c1.g) && 
/* 224 */           Objects.equals(this.e, c1.e) && super
/* 225 */           .equals(☃));
/*     */       } 
/*     */       
/* 228 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 233 */       return "StorageNbtComponent{id='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */         
/* 237 */         c() + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static dr.h d(String ☃) {
/*     */     try {
/* 252 */       return (new dr()).a(new StringReader(☃));
/* 253 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 254 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public ny(String ☃, boolean bool) {
/* 259 */     this(☃, d(☃), bool);
/*     */   }
/*     */   
/*     */   protected ny(String ☃, @Nullable dr.h h1, boolean bool) {
/* 263 */     this.e = ☃;
/* 264 */     this.f = h1;
/* 265 */     this.d = bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String h() {
/* 271 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 275 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public nx a(@Nullable db ☃, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/* 280 */     if (☃ == null || this.f == null) {
/* 281 */       return new oe("");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     Stream<String> stream = a(☃).flatMap(☃ -> { try { return this.f.a(☃).stream(); } catch (CommandSyntaxException commandSyntaxException) { return Stream.empty(); }  }).map(mt::f_);
/*     */     
/* 293 */     if (this.d) {
/* 294 */       return stream.<nx>flatMap(str -> {
/*     */             try {
/*     */               nx nx = nr.a.a(str);
/*     */               return Stream.of(ns.a(☃, nx, aqa1, i));
/* 298 */             } catch (Exception exception) {
/*     */               g.warn("Failed to parse component: " + str, exception);
/*     */               
/*     */               return Stream.of(new nx[0]);
/*     */             } 
/* 303 */           }).reduce((☃, nx1) -> ☃.c(", ").a(nx1))
/* 304 */         .orElse(new oe(""));
/*     */     }
/* 306 */     return new oe(Joiner.on(", ").join(stream.iterator()));
/*     */   }
/*     */   
/*     */   protected abstract Stream<md> a(db paramdb) throws CommandSyntaxException;
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */