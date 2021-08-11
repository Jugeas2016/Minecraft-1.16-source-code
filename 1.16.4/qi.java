/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import java.io.IOException;
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
/*     */ public class qi
/*     */   implements oj<om>
/*     */ {
/*     */   private a a;
/*  20 */   private final List<b> b = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public qi(a ☃, aah... arrayOfAah) {
/*  26 */     this.a = ☃;
/*     */     
/*  28 */     for (aah aah1 : arrayOfAah) {
/*  29 */       this.b.add(new b(this, aah1.eA(), aah1.f, aah1.d.b(), aah1.G()));
/*     */     }
/*     */   }
/*     */   
/*     */   public qi(a ☃, Iterable<aah> iterable) {
/*  34 */     this.a = ☃;
/*     */     
/*  36 */     for (aah aah : iterable) {
/*  37 */       this.b.add(new b(this, aah.eA(), aah.f, aah.d.b(), aah.G()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  43 */     this.a = ☃.<a>a(a.class);
/*     */     
/*  45 */     int i = ☃.i();
/*  46 */     for (int j = 0; j < i; j++) {
/*  47 */       int m, n; GameProfile gameProfile = null;
/*  48 */       int k = 0;
/*  49 */       bru bru = null;
/*  50 */       nr nr = null;
/*     */       
/*  52 */       switch (null.a[this.a.ordinal()]) {
/*     */         case 1:
/*  54 */           gameProfile = new GameProfile(☃.k(), ☃.e(16));
/*  55 */           m = ☃.i();
/*  56 */           for (n = 0; n < m; n++) {
/*  57 */             String str1 = ☃.e(32767);
/*  58 */             String str2 = ☃.e(32767);
/*     */             
/*  60 */             if (☃.readBoolean()) {
/*  61 */               gameProfile.getProperties().put(str1, new Property(str1, str2, ☃.e(32767)));
/*     */             } else {
/*  63 */               gameProfile.getProperties().put(str1, new Property(str1, str2));
/*     */             } 
/*     */           } 
/*  66 */           bru = bru.a(☃.i());
/*  67 */           k = ☃.i();
/*  68 */           if (☃.readBoolean()) {
/*  69 */             nr = ☃.h();
/*     */           }
/*     */           break;
/*     */         case 2:
/*  73 */           gameProfile = new GameProfile(☃.k(), null);
/*  74 */           bru = bru.a(☃.i());
/*     */           break;
/*     */         case 3:
/*  77 */           gameProfile = new GameProfile(☃.k(), null);
/*  78 */           k = ☃.i();
/*     */           break;
/*     */         case 4:
/*  81 */           gameProfile = new GameProfile(☃.k(), null);
/*  82 */           if (☃.readBoolean()) {
/*  83 */             nr = ☃.h();
/*     */           }
/*     */           break;
/*     */         case 5:
/*  87 */           gameProfile = new GameProfile(☃.k(), null);
/*     */           break;
/*     */       } 
/*     */       
/*  91 */       this.b.add(new b(this, gameProfile, k, bru, nr));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  97 */     ☃.a(this.a);
/*     */     
/*  99 */     ☃.d(this.b.size());
/* 100 */     for (b b : this.b) {
/* 101 */       switch (null.a[this.a.ordinal()]) {
/*     */         case 1:
/* 103 */           ☃.a(b.a().getId());
/* 104 */           ☃.a(b.a().getName());
/* 105 */           ☃.d(b.a().getProperties().size());
/* 106 */           for (Property property : b.a().getProperties().values()) {
/* 107 */             ☃.a(property.getName());
/* 108 */             ☃.a(property.getValue());
/* 109 */             if (property.hasSignature()) {
/* 110 */               ☃.writeBoolean(true);
/* 111 */               ☃.a(property.getSignature()); continue;
/*     */             } 
/* 113 */             ☃.writeBoolean(false);
/*     */           } 
/*     */           
/* 116 */           ☃.d(b.c().a());
/* 117 */           ☃.d(b.b());
/*     */           
/* 119 */           if (b.d() == null) {
/* 120 */             ☃.writeBoolean(false); continue;
/*     */           } 
/* 122 */           ☃.writeBoolean(true);
/* 123 */           ☃.a(b.d());
/*     */ 
/*     */         
/*     */         case 2:
/* 127 */           ☃.a(b.a().getId());
/* 128 */           ☃.d(b.c().a());
/*     */         
/*     */         case 3:
/* 131 */           ☃.a(b.a().getId());
/* 132 */           ☃.d(b.b());
/*     */         
/*     */         case 4:
/* 135 */           ☃.a(b.a().getId());
/* 136 */           if (b.d() == null) {
/* 137 */             ☃.writeBoolean(false); continue;
/*     */           } 
/* 139 */           ☃.writeBoolean(true);
/* 140 */           ☃.a(b.d());
/*     */ 
/*     */         
/*     */         case 5:
/* 144 */           ☃.a(b.a().getId());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 152 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public List<b> b() {
/* 156 */     return this.b;
/*     */   }
/*     */   
/*     */   public a c() {
/* 160 */     return this.a;
/*     */   }
/*     */   
/*     */   public enum a {
/* 164 */     a,
/* 165 */     b,
/* 166 */     c,
/* 167 */     d,
/* 168 */     e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 174 */     return MoreObjects.toStringHelper(this)
/* 175 */       .add("action", this.a)
/* 176 */       .add("entries", this.b)
/* 177 */       .toString();
/*     */   }
/*     */   
/*     */   public qi() {}
/*     */   
/*     */   public class b {
/*     */     private final int b;
/*     */     private final bru c;
/*     */     
/*     */     public b(qi ☃, GameProfile gameProfile, int i, @Nullable bru bru1, @Nullable nr nr1) {
/* 187 */       this.d = gameProfile;
/* 188 */       this.b = i;
/* 189 */       this.c = bru1;
/* 190 */       this.e = nr1;
/*     */     }
/*     */     private final GameProfile d; private final nr e;
/*     */     public GameProfile a() {
/* 194 */       return this.d;
/*     */     }
/*     */     
/*     */     public int b() {
/* 198 */       return this.b;
/*     */     }
/*     */     
/*     */     public bru c() {
/* 202 */       return this.c;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public nr d() {
/* 207 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 212 */       return MoreObjects.toStringHelper(this)
/* 213 */         .add("latency", this.b)
/* 214 */         .add("gameMode", this.c)
/* 215 */         .add("profile", this.d)
/* 216 */         .add("displayName", (this.e == null) ? null : nr.a.a(this.e))
/* 217 */         .toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */